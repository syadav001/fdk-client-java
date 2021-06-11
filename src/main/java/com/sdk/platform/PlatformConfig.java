package com.sdk.platform;


import com.sdk.common.AccessToken;
import lombok.Getter;
import lombok.Setter;

import java.net.CookieManager;
import java.net.CookieStore;
import java.util.Objects;

@Getter
@Setter
public final class PlatformConfig{
    private String companyId;
    private String  domain = "https://api.fynd.com";
    private String apiKey;
    private String apiSecret;
    private CookieStore persistentCookieStore;
    private PlatformOauthClient platformOauthClient;

    public PlatformConfig(String companyId,String apiKey,String apiSecret,String  domain, CookieStore cookieStore) {
        if(Objects.isNull(companyId)) {
            throw new IllegalArgumentException("Please enter Valid Company ID");
        }
        this.companyId = companyId;
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.domain = domain;
        this.persistentCookieStore = cookieStore;
        this.platformOauthClient = new PlatformOauthClient(this);
    }

    public AccessToken getAccessToken() {
        return this.platformOauthClient.getRawToken();
    }
}

