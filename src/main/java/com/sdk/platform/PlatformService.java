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

    private CommonApiList commonApiList;

    public CommonService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.commonApiList = generateCommonApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CommonApiList generateCommonApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CommonApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PlatformModels.Locations getLocations(String locationType , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Locations> response = commonApiList.getLocations(locationType, id).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    

}

}

public static class LeadService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private LeadApiList leadApiList;

    public LeadService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.leadApiList = generateLeadApiList(this.platformConfig.getPersistentCookieStore());
    }

    private LeadApiList generateLeadApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),LeadApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PlatformModels.TicketList getTickets(String companyId , Boolean items , Boolean filters , String q , String status , PlatformClient.PriorityEnum priority , String category , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketList> response = leadApiList.getTickets(companyId, items, filters, q, status, priority, category, pageNo, pageSize).execute();
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
        String companyId,
        Boolean items,
        Boolean filters,
        String q,
        String status,
        PlatformClient.PriorityEnum priority,
        String category,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.TicketList> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.TicketList callback = this.getTickets(
                
                 companyId,
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
    
    
    
    
    
    public PlatformModels.Ticket createTicket(String companyId ,PlatformModels.AddTicketPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.createTicket(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    public PlatformModels.Ticket getTicket(String companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.getTicket(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.Ticket editTicket(String companyId , String id ,PlatformModels.EditTicketPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.editTicket(companyId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketHistory createHistory(String companyId , String id ,PlatformModels.TicketHistoryPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketHistory> response = leadApiList.createHistory(companyId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.TicketHistoryList getTicketHistory(String companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketHistoryList> response = leadApiList.getTicketHistory(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.TicketFeedbackList getFeedbacks(String companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketFeedbackList> response = leadApiList.getFeedbacks(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.TicketFeedback submitFeedback(String companyId , String id ,PlatformModels.TicketFeedbackPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketFeedback> response = leadApiList.submitFeedback(companyId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetTokenForVideoRoomResponse getTokenForVideoRoom(String companyId , String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetTokenForVideoRoomResponse> response = leadApiList.getTokenForVideoRoom(companyId, uniqueName).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    public PlatformModels.GetParticipantsInsideVideoRoomResponse getVideoParticipants(String companyId , String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetParticipantsInsideVideoRoomResponse> response = leadApiList.getVideoParticipants(companyId, uniqueName).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    
    
    
    
    public PlatformModels.TicketList getTickets(String companyId , String applicationId , Boolean items , Boolean filters , String q , String status , PlatformClient.PriorityEnum priority , String category ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketList> response = leadApiList.getTickets(companyId, applicationId, items, filters, q, status, priority, category).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    public PlatformModels.Ticket getTicket(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.getTicket(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Ticket editTicket(String companyId , String applicationId , String id ,PlatformModels.EditTicketPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Ticket> response = leadApiList.editTicket(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.TicketHistory createHistory(String companyId , String applicationId , String id ,PlatformModels.TicketHistoryPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketHistory> response = leadApiList.createHistory(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TicketHistoryList getTicketHistory(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TicketHistoryList> response = leadApiList.getTicketHistory(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CustomForm getCustomForm(String companyId , String applicationId , String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomForm> response = leadApiList.getCustomForm(companyId, applicationId, slug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CustomForm editCustomForm(String companyId , String applicationId , String slug ,PlatformModels.EditCustomFormPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomForm> response = leadApiList.editCustomForm(companyId, applicationId, slug, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CustomFormList getCustomForms(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomFormList> response = leadApiList.getCustomForms(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CustomForm createCustomForm(String companyId , String applicationId ,PlatformModels.CreateCustomFormPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomForm> response = leadApiList.createCustomForm(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    public PlatformModels.GetTokenForVideoRoomResponse getTokenForVideoRoom(String companyId , String applicationId , String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetTokenForVideoRoomResponse> response = leadApiList.getTokenForVideoRoom(companyId, applicationId, uniqueName).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    public PlatformModels.GetParticipantsInsideVideoRoomResponse getVideoParticipants(String companyId , String applicationId , String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetParticipantsInsideVideoRoomResponse> response = leadApiList.getVideoParticipants(companyId, applicationId, uniqueName).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateVideoRoomResponse openVideoRoom(String companyId , String applicationId ,PlatformModels.CreateVideoRoomPayload body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateVideoRoomResponse> response = leadApiList.openVideoRoom(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CloseVideoRoomResponse closeVideoRoom(String companyId , String applicationId , String uniqueName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CloseVideoRoomResponse> response = leadApiList.closeVideoRoom(companyId, applicationId, uniqueName).execute();
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

    private FeedbackApiList feedbackApiList;

    public FeedbackService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.FeedbackAttributes getAttributes(String companyId , String applicationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FeedbackAttributes> response = feedbackApiList.getAttributes(companyId, applicationId, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.FeedbackAttributes> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.FeedbackAttributes callback = this.getAttributes(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.GetReviewResponse getCustomerReviews(String companyId , String applicationId , String id , String entityId , String entityType , String userId , String media , List<Double> rating , List<String> attributeRating , Boolean facets , String sort , String next , String start , String limit , String count , String pageId , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetReviewResponse> response = feedbackApiList.getCustomerReviews(companyId, applicationId, id, entityId, entityType, userId, media, rating, attributeRating, facets, sort, next, start, limit, count, pageId, pageSize).execute();
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
        String companyId,
        String applicationId,
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
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.UpdateResponse updateApprove(String companyId , String applicationId , String reviewId ,PlatformModels.ApproveRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateResponse> response = feedbackApiList.updateApprove(companyId, applicationId, reviewId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public List<PlatformModels.ActivityDump> getHistory(String companyId , String applicationId , String reviewId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<PlatformModels.ActivityDump>> response = feedbackApiList.getHistory(companyId, applicationId, reviewId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TemplateGetResponse getApplicationTemplates(String companyId , String applicationId , String pageId , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TemplateGetResponse> response = feedbackApiList.getApplicationTemplates(companyId, applicationId, pageId, pageSize).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.TemplateGetResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.TemplateGetResponse callback = this.getApplicationTemplates(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.InsertResponse createTemplate(String companyId , String applicationId ,PlatformModels.TemplateRequestList body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InsertResponse> response = feedbackApiList.createTemplate(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Template getTemplateById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Template> response = feedbackApiList.getTemplateById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.UpdateResponse updateTemplate(String companyId , String applicationId , String id ,PlatformModels.UpdateTemplateRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateResponse> response = feedbackApiList.updateTemplate(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.UpdateResponse updateTemplateStatus(String companyId , String applicationId , String id ,PlatformModels.UpdateTemplateStatusRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateResponse> response = feedbackApiList.updateTemplateStatus(companyId, applicationId, id, body).execute();
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

    private ThemeApiList themeApiList;

    public ThemeService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.AllAvailablePageSchema getAllPages(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AllAvailablePageSchema> response = themeApiList.getAllPages(companyId, applicationId, themeId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AvailablePageSchema createPage(String companyId , String applicationId , String themeId ,PlatformModels.AvailablePageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AvailablePageSchema> response = themeApiList.createPage(companyId, applicationId, themeId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AllAvailablePageSchema updateMultiplePages(String companyId , String applicationId , String themeId ,PlatformModels.AllAvailablePageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AllAvailablePageSchema> response = themeApiList.updateMultiplePages(companyId, applicationId, themeId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AvailablePageSchema getPage(String companyId , String applicationId , String themeId , String pageValue ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AvailablePageSchema> response = themeApiList.getPage(companyId, applicationId, themeId, pageValue).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AvailablePageSchema updatePage(String companyId , String applicationId , String themeId , String pageValue ,PlatformModels.AvailablePageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AvailablePageSchema> response = themeApiList.updatePage(companyId, applicationId, themeId, pageValue, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AvailablePageSchema deletePage(String companyId , String applicationId , String themeId , String pageValue ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AvailablePageSchema> response = themeApiList.deletePage(companyId, applicationId, themeId, pageValue).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesListingResponseSchema getThemeLibrary(String companyId , String applicationId , Integer pageSize , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesListingResponseSchema> response = themeApiList.getThemeLibrary(companyId, applicationId, pageSize, pageNo).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema addToThemeLibrary(String companyId , String applicationId ,PlatformModels.AddThemeRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.addToThemeLibrary(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema applyTheme(String companyId , String applicationId ,PlatformModels.AddThemeRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.applyTheme(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.UpgradableThemeSchema isUpgradable(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpgradableThemeSchema> response = themeApiList.isUpgradable(companyId, applicationId, themeId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema upgradeTheme(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.upgradeTheme(companyId, applicationId, themeId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesListingResponseSchema getPublicThemes(String companyId , String applicationId , Integer pageSize , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesListingResponseSchema> response = themeApiList.getPublicThemes(companyId, applicationId, pageSize, pageNo).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema createTheme(String companyId , String applicationId ,PlatformModels.ThemesSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.createTheme(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema getAppliedTheme(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.getAppliedTheme(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.FontsSchema getFonts(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FontsSchema> response = themeApiList.getFonts(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema getThemeById(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.getThemeById(companyId, applicationId, themeId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema updateTheme(String companyId , String applicationId , String themeId ,PlatformModels.ThemesSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.updateTheme(companyId, applicationId, themeId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema deleteTheme(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.deleteTheme(companyId, applicationId, themeId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema getThemeForPreview(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.getThemeForPreview(companyId, applicationId, themeId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema publishTheme(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.publishTheme(companyId, applicationId, themeId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema unpublishTheme(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.unpublishTheme(companyId, applicationId, themeId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema archiveTheme(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.archiveTheme(companyId, applicationId, themeId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ThemesSchema unarchiveTheme(String companyId , String applicationId , String themeId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ThemesSchema> response = themeApiList.unarchiveTheme(companyId, applicationId, themeId).execute();
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

    private UserApiList userApiList;

    public UserService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.CustomerListResponseSchema getCustomers(String companyId , String applicationId , String q , Integer pageSize , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CustomerListResponseSchema> response = userApiList.getCustomers(companyId, applicationId, q, pageSize, pageNo).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.UserSearchResponseSchema searchUsers(String companyId , String applicationId , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UserSearchResponseSchema> response = userApiList.searchUsers(companyId, applicationId, q).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateUserResponseSchema createUser(String companyId , String applicationId ,PlatformModels.CreateUserRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateUserResponseSchema> response = userApiList.createUser(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateUserResponseSchema updateUser(String companyId , String applicationId , String userId ,PlatformModels.UpdateUserRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateUserResponseSchema> response = userApiList.updateUser(companyId, applicationId, userId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateUserSessionResponseSchema createUserSession(String companyId , String applicationId ,PlatformModels.CreateUserSessionRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateUserSessionResponseSchema> response = userApiList.createUserSession(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PlatformSchema getPlatformConfig(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PlatformSchema> response = userApiList.getPlatformConfig(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PlatformSchema updatePlatformConfig(String companyId , String applicationId ,PlatformModels.PlatformSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PlatformSchema> response = userApiList.updatePlatformConfig(companyId, applicationId, body).execute();
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

    private ContentApiList contentApiList;

    public ContentService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.GetAnnouncementListSchema getAnnouncementsList(String companyId , String applicationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAnnouncementListSchema> response = contentApiList.getAnnouncementsList(companyId, applicationId, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GetAnnouncementListSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GetAnnouncementListSchema callback = this.getAnnouncementsList(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.CreateAnnouncementSchema createAnnouncement(String companyId , String applicationId ,PlatformModels.AdminAnnouncementSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAnnouncementSchema> response = contentApiList.createAnnouncement(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AdminAnnouncementSchema getAnnouncementById(String companyId , String applicationId , String announcementId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AdminAnnouncementSchema> response = contentApiList.getAnnouncementById(companyId, applicationId, announcementId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateAnnouncementSchema updateAnnouncement(String companyId , String applicationId , String announcementId ,PlatformModels.AdminAnnouncementSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAnnouncementSchema> response = contentApiList.updateAnnouncement(companyId, applicationId, announcementId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateAnnouncementSchema updateAnnouncementSchedule(String companyId , String applicationId , String announcementId ,PlatformModels.ScheduleSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAnnouncementSchema> response = contentApiList.updateAnnouncementSchedule(companyId, applicationId, announcementId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateAnnouncementSchema deleteAnnouncement(String companyId , String applicationId , String announcementId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAnnouncementSchema> response = contentApiList.deleteAnnouncement(companyId, applicationId, announcementId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.BlogSchema createBlog(String companyId , String applicationId ,PlatformModels.BlogRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogSchema> response = contentApiList.createBlog(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.BlogGetResponse getBlogs(String companyId , String applicationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogGetResponse> response = contentApiList.getBlogs(companyId, applicationId, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.BlogGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.BlogGetResponse callback = this.getBlogs(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.BlogSchema updateBlog(String companyId , String applicationId , String id ,PlatformModels.BlogRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogSchema> response = contentApiList.updateBlog(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.BlogSchema deleteBlog(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogSchema> response = contentApiList.deleteBlog(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.BlogSchema getComponentById(String companyId , String applicationId , String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BlogSchema> response = contentApiList.getComponentById(companyId, applicationId, slug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetFaqCategoriesSchema getFaqCategories(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetFaqCategoriesSchema> response = contentApiList.getFaqCategories(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetFaqCategoryBySlugSchema getFaqCategoryBySlugOrId(String companyId , String applicationId , String idOrSlug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetFaqCategoryBySlugSchema> response = contentApiList.getFaqCategoryBySlugOrId(companyId, applicationId, idOrSlug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateFaqCategorySchema createFaqCategory(String companyId , String applicationId ,PlatformModels.CreateFaqCategoryRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqCategorySchema> response = contentApiList.createFaqCategory(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateFaqCategorySchema updateFaqCategory(String companyId , String applicationId , String id ,PlatformModels.UpdateFaqCategoryRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqCategorySchema> response = contentApiList.updateFaqCategory(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.FaqSchema deleteFaqCategory(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FaqSchema> response = contentApiList.deleteFaqCategory(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetFaqSchema getFaqsByCategoryIdOrSlug(String companyId , String applicationId , String idOrSlug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetFaqSchema> response = contentApiList.getFaqsByCategoryIdOrSlug(companyId, applicationId, idOrSlug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateFaqResponseSchema addFaq(String companyId , String applicationId , String categoryId ,PlatformModels.CreateFaqSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqResponseSchema> response = contentApiList.addFaq(companyId, applicationId, categoryId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateFaqResponseSchema updateFaq(String companyId , String applicationId , String categoryId , String faqId ,PlatformModels.CreateFaqSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqResponseSchema> response = contentApiList.updateFaq(companyId, applicationId, categoryId, faqId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateFaqResponseSchema deleteFaq(String companyId , String applicationId , String categoryId , String faqId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqResponseSchema> response = contentApiList.deleteFaq(companyId, applicationId, categoryId, faqId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateFaqResponseSchema getFaqByIdOrSlug(String companyId , String applicationId , String idOrSlug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateFaqResponseSchema> response = contentApiList.getFaqByIdOrSlug(companyId, applicationId, idOrSlug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.LandingPageGetResponse getLandingPages(String companyId , String applicationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LandingPageGetResponse> response = contentApiList.getLandingPages(companyId, applicationId, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.LandingPageGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.LandingPageGetResponse callback = this.getLandingPages(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.LandingPageSchema createLandingPage(String companyId , String applicationId ,PlatformModels.LandingPageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LandingPageSchema> response = contentApiList.createLandingPage(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.LandingPageSchema updateLandingPage(String companyId , String applicationId , String id ,PlatformModels.LandingPageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LandingPageSchema> response = contentApiList.updateLandingPage(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.LandingPageSchema deleteLandingPage(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LandingPageSchema> response = contentApiList.deleteLandingPage(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ApplicationLegal getLegalInformation(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationLegal> response = contentApiList.getLegalInformation(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ApplicationLegal updateLegalInformation(String companyId , String applicationId ,PlatformModels.ApplicationLegal body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationLegal> response = contentApiList.updateLegalInformation(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.NavigationGetResponse getNavigations(String companyId , String applicationId , String devicePlatform , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationGetResponse> response = contentApiList.getNavigations(companyId, applicationId, devicePlatform, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        String devicePlatform,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.NavigationGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.NavigationGetResponse callback = this.getNavigations(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.NavigationSchema createNavigation(String companyId , String applicationId ,PlatformModels.NavigationRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationSchema> response = contentApiList.createNavigation(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.DefaultNavigationResponse getDefaultNavigations(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DefaultNavigationResponse> response = contentApiList.getDefaultNavigations(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.NavigationSchema getNavigationBySlug(String companyId , String applicationId , String slug , String devicePlatform ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationSchema> response = contentApiList.getNavigationBySlug(companyId, applicationId, slug, devicePlatform).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.NavigationSchema updateNavigation(String companyId , String applicationId , String id ,PlatformModels.NavigationRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationSchema> response = contentApiList.updateNavigation(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.NavigationSchema deleteNavigation(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.NavigationSchema> response = contentApiList.deleteNavigation(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PageMetaSchema getPageMeta(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageMetaSchema> response = contentApiList.getPageMeta(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PageSpec getPageSpec(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSpec> response = contentApiList.getPageSpec(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PageSchema createPage(String companyId , String applicationId ,PlatformModels.PageRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.createPage(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PageGetResponse getPages(String companyId , String applicationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageGetResponse> response = contentApiList.getPages(companyId, applicationId, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.PageGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.PageGetResponse callback = this.getPages(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.PageSchema createPagePreview(String companyId , String applicationId ,PlatformModels.PageRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.createPagePreview(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PageSchema updatePagePreview(String companyId , String applicationId , String slug ,PlatformModels.PagePublishRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.updatePagePreview(companyId, applicationId, slug, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PageSchema updatePage(String companyId , String applicationId , String id ,PlatformModels.PageSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.updatePage(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PageSchema deletePage(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.deletePage(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PageSchema getPageBySlug(String companyId , String applicationId , String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PageSchema> response = contentApiList.getPageBySlug(companyId, applicationId, slug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SeoComponent getSEOConfiguration(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SeoComponent> response = contentApiList.getSEOConfiguration(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SeoSchema updateSEOConfiguration(String companyId , String applicationId ,PlatformModels.SeoComponent body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SeoSchema> response = contentApiList.updateSEOConfiguration(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SlideshowGetResponse getSlideshows(String companyId , String applicationId , String devicePlatform , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowGetResponse> response = contentApiList.getSlideshows(companyId, applicationId, devicePlatform, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        String devicePlatform,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SlideshowGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SlideshowGetResponse callback = this.getSlideshows(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.SlideshowSchema createSlideshow(String companyId , String applicationId ,PlatformModels.SlideshowRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowSchema> response = contentApiList.createSlideshow(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SlideshowSchema getSlideshowBySlug(String companyId , String applicationId , String slug , String devicePlatform ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowSchema> response = contentApiList.getSlideshowBySlug(companyId, applicationId, slug, devicePlatform).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SlideshowSchema updateSlideshow(String companyId , String applicationId , String id ,PlatformModels.SlideshowRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowSchema> response = contentApiList.updateSlideshow(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SlideshowSchema deleteSlideshow(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SlideshowSchema> response = contentApiList.deleteSlideshow(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Support getSupportInformation(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Support> response = contentApiList.getSupportInformation(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Support updateSupportInformation(String companyId , String applicationId ,PlatformModels.Support body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Support> response = contentApiList.updateSupportInformation(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TagsSchema updateInjectableTag(String companyId , String applicationId ,PlatformModels.CreateTagRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.updateInjectableTag(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TagsSchema deleteAllInjectableTags(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.deleteAllInjectableTags(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TagsSchema getInjectableTags(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.getInjectableTags(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TagsSchema addInjectableTag(String companyId , String applicationId ,PlatformModels.CreateTagRequestSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.addInjectableTag(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TagDeleteSuccessResponse removeInjectableTag(String companyId , String applicationId ,PlatformModels.RemoveHandpickedSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagDeleteSuccessResponse> response = contentApiList.removeInjectableTag(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TagsSchema editInjectableTag(String companyId , String applicationId , String tagId ,PlatformModels.UpdateHandpickedSchema body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TagsSchema> response = contentApiList.editInjectableTag(companyId, applicationId, tagId, body).execute();
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

    private BillingApiList billingApiList;

    public BillingService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.billingApiList = generateBillingApiList(this.platformConfig.getPersistentCookieStore());
    }

    private BillingApiList generateBillingApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),BillingApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PlatformModels.CreateSubscriptionResponse createSubscriptionCharge(String companyId , String extensionId ,PlatformModels.CreateSubscriptionCharge body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateSubscriptionResponse> response = billingApiList.createSubscriptionCharge(companyId, extensionId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.EntitySubscription getSubscriptionCharge(String companyId , String extensionId , String subscriptionId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EntitySubscription> response = billingApiList.getSubscriptionCharge(companyId, extensionId, subscriptionId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.EntitySubscription cancelSubscriptionCharge(String companyId , String extensionId , String subscriptionId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EntitySubscription> response = billingApiList.cancelSubscriptionCharge(companyId, extensionId, subscriptionId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.Invoices getInvoices(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Invoices> response = billingApiList.getInvoices(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.Invoice getInvoiceById(String companyId , String invoiceId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Invoice> response = billingApiList.getInvoiceById(companyId, invoiceId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriptionCustomer getCustomerDetail(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionCustomer> response = billingApiList.getCustomerDetail(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriptionCustomer upsertCustomerDetail(String companyId ,PlatformModels.SubscriptionCustomerCreate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionCustomer> response = billingApiList.upsertCustomerDetail(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriptionStatus getSubscription(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionStatus> response = billingApiList.getSubscription(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriptionLimit getFeatureLimitConfig(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionLimit> response = billingApiList.getFeatureLimitConfig(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriptionActivateRes activateSubscriptionPlan(String companyId ,PlatformModels.SubscriptionActivateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionActivateRes> response = billingApiList.activateSubscriptionPlan(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CancelSubscriptionRes cancelSubscriptionPlan(String companyId ,PlatformModels.CancelSubscriptionReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CancelSubscriptionRes> response = billingApiList.cancelSubscriptionPlan(companyId, body).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class CommunicationService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CommunicationApiList communicationApiList;

    public CommunicationService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.communicationApiList = generateCommunicationApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CommunicationApiList generateCommunicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CommunicationApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.SystemNotifications getSystemNotifications(String companyId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SystemNotifications> response = communicationApiList.getSystemNotifications(companyId, pageNo, pageSize).execute();
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
        String companyId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SystemNotifications> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SystemNotifications callback = this.getSystemNotifications(
                
                 companyId,
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.Campaigns getCampaigns(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Campaigns> response = communicationApiList.getCampaigns(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.Campaigns> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.Campaigns callback = this.getCampaigns(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.Campaign createCampaign(String companyId , String applicationId ,PlatformModels.CampaignReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Campaign> response = communicationApiList.createCampaign(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Campaign getCampaignById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Campaign> response = communicationApiList.getCampaignById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Campaign updateCampaignById(String companyId , String applicationId , String id ,PlatformModels.CampaignReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Campaign> response = communicationApiList.updateCampaignById(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetStats getStatsOfCampaignById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetStats> response = communicationApiList.getStatsOfCampaignById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Audiences getAudiences(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Audiences> response = communicationApiList.getAudiences(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.Audiences> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.Audiences callback = this.getAudiences(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.Audience createAudience(String companyId , String applicationId ,PlatformModels.AudienceReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Audience> response = communicationApiList.createAudience(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.BigqueryHeadersRes getBigqueryHeaders(String companyId , String applicationId ,PlatformModels.BigqueryHeadersReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BigqueryHeadersRes> response = communicationApiList.getBigqueryHeaders(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Audience getAudienceById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Audience> response = communicationApiList.getAudienceById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Audience updateAudienceById(String companyId , String applicationId , String id ,PlatformModels.AudienceReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Audience> response = communicationApiList.updateAudienceById(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetNRecordsCsvRes getNSampleRecordsFromCsv(String companyId , String applicationId ,PlatformModels.GetNRecordsCsvReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetNRecordsCsvRes> response = communicationApiList.getNSampleRecordsFromCsv(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.EmailProviders getEmailProviders(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailProviders> response = communicationApiList.getEmailProviders(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.EmailProviders> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.EmailProviders callback = this.getEmailProviders(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.EmailProvider createEmailProvider(String companyId , String applicationId ,PlatformModels.EmailProviderReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailProvider> response = communicationApiList.createEmailProvider(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.EmailProvider getEmailProviderById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailProvider> response = communicationApiList.getEmailProviderById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.EmailProvider updateEmailProviderById(String companyId , String applicationId , String id ,PlatformModels.EmailProviderReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailProvider> response = communicationApiList.updateEmailProviderById(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.EmailTemplates getEmailTemplates(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplates> response = communicationApiList.getEmailTemplates(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.EmailTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.EmailTemplates callback = this.getEmailTemplates(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.EmailTemplateRes createEmailTemplate(String companyId , String applicationId ,PlatformModels.EmailTemplateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplateRes> response = communicationApiList.createEmailTemplate(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SystemEmailTemplates getSystemEmailTemplates(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SystemEmailTemplates> response = communicationApiList.getSystemEmailTemplates(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SystemEmailTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SystemEmailTemplates callback = this.getSystemEmailTemplates(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.EmailTemplate getEmailTemplateById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplate> response = communicationApiList.getEmailTemplateById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.EmailTemplateRes updateEmailTemplateById(String companyId , String applicationId , String id ,PlatformModels.EmailTemplateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplateRes> response = communicationApiList.updateEmailTemplateById(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.EmailTemplateDeleteSuccessRes deleteEmailTemplateById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EmailTemplateDeleteSuccessRes> response = communicationApiList.deleteEmailTemplateById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.EventSubscriptions getEventSubscriptions(String companyId , String applicationId , Integer pageNo , Integer pageSize , String populate ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EventSubscriptions> response = communicationApiList.getEventSubscriptions(companyId, applicationId, pageNo, pageSize, populate).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        String populate
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.EventSubscriptions> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.EventSubscriptions callback = this.getEventSubscriptions(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.Jobs getJobs(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Jobs> response = communicationApiList.getJobs(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.Jobs> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.Jobs callback = this.getJobs(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.TriggerJobResponse triggerCampaignJob(String companyId , String applicationId ,PlatformModels.TriggerJobRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TriggerJobResponse> response = communicationApiList.triggerCampaignJob(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.JobLogs getJobLogs(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.JobLogs> response = communicationApiList.getJobLogs(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.JobLogs> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.JobLogs callback = this.getJobLogs(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.Logs getCommunicationLogs(String companyId , String applicationId , String pageId , Integer pageSize , Object sort , Object query ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Logs> response = communicationApiList.getCommunicationLogs(companyId, applicationId, pageId, pageSize, sort, query).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort,
        Object query
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.Logs> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.Logs callback = this.getCommunicationLogs(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    
    
    public PlatformModels.SmsProviders getSmsProviders(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsProviders> response = communicationApiList.getSmsProviders(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SmsProviders> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SmsProviders callback = this.getSmsProviders(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.SmsProvider createSmsProvider(String companyId , String applicationId ,PlatformModels.SmsProviderReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsProvider> response = communicationApiList.createSmsProvider(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SmsProvider getSmsProviderById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsProvider> response = communicationApiList.getSmsProviderById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SmsProvider updateSmsProviderById(String companyId , String applicationId , String id ,PlatformModels.SmsProviderReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsProvider> response = communicationApiList.updateSmsProviderById(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SmsTemplates getSmsTemplates(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplates> response = communicationApiList.getSmsTemplates(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SmsTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SmsTemplates callback = this.getSmsTemplates(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.SmsTemplateRes createSmsTemplate(String companyId , String applicationId ,PlatformModels.SmsTemplateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplateRes> response = communicationApiList.createSmsTemplate(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SmsTemplate getSmsTemplateById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplate> response = communicationApiList.getSmsTemplateById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SmsTemplateRes updateSmsTemplateById(String companyId , String applicationId , String id ,PlatformModels.SmsTemplateReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplateRes> response = communicationApiList.updateSmsTemplateById(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SmsTemplateDeleteSuccessRes deleteSmsTemplateById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SmsTemplateDeleteSuccessRes> response = communicationApiList.deleteSmsTemplateById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SystemSmsTemplates getSystemSystemTemplates(String companyId , String applicationId , Integer pageNo , Integer pageSize , Object sort ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SystemSmsTemplates> response = communicationApiList.getSystemSystemTemplates(companyId, applicationId, pageNo, pageSize, sort).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        Object sort
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SystemSmsTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SystemSmsTemplates callback = this.getSystemSystemTemplates(
                
                 companyId,
                 applicationId,
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

    private PaymentApiList paymentApiList;

    public PaymentService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.paymentApiList = generatePaymentApiList(this.platformConfig.getPersistentCookieStore());
    }

    private PaymentApiList generatePaymentApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),PaymentApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PayoutsResponse getAllPayouts(Integer companyId , String uniqueExternalId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PayoutsResponse> response = paymentApiList.getAllPayouts(companyId, uniqueExternalId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.PayoutResponse savePayout(Integer companyId ,PlatformModels.PayoutRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PayoutResponse> response = paymentApiList.savePayout(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.UpdatePayoutResponse updatePayout(Integer companyId , String uniqueTransferNo ,PlatformModels.PayoutRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdatePayoutResponse> response = paymentApiList.updatePayout(companyId, uniqueTransferNo, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.UpdatePayoutResponse activateAndDectivatePayout(Integer companyId , String uniqueTransferNo ,PlatformModels.UpdatePayoutRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdatePayoutResponse> response = paymentApiList.activateAndDectivatePayout(companyId, uniqueTransferNo, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.DeletePayoutResponse deletePayout(Integer companyId , String uniqueTransferNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeletePayoutResponse> response = paymentApiList.deletePayout(companyId, uniqueTransferNo).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriptionPaymentMethodResponse getSubscriptionPaymentMethod(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionPaymentMethodResponse> response = paymentApiList.getSubscriptionPaymentMethod(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.DeleteSubscriptionPaymentMethodResponse deleteSubscriptionPaymentMethod(Integer companyId , String uniqueExternalId , String paymentMethodId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeleteSubscriptionPaymentMethodResponse> response = paymentApiList.deleteSubscriptionPaymentMethod(companyId, uniqueExternalId, paymentMethodId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriptionConfigResponse getSubscriptionConfig(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriptionConfigResponse> response = paymentApiList.getSubscriptionConfig(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SaveSubscriptionSetupIntentResponse saveSubscriptionSetupIntent(Integer companyId ,PlatformModels.SaveSubscriptionSetupIntentRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SaveSubscriptionSetupIntentResponse> response = paymentApiList.saveSubscriptionSetupIntent(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    public PlatformModels.IfscCodeResponse verifyIfscCode(Integer companyId , String ifscCode ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.IfscCodeResponse> response = paymentApiList.verifyIfscCode(companyId, ifscCode).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.PaymentGatewayConfigResponse getBrandPaymentGatewayConfig(Integer companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentGatewayConfigResponse> response = paymentApiList.getBrandPaymentGatewayConfig(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PaymentGatewayToBeReviewed saveBrandPaymentGatewayConfig(Integer companyId , String applicationId ,PlatformModels.PaymentGatewayConfigRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentGatewayToBeReviewed> response = paymentApiList.saveBrandPaymentGatewayConfig(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PaymentGatewayToBeReviewed updateBrandPaymentGatewayConfig(Integer companyId , String applicationId ,PlatformModels.PaymentGatewayConfigRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentGatewayToBeReviewed> response = paymentApiList.updateBrandPaymentGatewayConfig(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PaymentOptionsResponse getPaymentModeRoutes(Integer companyId , String applicationId , Boolean refresh , String requestType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentOptionsResponse> response = paymentApiList.getPaymentModeRoutes(companyId, applicationId, refresh, requestType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.RefundAccountResponse addBeneficiaryDetails(Integer companyId , String applicationId ,PlatformModels.AddBeneficiaryDetailsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.RefundAccountResponse> response = paymentApiList.addBeneficiaryDetails(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    public PlatformModels.OrderBeneficiaryResponse getUserOrderBeneficiaries(String orderId , Integer companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderBeneficiaryResponse> response = paymentApiList.getUserOrderBeneficiaries(orderId, companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.OrderBeneficiaryResponse getUserBeneficiaries(String orderId , Integer companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderBeneficiaryResponse> response = paymentApiList.getUserBeneficiaries(orderId, companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PaymentConfirmationResponse confirmPayment(Integer companyId , String applicationId ,PlatformModels.PaymentConfirmationRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PaymentConfirmationResponse> response = paymentApiList.confirmPayment(companyId, applicationId, body).execute();
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

    private OrderApiList orderApiList;

    public OrderService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.orderApiList = generateOrderApiList(this.platformConfig.getPersistentCookieStore());
    }

    private OrderApiList generateOrderApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),OrderApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PlatformModels.UpdateShipmentStatusResponse shipmentStatusUpdate(String companyId ,PlatformModels.UpdateShipmentStatusBody body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateShipmentStatusResponse> response = orderApiList.shipmentStatusUpdate(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetActivityStatus activityStatus(String companyId , String bagId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetActivityStatus> response = orderApiList.activityStatus(companyId, bagId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.UpdateProcessShipmenstRequestResponse storeProcessShipmentUpdate(String companyId ,PlatformModels.UpdateProcessShipmenstRequestBody body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateProcessShipmenstRequestResponse> response = orderApiList.storeProcessShipmentUpdate(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public Object checkRefund(String companyId , String shipmentId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = orderApiList.checkRefund(companyId, shipmentId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.OrderListing getOrdersByCompanyId(String companyId , String pageNo , String pageSize , String fromDate , String toDate , String q , String stage , String salesChannels , String orderId , String stores , String status , Boolean shortenUrls , String filterType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderListing> response = orderApiList.getOrdersByCompanyId(companyId, pageNo, pageSize, fromDate, toDate, q, stage, salesChannels, orderId, stores, status, shortenUrls, filterType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.OrderLanesCount getOrderLanesCountByCompanyId(String companyId , String pageNo , String pageSize , String fromDate , String toDate , String q , String stage , String salesChannels , String orderId , String stores , String status , Boolean shortenUrls , String filterType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderLanesCount> response = orderApiList.getOrderLanesCountByCompanyId(companyId, pageNo, pageSize, fromDate, toDate, q, stage, salesChannels, orderId, stores, status, shortenUrls, filterType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.OrderDetails getOrderDetails(String companyId , String orderId , String next , String previous ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderDetails> response = orderApiList.getOrderDetails(companyId, orderId, next, previous).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.OrderPicklistListing getPicklistOrdersByCompanyId(String companyId , String pageNo , String pageSize , String fromDate , String toDate , String q , String stage , String salesChannels , String orderId , String stores , String status , Boolean shortenUrls , String filterType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderPicklistListing> response = orderApiList.getPicklistOrdersByCompanyId(companyId, pageNo, pageSize, fromDate, toDate, q, stage, salesChannels, orderId, stores, status, shortenUrls, filterType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetShipmentAddressResponse getShipmentAddress(String companyId , String shipmentId , String addressCategory ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetShipmentAddressResponse> response = orderApiList.getShipmentAddress(companyId, shipmentId, addressCategory).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.UpdateShipmentAddressResponse updateShipmentAddress(String companyId , String shipmentId , String addressCategory ,PlatformModels.UpdateShipmentAddressRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateShipmentAddressResponse> response = orderApiList.updateShipmentAddress(companyId, shipmentId, addressCategory, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetPingResponse getPing(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetPingResponse> response = orderApiList.getPing(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetVoiceCallbackResponse voiceCallback(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetVoiceCallbackResponse> response = orderApiList.voiceCallback(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetClickToCallResponse voiceClickToCall(String companyId , String caller , String receiver ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetClickToCallResponse> response = orderApiList.voiceClickToCall(companyId, caller, receiver).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.PlatformShipmentTrack trackShipmentPlatform(String companyId , String applicationId , String shipmentId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PlatformShipmentTrack> response = orderApiList.trackShipmentPlatform(companyId, applicationId, shipmentId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.PlatformOrderTrack trackOrder(String companyId , String applicationId , String orderId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.PlatformOrderTrack> response = orderApiList.trackOrder(companyId, applicationId, orderId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.FailedOrders failedOrders(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FailedOrders> response = orderApiList.failedOrders(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.UpdateOrderReprocessResponse reprocessOrder(String companyId , String applicationId , String orderId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateOrderReprocessResponse> response = orderApiList.reprocessOrder(companyId, applicationId, orderId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ShipmentUpdateResponse updateShipment(String companyId , String applicationId , String shipmentId ,PlatformModels.ShipmentUpdateRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShipmentUpdateResponse> response = orderApiList.updateShipment(companyId, applicationId, shipmentId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ShipmentReasonsResponse getPlatformShipmentReasons(String companyId , String applicationId , String action ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShipmentReasonsResponse> response = orderApiList.getPlatformShipmentReasons(companyId, applicationId, action).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ShipmentTrackResponse getShipmentTrackDetails(String companyId , String applicationId , String orderId , String shipmentId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShipmentTrackResponse> response = orderApiList.getShipmentTrackDetails(companyId, applicationId, orderId, shipmentId).execute();
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

    private CatalogApiList catalogApiList;

    public CatalogService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.catalogApiList = generateCatalogApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CatalogApiList generateCatalogApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CatalogApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetProductBundleListingResponse getProductBundle(String companyId , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetProductBundleListingResponse> response = catalogApiList.getProductBundle(companyId, q).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetProductBundleCreateResponse createProductBundle(String companyId ,PlatformModels.ProductBundleRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetProductBundleCreateResponse> response = catalogApiList.createProductBundle(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetProductBundleResponse getProductBundleDetail(String companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetProductBundleResponse> response = catalogApiList.getProductBundleDetail(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetProductBundleCreateResponse updateProductBundle(String companyId , String id ,PlatformModels.ProductBundleUpdateRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetProductBundleCreateResponse> response = catalogApiList.updateProductBundle(companyId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ListSizeGuide getSizeGuides(String companyId , Boolean active , String q , String tag , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ListSizeGuide> response = catalogApiList.getSizeGuides(companyId, active, q, tag, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse createSizeGuide(String companyId ,PlatformModels.ValidateSizeGuide body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createSizeGuide(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SizeGuideResponse getSizeGuide(String companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SizeGuideResponse> response = catalogApiList.getSizeGuide(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse updateSizeGuide(String companyId , String id ,PlatformModels.ValidateSizeGuide body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.updateSizeGuide(companyId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CrossSellingResponse getSellerInsights(String companyId , String sellerAppId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CrossSellingResponse> response = catalogApiList.getSellerInsights(companyId, sellerAppId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.UpdatedResponse createMarketplaceOptin(Integer companyId , String marketplace ,PlatformModels.OptInPostRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdatedResponse> response = catalogApiList.createMarketplaceOptin(companyId, marketplace, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetOptInPlatform getMarketplaceOptinDetail(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetOptInPlatform> response = catalogApiList.getMarketplaceOptinDetail(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.OptinCompanyDetail getCompanyDetail(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptinCompanyDetail> response = catalogApiList.getCompanyDetail(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.OptinCompanyBrandDetailsView getCompanyBrandDetail(Integer companyId , Boolean isActive , Boolean q , Integer pageNo , Integer pageSize , String marketplace ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptinCompanyBrandDetailsView> response = catalogApiList.getCompanyBrandDetail(companyId, isActive, q, pageNo, pageSize, marketplace).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.OptinCompanyMetrics getCompanyMetrics(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptinCompanyMetrics> response = catalogApiList.getCompanyMetrics(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.OptinStoreDetails getStoreDetail(Integer companyId , String q , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptinStoreDetails> response = catalogApiList.getStoreDetail(companyId, q, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GenderDetail getGenderAttribute(Integer companyId , String attributeSlug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GenderDetail> response = catalogApiList.getGenderAttribute(companyId, attributeSlug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ProdcutTemplateCategoriesResponse listProductTemplateCategories(String companyId , String departments , String itemType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProdcutTemplateCategoriesResponse> response = catalogApiList.listProductTemplateCategories(companyId, departments, itemType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.DepartmentsResponse listDepartmentsData(String companyId , Integer pageNo , Integer pageSize , String name , String search , Boolean isActive ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DepartmentsResponse> response = catalogApiList.listDepartmentsData(companyId, pageNo, pageSize, name, search, isActive).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.DepartmentsResponse getDepartmentData(String companyId , String uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DepartmentsResponse> response = catalogApiList.getDepartmentData(companyId, uid).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.TemplatesResponse listProductTemplate(String companyId , String departments ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TemplatesResponse> response = catalogApiList.listProductTemplate(companyId, departments).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.TemplatesValidationResponse validateProductTemplate(String companyId , String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TemplatesValidationResponse> response = catalogApiList.validateProductTemplate(companyId, slug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public Object downloadProductTemplateViews(String companyId , String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = catalogApiList.downloadProductTemplateViews(companyId, slug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public Object downloadProductTemplateView(String companyId , String itemType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = catalogApiList.downloadProductTemplateView(companyId, itemType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.InventoryValidationResponse validateProductTemplateSchema(String companyId , String itemType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryValidationResponse> response = catalogApiList.validateProductTemplateSchema(companyId, itemType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.HSNCodesResponse listHSNCodes(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HSNCodesResponse> response = catalogApiList.listHSNCodes(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ProductDownloadsResponse listProductTemplateExportDetails(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductDownloadsResponse> response = catalogApiList.listProductTemplateExportDetails(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ProductConfigurationDownloads listTemplateBrandTypeValues(String companyId , String filter ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductConfigurationDownloads> response = catalogApiList.listTemplateBrandTypeValues(companyId, filter).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CategoryResponse listCategories(String companyId , String level , String departments , String q , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CategoryResponse> response = catalogApiList.listCategories(companyId, level, departments, q, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CategoryCreateResponse createCategories(String companyId ,PlatformModels.CategoryRequestBody body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CategoryCreateResponse> response = catalogApiList.createCategories(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SingleCategoryResponse getCategoryData(String companyId , String uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SingleCategoryResponse> response = catalogApiList.getCategoryData(companyId, uid).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CategoryUpdateResponse updateCategory(String companyId , String uid ,PlatformModels.CategoryRequestBody body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CategoryUpdateResponse> response = catalogApiList.updateCategory(companyId, uid, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ProductListingResponse getProducts(Integer companyId , List<Integer> brandIds , List<Integer> categoryIds , List<Integer> itemIds , List<Integer> departmentIds , List<Double> itemCode , String q , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductListingResponse> response = catalogApiList.getProducts(companyId, brandIds, categoryIds, itemIds, departmentIds, itemCode, q, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse createProduct(String companyId ,PlatformModels.ProductCreateUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createProduct(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.Product getProduct(String itemCode , Integer companyId , Integer itemId , Integer brandUid , Integer uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Product> response = catalogApiList.getProduct(itemCode, companyId, itemId, brandUid, uid).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse editProduct(String companyId , Integer itemId ,PlatformModels.ProductCreateUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.editProduct(companyId, itemId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse deleteProduct(String companyId , Integer itemId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.deleteProduct(companyId, itemId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ValidateProduct getProductValidation(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ValidateProduct> response = catalogApiList.getProductValidation(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ProductListingResponse getProductSize(String itemCode , Integer companyId , Integer itemId , Integer brandUid , Integer uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductListingResponse> response = catalogApiList.getProductSize(itemCode, companyId, itemId, brandUid, uid).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ProductBulkRequestList getProductBulkUploadHistory(Integer companyId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductBulkRequestList> response = catalogApiList.getProductBulkUploadHistory(companyId, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse updateProductAssetsInBulk(Integer companyId ,PlatformModels.BulkJob body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.updateProductAssetsInBulk(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse createProductsInBulk(Integer companyId , String batchId ,PlatformModels.BulkProductRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createProductsInBulk(companyId, batchId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse deleteProductBulkJob(String companyId , Integer batchId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.deleteProductBulkJob(companyId, batchId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ProductTagsViewResponse getCompanyTags(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductTagsViewResponse> response = catalogApiList.getCompanyTags(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.BulkAssetResponse getProductAssetsInBulk(Integer companyId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkAssetResponse> response = catalogApiList.getProductAssetsInBulk(companyId, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse createProductAssetsInBulk(Integer companyId ,PlatformModels.ProductBulkAssets body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createProductAssetsInBulk(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ProductSizeDeleteResponse deleteSize(String companyId , Integer itemId , Integer size ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductSizeDeleteResponse> response = catalogApiList.deleteSize(companyId, itemId, size).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.InventoryResponse getInventoryBySize(String companyId , String itemId , String size , Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryResponse> response = catalogApiList.getInventoryBySize(companyId, itemId, size, pageNo, pageSize, q).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse addInventory(String companyId , Double itemId , String size ,PlatformModels.InventoryRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.addInventory(companyId, itemId, size, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.InventoryResponse getInventoryBySizeIdentifier(String companyId , String itemId , String sizeIdentifier , Integer pageNo , Integer pageSize , String q , List<Integer> locationIds ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryResponse> response = catalogApiList.getInventoryBySizeIdentifier(companyId, itemId, sizeIdentifier, pageNo, pageSize, q, locationIds).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.InventoryDelete deleteInventory(String companyId , String size , Integer itemId , Double locationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryDelete> response = catalogApiList.deleteInventory(companyId, size, itemId, locationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.BulkInventoryGet getInventoryBulkUploadHistory(Integer companyId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkInventoryGet> response = catalogApiList.getInventoryBulkUploadHistory(companyId, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CommonResponse createBulkInventoryJob(Integer companyId ,PlatformModels.BulkJob body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CommonResponse> response = catalogApiList.createBulkInventoryJob(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse createBulkInventory(Integer companyId , String batchId ,PlatformModels.InventoryBulkRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createBulkInventory(companyId, batchId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse deleteBulkInventoryJob(String companyId , String batchId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.deleteBulkInventoryJob(companyId, batchId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.InventoryExportJob getInventoryExport(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryExportJob> response = catalogApiList.getInventoryExport(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse createInventoryExportJob(Integer companyId ,PlatformModels.InventoryExportRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = catalogApiList.createInventoryExportJob(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.InventoryConfig exportInventoryConfig(String companyId , String filterType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.InventoryConfig> response = catalogApiList.exportInventoryConfig(companyId, filterType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.HsnCodesListingResponse getAllHsnCodes(String companyId , Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HsnCodesListingResponse> response = catalogApiList.getAllHsnCodes(companyId, pageNo, pageSize, q).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.HsnCode createHsnCode(String companyId ,PlatformModels.HsnUpsert body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HsnCode> response = catalogApiList.createHsnCode(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.HsnCode getHsnCode(String companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HsnCode> response = catalogApiList.getHsnCode(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.HsnCode updateHsnCode(String companyId , String id ,PlatformModels.HsnUpsert body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HsnCode> response = catalogApiList.updateHsnCode(companyId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.BulkHsnResponse bulkHsnCode(String companyId ,PlatformModels.BulkHsnUpsert body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkHsnResponse> response = catalogApiList.bulkHsnCode(companyId, body).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.GetSearchWordsDetailResponse getSearchKeywords(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetSearchWordsDetailResponse> response = catalogApiList.getSearchKeywords(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetSearchWordsData updateSearchKeywords(String companyId , String applicationId , String id ,PlatformModels.CreateSearchKeyword body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetSearchWordsData> response = catalogApiList.updateSearchKeywords(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.DeleteResponse deleteSearchKeywords(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeleteResponse> response = catalogApiList.deleteSearchKeywords(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetSearchWordsResponse getAllSearchKeyword(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetSearchWordsResponse> response = catalogApiList.getAllSearchKeyword(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetSearchWordsData createCustomKeyword(String companyId , String applicationId ,PlatformModels.CreateSearchKeyword body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetSearchWordsData> response = catalogApiList.createCustomKeyword(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetAutocompleteWordsResponse getAutocompleteKeywordDetail(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAutocompleteWordsResponse> response = catalogApiList.getAutocompleteKeywordDetail(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetAutocompleteWordsResponse updateAutocompleteKeyword(String companyId , String applicationId , String id ,PlatformModels.CreateAutocompleteKeyword body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAutocompleteWordsResponse> response = catalogApiList.updateAutocompleteKeyword(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.DeleteResponse deleteAutocompleteKeyword(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeleteResponse> response = catalogApiList.deleteAutocompleteKeyword(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetAutocompleteWordsResponse getAutocompleteConfig(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAutocompleteWordsResponse> response = catalogApiList.getAutocompleteConfig(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CreateAutocompleteWordsResponse createCustomAutocompleteRule(String companyId , String applicationId ,PlatformModels.CreateAutocompleteKeyword body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAutocompleteWordsResponse> response = catalogApiList.createCustomAutocompleteRule(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.GetCatalogConfigurationMetaData getCatalogConfiguration(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCatalogConfigurationMetaData> response = catalogApiList.getCatalogConfiguration(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetAppCatalogConfiguration getConfigurations(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAppCatalogConfiguration> response = catalogApiList.getConfigurations(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetAppCatalogConfiguration createConfigurationProductListing(String companyId , String applicationId ,PlatformModels.AppConfiguration body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAppCatalogConfiguration> response = catalogApiList.createConfigurationProductListing(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetAppCatalogEntityConfiguration getConfigurationByType(String companyId , String applicationId , String type ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAppCatalogEntityConfiguration> response = catalogApiList.getConfigurationByType(companyId, applicationId, type).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetAppCatalogConfiguration createConfigurationByType(String companyId , String applicationId , String type ,PlatformModels.AppConfiguration body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetAppCatalogConfiguration> response = catalogApiList.createConfigurationByType(companyId, applicationId, type, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetCollectionQueryOptionResponse getQueryFilters(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCollectionQueryOptionResponse> response = catalogApiList.getQueryFilters(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetCollectionListingResponse getAllCollections(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCollectionListingResponse> response = catalogApiList.getAllCollections(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CollectionCreateResponse createCollection(String companyId , String applicationId ,PlatformModels.CreateCollection body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CollectionCreateResponse> response = catalogApiList.createCollection(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CollectionDetailResponse getCollectionDetail(String companyId , String applicationId , String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CollectionDetailResponse> response = catalogApiList.getCollectionDetail(companyId, applicationId, slug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.UpdateCollection updateCollection(String companyId , String applicationId , String id ,PlatformModels.UpdateCollection body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdateCollection> response = catalogApiList.updateCollection(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.DeleteResponse deleteCollection(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeleteResponse> response = catalogApiList.deleteCollection(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.GetCollectionItemsResponse getCollectionItems(String companyId , String applicationId , String id , String sortOn , String pageId , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCollectionItemsResponse> response = catalogApiList.getCollectionItems(companyId, applicationId, id, sortOn, pageId, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.UpdatedResponse addCollectionItems(String companyId , String applicationId , String id ,PlatformModels.CollectionItemRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UpdatedResponse> response = catalogApiList.addCollectionItems(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CatalogInsightResponse getCatalogInsights(String companyId , String applicationId , String brand ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CatalogInsightResponse> response = catalogApiList.getCatalogInsights(companyId, applicationId, brand).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.BrandListingResponse getApplicationBrands(String companyId , String applicationId , String department , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BrandListingResponse> response = catalogApiList.getApplicationBrands(companyId, applicationId, department, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        String department,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.BrandListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.BrandListingResponse callback = this.getApplicationBrands(
                
                 companyId,
                 applicationId,
                 department,
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
    
    
    
    
    
    public PlatformModels.DepartmentResponse getDepartments(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DepartmentResponse> response = catalogApiList.getDepartments(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CategoryListingResponse getCategories(String companyId , String applicationId , String department ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CategoryListingResponse> response = catalogApiList.getCategories(companyId, applicationId, department).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ApplicationProductListingResponse getAppicationProducts(String companyId , String applicationId , String q , String f , Boolean filters , String sortOn , String pageId , Integer pageSize , Integer pageNo , String pageType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationProductListingResponse> response = catalogApiList.getAppicationProducts(companyId, applicationId, q, f, filters, sortOn, pageId, pageSize, pageNo, pageType).execute();
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
        String companyId,
        String applicationId,
        String q,
        String f,
        Boolean filters,
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.ApplicationProductListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.ApplicationProductListingResponse callback = this.getAppicationProducts(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.ProductDetail getProductDetailBySlug(String companyId , String applicationId , String slug ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductDetail> response = catalogApiList.getProductDetailBySlug(companyId, applicationId, slug).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ProductListingResponse getAppProducts(String companyId , String applicationId , List<Integer> brandIds , List<Integer> categoryIds , List<Integer> departmentIds , Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ProductListingResponse> response = catalogApiList.getAppProducts(companyId, applicationId, brandIds, categoryIds, departmentIds, pageNo, pageSize, q).execute();
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

public static class CompanyProfileService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CompanyProfileApiList companyprofileApiList;

    public CompanyProfileService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyprofileApiList = generateCompanyprofileApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CompanyProfileApiList generateCompanyprofileApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CompanyProfileApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PlatformModels.GetCompanyProfileSerializerResponse cbsOnboardGet(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetCompanyProfileSerializerResponse> response = companyprofileApiList.cbsOnboardGet(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse updateCompany(String companyId ,PlatformModels.UpdateCompany body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.updateCompany(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.MetricsSerializer getCompanyMetrics(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.MetricsSerializer> response = companyprofileApiList.getCompanyMetrics(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetBrandResponseSerializer getBrand(String companyId , String brandId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetBrandResponseSerializer> response = companyprofileApiList.getBrand(companyId, brandId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse editBrand(String companyId , String brandId ,PlatformModels.CreateUpdateBrandRequestSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.editBrand(companyId, brandId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse createBrand(String companyId ,PlatformModels.CreateUpdateBrandRequestSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.createBrand(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CompanyBrandListSerializer getBrands(String companyId , Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompanyBrandListSerializer> response = companyprofileApiList.getBrands(companyId, pageNo, pageSize, q).execute();
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
        String companyId,
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.CompanyBrandListSerializer> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.CompanyBrandListSerializer callback = this.getBrands(
                
                 companyId,
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
    
    
    
    
    
    public PlatformModels.SuccessResponse createCompanyBrandMapping(String companyId ,PlatformModels.CompanyBrandPostRequestSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.createCompanyBrandMapping(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.LocationListSerializer getLocations(String companyId , String storeType , String q , String stage , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.LocationListSerializer> response = companyprofileApiList.getLocations(companyId, storeType, q, stage, pageNo, pageSize).execute();
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
        String companyId,
        String storeType,
        String q,
        String stage,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.LocationListSerializer> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.LocationListSerializer callback = this.getLocations(
                
                 companyId,
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
    
    
    
    
    
    public PlatformModels.SuccessResponse createLocation(String companyId ,PlatformModels.LocationSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.createLocation(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetLocationSerializer getLocationDetail(String companyId , String locationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetLocationSerializer> response = companyprofileApiList.getLocationDetail(companyId, locationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse updateLocation(String companyId , String locationId ,PlatformModels.LocationSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.updateLocation(companyId, locationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessResponse createLocationBulk(String companyId ,PlatformModels.BulkLocationSerializer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessResponse> response = companyprofileApiList.createLocationBulk(companyId, body).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class FileStorageService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private FileStorageApiList filestorageApiList;

    public FileStorageService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.filestorageApiList = generateFilestorageApiList(this.platformConfig.getPersistentCookieStore());
    }

    private FileStorageApiList generateFilestorageApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),FileStorageApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PlatformModels.StartResponse startUpload(String namespace , Integer companyId ,PlatformModels.StartRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StartResponse> response = filestorageApiList.startUpload(namespace, companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CompleteResponse completeUpload(String namespace , Integer companyId ,PlatformModels.StartResponse body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompleteResponse> response = filestorageApiList.completeUpload(namespace, companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    
    
    public PlatformModels.SignUrlResponse getSignUrls(Integer companyId ,PlatformModels.SignUrlRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SignUrlResponse> response = filestorageApiList.getSignUrls(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.BulkResponse copyFiles(Boolean sync , Integer companyId ,PlatformModels.BulkRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkResponse> response = filestorageApiList.copyFiles(sync, companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    
    
    public PlatformModels.BrowseResponse browse(String namespace , Integer companyId , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BrowseResponse> response = filestorageApiList.browse(namespace, companyId, pageNo).execute();
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
        String namespace,
        Integer companyId
        
        ){ 
    
     int pageSize = 20; 

    Paginator<PlatformModels.BrowseResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.BrowseResponse callback = this.browse(
                
                 namespace,
                 companyId,
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
    
    
    
    
    
    
    
    public Object proxy(Integer companyId , String url ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = filestorageApiList.proxy(companyId, url).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    
    
    
    
    public PlatformModels.StartResponse appStartUpload(String namespace , Integer companyId , String applicationId ,PlatformModels.StartRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StartResponse> response = filestorageApiList.appStartUpload(namespace, companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CompleteResponse appCompleteUpload(String namespace , Integer companyId , String applicationId ,PlatformModels.StartResponse body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompleteResponse> response = filestorageApiList.appCompleteUpload(namespace, companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    public PlatformModels.BulkResponse appCopyFiles(Boolean sync , Integer companyId , Integer applicationId ,PlatformModels.BulkRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BulkResponse> response = filestorageApiList.appCopyFiles(sync, companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    public PlatformModels.BrowseResponse browse(String namespace , Integer companyId , Integer applicationId , Integer pageNo ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BrowseResponse> response = filestorageApiList.browse(namespace, companyId, applicationId, pageNo).execute();
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
        String namespace,
        Integer companyId,
        Integer applicationId
        
        ){ 
    
     int pageSize = 20; 

    Paginator<PlatformModels.BrowseResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.BrowseResponse callback = this.browse(
                
                 namespace,
                 companyId,
                 applicationId,
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

    private ShareApiList shareApiList;

    public ShareService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.ShortLinkRes createShortLink(String companyId , String applicationId ,PlatformModels.ShortLinkReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShortLinkRes> response = shareApiList.createShortLink(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ShortLinkList getShortLinks(String companyId , String applicationId , Integer pageNo , Integer pageSize , String createdBy , String active , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShortLinkList> response = shareApiList.getShortLinks(companyId, applicationId, pageNo, pageSize, createdBy, active, q).execute();
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
        String companyId,
        String applicationId,
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
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.ShortLinkRes getShortLinkByHash(String companyId , String applicationId , String hash ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShortLinkRes> response = shareApiList.getShortLinkByHash(companyId, applicationId, hash).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ShortLinkRes updateShortLinkById(String companyId , String applicationId , String id ,PlatformModels.ShortLinkReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ShortLinkRes> response = shareApiList.updateShortLinkById(companyId, applicationId, id, body).execute();
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

    private InventoryApiList inventoryApiList;

    public InventoryService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.inventoryApiList = generateInventoryApiList(this.platformConfig.getPersistentCookieStore());
    }

    private InventoryApiList generateInventoryApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),InventoryApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PlatformModels.ResponseEnvelopeListJobConfigRawDTO getJobsByCompany(Integer companyId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeListJobConfigRawDTO> response = inventoryApiList.getJobsByCompany(companyId, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeString updateJob(Integer companyId ,PlatformModels.JobConfigDTO body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeString> response = inventoryApiList.updateJob(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeString createJob(Integer companyId ,PlatformModels.JobConfigDTO body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeString> response = inventoryApiList.createJob(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeListJobConfigDTO getJobByCompanyAndIntegration(Integer companyId , String integrationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeListJobConfigDTO> response = inventoryApiList.getJobByCompanyAndIntegration(companyId, integrationId, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeJobConfigDTO getJobConfigDefaults(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeJobConfigDTO> response = inventoryApiList.getJobConfigDefaults(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeJobConfigDTO getJobByCode(Integer companyId , String code ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeJobConfigDTO> response = inventoryApiList.getJobByCode(companyId, code).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeJobMetricsDto getJobCodeMetrics(Integer companyId , String code , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeJobMetricsDto> response = inventoryApiList.getJobCodeMetrics(companyId, code, pageNo, pageSize).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ResponseEnvelopeListJobConfigListDTO getJobCodesByCompanyAndIntegration(Integer companyId , String integrationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ResponseEnvelopeListJobConfigListDTO> response = inventoryApiList.getJobCodesByCompanyAndIntegration(companyId, integrationId, pageNo, pageSize).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class ConfigurationService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ConfigurationApiList configurationApiList;

    public ConfigurationService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.configurationApiList = generateConfigurationApiList(this.platformConfig.getPersistentCookieStore());
    }

    private ConfigurationApiList generateConfigurationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),ConfigurationApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.CreateAppResponse createApplication(String companyId ,PlatformModels.CreateApplicationRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CreateAppResponse> response = configurationApiList.createApplication(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ApplicationsResponse getApplications(String companyId , Integer pageNo , Integer pageSize , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationsResponse> response = configurationApiList.getApplications(companyId, pageNo, pageSize, q).execute();
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
        String companyId,
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.ApplicationsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.ApplicationsResponse callback = this.getApplications(
                
                 companyId,
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
    
    
    
    
    
    
    
    public PlatformModels.CurrenciesResponse getCurrencies(String companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CurrenciesResponse> response = configurationApiList.getCurrencies(companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.DomainSuggestionsResponse getDomainAvailibility(String companyId ,PlatformModels.DomainSuggestionsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DomainSuggestionsResponse> response = configurationApiList.getDomainAvailibility(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.Integration getIntegrationById(String companyId , Integer id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Integration> response = configurationApiList.getIntegrationById(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetIntegrationsOptInsResponse getAvailableOptIns(String companyId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetIntegrationsOptInsResponse> response = configurationApiList.getAvailableOptIns(companyId, pageNo, pageSize).execute();
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
        String companyId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GetIntegrationsOptInsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GetIntegrationsOptInsResponse callback = this.getAvailableOptIns(
                
                 companyId,
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
    
    
    
    
    
    public PlatformModels.GetIntegrationsOptInsResponse getSelectedOptIns(String companyId , String level , Integer uid , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetIntegrationsOptInsResponse> response = configurationApiList.getSelectedOptIns(companyId, level, uid, pageNo, pageSize).execute();
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
        String companyId,
        String level,
        Integer uid,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GetIntegrationsOptInsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GetIntegrationsOptInsResponse callback = this.getSelectedOptIns(
                
                 companyId,
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
    
    
    
    
    
    public PlatformModels.IntegrationConfigResponse getIntegrationLevelConfig(String companyId , String id , String level , Boolean opted , Boolean checkPermission ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.IntegrationConfigResponse> response = configurationApiList.getIntegrationLevelConfig(companyId, id, level, opted, checkPermission).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.IntegrationLevel getIntegrationByLevelId(String companyId , String id , String level , Integer uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.IntegrationLevel> response = configurationApiList.getIntegrationByLevelId(companyId, id, level, uid).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.OptedStoreIntegration getLevelActiveIntegrations(String companyId , String id , String level , Integer uid ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptedStoreIntegration> response = configurationApiList.getLevelActiveIntegrations(companyId, id, level, uid).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.BrandsByCompanyResponse getBrandsByCompany(String companyId , String q ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BrandsByCompanyResponse> response = configurationApiList.getBrandsByCompany(companyId, q).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CompanyByBrandsResponse getCompanyByBrands(String companyId , Integer pageNo , Integer pageSize ,PlatformModels.CompanyByBrandsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompanyByBrandsResponse> response = configurationApiList.getCompanyByBrands(companyId, pageNo, pageSize, body).execute();
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
        String companyId,
        Integer pageSize,
        
        PlatformModels.CompanyByBrandsRequest body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.CompanyByBrandsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.CompanyByBrandsResponse callback = this.getCompanyByBrands(
                
                 companyId,
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
    
    
    
    
    
    public PlatformModels.StoreByBrandsResponse getStoreByBrands(String companyId , Integer pageNo , Integer pageSize ,PlatformModels.StoreByBrandsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StoreByBrandsResponse> response = configurationApiList.getStoreByBrands(companyId, pageNo, pageSize, body).execute();
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
        String companyId,
        Integer pageSize,
        
        PlatformModels.StoreByBrandsRequest body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.StoreByBrandsResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.StoreByBrandsResponse callback = this.getStoreByBrands(
                
                 companyId,
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
    
    
    
    
    
    public PlatformModels.OtherSellerApplications getOtherSellerApplications(String companyId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OtherSellerApplications> response = configurationApiList.getOtherSellerApplications(companyId, pageNo, pageSize).execute();
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
        String companyId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.OtherSellerApplications> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.OtherSellerApplications callback = this.getOtherSellerApplications(
                
                 companyId,
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
    
    
    
    
    
    public PlatformModels.OptedApplicationResponse getOtherSellerApplicationById(String companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OptedApplicationResponse> response = configurationApiList.getOtherSellerApplicationById(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SuccessMessageResponse optOutFromApplication(String companyId , String id ,PlatformModels.OptOutInventory body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessageResponse> response = configurationApiList.optOutFromApplication(companyId, id, body).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.MobileAppConfiguration getBuildConfig(String companyId , String applicationId , String platformType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.MobileAppConfiguration> response = configurationApiList.getBuildConfig(companyId, applicationId, platformType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.MobileAppConfiguration updateBuildConfig(String companyId , String applicationId , String platformType ,PlatformModels.MobileAppConfigRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.MobileAppConfiguration> response = configurationApiList.updateBuildConfig(companyId, applicationId, platformType, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.BuildVersionHistory getPreviousVersions(String companyId , String applicationId , String platformType ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.BuildVersionHistory> response = configurationApiList.getPreviousVersions(companyId, applicationId, platformType).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AppFeatureResponse getAppFeatures(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppFeatureResponse> response = configurationApiList.getAppFeatures(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AppFeature updateAppFeatures(String companyId , String applicationId ,PlatformModels.AppFeatureRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppFeature> response = configurationApiList.updateAppFeatures(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ApplicationDetail getAppBasicDetails(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationDetail> response = configurationApiList.getAppBasicDetails(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ApplicationDetail updateAppBasicDetails(String companyId , String applicationId ,PlatformModels.ApplicationDetail body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationDetail> response = configurationApiList.updateAppBasicDetails(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ApplicationInformation getAppContactInfo(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInformation> response = configurationApiList.getAppContactInfo(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ApplicationInformation updateAppContactInfo(String companyId , String applicationId ,PlatformModels.ApplicationInformation body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInformation> response = configurationApiList.updateAppContactInfo(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TokenResponse getAppApiTokens(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TokenResponse> response = configurationApiList.getAppApiTokens(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.TokenResponse updateAppApiTokens(String companyId , String applicationId ,PlatformModels.TokenResponse body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.TokenResponse> response = configurationApiList.updateAppApiTokens(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CompaniesResponse getAppCompanies(String companyId , String applicationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CompaniesResponse> response = configurationApiList.getAppCompanies(companyId, applicationId, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.CompaniesResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.CompaniesResponse callback = this.getAppCompanies(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.StoresResponse getAppStores(String companyId , String applicationId , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StoresResponse> response = configurationApiList.getAppStores(companyId, applicationId, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.StoresResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.StoresResponse callback = this.getAppStores(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.ApplicationInventory getInventoryConfig(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInventory> response = configurationApiList.getInventoryConfig(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ApplicationInventory updateInventoryConfig(String companyId , String applicationId ,PlatformModels.ApplicationInventory body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInventory> response = configurationApiList.updateInventoryConfig(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.ApplicationInventory partiallyUpdateInventoryConfig(String companyId , String applicationId ,PlatformModels.AppInventoryPartialUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ApplicationInventory> response = configurationApiList.partiallyUpdateInventoryConfig(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AppSupportedCurrency getAppCurrencyConfig(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppSupportedCurrency> response = configurationApiList.getAppCurrencyConfig(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AppSupportedCurrency updateAppCurrencyConfig(String companyId , String applicationId ,PlatformModels.AppSupportedCurrency body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppSupportedCurrency> response = configurationApiList.updateAppCurrencyConfig(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.OrderingStores getOrderingStoresByFilter(String companyId , String applicationId , Integer pageNo , Integer pageSize ,PlatformModels.FilterOrderingStoreRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OrderingStores> response = configurationApiList.getOrderingStoresByFilter(companyId, applicationId, pageNo, pageSize, body).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize,
        
        PlatformModels.FilterOrderingStoreRequest body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.OrderingStores> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.OrderingStores callback = this.getOrderingStoresByFilter(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.DeploymentMeta updateOrderingStoreConfig(String companyId , String applicationId ,PlatformModels.OrderingStoreConfig body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DeploymentMeta> response = configurationApiList.updateOrderingStoreConfig(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.DomainsResponse getDomains(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DomainsResponse> response = configurationApiList.getDomains(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Domain addDomain(String companyId , String applicationId ,PlatformModels.DomainAddRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Domain> response = configurationApiList.addDomain(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SuccessMessageResponse removeDomainById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessageResponse> response = configurationApiList.removeDomainById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.DomainsResponse changeDomainType(String companyId , String applicationId ,PlatformModels.UpdateDomainTypeRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DomainsResponse> response = configurationApiList.changeDomainType(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.DomainStatusResponse getDomainStatus(String companyId , String applicationId ,PlatformModels.DomainStatusRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DomainStatusResponse> response = configurationApiList.getDomainStatus(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    public PlatformModels.Application getApplicationById(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Application> response = configurationApiList.getApplicationById(companyId, applicationId).execute();
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

    private CartApiList cartApiList;

    public CartService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.CouponsResponse getCoupons(String companyId , String applicationId , Integer pageNo , Integer pageSize , Boolean isArchived , String title , Boolean isPublic , Boolean isDisplay , String typeSlug , String code ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CouponsResponse> response = cartApiList.getCoupons(companyId, applicationId, pageNo, pageSize, isArchived, title, isPublic, isDisplay, typeSlug, code).execute();
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
        String companyId,
        String applicationId,
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
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.SuccessMessage createCoupon(String companyId , String applicationId ,PlatformModels.CouponAdd body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessage> response = cartApiList.createCoupon(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.CouponUpdate getCouponById(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CouponUpdate> response = cartApiList.getCouponById(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SuccessMessage updateCoupon(String companyId , String applicationId , String id ,PlatformModels.CouponUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessage> response = cartApiList.updateCoupon(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.SuccessMessage updateCouponPartially(String companyId , String applicationId , String id ,PlatformModels.CouponPartialUpdate body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SuccessMessage> response = cartApiList.updateCouponPartially(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.OpenapiCartDetailsResponse fetchAndvalidateCartItems(String companyId , String applicationId ,PlatformModels.OpenapiCartDetailsRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OpenapiCartDetailsResponse> response = cartApiList.fetchAndvalidateCartItems(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.OpenApiCartServiceabilityResponse checkCartServiceability(String companyId , String applicationId ,PlatformModels.OpenApiCartServiceabilityRequest body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OpenApiCartServiceabilityResponse> response = cartApiList.checkCartServiceability(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.OpenApiCheckoutResponse checkoutCart(String companyId , String applicationId ,PlatformModels.OpenApiPlatformCheckoutReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.OpenApiCheckoutResponse> response = cartApiList.checkoutCart(companyId, applicationId, body).execute();
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

    private RewardsApiList rewardsApiList;

    public RewardsService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.GiveawayResponse getGiveaways(String companyId , String applicationId , String pageId , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GiveawayResponse> response = rewardsApiList.getGiveaways(companyId, applicationId, pageId, pageSize).execute();
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
        String companyId,
        String applicationId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GiveawayResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GiveawayResponse callback = this.getGiveaways(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public PlatformModels.Giveaway createGiveaway(String companyId , String applicationId ,PlatformModels.Giveaway body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Giveaway> response = rewardsApiList.createGiveaway(companyId, applicationId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Giveaway getGiveawayByID(String companyId , String applicationId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Giveaway> response = rewardsApiList.getGiveawayByID(companyId, applicationId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Giveaway updateGiveaway(String companyId , String applicationId , String id ,PlatformModels.Giveaway body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Giveaway> response = rewardsApiList.updateGiveaway(companyId, applicationId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public List<PlatformModels.Offer> getOffers(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<PlatformModels.Offer>> response = rewardsApiList.getOffers(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Offer getOfferByName(String companyId , String applicationId , String cookie , String name ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Offer> response = rewardsApiList.getOfferByName(companyId, applicationId, cookie, name).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.Offer updateOfferByName(String companyId , String applicationId , String name ,PlatformModels.Offer body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.Offer> response = rewardsApiList.updateOfferByName(companyId, applicationId, name, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.UserRes getUserAvailablePoints(String companyId , String applicationId , String userId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.UserRes> response = rewardsApiList.getUserAvailablePoints(companyId, applicationId, userId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AppUser updateUserStatus(String companyId , String applicationId , String userId ,PlatformModels.AppUser body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AppUser> response = rewardsApiList.updateUserStatus(companyId, applicationId, userId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.HistoryRes getUserPointsHistory(String companyId , String applicationId , String userId , String pageId , Integer pageLimit , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.HistoryRes> response = rewardsApiList.getUserPointsHistory(companyId, applicationId, userId, pageId, pageLimit, pageSize).execute();
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
        String companyId,
        String applicationId,
        String userId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.HistoryRes> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            PlatformModels.HistoryRes callback = this.getUserPointsHistory(
                
                 companyId,
                 applicationId,
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

    private AnalyticsApiList analyticsApiList;

    public AnalyticsService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.analyticsApiList = generateAnalyticsApiList(this.platformConfig.getPersistentCookieStore());
    }

    private AnalyticsApiList generateAnalyticsApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),AnalyticsApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public PlatformModels.ExportJobRes createExportJob(String companyId , String exportType ,PlatformModels.ExportJobReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ExportJobRes> response = analyticsApiList.createExportJob(companyId, exportType, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.ExportJobStatusRes getExportJobStatus(String companyId , String exportType , String jobId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ExportJobStatusRes> response = analyticsApiList.getExportJobStatus(companyId, exportType, jobId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.GetLogsListRes getLogsList(String companyId , String logType , Integer pageNo , Integer pageSize ,PlatformModels.GetLogsListReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.GetLogsListRes> response = analyticsApiList.getLogsList(companyId, logType, pageNo, pageSize, body).execute();
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
        String companyId,
        String logType,
        Integer pageSize,
        
        PlatformModels.GetLogsListReq body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.GetLogsListRes> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.GetLogsListRes callback = this.getLogsList(
                
                 companyId,
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
    
    
    
    
    
    public PlatformModels.SearchLogRes searchLogs(String companyId , Integer pageNo , Integer pageSize , String logType ,PlatformModels.SearchLogReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SearchLogRes> response = analyticsApiList.searchLogs(companyId, pageNo, pageSize, logType, body).execute();
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
        String companyId,
        Integer pageSize,
        String logType,
        
        PlatformModels.SearchLogReq body){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.SearchLogRes> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.SearchLogRes callback = this.searchLogs(
                
                 companyId,
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.StatsGroups getStatiscticsGroups(String companyId , String applicationId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StatsGroups> response = analyticsApiList.getStatiscticsGroups(companyId, applicationId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.StatsGroupComponents getStatiscticsGroupComponents(String companyId , String applicationId , String groupName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StatsGroupComponents> response = analyticsApiList.getStatiscticsGroupComponents(companyId, applicationId, groupName).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public Object getComponentStatsCSV(String companyId , String applicationId , String componentName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = analyticsApiList.getComponentStatsCSV(companyId, applicationId, componentName).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public Object getComponentStatsPDF(String companyId , String applicationId , String componentName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = analyticsApiList.getComponentStatsPDF(companyId, applicationId, componentName).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.StatsRes getComponentStats(String companyId , String applicationId , String componentName ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.StatsRes> response = analyticsApiList.getComponentStats(companyId, applicationId, componentName).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AbandonCartsList getAbandonCartList(String companyId , String applicationId , String fromDate , String toDate , Integer pageNo , Integer pageSize ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AbandonCartsList> response = analyticsApiList.getAbandonCartList(companyId, applicationId, fromDate, toDate, pageNo, pageSize).execute();
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
        String companyId,
        String applicationId,
        String fromDate,
        String toDate,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<PlatformModels.AbandonCartsList> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            PlatformModels.AbandonCartsList callback = this.getAbandonCartList(
                
                 companyId,
                 applicationId,
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
    
    
    
    
    
    public Object getAbandonCartsCSV(String companyId , String applicationId , String fromDate , String toDate ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = analyticsApiList.getAbandonCartsCSV(companyId, applicationId, fromDate, toDate).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.AbandonCartDetail getAbandonCartDetail(String companyId , String applicationId , String cartId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AbandonCartDetail> response = analyticsApiList.getAbandonCartDetail(companyId, applicationId, cartId).execute();
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

    private DiscountApiList discountApiList;

    public DiscountService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.discountApiList = generateDiscountApiList(this.platformConfig.getPersistentCookieStore());
    }

    private DiscountApiList generateDiscountApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),DiscountApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PlatformModels.ListOrCalender getDiscounts(Integer companyId , String view , String q , Integer pageNo , Integer pageSize , Boolean archived , Integer month , Integer year , String type , List<String> appIds ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.ListOrCalender> response = discountApiList.getDiscounts(companyId, view, q, pageNo, pageSize, archived, month, year, type, appIds).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.DiscountJob createDiscount(Integer companyId ,PlatformModels.CreateUpdateDiscount body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DiscountJob> response = discountApiList.createDiscount(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.DiscountJob getDiscount(Integer companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DiscountJob> response = discountApiList.getDiscount(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.DiscountJob updateDiscount(Integer companyId , String id ,PlatformModels.CreateUpdateDiscount body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.DiscountJob> response = discountApiList.updateDiscount(companyId, id, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.FileJobResponse validateDiscountFile(Integer companyId , String discount ,PlatformModels.DiscountJob body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FileJobResponse> response = discountApiList.validateDiscountFile(companyId, discount, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.FileJobResponse downloadDiscountFile(Integer companyId , String type ,PlatformModels.DownloadFileJob body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FileJobResponse> response = discountApiList.downloadDiscountFile(companyId, type, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.FileJobResponse getValidationJob(Integer companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FileJobResponse> response = discountApiList.getValidationJob(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CancelJobResponse cancelValidationJob(Integer companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CancelJobResponse> response = discountApiList.cancelValidationJob(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.FileJobResponse getDownloadJob(Integer companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.FileJobResponse> response = discountApiList.getDownloadJob(companyId, id).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.CancelJobResponse cancelDownloadJob(Integer companyId , String id ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.CancelJobResponse> response = discountApiList.cancelDownloadJob(companyId, id).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

}

public static class PartnerService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private PartnerApiList partnerApiList;

    public PartnerService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    public PlatformModels.AddProxyResponse addProxyPath(String companyId , String applicationId , String extensionId ,PlatformModels.AddProxyReq body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.AddProxyResponse> response = partnerApiList.addProxyPath(companyId, applicationId, extensionId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    public PlatformModels.RemoveProxyResponse removeProxyPath(String companyId , String applicationId , String extensionId , String attachedPath ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.RemoveProxyResponse> response = partnerApiList.removeProxyPath(companyId, applicationId, extensionId, attachedPath).execute();
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

    private WebhookApiList webhookApiList;

    public WebhookService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.webhookApiList = generateWebhookApiList(this.platformConfig.getPersistentCookieStore());
    }

    private WebhookApiList generateWebhookApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),WebhookApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PlatformModels.SubscriberResponse getSubscribersByCompany(Integer pageNo , Integer pageSize , Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriberResponse> response = webhookApiList.getSubscribersByCompany(pageNo, pageSize, companyId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriberConfig registerSubscriberToEvent(Integer companyId ,PlatformModels.SubscriberConfig body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriberConfig> response = webhookApiList.registerSubscriberToEvent(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriberConfig updateSubscriberConfig(Integer companyId ,PlatformModels.SubscriberConfig body) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriberConfig> response = webhookApiList.updateSubscriberConfig(companyId, body).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.SubscriberResponse getSubscriberById(Integer companyId , Integer subscriberId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.SubscriberResponse> response = webhookApiList.getSubscriberById(companyId, subscriberId).execute();
            if (!response.isSuccessful()) {
                    throw new IOException(response.errorBody() != null
                            ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
                }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
    
    
    
    public PlatformModels.EventConfigList fetchAllEventConfigurations(Integer companyId ) throws IOException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<PlatformModels.EventConfigList> response = webhookApiList.fetchAllEventConfigurations(companyId).execute();
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

    ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
    }

    
    
    
    
    
    
    
    
    
    
    

}

}

private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}
}