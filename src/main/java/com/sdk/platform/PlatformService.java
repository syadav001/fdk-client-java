package com.sdk.platform;

import com.sdk.common.*;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

public class PlatformService {




public static class CommonService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private CommonApiList commonApiList;

    public CommonService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.commonApiList = generateCommonApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CommonApiList generateCommonApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CommonApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationResponse searchApplication(String authorization , String query ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationResponse> response = commonApiList.searchApplication(query ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Locations getLocations(String locationType , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Locations> response = commonApiList.getLocations(locationType , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    

}

}

public static class LeadService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private LeadApiList leadApiList;

    public LeadService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.leadApiList = generateLeadApiList(this.platformConfig.getPersistentCookieStore());
    }

    private LeadApiList generateLeadApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),LeadApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketList getTickets(Boolean items , Boolean filters , String q , String status , PlatformModels.PriorityEnum priority , String category , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketList> response = leadApiList.getTickets(this.companyId ,items , filters , q , status , priority , category , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getTickets
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.TicketList> getTicketsPagination(
        Boolean items ,
        Boolean filters ,
        String q ,
        String status ,
        PlatformModels.PriorityEnum priority ,
        String category ,
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.TicketList> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.TicketList callback = this.getTickets(
                
                 
                 items,
                 filters,
                 q,
                 status,
                 priority,
                 category,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Ticket createTicket(PlatformModels.AddTicketPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.createTicket(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Ticket getTicket(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.getTicket(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Ticket editTicket(String id ,PlatformModels.EditTicketPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.editTicket(this.companyId , id  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketHistory createHistory(String id ,PlatformModels.TicketHistoryPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketHistory> response = leadApiList.createHistory(this.companyId , id  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketHistoryList getTicketHistory(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketHistoryList> response = leadApiList.getTicketHistory(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketFeedbackList getFeedbacks(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketFeedbackList> response = leadApiList.getFeedbacks(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketFeedback submitFeedback(String id ,PlatformModels.TicketFeedbackPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketFeedback> response = leadApiList.submitFeedback(this.companyId , id  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetTokenForVideoRoomResponse getTokenForVideoRoom(String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetTokenForVideoRoomResponse> response = leadApiList.getTokenForVideoRoom(this.companyId , uniqueName  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetParticipantsInsideVideoRoomResponse getVideoParticipants(String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetParticipantsInsideVideoRoomResponse> response = leadApiList.getVideoParticipants(this.companyId , uniqueName  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketList getTickets(Boolean items , Boolean filters , String q , String status , PlatformModels.PriorityEnum priority , String category ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketList> response = leadApiList.getTickets(this.companyId , this.applicationId ,items , filters , q , status , priority , category ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Ticket getTicket(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.getTicket(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Ticket editTicket(String id ,PlatformModels.EditTicketPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.editTicket(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketHistory createHistory(String id ,PlatformModels.TicketHistoryPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketHistory> response = leadApiList.createHistory(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketHistoryList getTicketHistory(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketHistoryList> response = leadApiList.getTicketHistory(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CustomForm getCustomForm(String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomForm> response = leadApiList.getCustomForm(this.companyId , this.applicationId , slug ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CustomForm editCustomForm(String slug ,PlatformModels.EditCustomFormPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomForm> response = leadApiList.editCustomForm(this.companyId , this.applicationId , slug , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CustomFormList getCustomForms() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomFormList> response = leadApiList.getCustomForms(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CustomForm createCustomForm(PlatformModels.CreateCustomFormPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomForm> response = leadApiList.createCustomForm(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetTokenForVideoRoomResponse getTokenForVideoRoom(String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetTokenForVideoRoomResponse> response = leadApiList.getTokenForVideoRoom(this.companyId , this.applicationId , uniqueName ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetParticipantsInsideVideoRoomResponse getVideoParticipants(String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetParticipantsInsideVideoRoomResponse> response = leadApiList.getVideoParticipants(this.companyId , this.applicationId , uniqueName ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateVideoRoomResponse openVideoRoom(PlatformModels.CreateVideoRoomPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateVideoRoomResponse> response = leadApiList.openVideoRoom(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CloseVideoRoomResponse closeVideoRoom(String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CloseVideoRoomResponse> response = leadApiList.closeVideoRoom(this.companyId , this.applicationId , uniqueName ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}

}

public static class FeedbackService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private FeedbackApiList feedbackApiList;

    public FeedbackService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.feedbackApiList = generateFeedbackApiList(this.platformConfig.getPersistentCookieStore());
    }

    private FeedbackApiList generateFeedbackApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),FeedbackApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.FeedbackAttributes getAttributes(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FeedbackAttributes> response = feedbackApiList.getAttributes(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAttributes
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.FeedbackAttributes> getAttributesPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.FeedbackAttributes> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.FeedbackAttributes callback = this.getAttributes(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetReviewResponse getCustomerReviews(String id , String entityId , String entityType , String userId , String media , List<Double> rating , List<String> attributeRating , Boolean facets , String sort , String next , String start , String limit , String count , String pageId , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetReviewResponse> response = feedbackApiList.getCustomerReviews(this.companyId , this.applicationId ,id , entityId , entityType , userId , media , rating , attributeRating , facets , sort , next , start , limit , count , pageId , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getCustomerReviews
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.GetReviewResponse> getCustomerReviewsPagination(
        String id,
        String entityId,
        String entityType,
        String userId,
        String media,
        List<Double> rating,
        List<String> attributeRating,
        Boolean facets,
        String sort,
        String next,
        String start,
        String limit,
        String count,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GetReviewResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GetReviewResponse callback = this.getCustomerReviews(
                
                 
                 
                 id,
                 entityId,
                 entityType,
                 userId,
                 media,
                 rating,
                 attributeRating,
                 facets,
                 sort,
                 next,
                 start,
                 limit,
                 count,
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdateResponse updateApprove(String reviewId ,PlatformModels.ApproveRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateResponse> response = feedbackApiList.updateApprove(this.companyId , this.applicationId , reviewId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<PlatformModels.ActivityDump> getHistory(String reviewId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<PlatformModels.ActivityDump>> response = feedbackApiList.getHistory(this.companyId , this.applicationId , reviewId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TemplateGetResponse getApplicationTemplates(String pageId , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TemplateGetResponse> response = feedbackApiList.getApplicationTemplates(this.companyId , this.applicationId ,pageId , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getApplicationTemplates
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.TemplateGetResponse> getApplicationTemplatesPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.TemplateGetResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.TemplateGetResponse callback = this.getApplicationTemplates(
                
                 
                 
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.InsertResponse createTemplate(PlatformModels.TemplateRequestList body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InsertResponse> response = feedbackApiList.createTemplate(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Template getTemplateById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Template> response = feedbackApiList.getTemplateById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdateResponse updateTemplate(String id ,PlatformModels.UpdateTemplateRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateResponse> response = feedbackApiList.updateTemplate(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdateResponse updateTemplateStatus(String id ,PlatformModels.UpdateTemplateStatusRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateResponse> response = feedbackApiList.updateTemplateStatus(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}

}

public static class ThemeService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private ThemeApiList themeApiList;

    public ThemeService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.themeApiList = generateThemeApiList(this.platformConfig.getPersistentCookieStore());
    }

    private ThemeApiList generateThemeApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),ThemeApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AllAvailablePageSchema getAllPages(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AllAvailablePageSchema> response = themeApiList.getAllPages(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AvailablePageSchema createPage(String themeId ,PlatformModels.AvailablePageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AvailablePageSchema> response = themeApiList.createPage(this.companyId , this.applicationId , themeId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AllAvailablePageSchema updateMultiplePages(String themeId ,PlatformModels.AllAvailablePageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AllAvailablePageSchema> response = themeApiList.updateMultiplePages(this.companyId , this.applicationId , themeId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AvailablePageSchema getPage(String themeId , String pageValue ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AvailablePageSchema> response = themeApiList.getPage(this.companyId , this.applicationId , themeId , pageValue ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AvailablePageSchema updatePage(String themeId , String pageValue ,PlatformModels.AvailablePageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AvailablePageSchema> response = themeApiList.updatePage(this.companyId , this.applicationId , themeId , pageValue , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AvailablePageSchema deletePage(String themeId , String pageValue ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AvailablePageSchema> response = themeApiList.deletePage(this.companyId , this.applicationId , themeId , pageValue ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesListingResponseSchema getThemeLibrary(Integer pageSize , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesListingResponseSchema> response = themeApiList.getThemeLibrary(this.companyId , this.applicationId ,pageSize , pageNo ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema addToThemeLibrary(PlatformModels.AddThemeRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.addToThemeLibrary(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema applyTheme(PlatformModels.AddThemeRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.applyTheme(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpgradableThemeSchema isUpgradable(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpgradableThemeSchema> response = themeApiList.isUpgradable(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema upgradeTheme(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.upgradeTheme(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesListingResponseSchema getPublicThemes(Integer pageSize , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesListingResponseSchema> response = themeApiList.getPublicThemes(this.companyId , this.applicationId ,pageSize , pageNo ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema createTheme(PlatformModels.ThemesSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.createTheme(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema getAppliedTheme() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.getAppliedTheme(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.FontsSchema getFonts() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FontsSchema> response = themeApiList.getFonts(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema getThemeById(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.getThemeById(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema updateTheme(String themeId ,PlatformModels.ThemesSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.updateTheme(this.companyId , this.applicationId , themeId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema deleteTheme(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.deleteTheme(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema getThemeForPreview(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.getThemeForPreview(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema publishTheme(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.publishTheme(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema unpublishTheme(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.unpublishTheme(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema archiveTheme(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.archiveTheme(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ThemesSchema unarchiveTheme(String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.unarchiveTheme(this.companyId , this.applicationId , themeId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}

}

public static class UserService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private UserApiList userApiList;

    public UserService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.userApiList = generateUserApiList(this.platformConfig.getPersistentCookieStore());
    }

    private UserApiList generateUserApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),UserApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CustomerListResponseSchema getCustomers(String q , Integer pageSize , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomerListResponseSchema> response = userApiList.getCustomers(this.companyId , this.applicationId ,q , pageSize , pageNo ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UserSearchResponseSchema searchUsers(Object q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UserSearchResponseSchema> response = userApiList.searchUsers(this.companyId , this.applicationId ,q ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateUserResponseSchema createUser(PlatformModels.CreateUserRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateUserResponseSchema> response = userApiList.createUser(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateUserResponseSchema updateUser(String userId ,PlatformModels.UpdateUserRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateUserResponseSchema> response = userApiList.updateUser(this.companyId , this.applicationId , userId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateUserSessionResponseSchema createUserSession(PlatformModels.CreateUserSessionRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateUserSessionResponseSchema> response = userApiList.createUserSession(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PlatformSchema getPlatformConfig() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PlatformSchema> response = userApiList.getPlatformConfig(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PlatformSchema updatePlatformConfig(PlatformModels.PlatformSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PlatformSchema> response = userApiList.updatePlatformConfig(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}

}

public static class ContentService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private ContentApiList contentApiList;

    public ContentService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.contentApiList = generateContentApiList(this.platformConfig.getPersistentCookieStore());
    }

    private ContentApiList generateContentApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),ContentApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetAnnouncementListSchema getAnnouncementsList(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAnnouncementListSchema> response = contentApiList.getAnnouncementsList(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAnnouncementsList
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.GetAnnouncementListSchema> getAnnouncementsListPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GetAnnouncementListSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GetAnnouncementListSchema callback = this.getAnnouncementsList(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateAnnouncementSchema createAnnouncement(PlatformModels.AdminAnnouncementSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAnnouncementSchema> response = contentApiList.createAnnouncement(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AdminAnnouncementSchema getAnnouncementById(String announcementId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AdminAnnouncementSchema> response = contentApiList.getAnnouncementById(this.companyId , this.applicationId , announcementId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateAnnouncementSchema updateAnnouncement(String announcementId ,PlatformModels.AdminAnnouncementSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAnnouncementSchema> response = contentApiList.updateAnnouncement(this.companyId , this.applicationId , announcementId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateAnnouncementSchema updateAnnouncementSchedule(String announcementId ,PlatformModels.ScheduleSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAnnouncementSchema> response = contentApiList.updateAnnouncementSchedule(this.companyId , this.applicationId , announcementId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateAnnouncementSchema deleteAnnouncement(String announcementId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAnnouncementSchema> response = contentApiList.deleteAnnouncement(this.companyId , this.applicationId , announcementId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BlogSchema createBlog(PlatformModels.BlogRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogSchema> response = contentApiList.createBlog(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BlogGetResponse getBlogs(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogGetResponse> response = contentApiList.getBlogs(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getBlogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.BlogGetResponse> getBlogsPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.BlogGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.BlogGetResponse callback = this.getBlogs(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BlogSchema updateBlog(String id ,PlatformModels.BlogRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogSchema> response = contentApiList.updateBlog(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BlogSchema deleteBlog(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogSchema> response = contentApiList.deleteBlog(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BlogSchema getComponentById(String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogSchema> response = contentApiList.getComponentById(this.companyId , this.applicationId , slug ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DataLoaderResponseSchema addDataLoader(PlatformModels.DataLoaderSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DataLoaderResponseSchema> response = contentApiList.addDataLoader(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<PlatformModels.DataLoaderResponseSchema> getDataLoaders() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<PlatformModels.DataLoaderResponseSchema>> response = contentApiList.getDataLoaders(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DataLoaderResponseSchema deleteDataLoader(String dataLoaderId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DataLoaderResponseSchema> response = contentApiList.deleteDataLoader(this.companyId , this.applicationId , dataLoaderId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DataLoaderResponseSchema editDataLoader(String dataLoaderId ,PlatformModels.DataLoaderSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DataLoaderResponseSchema> response = contentApiList.editDataLoader(this.companyId , this.applicationId , dataLoaderId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<PlatformModels.DataLoaderResponseSchema> getDataLoadersByService(String serviceName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<PlatformModels.DataLoaderResponseSchema>> response = contentApiList.getDataLoadersByService(this.companyId , this.applicationId , serviceName ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DataLoaderResponseSchema selectDataLoader(String dataLoaderId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DataLoaderResponseSchema> response = contentApiList.selectDataLoader(this.companyId , this.applicationId , dataLoaderId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DataLoaderResetResponseSchema resetDataLoader(String service , String operationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DataLoaderResetResponseSchema> response = contentApiList.resetDataLoader(this.companyId , this.applicationId , service , operationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetFaqCategoriesSchema getFaqCategories() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetFaqCategoriesSchema> response = contentApiList.getFaqCategories(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetFaqCategoryBySlugSchema getFaqCategoryBySlugOrId(String idOrSlug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetFaqCategoryBySlugSchema> response = contentApiList.getFaqCategoryBySlugOrId(this.companyId , this.applicationId , idOrSlug ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateFaqCategorySchema createFaqCategory(PlatformModels.CreateFaqCategoryRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqCategorySchema> response = contentApiList.createFaqCategory(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateFaqCategorySchema updateFaqCategory(String id ,PlatformModels.UpdateFaqCategoryRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqCategorySchema> response = contentApiList.updateFaqCategory(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.FaqSchema deleteFaqCategory(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FaqSchema> response = contentApiList.deleteFaqCategory(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetFaqSchema getFaqsByCategoryIdOrSlug(String idOrSlug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetFaqSchema> response = contentApiList.getFaqsByCategoryIdOrSlug(this.companyId , this.applicationId , idOrSlug ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateFaqResponseSchema addFaq(String categoryId ,PlatformModels.CreateFaqSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqResponseSchema> response = contentApiList.addFaq(this.companyId , this.applicationId , categoryId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateFaqResponseSchema updateFaq(String categoryId , String faqId ,PlatformModels.CreateFaqSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqResponseSchema> response = contentApiList.updateFaq(this.companyId , this.applicationId , categoryId , faqId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateFaqResponseSchema deleteFaq(String categoryId , String faqId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqResponseSchema> response = contentApiList.deleteFaq(this.companyId , this.applicationId , categoryId , faqId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateFaqResponseSchema getFaqByIdOrSlug(String idOrSlug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqResponseSchema> response = contentApiList.getFaqByIdOrSlug(this.companyId , this.applicationId , idOrSlug ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.LandingPageGetResponse getLandingPages(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LandingPageGetResponse> response = contentApiList.getLandingPages(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getLandingPages
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.LandingPageGetResponse> getLandingPagesPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.LandingPageGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.LandingPageGetResponse callback = this.getLandingPages(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.LandingPageSchema createLandingPage(PlatformModels.LandingPageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LandingPageSchema> response = contentApiList.createLandingPage(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.LandingPageSchema updateLandingPage(String id ,PlatformModels.LandingPageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LandingPageSchema> response = contentApiList.updateLandingPage(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.LandingPageSchema deleteLandingPage(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LandingPageSchema> response = contentApiList.deleteLandingPage(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationLegal getLegalInformation() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationLegal> response = contentApiList.getLegalInformation(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationLegal updateLegalInformation(PlatformModels.ApplicationLegal body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationLegal> response = contentApiList.updateLegalInformation(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.NavigationGetResponse getNavigations(String devicePlatform , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationGetResponse> response = contentApiList.getNavigations(this.companyId , this.applicationId ,devicePlatform , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getNavigations
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.NavigationGetResponse> getNavigationsPagination(
        String devicePlatform,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.NavigationGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.NavigationGetResponse callback = this.getNavigations(
                
                 
                 
                 devicePlatform,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.NavigationSchema createNavigation(PlatformModels.NavigationRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationSchema> response = contentApiList.createNavigation(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DefaultNavigationResponse getDefaultNavigations() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DefaultNavigationResponse> response = contentApiList.getDefaultNavigations(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.NavigationSchema getNavigationBySlug(String slug , String devicePlatform ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationSchema> response = contentApiList.getNavigationBySlug(this.companyId , this.applicationId , slug ,devicePlatform ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.NavigationSchema updateNavigation(String id ,PlatformModels.NavigationRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationSchema> response = contentApiList.updateNavigation(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.NavigationSchema deleteNavigation(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationSchema> response = contentApiList.deleteNavigation(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PageMetaSchema getPageMeta() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageMetaSchema> response = contentApiList.getPageMeta(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PageSpec getPageSpec() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSpec> response = contentApiList.getPageSpec(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PageSchema createPagePreview(PlatformModels.PageRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.createPagePreview(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PageSchema updatePagePreview(String slug ,PlatformModels.PagePublishRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.updatePagePreview(this.companyId , this.applicationId , slug , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PageSchema deletePage(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.deletePage(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PathMappingSchema updatePathRedirectionRules(PlatformModels.PathMappingSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PathMappingSchema> response = contentApiList.updatePathRedirectionRules(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PathMappingSchema getPathRedirectionRules() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PathMappingSchema> response = contentApiList.getPathRedirectionRules(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SeoComponent getSEOConfiguration() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SeoComponent> response = contentApiList.getSEOConfiguration(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SeoSchema updateSEOConfiguration(PlatformModels.SeoComponent body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SeoSchema> response = contentApiList.updateSEOConfiguration(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SlideshowGetResponse getSlideshows(String devicePlatform , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowGetResponse> response = contentApiList.getSlideshows(this.companyId , this.applicationId ,devicePlatform , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSlideshows
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.SlideshowGetResponse> getSlideshowsPagination(
        String devicePlatform,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SlideshowGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SlideshowGetResponse callback = this.getSlideshows(
                
                 
                 
                 devicePlatform,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SlideshowSchema createSlideshow(PlatformModels.SlideshowRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowSchema> response = contentApiList.createSlideshow(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SlideshowSchema getSlideshowBySlug(String slug , String devicePlatform ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowSchema> response = contentApiList.getSlideshowBySlug(this.companyId , this.applicationId , slug ,devicePlatform ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SlideshowSchema updateSlideshow(String id ,PlatformModels.SlideshowRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowSchema> response = contentApiList.updateSlideshow(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SlideshowSchema deleteSlideshow(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowSchema> response = contentApiList.deleteSlideshow(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Support getSupportInformation() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Support> response = contentApiList.getSupportInformation(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Support updateSupportInformation(PlatformModels.Support body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Support> response = contentApiList.updateSupportInformation(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TagsSchema updateInjectableTag(PlatformModels.CreateTagRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.updateInjectableTag(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TagsSchema deleteAllInjectableTags() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.deleteAllInjectableTags(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TagsSchema getInjectableTags() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.getInjectableTags(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TagsSchema addInjectableTag(PlatformModels.CreateTagRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.addInjectableTag(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TagDeleteSuccessResponse removeInjectableTag(PlatformModels.RemoveHandpickedSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagDeleteSuccessResponse> response = contentApiList.removeInjectableTag(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TagsSchema editInjectableTag(String tagId ,PlatformModels.UpdateHandpickedSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.editInjectableTag(this.companyId , this.applicationId , tagId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PageSchema createPage(PlatformModels.PageRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.createPage(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PageGetResponse getPages(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageGetResponse> response = contentApiList.getPages(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getPages
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.PageGetResponse> getPagesPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.PageGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.PageGetResponse callback = this.getPages(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PageSchema updatePage(String id ,PlatformModels.PageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.updatePage(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PageSchema getPageBySlug(String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.getPageBySlug(this.companyId , this.applicationId , slug ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}

}

public static class BillingService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private BillingApiList billingApiList;

    public BillingService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.billingApiList = generateBillingApiList(this.platformConfig.getPersistentCookieStore());
    }

    private BillingApiList generateBillingApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),BillingApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CheckValidityResponse checkCouponValidity(String plan , String couponCode ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CheckValidityResponse> response = billingApiList.checkCouponValidity(this.companyId ,plan , couponCode ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateSubscriptionResponse createSubscriptionCharge(String extensionId ,PlatformModels.CreateSubscriptionCharge body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateSubscriptionResponse> response = billingApiList.createSubscriptionCharge(this.companyId , extensionId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EntitySubscription getSubscriptionCharge(String extensionId , String subscriptionId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EntitySubscription> response = billingApiList.getSubscriptionCharge(this.companyId , extensionId  , subscriptionId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EntitySubscription cancelSubscriptionCharge(String extensionId , String subscriptionId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EntitySubscription> response = billingApiList.cancelSubscriptionCharge(this.companyId , extensionId  , subscriptionId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Invoices getInvoices() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Invoices> response = billingApiList.getInvoices(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Invoice getInvoiceById(String invoiceId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Invoice> response = billingApiList.getInvoiceById(this.companyId , invoiceId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriptionCustomer getCustomerDetail() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionCustomer> response = billingApiList.getCustomerDetail(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriptionCustomer upsertCustomerDetail(PlatformModels.SubscriptionCustomerCreate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionCustomer> response = billingApiList.upsertCustomerDetail(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriptionStatus getSubscription() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionStatus> response = billingApiList.getSubscription(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriptionLimit getFeatureLimitConfig() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionLimit> response = billingApiList.getFeatureLimitConfig(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriptionActivateRes activateSubscriptionPlan(PlatformModels.SubscriptionActivateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionActivateRes> response = billingApiList.activateSubscriptionPlan(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CancelSubscriptionRes cancelSubscriptionPlan(PlatformModels.CancelSubscriptionReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CancelSubscriptionRes> response = billingApiList.cancelSubscriptionPlan(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class CommunicationService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private CommunicationApiList communicationApiList;

    public CommunicationService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.communicationApiList = generateCommunicationApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CommunicationApiList generateCommunicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CommunicationApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SystemNotifications getSystemNotifications(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SystemNotifications> response = communicationApiList.getSystemNotifications(this.companyId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSystemNotifications
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.SystemNotifications> getSystemNotificationsPagination(
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SystemNotifications> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SystemNotifications callback = this.getSystemNotifications(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Campaigns getCampaigns(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Campaigns> response = communicationApiList.getCampaigns(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getCampaigns
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.Campaigns> getCampaignsPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.Campaigns> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.Campaigns callback = this.getCampaigns(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Campaign createCampaign(PlatformModels.CampaignReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Campaign> response = communicationApiList.createCampaign(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Campaign getCampaignById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Campaign> response = communicationApiList.getCampaignById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Campaign updateCampaignById(String id ,PlatformModels.CampaignReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Campaign> response = communicationApiList.updateCampaignById(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetStats getStatsOfCampaignById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetStats> response = communicationApiList.getStatsOfCampaignById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Audiences getAudiences(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Audiences> response = communicationApiList.getAudiences(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAudiences
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.Audiences> getAudiencesPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.Audiences> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.Audiences callback = this.getAudiences(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Audience createAudience(PlatformModels.AudienceReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Audience> response = communicationApiList.createAudience(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BigqueryHeadersRes getBigqueryHeaders(PlatformModels.BigqueryHeadersReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BigqueryHeadersRes> response = communicationApiList.getBigqueryHeaders(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Audience getAudienceById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Audience> response = communicationApiList.getAudienceById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Audience updateAudienceById(String id ,PlatformModels.AudienceReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Audience> response = communicationApiList.updateAudienceById(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetNRecordsCsvRes getNSampleRecordsFromCsv(PlatformModels.GetNRecordsCsvReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetNRecordsCsvRes> response = communicationApiList.getNSampleRecordsFromCsv(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EmailProviders getEmailProviders(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailProviders> response = communicationApiList.getEmailProviders(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getEmailProviders
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.EmailProviders> getEmailProvidersPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.EmailProviders> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.EmailProviders callback = this.getEmailProviders(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EmailProvider createEmailProvider(PlatformModels.EmailProviderReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailProvider> response = communicationApiList.createEmailProvider(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EmailProvider getEmailProviderById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailProvider> response = communicationApiList.getEmailProviderById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EmailProvider updateEmailProviderById(String id ,PlatformModels.EmailProviderReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailProvider> response = communicationApiList.updateEmailProviderById(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EmailTemplates getEmailTemplates(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplates> response = communicationApiList.getEmailTemplates(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getEmailTemplates
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.EmailTemplates> getEmailTemplatesPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.EmailTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.EmailTemplates callback = this.getEmailTemplates(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EmailTemplateRes createEmailTemplate(PlatformModels.EmailTemplateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplateRes> response = communicationApiList.createEmailTemplate(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SystemEmailTemplates getSystemEmailTemplates(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SystemEmailTemplates> response = communicationApiList.getSystemEmailTemplates(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSystemEmailTemplates
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.SystemEmailTemplates> getSystemEmailTemplatesPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SystemEmailTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SystemEmailTemplates callback = this.getSystemEmailTemplates(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EmailTemplate getEmailTemplateById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplate> response = communicationApiList.getEmailTemplateById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EmailTemplateRes updateEmailTemplateById(String id ,PlatformModels.EmailTemplateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplateRes> response = communicationApiList.updateEmailTemplateById(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EmailTemplateDeleteSuccessRes deleteEmailTemplateById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplateDeleteSuccessRes> response = communicationApiList.deleteEmailTemplateById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EventSubscriptions getEventSubscriptions(Integer pageNo , Integer pageSize , String populate ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EventSubscriptions> response = communicationApiList.getEventSubscriptions(this.companyId , this.applicationId ,pageNo , pageSize , populate ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getEventSubscriptions
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.EventSubscriptions> getEventSubscriptionsPagination(
        Integer pageSize,
        String populate
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.EventSubscriptions> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.EventSubscriptions callback = this.getEventSubscriptions(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 populate
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Jobs getJobs(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Jobs> response = communicationApiList.getJobs(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getJobs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.Jobs> getJobsPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.Jobs> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.Jobs callback = this.getJobs(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TriggerJobResponse triggerCampaignJob(PlatformModels.TriggerJobRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TriggerJobResponse> response = communicationApiList.triggerCampaignJob(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.JobLogs getJobLogs(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.JobLogs> response = communicationApiList.getJobLogs(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getJobLogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.JobLogs> getJobLogsPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.JobLogs> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.JobLogs callback = this.getJobLogs(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Logs getCommunicationLogs(String pageId , Integer pageSize , Object sort , Object query ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Logs> response = communicationApiList.getCommunicationLogs(this.companyId , this.applicationId ,pageId , pageSize , sort , query ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getCommunicationLogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.Logs> getCommunicationLogsPagination(
        Integer pageSize,
        Object sort,
        Object query
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.Logs> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.Logs callback = this.getCommunicationLogs(
                
                 
                 
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                ,
                 sort,
                 query
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SmsProviders getSmsProviders(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsProviders> response = communicationApiList.getSmsProviders(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSmsProviders
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.SmsProviders> getSmsProvidersPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SmsProviders> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SmsProviders callback = this.getSmsProviders(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SmsProvider createSmsProvider(PlatformModels.SmsProviderReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsProvider> response = communicationApiList.createSmsProvider(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SmsProvider getSmsProviderById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsProvider> response = communicationApiList.getSmsProviderById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SmsProvider updateSmsProviderById(String id ,PlatformModels.SmsProviderReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsProvider> response = communicationApiList.updateSmsProviderById(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SmsTemplates getSmsTemplates(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplates> response = communicationApiList.getSmsTemplates(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSmsTemplates
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.SmsTemplates> getSmsTemplatesPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SmsTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SmsTemplates callback = this.getSmsTemplates(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SmsTemplateRes createSmsTemplate(PlatformModels.SmsTemplateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplateRes> response = communicationApiList.createSmsTemplate(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SmsTemplate getSmsTemplateById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplate> response = communicationApiList.getSmsTemplateById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SmsTemplateRes updateSmsTemplateById(String id ,PlatformModels.SmsTemplateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplateRes> response = communicationApiList.updateSmsTemplateById(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SmsTemplateDeleteSuccessRes deleteSmsTemplateById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplateDeleteSuccessRes> response = communicationApiList.deleteSmsTemplateById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SystemSmsTemplates getSystemSystemTemplates(Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SystemSmsTemplates> response = communicationApiList.getSystemSystemTemplates(this.companyId , this.applicationId ,pageNo , pageSize , sort ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSystemSystemTemplates
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.SystemSmsTemplates> getSystemSystemTemplatesPagination(
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SystemSmsTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SystemSmsTemplates callback = this.getSystemSystemTemplates(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    

}

}

public static class PaymentService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private PaymentApiList paymentApiList;

    public PaymentService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.paymentApiList = generatePaymentApiList(this.platformConfig.getPersistentCookieStore());
    }

    private PaymentApiList generatePaymentApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),PaymentApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PayoutsResponse getAllPayouts(String uniqueExternalId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PayoutsResponse> response = paymentApiList.getAllPayouts(this.companyId ,uniqueExternalId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PayoutResponse savePayout(PlatformModels.PayoutRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PayoutResponse> response = paymentApiList.savePayout(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdatePayoutResponse updatePayout(String uniqueTransferNo ,PlatformModels.PayoutRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdatePayoutResponse> response = paymentApiList.updatePayout(this.companyId , uniqueTransferNo  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdatePayoutResponse activateAndDectivatePayout(String uniqueTransferNo ,PlatformModels.UpdatePayoutRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdatePayoutResponse> response = paymentApiList.activateAndDectivatePayout(this.companyId , uniqueTransferNo  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DeletePayoutResponse deletePayout(String uniqueTransferNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeletePayoutResponse> response = paymentApiList.deletePayout(this.companyId , uniqueTransferNo  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriptionPaymentMethodResponse getSubscriptionPaymentMethod(String uniqueExternalId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionPaymentMethodResponse> response = paymentApiList.getSubscriptionPaymentMethod(this.companyId ,uniqueExternalId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DeleteSubscriptionPaymentMethodResponse deleteSubscriptionPaymentMethod(String uniqueExternalId , String paymentMethodId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeleteSubscriptionPaymentMethodResponse> response = paymentApiList.deleteSubscriptionPaymentMethod(this.companyId ,uniqueExternalId , paymentMethodId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriptionConfigResponse getSubscriptionConfig() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionConfigResponse> response = paymentApiList.getSubscriptionConfig(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SaveSubscriptionSetupIntentResponse saveSubscriptionSetupIntent(PlatformModels.SaveSubscriptionSetupIntentRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SaveSubscriptionSetupIntentResponse> response = paymentApiList.saveSubscriptionSetupIntent(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.IfscCodeResponse verifyIfscCode(String ifscCode ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.IfscCodeResponse> response = paymentApiList.verifyIfscCode(this.companyId ,ifscCode ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PaymentGatewayConfigResponse getBrandPaymentGatewayConfig() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentGatewayConfigResponse> response = paymentApiList.getBrandPaymentGatewayConfig(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PaymentGatewayToBeReviewed saveBrandPaymentGatewayConfig(PlatformModels.PaymentGatewayConfigRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentGatewayToBeReviewed> response = paymentApiList.saveBrandPaymentGatewayConfig(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PaymentGatewayToBeReviewed updateBrandPaymentGatewayConfig(PlatformModels.PaymentGatewayConfigRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentGatewayToBeReviewed> response = paymentApiList.updateBrandPaymentGatewayConfig(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PaymentOptionsResponse getPaymentModeRoutes(Boolean refresh , String requestType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentOptionsResponse> response = paymentApiList.getPaymentModeRoutes(this.companyId , this.applicationId ,refresh , requestType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.RefundAccountResponse addBeneficiaryDetails(PlatformModels.AddBeneficiaryDetailsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.RefundAccountResponse> response = paymentApiList.addBeneficiaryDetails(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderBeneficiaryResponse getUserOrderBeneficiaries(String orderId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderBeneficiaryResponse> response = paymentApiList.getUserOrderBeneficiaries(this.companyId , this.applicationId ,orderId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderBeneficiaryResponse getUserBeneficiaries(String orderId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderBeneficiaryResponse> response = paymentApiList.getUserBeneficiaries(this.companyId , this.applicationId ,orderId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PaymentConfirmationResponse confirmPayment(PlatformModels.PaymentConfirmationRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentConfirmationResponse> response = paymentApiList.confirmPayment(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}

}

public static class OrderService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private OrderApiList orderApiList;

    public OrderService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.orderApiList = generateOrderApiList(this.platformConfig.getPersistentCookieStore());
    }

    private OrderApiList generateOrderApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),OrderApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdateShipmentStatusResponse shipmentStatusUpdate(PlatformModels.UpdateShipmentStatusBody body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateShipmentStatusResponse> response = orderApiList.shipmentStatusUpdate(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetActivityStatus activityStatus(String bagId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetActivityStatus> response = orderApiList.activityStatus(this.companyId ,bagId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdateProcessShipmenstRequestResponse storeProcessShipmentUpdate(PlatformModels.UpdateProcessShipmenstRequestBody body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateProcessShipmenstRequestResponse> response = orderApiList.storeProcessShipmentUpdate(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Object checkRefund(String shipmentId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = orderApiList.checkRefund(this.companyId , shipmentId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CanBreakResponse ShipmentBagsCanBreak(PlatformModels.CanBreakRequestBody body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CanBreakResponse> response = orderApiList.ShipmentBagsCanBreak(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderListing getOrdersByCompanyId(String pageNo , String pageSize , String fromDate , String toDate , Boolean isPrioritySort , Boolean lockStatus , String q , String stage , String salesChannels , String orderId , String stores , String deploymentStores , String status , String dp , Boolean shortenUrls , String filterType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderListing> response = orderApiList.getOrdersByCompanyId(this.companyId ,pageNo , pageSize , fromDate , toDate , isPrioritySort , lockStatus , q , stage , salesChannels , orderId , stores , deploymentStores , status , dp , shortenUrls , filterType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderLanesCount getOrderLanesCountByCompanyId(String pageNo , String pageSize , String fromDate , String toDate , String q , String stage , String salesChannels , String orderId , String stores , String status , Boolean shortenUrls , String filterType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderLanesCount> response = orderApiList.getOrderLanesCountByCompanyId(this.companyId ,pageNo , pageSize , fromDate , toDate , q , stage , salesChannels , orderId , stores , status , shortenUrls , filterType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderDetails getOrderDetails(String orderId , String next , String previous ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderDetails> response = orderApiList.getOrderDetails(this.companyId ,orderId , next , previous ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderPicklistListing getPicklistOrdersByCompanyId(String pageNo , String pageSize , String fromDate , String toDate , String q , String stage , String salesChannels , String orderId , String stores , String status , Boolean shortenUrls , String filterType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderPicklistListing> response = orderApiList.getPicklistOrdersByCompanyId(this.companyId ,pageNo , pageSize , fromDate , toDate , q , stage , salesChannels , orderId , stores , status , shortenUrls , filterType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetShipmentAddressResponse getShipmentAddress(String shipmentId , String addressCategory ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetShipmentAddressResponse> response = orderApiList.getShipmentAddress(this.companyId , shipmentId  , addressCategory  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdateShipmentAddressResponse updateShipmentAddress(String shipmentId , String addressCategory ,PlatformModels.UpdateShipmentAddressRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateShipmentAddressResponse> response = orderApiList.updateShipmentAddress(this.companyId , shipmentId  , addressCategory  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetPingResponse getPing() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetPingResponse> response = orderApiList.getPing(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetVoiceCallbackResponse voiceCallback() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetVoiceCallbackResponse> response = orderApiList.voiceCallback(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetClickToCallResponse voiceClickToCall(String caller , String receiver ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetClickToCallResponse> response = orderApiList.voiceClickToCall(this.companyId ,caller , receiver ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderDetails getOrderDetails(String orderId , String next , String previous ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderDetails> response = orderApiList.getOrderDetails(this.companyId , this.applicationId ,orderId , next , previous ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PlatformShipmentTrack trackShipmentPlatform(String shipmentId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PlatformShipmentTrack> response = orderApiList.trackShipmentPlatform(this.companyId , this.applicationId , shipmentId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PlatformOrderTrack trackOrder(String orderId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PlatformOrderTrack> response = orderApiList.trackOrder(this.companyId , this.applicationId , orderId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.FailedOrders failedOrders() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FailedOrders> response = orderApiList.failedOrders(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdateOrderReprocessResponse reprocessOrder(String orderId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateOrderReprocessResponse> response = orderApiList.reprocessOrder(this.companyId , this.applicationId , orderId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ShipmentUpdateResponse updateShipment(String shipmentId ,PlatformModels.ShipmentUpdateRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShipmentUpdateResponse> response = orderApiList.updateShipment(this.companyId , this.applicationId , shipmentId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ShipmentReasonsResponse getPlatformShipmentReasons(String action ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShipmentReasonsResponse> response = orderApiList.getPlatformShipmentReasons(this.companyId , this.applicationId , action ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ShipmentTrackResponse getShipmentTrackDetails(String orderId , String shipmentId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShipmentTrackResponse> response = orderApiList.getShipmentTrackDetails(this.companyId , this.applicationId , orderId , shipmentId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderListing getOrdersByApplicationId(String pageNo , String pageSize , String fromDate , String toDate , String q , String stage , String salesChannels , String orderId , String stores , String status , String dp , Boolean shortenUrls , String filterType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderListing> response = orderApiList.getOrdersByApplicationId(this.companyId , this.applicationId ,pageNo , pageSize , fromDate , toDate , q , stage , salesChannels , orderId , stores , status , dp , shortenUrls , filterType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    

}

}

public static class CatalogService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private CatalogApiList catalogApiList;

    public CatalogService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.catalogApiList = generateCatalogApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CatalogApiList generateCatalogApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CatalogApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetProductBundleListingResponse getProductBundle(String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetProductBundleListingResponse> response = catalogApiList.getProductBundle(this.companyId ,q ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetProductBundleCreateResponse createProductBundle(PlatformModels.ProductBundleRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetProductBundleCreateResponse> response = catalogApiList.createProductBundle(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetProductBundleCreateResponse updateProductBundle(String id ,PlatformModels.ProductBundleUpdateRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetProductBundleCreateResponse> response = catalogApiList.updateProductBundle(this.companyId , id  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetProductBundleResponse getProductBundleDetail(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetProductBundleResponse> response = catalogApiList.getProductBundleDetail(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ListSizeGuide getSizeGuides(Boolean active , String q , String tag , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ListSizeGuide> response = catalogApiList.getSizeGuides(this.companyId ,active , q , tag , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createSizeGuide(PlatformModels.ValidateSizeGuide body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createSizeGuide(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse updateSizeGuide(String id ,PlatformModels.ValidateSizeGuide body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.updateSizeGuide(this.companyId , id  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SizeGuideResponse getSizeGuide(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SizeGuideResponse> response = catalogApiList.getSizeGuide(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CrossSellingResponse getSellerInsights(String sellerAppId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CrossSellingResponse> response = catalogApiList.getSellerInsights(this.companyId , sellerAppId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdatedResponse createMarketplaceOptin(String marketplace ,PlatformModels.OptInPostRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdatedResponse> response = catalogApiList.createMarketplaceOptin(this.companyId , marketplace  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetOptInPlatform getMarketplaceOptinDetail() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetOptInPlatform> response = catalogApiList.getMarketplaceOptinDetail(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OptinCompanyDetail getCompanyDetail() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptinCompanyDetail> response = catalogApiList.getCompanyDetail(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OptinCompanyBrandDetailsView getCompanyBrandDetail(Boolean isActive , Boolean q , Integer pageNo , Integer pageSize , String marketplace ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptinCompanyBrandDetailsView> response = catalogApiList.getCompanyBrandDetail(this.companyId ,isActive , q , pageNo , pageSize , marketplace ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OptinCompanyMetrics getCompanyMetrics() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptinCompanyMetrics> response = catalogApiList.getCompanyMetrics(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OptinStoreDetails getStoreDetail(String q , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptinStoreDetails> response = catalogApiList.getStoreDetail(this.companyId ,q , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GenderDetail getGenderAttribute(String attributeSlug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GenderDetail> response = catalogApiList.getGenderAttribute(this.companyId , attributeSlug  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProdcutTemplateCategoriesResponse listProductTemplateCategories(String departments , String itemType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProdcutTemplateCategoriesResponse> response = catalogApiList.listProductTemplateCategories(this.companyId ,departments , itemType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DepartmentsResponse listDepartmentsData(Integer pageNo , Integer pageSize , String name , String search , Boolean isActive ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DepartmentsResponse> response = catalogApiList.listDepartmentsData(this.companyId ,pageNo , pageSize , name , search , isActive ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DepartmentsResponse getDepartmentData(String uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DepartmentsResponse> response = catalogApiList.getDepartmentData(this.companyId , uid  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TemplatesResponse listProductTemplate(String department ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TemplatesResponse> response = catalogApiList.listProductTemplate(this.companyId ,department ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TemplatesValidationResponse validateProductTemplate(String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TemplatesValidationResponse> response = catalogApiList.validateProductTemplate(this.companyId , slug  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Object downloadProductTemplateViews(String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = catalogApiList.downloadProductTemplateViews(this.companyId , slug  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Object downloadProductTemplateView(String itemType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = catalogApiList.downloadProductTemplateView(this.companyId ,itemType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.InventoryValidationResponse validateProductTemplateSchema(String itemType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryValidationResponse> response = catalogApiList.validateProductTemplateSchema(this.companyId ,itemType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.HSNCodesResponse listHSNCodes() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HSNCodesResponse> response = catalogApiList.listHSNCodes(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProductDownloadsResponse listProductTemplateExportDetails() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductDownloadsResponse> response = catalogApiList.listProductTemplateExportDetails(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProductConfigurationDownloads listTemplateBrandTypeValues(String filter ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductConfigurationDownloads> response = catalogApiList.listTemplateBrandTypeValues(this.companyId ,filter ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CategoryResponse listCategories(String level , String departments , String q , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CategoryResponse> response = catalogApiList.listCategories(this.companyId ,level , departments , q , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CategoryCreateResponse createCategories(PlatformModels.CategoryRequestBody body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CategoryCreateResponse> response = catalogApiList.createCategories(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CategoryUpdateResponse updateCategory(String uid ,PlatformModels.CategoryRequestBody body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CategoryUpdateResponse> response = catalogApiList.updateCategory(this.companyId , uid  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SingleCategoryResponse getCategoryData(String uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SingleCategoryResponse> response = catalogApiList.getCategoryData(this.companyId , uid  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProductListingResponse getProducts(List<Integer> brandIds , List<Integer> categoryIds , List<Integer> itemIds , List<Integer> departmentIds , List<String> itemCode , String q , List<String> tags , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductListingResponse> response = catalogApiList.getProducts(this.companyId ,brandIds , categoryIds , itemIds , departmentIds , itemCode , q , tags , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createProduct(PlatformModels.ProductCreateUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createProduct(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse editProduct(Integer itemId ,PlatformModels.ProductCreateUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.editProduct(this.companyId , itemId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Product getProduct(String itemCode , Integer itemId , Integer brandUid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Product> response = catalogApiList.getProduct(this.companyId , itemId  ,itemCode , brandUid ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse deleteProduct(Integer itemId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.deleteProduct(this.companyId , itemId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ValidateProduct getProductValidation() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ValidateProduct> response = catalogApiList.getProductValidation(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProductListingResponse getProductSize(String itemCode , Integer itemId , Integer brandUid , Integer uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductListingResponse> response = catalogApiList.getProductSize(this.companyId , itemId  ,itemCode , brandUid , uid ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProductBulkRequestList getProductBulkUploadHistory(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductBulkRequestList> response = catalogApiList.getProductBulkUploadHistory(this.companyId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse updateProductAssetsInBulk(PlatformModels.BulkJob body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.updateProductAssetsInBulk(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createProductsInBulk(String batchId ,PlatformModels.BulkProductRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createProductsInBulk(this.companyId , batchId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse deleteProductBulkJob(Integer batchId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.deleteProductBulkJob(this.companyId , batchId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProductTagsViewResponse getProductTags() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductTagsViewResponse> response = catalogApiList.getProductTags(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BulkAssetResponse getProductAssetsInBulk(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkAssetResponse> response = catalogApiList.getProductAssetsInBulk(this.companyId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createProductAssetsInBulk(PlatformModels.ProductBulkAssets body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createProductAssetsInBulk(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProductSizeDeleteResponse deleteSize(Integer itemId , Integer size ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductSizeDeleteResponse> response = catalogApiList.deleteSize(this.companyId , itemId  , size  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.InventoryResponse getInventoryBySize(String itemId , String size , Integer pageNo , Integer pageSize , String q , Boolean sellable ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryResponse> response = catalogApiList.getInventoryBySize(this.companyId , itemId  , size  ,pageNo , pageSize , q , sellable ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse addInventory(Double itemId , String size ,PlatformModels.InventoryRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.addInventory(this.companyId , itemId  , size  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.InventoryResponse getInventoryBySizeIdentifier(String itemId , String sizeIdentifier , Integer pageNo , Integer pageSize , String q , List<Integer> locationIds ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryResponse> response = catalogApiList.getInventoryBySizeIdentifier(this.companyId , itemId  , sizeIdentifier  ,pageNo , pageSize , q , locationIds ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.InventoryDelete deleteInventory(String size , Integer itemId , Double locationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryDelete> response = catalogApiList.deleteInventory(this.companyId , size  , itemId  , locationId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BulkInventoryGet getInventoryBulkUploadHistory(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkInventoryGet> response = catalogApiList.getInventoryBulkUploadHistory(this.companyId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CommonResponse createBulkInventoryJob(PlatformModels.BulkJob body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CommonResponse> response = catalogApiList.createBulkInventoryJob(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createBulkInventory(String batchId ,PlatformModels.InventoryBulkRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createBulkInventory(this.companyId , batchId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse deleteBulkInventoryJob(String batchId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.deleteBulkInventoryJob(this.companyId , batchId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.InventoryExportJob getInventoryExport() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryExportJob> response = catalogApiList.getInventoryExport(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createInventoryExportJob(PlatformModels.InventoryExportRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createInventoryExportJob(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.InventoryConfig exportInventoryConfig(String filterType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryConfig> response = catalogApiList.exportInventoryConfig(this.companyId ,filterType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.HsnCodesListingResponse getAllHsnCodes(Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HsnCodesListingResponse> response = catalogApiList.getAllHsnCodes(this.companyId ,pageNo , pageSize , q ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.HsnCode createHsnCode(PlatformModels.HsnUpsert body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HsnCode> response = catalogApiList.createHsnCode(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.HsnCode updateHsnCode(String id ,PlatformModels.HsnUpsert body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HsnCode> response = catalogApiList.updateHsnCode(this.companyId , id  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.HsnCode getHsnCode(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HsnCode> response = catalogApiList.getHsnCode(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BulkHsnResponse bulkHsnCode(PlatformModels.BulkHsnUpsert body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkHsnResponse> response = catalogApiList.bulkHsnCode(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.StoreAssignResponse getOptimalLocations(PlatformModels.AssignStore body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StoreAssignResponse> response = catalogApiList.getOptimalLocations(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetSearchWordsData updateSearchKeywords(String id ,PlatformModels.CreateSearchKeyword body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetSearchWordsData> response = catalogApiList.updateSearchKeywords(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetSearchWordsDetailResponse getSearchKeywords(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetSearchWordsDetailResponse> response = catalogApiList.getSearchKeywords(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DeleteResponse deleteSearchKeywords(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeleteResponse> response = catalogApiList.deleteSearchKeywords(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetSearchWordsResponse getAllSearchKeyword() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetSearchWordsResponse> response = catalogApiList.getAllSearchKeyword(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetSearchWordsData createCustomKeyword(PlatformModels.CreateSearchKeyword body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetSearchWordsData> response = catalogApiList.createCustomKeyword(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetAutocompleteWordsResponse updateAutocompleteKeyword(String id ,PlatformModels.CreateAutocompleteKeyword body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAutocompleteWordsResponse> response = catalogApiList.updateAutocompleteKeyword(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetAutocompleteWordsResponse getAutocompleteKeywordDetail(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAutocompleteWordsResponse> response = catalogApiList.getAutocompleteKeywordDetail(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DeleteResponse deleteAutocompleteKeyword(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeleteResponse> response = catalogApiList.deleteAutocompleteKeyword(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetAutocompleteWordsResponse getAutocompleteConfig() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAutocompleteWordsResponse> response = catalogApiList.getAutocompleteConfig(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateAutocompleteWordsResponse createCustomAutocompleteRule(PlatformModels.CreateAutocompleteKeyword body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAutocompleteWordsResponse> response = catalogApiList.createCustomAutocompleteRule(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetCatalogConfigurationMetaData getCatalogConfiguration() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCatalogConfigurationMetaData> response = catalogApiList.getCatalogConfiguration(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetAppCatalogConfiguration getConfigurations() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAppCatalogConfiguration> response = catalogApiList.getConfigurations(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetAppCatalogConfiguration createConfigurationProductListing(PlatformModels.AppConfiguration body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAppCatalogConfiguration> response = catalogApiList.createConfigurationProductListing(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetAppCatalogEntityConfiguration getConfigurationByType(String type ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAppCatalogEntityConfiguration> response = catalogApiList.getConfigurationByType(this.companyId , this.applicationId , type ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetAppCatalogConfiguration createConfigurationByType(String type ,PlatformModels.AppConfiguration body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAppCatalogConfiguration> response = catalogApiList.createConfigurationByType(this.companyId , this.applicationId , type , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetCollectionQueryOptionResponse getQueryFilters() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCollectionQueryOptionResponse> response = catalogApiList.getQueryFilters(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetCollectionListingResponse getAllCollections() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCollectionListingResponse> response = catalogApiList.getAllCollections(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CollectionCreateResponse createCollection(PlatformModels.CreateCollection body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CollectionCreateResponse> response = catalogApiList.createCollection(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CollectionDetailResponse getCollectionDetail(String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CollectionDetailResponse> response = catalogApiList.getCollectionDetail(this.companyId , this.applicationId , slug ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdateCollection updateCollection(String id ,PlatformModels.UpdateCollection body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateCollection> response = catalogApiList.updateCollection(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DeleteResponse deleteCollection(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeleteResponse> response = catalogApiList.deleteCollection(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetCollectionItemsResponse getCollectionItems(String id , String sortOn , String pageId , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCollectionItemsResponse> response = catalogApiList.getCollectionItems(this.companyId , this.applicationId , id ,sortOn , pageId , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UpdatedResponse addCollectionItems(String id ,PlatformModels.CollectionItemRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdatedResponse> response = catalogApiList.addCollectionItems(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CatalogInsightResponse getCatalogInsights(String brand ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CatalogInsightResponse> response = catalogApiList.getCatalogInsights(this.companyId , this.applicationId ,brand ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.InventoryResponse getDiscountedInventoryBySizeIdentifier(Integer itemId , String sizeIdentifier , Integer pageNo , Integer pageSize , String q , List<Integer> locationIds ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryResponse> response = catalogApiList.getDiscountedInventoryBySizeIdentifier(this.companyId , this.applicationId , itemId , sizeIdentifier ,pageNo , pageSize , q , locationIds ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BrandListingResponse getApplicationBrands(String department , Integer pageNo , Integer pageSize , String q , List<Integer> brandId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BrandListingResponse> response = catalogApiList.getApplicationBrands(this.companyId , this.applicationId ,department , pageNo , pageSize , q , brandId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getApplicationBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.BrandListingResponse> getApplicationBrandsPagination(
        String department,
        Integer pageSize,
        String q,
        List<Integer> brandId
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.BrandListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.BrandListingResponse callback = this.getApplicationBrands(
                
                 
                 
                 department,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 brandId
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DepartmentResponse getDepartments() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DepartmentResponse> response = catalogApiList.getDepartments(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CategoryListingResponse getCategories(String department ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CategoryListingResponse> response = catalogApiList.getCategories(this.companyId , this.applicationId ,department ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationProductListingResponse getAppicationProducts(String q , String f , Boolean filters , String sortOn , String pageId , Integer pageSize , Integer pageNo , String pageType , List<Integer> itemIds ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationProductListingResponse> response = catalogApiList.getAppicationProducts(this.companyId , this.applicationId ,q , f , filters , sortOn , pageId , pageSize , pageNo , pageType , itemIds ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAppicationProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.ApplicationProductListingResponse> getAppicationProductsPagination(
        String q,
        String f,
        Boolean filters,
        String sortOn,
        Integer pageSize,
        List<Integer> itemIds
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.ApplicationProductListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.ApplicationProductListingResponse callback = this.getAppicationProducts(
                
                 
                 
                 q,
                 f,
                 filters,
                 sortOn,
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                ,
                 paginator.getPageNo()
                ,
                 paginator.getPageType()
                ,
                 itemIds
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProductDetail getProductDetailBySlug(String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductDetail> response = catalogApiList.getProductDetailBySlug(this.companyId , this.applicationId , slug ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ProductListingResponse getAppProducts(List<Integer> brandIds , List<Integer> categoryIds , List<Integer> departmentIds , List<String> tags , Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductListingResponse> response = catalogApiList.getAppProducts(this.companyId , this.applicationId ,brandIds , categoryIds , departmentIds , tags , pageNo , pageSize , q ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.LocationListSerializer getAppLocations(String storeType , List<Integer> uid , String q , String stage , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LocationListSerializer> response = catalogApiList.getAppLocations(this.companyId , this.applicationId ,storeType , uid , q , stage , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAppLocations
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.LocationListSerializer> getAppLocationsPagination(
        String storeType,
        List<Integer> uid,
        String q,
        String stage,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.LocationListSerializer> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.LocationListSerializer callback = this.getAppLocations(
                
                 
                 
                 storeType,
                 uid,
                 q,
                 stage,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    

}

}

public static class CompanyProfileService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private CompanyProfileApiList companyprofileApiList;

    public CompanyProfileService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.companyprofileApiList = generateCompanyprofileApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CompanyProfileApiList generateCompanyprofileApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CompanyProfileApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse updateCompany(PlatformModels.UpdateCompany body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.updateCompany(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetCompanyProfileSerializerResponse cbsOnboardGet() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCompanyProfileSerializerResponse> response = companyprofileApiList.cbsOnboardGet(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.MetricsSerializer getCompanyMetrics() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.MetricsSerializer> response = companyprofileApiList.getCompanyMetrics(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse editBrand(String brandId ,PlatformModels.CreateUpdateBrandRequestSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.editBrand(this.companyId , brandId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetBrandResponseSerializer getBrand(String brandId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetBrandResponseSerializer> response = companyprofileApiList.getBrand(this.companyId , brandId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createBrand(PlatformModels.CreateUpdateBrandRequestSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.createBrand(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createCompanyBrandMapping(PlatformModels.CompanyBrandPostRequestSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.createCompanyBrandMapping(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CompanyBrandListSerializer getBrands(Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompanyBrandListSerializer> response = companyprofileApiList.getBrands(this.companyId ,pageNo , pageSize , q ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.CompanyBrandListSerializer> getBrandsPagination(
        Integer pageSize ,
        String q 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.CompanyBrandListSerializer> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.CompanyBrandListSerializer callback = this.getBrands(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createLocation(PlatformModels.LocationSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.createLocation(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.LocationListSerializer getLocations(String storeType , String q , String stage , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LocationListSerializer> response = companyprofileApiList.getLocations(this.companyId ,storeType , q , stage , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getLocations
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.LocationListSerializer> getLocationsPagination(
        String storeType ,
        String q ,
        String stage ,
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.LocationListSerializer> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.LocationListSerializer callback = this.getLocations(
                
                 
                 storeType,
                 q,
                 stage,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse updateLocation(String locationId ,PlatformModels.LocationSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.updateLocation(this.companyId , locationId  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetLocationSerializer getLocationDetail(String locationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetLocationSerializer> response = companyprofileApiList.getLocationDetail(this.companyId , locationId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessResponse createLocationBulk(PlatformModels.BulkLocationSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.createLocationBulk(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class FileStorageService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private FileStorageApiList filestorageApiList;

    public FileStorageService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.filestorageApiList = generateFilestorageApiList(this.platformConfig.getPersistentCookieStore());
    }

    private FileStorageApiList generateFilestorageApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),FileStorageApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.StartResponse startUpload(String namespace ,PlatformModels.StartRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StartResponse> response = filestorageApiList.startUpload(namespace  , this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CompleteResponse completeUpload(String namespace ,PlatformModels.StartResponse body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompleteResponse> response = filestorageApiList.completeUpload(namespace  , this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SignUrlResponse getSignUrls(PlatformModels.SignUrlRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SignUrlResponse> response = filestorageApiList.getSignUrls(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BulkResponse copyFiles(Boolean sync ,PlatformModels.BulkRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkResponse> response = filestorageApiList.copyFiles(this.companyId ,sync , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BrowseResponse browse(String namespace , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BrowseResponse> response = filestorageApiList.browse(namespace  , this.companyId ,pageNo ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for browse
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.BrowseResponse> browsePagination(
        String namespace 
        
        ){ 
    
     int pageSize = 20; 

    Paginator<PlatformModels.BrowseResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.BrowseResponse callback = this.browse(
                
                 namespace,
                 
                 paginator.getPageNo()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Object proxy(String url ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = filestorageApiList.proxy(this.companyId ,url ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.StartResponse appStartUpload(String namespace ,PlatformModels.StartRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StartResponse> response = filestorageApiList.appStartUpload(namespace , this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CompleteResponse appCompleteUpload(String namespace ,PlatformModels.StartResponse body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompleteResponse> response = filestorageApiList.appCompleteUpload(namespace , this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BulkResponse appCopyFiles(Boolean sync ,PlatformModels.BulkRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkResponse> response = filestorageApiList.appCopyFiles(this.companyId , this.applicationId ,sync , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BrowseResponse browse(String namespace , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BrowseResponse> response = filestorageApiList.browse(namespace , this.companyId , this.applicationId ,pageNo ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for browse
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.BrowseResponse> browsePagination(
        String namespace
        
        ){ 
    
     int pageSize = 20; 

    Paginator<PlatformModels.BrowseResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.BrowseResponse callback = this.browse(
                
                 namespace,
                 
                 
                 paginator.getPageNo()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    

}

}

public static class ShareService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private ShareApiList shareApiList;

    public ShareService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.shareApiList = generateShareApiList(this.platformConfig.getPersistentCookieStore());
    }

    private ShareApiList generateShareApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),ShareApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ShortLinkRes createShortLink(PlatformModels.ShortLinkReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShortLinkRes> response = shareApiList.createShortLink(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ShortLinkList getShortLinks(Integer pageNo , Integer pageSize , String createdBy , String active , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShortLinkList> response = shareApiList.getShortLinks(this.companyId , this.applicationId ,pageNo , pageSize , createdBy , active , q ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getShortLinks
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.ShortLinkList> getShortLinksPagination(
        Integer pageSize,
        String createdBy,
        String active,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.ShortLinkList> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.ShortLinkList callback = this.getShortLinks(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 createdBy,
                 active,
                 q
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ShortLinkRes getShortLinkByHash(String hash ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShortLinkRes> response = shareApiList.getShortLinkByHash(this.companyId , this.applicationId , hash ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ShortLinkRes updateShortLinkById(String id ,PlatformModels.ShortLinkReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShortLinkRes> response = shareApiList.updateShortLinkById(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}

}

public static class InventoryService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private InventoryApiList inventoryApiList;

    public InventoryService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.inventoryApiList = generateInventoryApiList(this.platformConfig.getPersistentCookieStore());
    }

    private InventoryApiList generateInventoryApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),InventoryApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeListJobConfigRawDTO getJobsByCompany(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeListJobConfigRawDTO> response = inventoryApiList.getJobsByCompany(this.companyId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeString updateJob(PlatformModels.JobConfigDTO body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeString> response = inventoryApiList.updateJob(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeString createJob(PlatformModels.JobConfigDTO body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeString> response = inventoryApiList.createJob(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeListJobStepsDTO getJobSteps(Integer jobId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeListJobStepsDTO> response = inventoryApiList.getJobSteps(this.companyId , jobId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeListJobConfigDTO getJobByCompanyAndIntegration(String integrationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeListJobConfigDTO> response = inventoryApiList.getJobByCompanyAndIntegration(this.companyId , integrationId  ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeString disable(String integrationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeString> response = inventoryApiList.disable(this.companyId , integrationId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeJobConfigDTO getJobConfigDefaults() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeJobConfigDTO> response = inventoryApiList.getJobConfigDefaults(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeJobConfigDTO getJobByCode(String code ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeJobConfigDTO> response = inventoryApiList.getJobByCode(this.companyId , code  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeJobMetricsDto getJobCodeMetrics(String code , Integer pageNo , Integer pageSize , String status , String date ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeJobMetricsDto> response = inventoryApiList.getJobCodeMetrics(this.companyId , code  ,pageNo , pageSize , status , date ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeListJobConfigListDTO getJobCodesByCompanyAndIntegration(String integrationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeListJobConfigListDTO> response = inventoryApiList.getJobCodesByCompanyAndIntegration(this.companyId , integrationId  ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class ConfigurationService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private ConfigurationApiList configurationApiList;

    public ConfigurationService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.configurationApiList = generateConfigurationApiList(this.platformConfig.getPersistentCookieStore());
    }

    private ConfigurationApiList generateConfigurationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),ConfigurationApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateAppResponse createApplication(PlatformModels.CreateApplicationRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAppResponse> response = configurationApiList.createApplication(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationsResponse getApplications(Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationsResponse> response = configurationApiList.getApplications(this.companyId ,pageNo , pageSize , q ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getApplications
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.ApplicationsResponse> getApplicationsPagination(
        Integer pageSize ,
        String q 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.ApplicationsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.ApplicationsResponse callback = this.getApplications(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CurrenciesResponse getCurrencies() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CurrenciesResponse> response = configurationApiList.getCurrencies(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DomainSuggestionsResponse getDomainAvailibility(PlatformModels.DomainSuggestionsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DomainSuggestionsResponse> response = configurationApiList.getDomainAvailibility(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Integration getIntegrationById(Integer id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Integration> response = configurationApiList.getIntegrationById(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetIntegrationsOptInsResponse getAvailableOptIns(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetIntegrationsOptInsResponse> response = configurationApiList.getAvailableOptIns(this.companyId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAvailableOptIns
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.GetIntegrationsOptInsResponse> getAvailableOptInsPagination(
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GetIntegrationsOptInsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GetIntegrationsOptInsResponse callback = this.getAvailableOptIns(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetIntegrationsOptInsResponse getSelectedOptIns(String level , Integer uid , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetIntegrationsOptInsResponse> response = configurationApiList.getSelectedOptIns(this.companyId , level  , uid  ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSelectedOptIns
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.GetIntegrationsOptInsResponse> getSelectedOptInsPagination(
        String level ,
        Integer uid ,
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GetIntegrationsOptInsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GetIntegrationsOptInsResponse callback = this.getSelectedOptIns(
                
                 
                 level,
                 uid,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.IntegrationConfigResponse getIntegrationLevelConfig(String id , String level , Boolean opted , Boolean checkPermission ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.IntegrationConfigResponse> response = configurationApiList.getIntegrationLevelConfig(this.companyId , id  , level  ,opted , checkPermission ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.IntegrationLevel updateLevelIntegration(String id , String level ,PlatformModels.UpdateIntegrationLevelRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.IntegrationLevel> response = configurationApiList.updateLevelIntegration(this.companyId , id  , level  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.IntegrationLevel getIntegrationByLevelId(String id , String level , Integer uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.IntegrationLevel> response = configurationApiList.getIntegrationByLevelId(this.companyId , id  , level  , uid  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.IntegrationLevel updateLevelUidIntegration(String id , String level , Integer uid ,PlatformModels.IntegrationLevel body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.IntegrationLevel> response = configurationApiList.updateLevelUidIntegration(this.companyId , id  , level  , uid  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OptedStoreIntegration getLevelActiveIntegrations(String id , String level , Integer uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptedStoreIntegration> response = configurationApiList.getLevelActiveIntegrations(this.companyId , id  , level  , uid  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BrandsByCompanyResponse getBrandsByCompany(String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BrandsByCompanyResponse> response = configurationApiList.getBrandsByCompany(this.companyId ,q ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CompanyByBrandsResponse getCompanyByBrands(Integer pageNo , Integer pageSize ,PlatformModels.CompanyByBrandsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompanyByBrandsResponse> response = configurationApiList.getCompanyByBrands(this.companyId ,pageNo , pageSize , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getCompanyByBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.CompanyByBrandsResponse> getCompanyByBrandsPagination(
        Integer pageSize ,
        
        PlatformModels.CompanyByBrandsRequest body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.CompanyByBrandsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.CompanyByBrandsResponse callback = this.getCompanyByBrands(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,body 
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.StoreByBrandsResponse getStoreByBrands(Integer pageNo , Integer pageSize ,PlatformModels.StoreByBrandsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StoreByBrandsResponse> response = configurationApiList.getStoreByBrands(this.companyId ,pageNo , pageSize , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getStoreByBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.StoreByBrandsResponse> getStoreByBrandsPagination(
        Integer pageSize ,
        
        PlatformModels.StoreByBrandsRequest body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.StoreByBrandsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.StoreByBrandsResponse callback = this.getStoreByBrands(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,body 
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OtherSellerApplications getOtherSellerApplications(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OtherSellerApplications> response = configurationApiList.getOtherSellerApplications(this.companyId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getOtherSellerApplications
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.OtherSellerApplications> getOtherSellerApplicationsPagination(
        Integer pageSize 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.OtherSellerApplications> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.OtherSellerApplications callback = this.getOtherSellerApplications(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OptedApplicationResponse getOtherSellerApplicationById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptedApplicationResponse> response = configurationApiList.getOtherSellerApplicationById(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessMessageResponse optOutFromApplication(String id ,PlatformModels.OptOutInventory body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessageResponse> response = configurationApiList.optOutFromApplication(this.companyId , id  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.MobileAppConfiguration getBuildConfig(String platformType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.MobileAppConfiguration> response = configurationApiList.getBuildConfig(this.companyId , this.applicationId , platformType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.MobileAppConfiguration updateBuildConfig(String platformType ,PlatformModels.MobileAppConfigRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.MobileAppConfiguration> response = configurationApiList.updateBuildConfig(this.companyId , this.applicationId , platformType , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BuildVersionHistory getPreviousVersions(String platformType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BuildVersionHistory> response = configurationApiList.getPreviousVersions(this.companyId , this.applicationId , platformType ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AppFeatureResponse getAppFeatures() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppFeatureResponse> response = configurationApiList.getAppFeatures(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AppFeature updateAppFeatures(PlatformModels.AppFeatureRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppFeature> response = configurationApiList.updateAppFeatures(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationDetail getAppBasicDetails() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationDetail> response = configurationApiList.getAppBasicDetails(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationDetail updateAppBasicDetails(PlatformModels.ApplicationDetail body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationDetail> response = configurationApiList.updateAppBasicDetails(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationInformation getAppContactInfo() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInformation> response = configurationApiList.getAppContactInfo(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationInformation updateAppContactInfo(PlatformModels.ApplicationInformation body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInformation> response = configurationApiList.updateAppContactInfo(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TokenResponse getAppApiTokens() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TokenResponse> response = configurationApiList.getAppApiTokens(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TokenResponse updateAppApiTokens(PlatformModels.TokenResponse body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TokenResponse> response = configurationApiList.updateAppApiTokens(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CompaniesResponse getAppCompanies(Integer uid , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompaniesResponse> response = configurationApiList.getAppCompanies(this.companyId , this.applicationId ,uid , pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAppCompanies
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.CompaniesResponse> getAppCompaniesPagination(
        Integer uid,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.CompaniesResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.CompaniesResponse callback = this.getAppCompanies(
                
                 
                 
                 uid,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.StoresResponse getAppStores(Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StoresResponse> response = configurationApiList.getAppStores(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAppStores
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.StoresResponse> getAppStoresPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.StoresResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.StoresResponse callback = this.getAppStores(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationInventory getInventoryConfig() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInventory> response = configurationApiList.getInventoryConfig(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationInventory updateInventoryConfig(PlatformModels.ApplicationInventory body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInventory> response = configurationApiList.updateInventoryConfig(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ApplicationInventory partiallyUpdateInventoryConfig(PlatformModels.AppInventoryPartialUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInventory> response = configurationApiList.partiallyUpdateInventoryConfig(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AppSupportedCurrency getAppCurrencyConfig() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppSupportedCurrency> response = configurationApiList.getAppCurrencyConfig(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AppSupportedCurrency updateAppCurrencyConfig(PlatformModels.AppSupportedCurrency body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppSupportedCurrency> response = configurationApiList.updateAppCurrencyConfig(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AppCurrencyResponse getAppSupportedCurrency() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppCurrencyResponse> response = configurationApiList.getAppSupportedCurrency(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderingStores getOrderingStoresByFilter(Integer pageNo , Integer pageSize ,PlatformModels.FilterOrderingStoreRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderingStores> response = configurationApiList.getOrderingStoresByFilter(this.companyId , this.applicationId ,pageNo , pageSize , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getOrderingStoresByFilter
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.OrderingStores> getOrderingStoresByFilterPagination(
        Integer pageSize,
        
        PlatformModels.FilterOrderingStoreRequest body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.OrderingStores> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.OrderingStores callback = this.getOrderingStoresByFilter(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,body 
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DeploymentMeta updateOrderingStoreConfig(PlatformModels.OrderingStoreConfig body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeploymentMeta> response = configurationApiList.updateOrderingStoreConfig(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OrderingStoresResponse getStaffOrderingStores(Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderingStoresResponse> response = configurationApiList.getStaffOrderingStores(this.companyId , this.applicationId ,pageNo , pageSize , q ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getStaffOrderingStores
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.OrderingStoresResponse> getStaffOrderingStoresPagination(
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.OrderingStoresResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.OrderingStoresResponse callback = this.getStaffOrderingStores(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DomainsResponse getDomains() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DomainsResponse> response = configurationApiList.getDomains(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Domain addDomain(PlatformModels.DomainAddRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Domain> response = configurationApiList.addDomain(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessMessageResponse removeDomainById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessageResponse> response = configurationApiList.removeDomainById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DomainsResponse changeDomainType(PlatformModels.UpdateDomainTypeRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DomainsResponse> response = configurationApiList.changeDomainType(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DomainStatusResponse getDomainStatus(PlatformModels.DomainStatusRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DomainStatusResponse> response = configurationApiList.getDomainStatus(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Application getApplicationById() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Application> response = configurationApiList.getApplicationById(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class CartService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private CartApiList cartApiList;

    public CartService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.cartApiList = generateCartApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CartApiList generateCartApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CartApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CouponsResponse getCoupons(Integer pageNo , Integer pageSize , Boolean isArchived , String title , Boolean isPublic , Boolean isDisplay , String typeSlug , String code ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CouponsResponse> response = cartApiList.getCoupons(this.companyId , this.applicationId ,pageNo , pageSize , isArchived , title , isPublic , isDisplay , typeSlug , code ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getCoupons
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.CouponsResponse> getCouponsPagination(
        Integer pageSize,
        Boolean isArchived,
        String title,
        Boolean isPublic,
        Boolean isDisplay,
        String typeSlug,
        String code
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.CouponsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.CouponsResponse callback = this.getCoupons(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 isArchived,
                 title,
                 isPublic,
                 isDisplay,
                 typeSlug,
                 code
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessMessage createCoupon(PlatformModels.CouponAdd body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessage> response = cartApiList.createCoupon(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CouponUpdate getCouponById(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CouponUpdate> response = cartApiList.getCouponById(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessMessage updateCoupon(String id ,PlatformModels.CouponUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessage> response = cartApiList.updateCoupon(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SuccessMessage updateCouponPartially(String id ,PlatformModels.CouponPartialUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessage> response = cartApiList.updateCouponPartially(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OpenapiCartDetailsResponse fetchAndvalidateCartItems(PlatformModels.OpenapiCartDetailsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OpenapiCartDetailsResponse> response = cartApiList.fetchAndvalidateCartItems(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OpenApiCartServiceabilityResponse checkCartServiceability(PlatformModels.OpenApiCartServiceabilityRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OpenApiCartServiceabilityResponse> response = cartApiList.checkCartServiceability(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.OpenApiCheckoutResponse checkoutCart(PlatformModels.OpenApiPlatformCheckoutReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OpenApiCheckoutResponse> response = cartApiList.checkoutCart(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}

}

public static class RewardsService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private RewardsApiList rewardsApiList;

    public RewardsService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.rewardsApiList = generateRewardsApiList(this.platformConfig.getPersistentCookieStore());
    }

    private RewardsApiList generateRewardsApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),RewardsApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GiveawayResponse getGiveaways(String pageId , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GiveawayResponse> response = rewardsApiList.getGiveaways(this.companyId , this.applicationId ,pageId , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getGiveaways
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.GiveawayResponse> getGiveawaysPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GiveawayResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GiveawayResponse callback = this.getGiveaways(
                
                 
                 
                 paginator.getNextId()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Giveaway createGiveaway(PlatformModels.Giveaway body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Giveaway> response = rewardsApiList.createGiveaway(this.companyId , this.applicationId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Giveaway getGiveawayByID(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Giveaway> response = rewardsApiList.getGiveawayByID(this.companyId , this.applicationId , id ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Giveaway updateGiveaway(String id ,PlatformModels.Giveaway body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Giveaway> response = rewardsApiList.updateGiveaway(this.companyId , this.applicationId , id , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public List<PlatformModels.Offer> getOffers() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<PlatformModels.Offer>> response = rewardsApiList.getOffers(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Offer getOfferByName(String cookie , String name ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Offer> response = rewardsApiList.getOfferByName(this.companyId , this.applicationId , name ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.Offer updateOfferByName(String name ,PlatformModels.Offer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Offer> response = rewardsApiList.updateOfferByName(this.companyId , this.applicationId , name , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.UserRes getUserAvailablePoints(String userId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UserRes> response = rewardsApiList.getUserAvailablePoints(this.companyId , this.applicationId , userId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AppUser updateUserStatus(String userId ,PlatformModels.AppUser body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppUser> response = rewardsApiList.updateUserStatus(this.companyId , this.applicationId , userId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.HistoryRes getUserPointsHistory(String userId , String pageId , Integer pageLimit , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HistoryRes> response = rewardsApiList.getUserPointsHistory(this.companyId , this.applicationId , userId ,pageId , pageLimit , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getUserPointsHistory
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.HistoryRes> getUserPointsHistoryPagination(
        String userId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.HistoryRes> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.HistoryRes callback = this.getUserPointsHistory(
                
                 
                 
                 userId,
                 paginator.getNextId()
                ,
                 null
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    

}

}

public static class AnalyticsService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private AnalyticsApiList analyticsApiList;

    public AnalyticsService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.analyticsApiList = generateAnalyticsApiList(this.platformConfig.getPersistentCookieStore());
    }

    private AnalyticsApiList generateAnalyticsApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),AnalyticsApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ExportJobRes createExportJob(String exportType ,PlatformModels.ExportJobReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ExportJobRes> response = analyticsApiList.createExportJob(this.companyId , exportType  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ExportJobStatusRes getExportJobStatus(String exportType , String jobId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ExportJobStatusRes> response = analyticsApiList.getExportJobStatus(this.companyId , exportType  , jobId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetLogsListRes getLogsList(String logType , Integer pageNo , Integer pageSize ,PlatformModels.GetLogsListReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetLogsListRes> response = analyticsApiList.getLogsList(this.companyId , logType  ,pageNo , pageSize , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getLogsList
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.GetLogsListRes> getLogsListPagination(
        String logType ,
        Integer pageSize ,
        
        PlatformModels.GetLogsListReq body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GetLogsListRes> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GetLogsListRes callback = this.getLogsList(
                
                 
                 logType,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,body 
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SearchLogRes searchLogs(Integer pageNo , Integer pageSize , String logType ,PlatformModels.SearchLogReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SearchLogRes> response = analyticsApiList.searchLogs(this.companyId , logType  ,pageNo , pageSize , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for searchLogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.SearchLogRes> searchLogsPagination(
        Integer pageSize ,
        String logType ,
        
        PlatformModels.SearchLogReq body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SearchLogRes> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SearchLogRes callback = this.searchLogs(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 logType,body 
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.StatsGroups getStatiscticsGroups() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StatsGroups> response = analyticsApiList.getStatiscticsGroups(this.companyId , this.applicationId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.StatsGroupComponents getStatiscticsGroupComponents(String groupName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StatsGroupComponents> response = analyticsApiList.getStatiscticsGroupComponents(this.companyId , this.applicationId , groupName ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Object getComponentStatsCSV(String componentName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = analyticsApiList.getComponentStatsCSV(this.companyId , this.applicationId , componentName ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Object getComponentStatsPDF(String componentName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = analyticsApiList.getComponentStatsPDF(this.companyId , this.applicationId , componentName ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.StatsRes getComponentStats(String componentName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StatsRes> response = analyticsApiList.getComponentStats(this.companyId , this.applicationId , componentName ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AbandonCartsList getAbandonCartList(String fromDate , String toDate , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AbandonCartsList> response = analyticsApiList.getAbandonCartList(this.companyId , this.applicationId , fromDate , toDate ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAbandonCartList
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<PlatformModels.AbandonCartsList> getAbandonCartListPagination(
        String fromDate,
        String toDate,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.AbandonCartsList> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.AbandonCartsList callback = this.getAbandonCartList(
                
                 
                 
                 fromDate,
                 toDate,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Object getAbandonCartsCSV(String fromDate , String toDate ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = analyticsApiList.getAbandonCartsCSV(this.companyId , this.applicationId , fromDate , toDate ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AbandonCartDetail getAbandonCartDetail(String cartId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AbandonCartDetail> response = analyticsApiList.getAbandonCartDetail(this.companyId , this.applicationId , cartId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    

}

}

public static class DiscountService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private DiscountApiList discountApiList;

    public DiscountService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.discountApiList = generateDiscountApiList(this.platformConfig.getPersistentCookieStore());
    }

    private DiscountApiList generateDiscountApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),DiscountApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ListOrCalender getDiscounts(String view , String q , Integer pageNo , Integer pageSize , Boolean archived , Integer month , Integer year , String type , List<String> appIds ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ListOrCalender> response = discountApiList.getDiscounts(this.companyId ,view , q , pageNo , pageSize , archived , month , year , type , appIds ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DiscountJob createDiscount(PlatformModels.CreateUpdateDiscount body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DiscountJob> response = discountApiList.createDiscount(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DiscountJob getDiscount(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DiscountJob> response = discountApiList.getDiscount(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.DiscountJob updateDiscount(String id ,PlatformModels.CreateUpdateDiscount body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DiscountJob> response = discountApiList.updateDiscount(this.companyId , id  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.FileJobResponse validateDiscountFile(String discount ,PlatformModels.DiscountJob body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FileJobResponse> response = discountApiList.validateDiscountFile(this.companyId ,discount , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.FileJobResponse downloadDiscountFile(String type ,PlatformModels.DownloadFileJob body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FileJobResponse> response = discountApiList.downloadDiscountFile(this.companyId , type  , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.FileJobResponse getValidationJob(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FileJobResponse> response = discountApiList.getValidationJob(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CancelJobResponse cancelValidationJob(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CancelJobResponse> response = discountApiList.cancelValidationJob(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.FileJobResponse getDownloadJob(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FileJobResponse> response = discountApiList.getDownloadJob(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CancelJobResponse cancelDownloadJob(String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CancelJobResponse> response = discountApiList.cancelDownloadJob(this.companyId , id  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class PartnerService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private PartnerApiList partnerApiList;

    public PartnerService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.partnerApiList = generatePartnerApiList(this.platformConfig.getPersistentCookieStore());
    }

    private PartnerApiList generatePartnerApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),PartnerApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.AddProxyResponse addProxyPath(String extensionId ,PlatformModels.AddProxyReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AddProxyResponse> response = partnerApiList.addProxyPath(this.companyId , this.applicationId , extensionId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.RemoveProxyResponse removeProxyPath(String extensionId , String attachedPath ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.RemoveProxyResponse> response = partnerApiList.removeProxyPath(this.companyId , this.applicationId , extensionId , attachedPath ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}

}

public static class WebhookService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private WebhookApiList webhookApiList;

    public WebhookService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.webhookApiList = generateWebhookApiList(this.platformConfig.getPersistentCookieStore());
    }

    private WebhookApiList generateWebhookApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),WebhookApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriberResponse getSubscribersByCompany(Integer pageNo , Integer pageSize , String extensionId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriberResponse> response = webhookApiList.getSubscribersByCompany(this.companyId ,pageNo , pageSize , extensionId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriberConfig registerSubscriberToEvent(PlatformModels.SubscriberConfig body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriberConfig> response = webhookApiList.registerSubscriberToEvent(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriberConfig updateSubscriberConfig(PlatformModels.SubscriberConfig body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriberConfig> response = webhookApiList.updateSubscriberConfig(this.companyId , body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriberConfigList getSubscribersByExtensionId(Integer pageNo , Integer pageSize , String extensionId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriberConfigList> response = webhookApiList.getSubscribersByExtensionId(this.companyId , extensionId  ,pageNo , pageSize ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SubscriberResponse getSubscriberById(Integer subscriberId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriberResponse> response = webhookApiList.getSubscriberById(this.companyId , subscriberId  ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.EventConfigResponse fetchAllEventConfigurations() throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EventConfigResponse> response = webhookApiList.fetchAllEventConfigurations(this.companyId ).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    


public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}
}