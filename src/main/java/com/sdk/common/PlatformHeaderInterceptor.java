package com.sdk.common;

import com.sdk.platform.PlatformConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;

public class PlatformHeaderInterceptor implements Interceptor {

    private PlatformConfig platformConfig;

    public PlatformHeaderInterceptor(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        String bearerToken = Base64.getEncoder().encodeToString((platformConfig.getApiKey()+":"+ platformConfig.getApiSecret()).getBytes());
        Request request = chain.request()
                .newBuilder()
                .addHeader("Accept-Language", "en-IN")
                .addHeader("Authorization", "Basic "+ bearerToken)
                .addHeader("Content-Type","application/x-www-form-urlencoded")
                .addHeader("x-fp-sdk-version", "0.1.16")
                .build();
        return chain.proceed(request);
    }
}
