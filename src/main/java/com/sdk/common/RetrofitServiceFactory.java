package com.sdk.common;

import okhttp3.*;
import okhttp3.internal.JavaNetCookieJar;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.security.cert.CertificateException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/** Service Generator class for Retrofit communication Depends on baseUrl property */
public class RetrofitServiceFactory {

    private String baseURL;

    private Retrofit.Builder builder;

    private Retrofit retrofit;

    private OkHttpClient.Builder httpClient;

    private HttpLoggingInterceptor logging;

    public RetrofitServiceFactory() {
        baseURL = "http://localhost:8080";
        builder =
                new Retrofit.Builder()
                        .baseUrl(baseURL)
                        .addConverterFactory(JacksonConverterFactory.create());
        retrofit = builder.build();
        httpClient = new OkHttpClient.Builder();
        logging = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    public <S> S createService(String baseUrl, Class<S> serviceClass, List<Interceptor> interceptorList) {
        return createService(baseUrl, serviceClass, interceptorList, null);
    }

    /**
     * This method generates retrofit Service call object
     *
     * @param baseUrl the base url for retrofit
     * @param serviceClass the class call object which needs to be returned
     * @return the service class call object
     */
    public <S> S createService(String baseUrl, Class<S> serviceClass, List<Interceptor> interceptorList, CookieStore cookieStore) {
        setApiBaseUrl(baseUrl);
        if (!httpClient.interceptors().contains(logging)) {
            httpClient.addInterceptor(logging);
        }
        builder.client(getUnsafeOkHttpClient(interceptorList, cookieStore));
        retrofit = builder.build();
        return retrofit.create(serviceClass);
    }

    private static OkHttpClient getUnsafeOkHttpClient(List<Interceptor> interceptorList, CookieStore cookieStore) {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts =
                    new TrustManager[] {
                            new X509TrustManager() {
                                @Override
                                public void checkClientTrusted(
                                        java.security.cert.X509Certificate[] chain, String authType)
                                        throws CertificateException {}

                                @Override
                                public void checkServerTrusted(
                                        java.security.cert.X509Certificate[] chain, String authType)
                                        throws CertificateException {}

                                @Override
                                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                                    return new java.security.cert.X509Certificate[] {};
                                }
                            }
                    };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
            builder.hostnameVerifier((hostname, session) -> true);
            if(!interceptorList.isEmpty()) {
                interceptorList.forEach(builder::addInterceptor);
            }
            CookieJar cookieJar = addCookie(cookieStore);
            if(Objects.nonNull(cookieJar)) {
                builder.cookieJar(cookieJar);
            }
            builder.readTimeout(Duration.ofMinutes(Constants.READ_TIMEOUT).toMinutes(), TimeUnit.MINUTES);
            builder.connectTimeout(Duration.ofSeconds(Constants.CONNECT_TIMEOUT).getSeconds(), TimeUnit.SECONDS);
            builder.writeTimeout(Duration.ofSeconds(Constants.WRITE_TIMEOUT).getSeconds(), TimeUnit.SECONDS);
            builder.connectionPool(
                    new ConnectionPool(Constants.IDLE_CONNECTION, Constants.KEEP_ALIVE, TimeUnit.MINUTES));
            return builder.build();
        } catch (Exception e) {
            throw new FDKError(e.getMessage());
        }
    }

    private static CookieJar addCookie(CookieStore cookieStore) {
        if(Objects.nonNull(cookieStore)) {
            CookieManager cookieManager = new CookieManager(cookieStore, CookiePolicy.ACCEPT_ALL);
            return new JavaNetCookieJar(cookieManager);
        }
        return null;
    }

    private void setApiBaseUrl(String baseUrl) {
        baseURL = baseUrl;
        builder =
                new Retrofit.Builder()
                        .addConverterFactory(JacksonConverterFactory.create())
                        .baseUrl(baseURL);
    }

    interface Constants {
        int READ_TIMEOUT = 15;
        int CONNECT_TIMEOUT = 30;
        int WRITE_TIMEOUT = 30;
        int KEEP_ALIVE = 5;
        int IDLE_CONNECTION = 0;
    }
}
