package com.sdk.platform;

import com.sdk.common.*;
import lombok.Getter;
import lombok.Setter;
import okhttp3.Interceptor;
import org.apache.commons.lang3.RandomStringUtils;
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

    PlatformOauthClient(PlatformConfig config)
    {
        this.config=config;
        this.refreshToken = "";
        this.retrofitServiceFactory = new RetrofitServiceFactory();
    }

    enum GrantType {
        AUTHORIZATION_CODE,
        REFRESH_TOKEN
    }

    private void setToken(AccessToken accessToken) {
        this.rawToken = accessToken;
        this.tokenExpiresIn = accessToken.getExpiresIn();
        this.token = accessToken.getToken();
        this.refreshToken = ObjectUtils.isEmpty(accessToken.getRefreshToken())? "":accessToken.getRefreshToken();
        if(ObjectUtils.isEmpty(this.refreshToken)) {
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

    private String getRandomState(){
        return RandomStringUtils.randomAlphanumeric(15).toUpperCase();
    }

    public String getAuthorizationURL(List<String> scope, String redirectUri, boolean isOnline)
    {
        String apiKey = config.getApiKey();
        if (ObjectUtils.isEmpty(apiKey)) {
            throw new FDKError("API Key missing in config");
        }
        String accessMode = isOnline?"online":"offline";
        String query = "client_id=" + apiKey + "&scope="+String.join(",", scope)
                + "&redirect_uri=" + redirectUri + "&state="+getRandomState() + "&access_mode=" + accessMode;
        return config.getDomain()+"/v1.0/company/"+config.getCompanyId()+"/oauth/authorize?"+ query;
    }

    public void renewAccesstoken() throws IOException {

        HashMap<String, String> body = new HashMap<>();
        body.put("grant_type", GrantType.REFRESH_TOKEN.toString().toLowerCase());
        body.put("refresh_token", this.refreshToken);

        String url = config.getDomain()+"/service/panel/authentication/v1.0/company/"+config.getCompanyId()+"/oauth/token";
        AccessToken newToken = getToken(body, url);
        setToken(newToken);
    }

    public void verifyCallback(String authorizationCode) throws IOException {

        HashMap<String, String> body = new HashMap<>();
        body.put("grant_type", GrantType.AUTHORIZATION_CODE.toString().toLowerCase());
        body.put("code", authorizationCode);

        String url = config.getDomain()+"/service/panel/authentication/v1.0/company/"+config.getCompanyId()+"/oauth/token";
        AccessToken newToken = getToken(body, url);
        setToken(newToken);
    }

    public boolean isAccessTokenValid() {
        return !ObjectUtils.isEmpty(this.token) && this.rawToken.getExpiresIn()>0;
    }

    private AccessToken getToken(HashMap<String, String> body , String url ) throws IOException {
        TokenApiList tokenApiList = generateTokenApiList();
        Response<AccessResponse> response = tokenApiList.getAccessToken(url, body).execute();
        if (response.isSuccessful() && !ObjectUtils.isEmpty(response.body())) {
            AccessResponse accessResponse = response.body();
            AccessToken accessToken = new AccessToken();
            accessToken.setToken(accessResponse.getAccessToken());
            accessToken.setRefreshToken(accessResponse.getRefreshToken());
            accessToken.setExpiresIn(TimeUnit.SECONDS.toMillis(
                    accessResponse.getExpiresInl()) + System.currentTimeMillis());
            return accessToken;
        }
        return new AccessToken();
    }

    private TokenApiList generateTokenApiList() {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PlatformHeaderInterceptor(config));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(config.getDomain(),TokenApiList.class,interceptorList);
    }
}

interface TokenApiList {
    @FormUrlEncoded
    @POST
    Call<AccessResponse> getAccessToken(@Url String slug, @FieldMap HashMap<String, String> map);
}

@Getter
@Setter
class AccessResponse{
    String accessToken;
    String refreshToken;
    Long expiresInl;
}
