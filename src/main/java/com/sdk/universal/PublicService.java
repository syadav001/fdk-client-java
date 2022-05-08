package com.sdk.universal;

import com.sdk.common.*;
import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;


import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

public class PublicService {



@Getter
public static class ConfigurationService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ConfigurationApiList configurationApiList;

    ConfigurationService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.configurationApiList = generateConfigurationApiList(this.publicConfig.getPersistentCookieStore());
    }

    private ConfigurationApiList generateConfigurationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),ConfigurationApiList.class, interceptorList, cookieStore);
    }

    
    
    public PublicModels.ApplicationResponse searchApplication(String authorization , String query ) throws IOException {
    
        Response<PublicModels.ApplicationResponse> response = configurationApiList.searchApplication(authorization, query).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.Locations getLocations(String locationType , String id ) throws IOException {
    
        Response<PublicModels.Locations> response = configurationApiList.getLocations(locationType, id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
public static class WebhookService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private WebhookApiList webhookApiList;

    WebhookService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.webhookApiList = generateWebhookApiList(this.publicConfig.getPersistentCookieStore());
    }

    private WebhookApiList generateWebhookApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),WebhookApiList.class, interceptorList, cookieStore);
    }

    
    
    public PublicModels.EventConfigResponse fetchAllWebhookEvents() throws IOException {
    
        Response<PublicModels.EventConfigResponse> response = webhookApiList.fetchAllWebhookEvents().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.EventConfigResponse queryWebhookEventDetails(List<PublicModels.EventConfigBase> body) throws IOException {
    
        Response<PublicModels.EventConfigResponse> response = webhookApiList.queryWebhookEventDetails( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
public static class InventoryService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private InventoryApiList inventoryApiList;

    InventoryService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.inventoryApiList = generateInventoryApiList(this.publicConfig.getPersistentCookieStore());
    }

    private InventoryApiList generateInventoryApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),InventoryApiList.class, interceptorList, cookieStore);
    }

    
    
    public PublicModels.ResponseEnvelopeSlingshotConfigurationDetail getConfigByApiKey(String apikey ) throws IOException {
    
        Response<PublicModels.ResponseEnvelopeSlingshotConfigurationDetail> response = inventoryApiList.getConfigByApiKey(apikey).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.ResponseEnvelopeApikeyModel getApiKey(String userName , String password ) throws IOException {
    
        Response<PublicModels.ResponseEnvelopeApikeyModel> response = inventoryApiList.getApiKey(userName, password).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.ResponseEnvelopeJobConfigDTO getJobByCode(String code ) throws IOException {
    
        Response<PublicModels.ResponseEnvelopeJobConfigDTO> response = inventoryApiList.getJobByCode(code).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.ResponseEnvelopeListJobConfigDTO getJobConfigByIntegrationType(String integrationType , Boolean disable ) throws IOException {
    
        Response<PublicModels.ResponseEnvelopeListJobConfigDTO> response = inventoryApiList.getJobConfigByIntegrationType(integrationType, disable).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.ResponseEnvelopeObject getJobCodesMetrics(Boolean dailyJob , String jobCode ) throws IOException {
    
        Response<PublicModels.ResponseEnvelopeObject> response = inventoryApiList.getJobCodesMetrics(dailyJob, jobCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public PublicModels.ResponseEnvelopeEmailJobMetrics saveJobCodesMetrics(PublicModels.EmailJobMetrics body) throws IOException {
    
        Response<PublicModels.ResponseEnvelopeEmailJobMetrics> response = inventoryApiList.saveJobCodesMetrics( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}
}