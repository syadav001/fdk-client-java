package com.sdk.platform;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sdk.common.*;
import lombok.Getter;
import lombok.Setter;
import okhttp3.Interceptor;
import okhttp3.Request;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ObjectUtils;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Getter
public class PlatformOauthClient {

    private PlatformConfig config;
    private RetrofitServiceFactory retrofitServiceFactory;
    private String token;
    private String refreshToken;
    private AccessToken rawToken;
    private long tokenExpiresIn;
    private static String URI = "/service/panel/authentication/v1.0/company/";

    PlatformOauthClient(PlatformConfig config) {
        this.config = config;
        this.refreshToken = "";
        this.retrofitServiceFactory = new RetrofitServiceFactory();
    }

    enum GrantType {
        AUTHORIZATION_CODE, REFRESH_TOKEN
    }

    public void setToken(AccessToken accessToken) {
        this.rawToken = accessToken;
        this.tokenExpiresIn = accessToken.getExpiresIn();
        this.token = accessToken.getToken();
        this.refreshToken = ObjectUtils.isEmpty(accessToken.getRefreshToken()) ? "" : accessToken.getRefreshToken();
        if (ObjectUtils.isEmpty(this.refreshToken)) {
            this.retryOAuthTokenTimer(accessToken.getExpiresIn());
        }
    }

    private void retryOAuthTokenTimer(long expiresIn) {
        try {
            if (expiresIn > 60) {
                this.renewAccesstoken();
            }
        } catch (Exception e) {
            throw new FDKError(e.getMessage());
        }
    }

    private String getRandomState() {
        return RandomStringUtils.randomAlphanumeric(15).toUpperCase();
    }

    public String getAuthorizationURL(List<String> scope, String redirectUri, String state, boolean isOnline) {
        String apiKey = config.getApiKey();
        if (ObjectUtils.isEmpty(apiKey)) {
            throw new FDKError("API Key missing in config");
        }
        state = StringUtils.isNotEmpty(state) ? state : getRandomState();
        String accessMode = isOnline ? "online" : "offline";
        String query = "client_id=" + apiKey + "&scope=" + String.join(",", scope) + "&redirect_uri=" + redirectUri
                + "&state=" + state + "&access_mode=" + accessMode + "&response_type=code";
        var queryString = config.getDomain() + URI + config.getCompanyId() + "/oauth/authorize?" + query;
        Request request = new Request.Builder().url(queryString).method("GET", null).build();
        request = new RequestSigner(request).sign(true);
        return request.url().query();
    }

    public void renewAccesstoken() throws IOException {

        HashMap<String, String> body = new HashMap<>();
        body.put("grant_type", GrantType.REFRESH_TOKEN.toString().toLowerCase());
        body.put("refresh_token", this.refreshToken);

        String url = config.getDomain() + URI + config.getCompanyId() + "/oauth/token";
        AccessToken newToken = getToken(body, url);
        setToken(newToken);
    }

    public void verifyCallback(String authorizationCode) throws IOException {

        HashMap<String, String> body = new HashMap<>();
        body.put("grant_type", GrantType.AUTHORIZATION_CODE.toString().toLowerCase());
        body.put("code", authorizationCode);

        String url = config.getDomain() + URI + config.getCompanyId() + "/oauth/token";
        AccessToken newToken = getToken(body, url);
        setToken(newToken);
    }

    public boolean isAccessTokenValid() {
        return !ObjectUtils.isEmpty(this.token) && this.rawToken.getExpiresIn() > 0;
    }

    private AccessToken getToken(HashMap<String, String> body, String url) throws IOException {
        TokenApiList tokenApiList = generateTokenApiList();
        Response<AccessResponse> response = tokenApiList.getAccessToken(url, body).execute();
        if (response.isSuccessful() && !ObjectUtils.isEmpty(response.body())) {
            AccessResponse accessResponse = response.body();
            AccessToken accessToken = new AccessToken();
            accessToken.setToken(accessResponse.getAccessToken());
            accessToken.setRefreshToken(accessResponse.getRefreshToken());
            accessToken.setExpiresIn(
                    TimeUnit.SECONDS.toMillis(accessResponse.getExpiresIn()) + System.currentTimeMillis());
            return accessToken;
        }
        return new AccessToken();
    }

    private TokenApiList generateTokenApiList() {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PlatformHeaderInterceptor(config));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(config.getDomain(), TokenApiList.class, interceptorList);
    }
}

interface TokenApiList {
    @FormUrlEncoded
    @POST
    Call<AccessResponse> getAccessToken(@Url String slug, @FieldMap HashMap<String, String> map);
}

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
class AccessResponse {
    @JsonProperty("access_token")
    String accessToken;

    @JsonProperty("refresh_token")
    String refreshToken;

    @JsonProperty("expires_in")
    Long expiresIn;
}
