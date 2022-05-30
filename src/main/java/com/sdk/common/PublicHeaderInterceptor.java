package com.sdk.common;

import com.sdk.universal.PublicConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Base64;

public class PublicHeaderInterceptor implements Interceptor {

    private PublicConfig publicConfig;

    public PublicHeaderInterceptor(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        String bearerToken = Base64.getEncoder().encodeToString((publicConfig.getApplicationToken()).getBytes());
        Request request = chain.request()
                .newBuilder()
                .addHeader("x-application-token", publicConfig.getApplicationToken())
                .addHeader("User-Agent", publicConfig.getUserAgent())
                .addHeader("Accept-Language", "en-IN")
                .addHeader("Authorization", "Bearer "+bearerToken)
                .addHeader("x-fp-sdk-version", "0.1.18")
                .build();
        return chain.proceed(request);
    }
}