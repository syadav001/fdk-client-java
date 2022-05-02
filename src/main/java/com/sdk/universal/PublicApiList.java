package com.sdk.universal;


import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;


interface ConfigurationApiList {
    
    @GET ("/service/common/configuration/v1.0/application/search-application")
    Call<PublicModels.ApplicationResponse> searchApplication(@Header("authorization") String authorization , @Query("query") String query );
    
    @GET ("/service/common/configuration/v1.0/location")
    Call<PublicModels.Locations> getLocations(@Query("location_type") String locationType , @Query("id") String id );
    
}

interface WebhookApiList {
    
    @GET ("/service/common/webhook/v1.0/events")
    Call<PublicModels.EventConfigResponse> fetchAllWebhookEvents();
    
    @POST ("/service/common/webhook/v1.0/events/query-event-details")
    Call<PublicModels.EventConfigResponse> queryWebhookEventDetails(@Body List<PublicModels.EventConfigBase> payload);
    
}

interface InventoryApiList {
    
    @GET ("/service/common/inventory/v1.0/company/slingshot")
    Call<PublicModels.ResponseEnvelopeSlingshotConfigurationDetail> getConfigByApiKey(@Query("apikey") String apikey );
    
    @GET ("/service/common/inventory/v1.0/company/slingshot/apikey")
    Call<PublicModels.ResponseEnvelopeObject> getApiKey(@Query("user_name") String userName , @Query("password") String password );
    
    @GET ("/service/common/inventory/v1.0/company/jobs/code/{code}")
    Call<PublicModels.ResponseEnvelopeJobConfigDTO> getJobByCode(@Path("code") String code );
    
    @GET ("/service/common/inventory/v1.0/company/job/config")
    Call<PublicModels.ResponseEnvelopeListJobConfigDTO> getJobConfigByIntegrationType(@Query("integration_type") String integrationType , @Query("disable") Boolean disable );
    
    @GET ("/service/common/inventory/v1.0/company/email/jobCode")
    Call<PublicModels.ResponseEnvelopeObject> getJobCodesMetrics(@Query("daily_job") Boolean dailyJob , @Query("job_code") String jobCode );
    
    @POST ("/service/common/inventory/v1.0/company/email/jobCode")
    Call<PublicModels.ResponseEnvelopeEmailJobMetrics> saveJobCodesMetrics(@Body PublicModels.EmailJobMetrics payload);
    
}
