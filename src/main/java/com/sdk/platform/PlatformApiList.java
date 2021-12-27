package com.sdk.platform;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;


interface CommonApiList {
    
    @GET ("/service/common/configuration/v1.0/location")
    Call<PlatformModels.Locations> getLocations(@Query("location_type") String locationType , @Query("id") String id );
    
}

interface LeadApiList {
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    Call<PlatformModels.TicketList> getTickets(@Path("company_id") String companyId , @Query("items") Boolean items , @Query("filters") Boolean filters , @Query("q") String q , @Query("status") String status , @Query("priority") PlatformClient.PriorityEnum priority , @Query("category") String category , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket")
    Call<PlatformModels.Ticket> createTicket(@Path("company_id") String companyId ,@Body PlatformModels.AddTicketPayload payload);
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket")
    Call<PlatformModels.TicketList> getTickets(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("items") Boolean items , @Query("filters") Boolean filters , @Query("q") String q , @Query("status") String status , @Query("priority") PlatformClient.PriorityEnum priority , @Query("category") String category );
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    Call<PlatformModels.Ticket> getTicket(@Path("company_id") String companyId , @Path("id") String id );
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}")
    Call<PlatformModels.Ticket> editTicket(@Path("company_id") String companyId , @Path("id") String id ,@Body PlatformModels.EditTicketPayload payload);
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    Call<PlatformModels.Ticket> getTicket(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}")
    Call<PlatformModels.Ticket> editTicket(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.EditTicketPayload payload);
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    Call<PlatformModels.TicketHistory> createHistory(@Path("company_id") String companyId , @Path("id") String id ,@Body PlatformModels.TicketHistoryPayload payload);
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/history")
    Call<PlatformModels.TicketHistoryList> getTicketHistory(@Path("company_id") String companyId , @Path("id") String id );
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    Call<PlatformModels.TicketFeedbackList> getFeedbacks(@Path("company_id") String companyId , @Path("id") String id );
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/ticket/{id}/feedback")
    Call<PlatformModels.TicketFeedback> submitFeedback(@Path("company_id") String companyId , @Path("id") String id ,@Body PlatformModels.TicketFeedbackPayload payload);
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    Call<PlatformModels.TicketHistory> createHistory(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.TicketHistoryPayload payload);
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/ticket/{id}/history")
    Call<PlatformModels.TicketHistoryList> getTicketHistory(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    Call<PlatformModels.CustomForm> getCustomForm(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("slug") String slug );
    
    @PUT ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form/{slug}")
    Call<PlatformModels.CustomForm> editCustomForm(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("slug") String slug ,@Body PlatformModels.EditCustomFormPayload payload);
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    Call<PlatformModels.CustomFormList> getCustomForms(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/form")
    Call<PlatformModels.CustomForm> createCustomForm(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateCustomFormPayload payload);
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/token")
    Call<PlatformModels.GetTokenForVideoRoomResponse> getTokenForVideoRoom(@Path("company_id") String companyId , @Path("unique_name") String uniqueName );
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/token")
    Call<PlatformModels.GetTokenForVideoRoomResponse> getTokenForVideoRoom(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("unique_name") String uniqueName );
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/video/room/{unique_name}/participants")
    Call<PlatformModels.GetParticipantsInsideVideoRoomResponse> getVideoParticipants(@Path("company_id") String companyId , @Path("unique_name") String uniqueName );
    
    @GET ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}/participants")
    Call<PlatformModels.GetParticipantsInsideVideoRoomResponse> getVideoParticipants(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("unique_name") String uniqueName );
    
    @POST ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room")
    Call<PlatformModels.CreateVideoRoomResponse> openVideoRoom(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateVideoRoomPayload payload);
    
    @DELETE ("/service/platform/lead/v1.0/company/{company_id}/application/{application_id}/video/room/{unique_name}")
    Call<PlatformModels.CloseVideoRoomResponse> closeVideoRoom(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("unique_name") String uniqueName );
    
}

interface FeedbackApiList {
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/attributes/")
    Call<PlatformModels.FeedbackAttributes> getAttributes(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/reviews/")
    Call<PlatformModels.GetReviewResponse> getCustomerReviews(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("id") String id , @Query("entity_id") String entityId , @Query("entity_type") String entityType , @Query("user_id") String userId , @Query("media") String media , @Query("rating") List<Double> rating , @Query("attribute_rating") List<String> attributeRating , @Query("facets") Boolean facets , @Query("sort") String sort , @Query("next") String next , @Query("start") String start , @Query("limit") String limit , @Query("count") String count , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @PUT ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/reviews/{review_id}/approve/")
    Call<PlatformModels.UpdateResponse> updateApprove(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("review_id") String reviewId ,@Body PlatformModels.ApproveRequest payload);
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/reviews/{review_id}/history/")
    Call<List<PlatformModels.ActivityDump>> getHistory(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("review_id") String reviewId );
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/")
    Call<PlatformModels.TemplateGetResponse> getApplicationTemplates(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/")
    Call<PlatformModels.InsertResponse> createTemplate(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.TemplateRequestList payload);
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/{id}/")
    Call<PlatformModels.Template> getTemplateById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/{id}/")
    Call<PlatformModels.UpdateResponse> updateTemplate(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.UpdateTemplateRequest payload);
    
    @PATCH ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/{id}/status/")
    Call<PlatformModels.UpdateResponse> updateTemplateStatus(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.UpdateTemplateStatusRequest payload);
    
}

interface ThemeApiList {
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<PlatformModels.AllAvailablePageSchema> getAllPages(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<PlatformModels.AvailablePageSchema> createPage(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId ,@Body PlatformModels.AvailablePageSchema payload);
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/page")
    Call<PlatformModels.AllAvailablePageSchema> updateMultiplePages(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId ,@Body PlatformModels.AllAvailablePageSchema payload);
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<PlatformModels.AvailablePageSchema> getPage(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("page_value") String pageValue );
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<PlatformModels.AvailablePageSchema> updatePage(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("page_value") String pageValue ,@Body PlatformModels.AvailablePageSchema payload);
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/{page_value}")
    Call<PlatformModels.AvailablePageSchema> deletePage(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId , @Path("page_value") String pageValue );
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    Call<PlatformModels.ThemesListingResponseSchema> getThemeLibrary(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_size") Integer pageSize , @Query("page_no") Integer pageNo );
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/library")
    Call<PlatformModels.ThemesSchema> addToThemeLibrary(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.AddThemeRequestSchema payload);
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/apply")
    Call<PlatformModels.ThemesSchema> applyTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.AddThemeRequestSchema payload);
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgradable")
    Call<PlatformModels.UpgradableThemeSchema> isUpgradable(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/upgrade")
    Call<PlatformModels.ThemesSchema> upgradeTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/list/public")
    Call<PlatformModels.ThemesListingResponseSchema> getPublicThemes(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_size") Integer pageSize , @Query("page_no") Integer pageNo );
    
    @POST ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    Call<PlatformModels.ThemesSchema> createTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.ThemesSchema payload);
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/")
    Call<PlatformModels.ThemesSchema> getAppliedTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/fonts")
    Call<PlatformModels.FontsSchema> getFonts(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<PlatformModels.ThemesSchema> getThemeById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<PlatformModels.ThemesSchema> updateTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId ,@Body PlatformModels.ThemesSchema payload);
    
    @DELETE ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}")
    Call<PlatformModels.ThemesSchema> deleteTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
    @GET ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/preview")
    Call<PlatformModels.ThemesSchema> getThemeForPreview(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/publish")
    Call<PlatformModels.ThemesSchema> publishTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unpublish")
    Call<PlatformModels.ThemesSchema> unpublishTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/archive")
    Call<PlatformModels.ThemesSchema> archiveTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
    @PUT ("/service/platform/theme/v1.0/company/{company_id}/application/{application_id}/{theme_id}/unarchive")
    Call<PlatformModels.ThemesSchema> unarchiveTheme(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("theme_id") String themeId );
    
}

interface UserApiList {
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/list")
    Call<PlatformModels.CustomerListResponseSchema> getCustomers(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("q") String q , @Query("page_size") Integer pageSize , @Query("page_no") Integer pageNo );
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/search")
    Call<PlatformModels.UserSearchResponseSchema> searchUsers(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("q") Object q );
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers")
    Call<PlatformModels.CreateUserResponseSchema> createUser(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateUserRequestSchema payload);
    
    @PUT ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/{user_id}")
    Call<PlatformModels.CreateUserResponseSchema> updateUser(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("user_id") String userId ,@Body PlatformModels.UpdateUserRequestSchema payload);
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/customers/session")
    Call<PlatformModels.CreateUserSessionResponseSchema> createUserSession(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateUserSessionRequestSchema payload);
    
    @GET ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    Call<PlatformModels.PlatformSchema> getPlatformConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/user/v1.0/company/{company_id}/application/{application_id}/platform/config")
    Call<PlatformModels.PlatformSchema> updatePlatformConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.PlatformSchema payload);
    
}

interface ContentApiList {
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    Call<PlatformModels.GetAnnouncementListSchema> getAnnouncementsList(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements")
    Call<PlatformModels.CreateAnnouncementSchema> createAnnouncement(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.AdminAnnouncementSchema payload);
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<PlatformModels.AdminAnnouncementSchema> getAnnouncementById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("announcement_id") String announcementId );
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<PlatformModels.CreateAnnouncementSchema> updateAnnouncement(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("announcement_id") String announcementId ,@Body PlatformModels.AdminAnnouncementSchema payload);
    
    @PATCH ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<PlatformModels.CreateAnnouncementSchema> updateAnnouncementSchedule(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("announcement_id") String announcementId ,@Body PlatformModels.ScheduleSchema payload);
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/announcements/{announcement_id}")
    Call<PlatformModels.CreateAnnouncementSchema> deleteAnnouncement(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("announcement_id") String announcementId );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    Call<PlatformModels.BlogSchema> createBlog(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.BlogRequest payload);
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/")
    Call<PlatformModels.BlogGetResponse> getBlogs(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    Call<PlatformModels.BlogSchema> updateBlog(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.BlogRequest payload);
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{id}")
    Call<PlatformModels.BlogSchema> deleteBlog(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/blogs/{slug}")
    Call<PlatformModels.BlogSchema> getComponentById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("slug") String slug );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    Call<PlatformModels.DataLoaderResponseSchema> addDataLoader(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.DataLoaderSchema payload);
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader")
    Call<List<PlatformModels.DataLoaderResponseSchema>> getDataLoaders(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    Call<PlatformModels.DataLoaderResponseSchema> deleteDataLoader(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("data_loader_id") String dataLoaderId );
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}")
    Call<PlatformModels.DataLoaderResponseSchema> editDataLoader(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("data_loader_id") String dataLoaderId ,@Body PlatformModels.DataLoaderSchema payload);
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/data-loader/{data_loader_id}/select")
    Call<PlatformModels.DataLoaderResponseSchema> selectDataLoader(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("data_loader_id") String dataLoaderId );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/categories")
    Call<PlatformModels.GetFaqCategoriesSchema> getFaqCategories(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}")
    Call<PlatformModels.GetFaqCategoryBySlugSchema> getFaqCategoryBySlugOrId(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id_or_slug") String idOrSlug );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category")
    Call<PlatformModels.CreateFaqCategorySchema> createFaqCategory(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateFaqCategoryRequestSchema payload);
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    Call<PlatformModels.CreateFaqCategorySchema> updateFaqCategory(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.UpdateFaqCategoryRequestSchema payload);
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id}")
    Call<PlatformModels.FaqSchema> deleteFaqCategory(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{id_or_slug}/faqs")
    Call<PlatformModels.GetFaqSchema> getFaqsByCategoryIdOrSlug(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id_or_slug") String idOrSlug );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faqs")
    Call<PlatformModels.CreateFaqResponseSchema> addFaq(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("category_id") String categoryId ,@Body PlatformModels.CreateFaqSchema payload);
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    Call<PlatformModels.CreateFaqResponseSchema> updateFaq(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("category_id") String categoryId , @Path("faq_id") String faqId ,@Body PlatformModels.CreateFaqSchema payload);
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/category/{category_id}/faq/{faq_id}")
    Call<PlatformModels.CreateFaqResponseSchema> deleteFaq(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("category_id") String categoryId , @Path("faq_id") String faqId );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/faq/{id_or_slug}")
    Call<PlatformModels.CreateFaqResponseSchema> getFaqByIdOrSlug(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id_or_slug") String idOrSlug );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    Call<PlatformModels.LandingPageGetResponse> getLandingPages(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/")
    Call<PlatformModels.LandingPageSchema> createLandingPage(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.LandingPageSchema payload);
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    Call<PlatformModels.LandingPageSchema> updateLandingPage(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.LandingPageSchema payload);
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/landing-page/{id}")
    Call<PlatformModels.LandingPageSchema> deleteLandingPage(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    Call<PlatformModels.ApplicationLegal> getLegalInformation(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/legal")
    Call<PlatformModels.ApplicationLegal> updateLegalInformation(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.ApplicationLegal payload);
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    Call<PlatformModels.NavigationGetResponse> getNavigations(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("device_platform") String devicePlatform , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/")
    Call<PlatformModels.NavigationSchema> createNavigation(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.NavigationRequest payload);
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/default")
    Call<PlatformModels.DefaultNavigationResponse> getDefaultNavigations(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{slug}")
    Call<PlatformModels.NavigationSchema> getNavigationBySlug(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("slug") String slug , @Query("device_platform") String devicePlatform );
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    Call<PlatformModels.NavigationSchema> updateNavigation(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.NavigationRequest payload);
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/navigations/{id}")
    Call<PlatformModels.NavigationSchema> deleteNavigation(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/meta")
    Call<PlatformModels.PageMetaSchema> getPageMeta(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_type") String pageType , @Query("cart_pages") Boolean cartPages );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/spec")
    Call<PlatformModels.PageSpec> getPageSpec(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/preview/")
    Call<PlatformModels.PageSchema> createPagePreview(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.PageRequest payload);
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/publish/{slug}")
    Call<PlatformModels.PageSchema> updatePagePreview(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("slug") String slug ,@Body PlatformModels.PagePublishRequest payload);
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/pages/{id}")
    Call<PlatformModels.PageSchema> deletePage(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    Call<PlatformModels.PathMappingSchema> updatePathRedirectionRules(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.PathMappingSchema payload);
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/path-mappings")
    Call<PlatformModels.PathMappingSchema> getPathRedirectionRules(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    Call<PlatformModels.SeoComponent> getSEOConfiguration(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/seo")
    Call<PlatformModels.SeoSchema> updateSEOConfiguration(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.SeoComponent payload);
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/")
    Call<PlatformModels.SlideshowGetResponse> getSlideshows(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("device_platform") String devicePlatform , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/")
    Call<PlatformModels.SlideshowSchema> createSlideshow(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.SlideshowRequest payload);
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{slug}")
    Call<PlatformModels.SlideshowSchema> getSlideshowBySlug(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("slug") String slug , @Query("device_platform") String devicePlatform );
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    Call<PlatformModels.SlideshowSchema> updateSlideshow(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.SlideshowRequest payload);
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/slideshows/{id}")
    Call<PlatformModels.SlideshowSchema> deleteSlideshow(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    Call<PlatformModels.Support> getSupportInformation(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/support")
    Call<PlatformModels.Support> updateSupportInformation(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.Support payload);
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    Call<PlatformModels.TagsSchema> updateInjectableTag(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateTagRequestSchema payload);
    
    @DELETE ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    Call<PlatformModels.TagsSchema> deleteAllInjectableTags(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags")
    Call<PlatformModels.TagsSchema> getInjectableTags(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/add")
    Call<PlatformModels.TagsSchema> addInjectableTag(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateTagRequestSchema payload);
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/remove/handpicked")
    Call<PlatformModels.TagDeleteSuccessResponse> removeInjectableTag(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.RemoveHandpickedSchema payload);
    
    @PUT ("/service/platform/content/v1.0/company/{company_id}/application/{application_id}/tags/edit/handpicked/{tag_id}")
    Call<PlatformModels.TagsSchema> editInjectableTag(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("tag_id") String tagId ,@Body PlatformModels.UpdateHandpickedSchema payload);
    
    @POST ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    Call<PlatformModels.PageSchema> createPage(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.PageRequest payload);
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/")
    Call<PlatformModels.PageGetResponse> getPages(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @PUT ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{id}")
    Call<PlatformModels.PageSchema> updatePage(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.PageSchema payload);
    
    @GET ("/service/platform/content/v2.0/company/{company_id}/application/{application_id}/pages/{slug}")
    Call<PlatformModels.PageSchema> getPageBySlug(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("slug") String slug );
    
}

interface BillingApiList {
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription")
    Call<PlatformModels.CreateSubscriptionResponse> createSubscriptionCharge(@Path("company_id") String companyId , @Path("extension_id") String extensionId ,@Body PlatformModels.CreateSubscriptionCharge payload);
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}")
    Call<PlatformModels.EntitySubscription> getSubscriptionCharge(@Path("company_id") String companyId , @Path("extension_id") String extensionId , @Path("subscription_id") String subscriptionId );
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/extension/{extension_id}/subscription/{subscription_id}/cancel")
    Call<PlatformModels.EntitySubscription> cancelSubscriptionCharge(@Path("company_id") String companyId , @Path("extension_id") String extensionId , @Path("subscription_id") String subscriptionId );
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/list")
    Call<PlatformModels.Invoices> getInvoices(@Path("company_id") String companyId );
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/invoice/{invoice_id}")
    Call<PlatformModels.Invoice> getInvoiceById(@Path("company_id") String companyId , @Path("invoice_id") String invoiceId );
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    Call<PlatformModels.SubscriptionCustomer> getCustomerDetail(@Path("company_id") String companyId );
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/customer-detail")
    Call<PlatformModels.SubscriptionCustomer> upsertCustomerDetail(@Path("company_id") String companyId ,@Body PlatformModels.SubscriptionCustomerCreate payload);
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current")
    Call<PlatformModels.SubscriptionStatus> getSubscription(@Path("company_id") String companyId );
    
    @GET ("/service/platform/billing/v1.0/company/{company_id}/subscription/current-limit")
    Call<PlatformModels.SubscriptionLimit> getFeatureLimitConfig(@Path("company_id") String companyId );
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/activate")
    Call<PlatformModels.SubscriptionActivateRes> activateSubscriptionPlan(@Path("company_id") String companyId ,@Body PlatformModels.SubscriptionActivateReq payload);
    
    @POST ("/service/platform/billing/v1.0/company/{company_id}/subscription/cancel")
    Call<PlatformModels.CancelSubscriptionRes> cancelSubscriptionPlan(@Path("company_id") String companyId ,@Body PlatformModels.CancelSubscriptionReq payload);
    
}

interface CommunicationApiList {
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    Call<PlatformModels.Campaigns> getCampaigns(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns")
    Call<PlatformModels.Campaign> createCampaign(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CampaignReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    Call<PlatformModels.Campaign> getCampaignById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/campaigns/{id}")
    Call<PlatformModels.Campaign> updateCampaignById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.CampaignReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/campaigns/get-stats/{id}")
    Call<PlatformModels.GetStats> getStatsOfCampaignById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    Call<PlatformModels.Audiences> getAudiences(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources")
    Call<PlatformModels.Audience> createAudience(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.AudienceReq payload);
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/bigquery-headers")
    Call<PlatformModels.BigqueryHeadersRes> getBigqueryHeaders(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.BigqueryHeadersReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    Call<PlatformModels.Audience> getAudienceById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/datasources/{id}")
    Call<PlatformModels.Audience> updateAudienceById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.AudienceReq payload);
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sources/get-n-records")
    Call<PlatformModels.GetNRecordsCsvRes> getNSampleRecordsFromCsv(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.GetNRecordsCsvReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    Call<PlatformModels.EmailProviders> getEmailProviders(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers")
    Call<PlatformModels.EmailProvider> createEmailProvider(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.EmailProviderReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    Call<PlatformModels.EmailProvider> getEmailProviderById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/providers/{id}")
    Call<PlatformModels.EmailProvider> updateEmailProviderById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.EmailProviderReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    Call<PlatformModels.EmailTemplates> getEmailTemplates(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates")
    Call<PlatformModels.EmailTemplateRes> createEmailTemplate(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.EmailTemplateReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/system-templates")
    Call<PlatformModels.SystemEmailTemplates> getSystemEmailTemplates(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    Call<PlatformModels.EmailTemplate> getEmailTemplateById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    Call<PlatformModels.EmailTemplateRes> updateEmailTemplateById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.EmailTemplateReq payload);
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/email/templates/{id}")
    Call<PlatformModels.EmailTemplateDeleteSuccessRes> deleteEmailTemplateById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/event/event-subscriptions")
    Call<PlatformModels.EventSubscriptions> getEventSubscriptions(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("populate") String populate );
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/jobs")
    Call<PlatformModels.Jobs> getJobs(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/trigger-job")
    Call<PlatformModels.TriggerJobResponse> triggerCampaignJob(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.TriggerJobRequest payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/jobs/logs")
    Call<PlatformModels.JobLogs> getJobLogs(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/log")
    Call<PlatformModels.Logs> getCommunicationLogs(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_id") String pageId , @Query("page_size") Integer pageSize , @Query("sort") Object sort , @Query("query") Object query );
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/notification/system-notifications/")
    Call<PlatformModels.SystemNotifications> getSystemNotifications(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    Call<PlatformModels.SmsProviders> getSmsProviders(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers")
    Call<PlatformModels.SmsProvider> createSmsProvider(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.SmsProviderReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    Call<PlatformModels.SmsProvider> getSmsProviderById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/providers/{id}")
    Call<PlatformModels.SmsProvider> updateSmsProviderById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.SmsProviderReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    Call<PlatformModels.SmsTemplates> getSmsTemplates(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
    @POST ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates")
    Call<PlatformModels.SmsTemplateRes> createSmsTemplate(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.SmsTemplateReq payload);
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    Call<PlatformModels.SmsTemplate> getSmsTemplateById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    Call<PlatformModels.SmsTemplateRes> updateSmsTemplateById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.SmsTemplateReq payload);
    
    @DELETE ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/templates/{id}")
    Call<PlatformModels.SmsTemplateDeleteSuccessRes> deleteSmsTemplateById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @GET ("/service/platform/communication/v1.0/company/{company_id}/application/{application_id}/sms/system-templates")
    Call<PlatformModels.SystemSmsTemplates> getSystemSystemTemplates(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("sort") Object sort );
    
}

interface PaymentApiList {
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PlatformModels.PaymentGatewayConfigResponse> getBrandPaymentGatewayConfig(@Path("company_id") Integer companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PlatformModels.PaymentGatewayToBeReviewed> saveBrandPaymentGatewayConfig(@Path("company_id") Integer companyId , @Path("application_id") String applicationId ,@Body PlatformModels.PaymentGatewayConfigRequest payload);
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/aggregator/request")
    Call<PlatformModels.PaymentGatewayToBeReviewed> updateBrandPaymentGatewayConfig(@Path("company_id") Integer companyId , @Path("application_id") String applicationId ,@Body PlatformModels.PaymentGatewayConfigRequest payload);
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/options")
    Call<PlatformModels.PaymentOptionsResponse> getPaymentModeRoutes(@Path("company_id") Integer companyId , @Path("application_id") String applicationId , @Query("refresh") Boolean refresh , @Query("request_type") String requestType );
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PlatformModels.PayoutsResponse> getAllPayouts(@Path("company_id") Integer companyId , @Query("unique_external_id") String uniqueExternalId );
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/payouts")
    Call<PlatformModels.PayoutResponse> savePayout(@Path("company_id") Integer companyId ,@Body PlatformModels.PayoutRequest payload);
    
    @PUT ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PlatformModels.UpdatePayoutResponse> updatePayout(@Path("company_id") Integer companyId , @Path("unique_transfer_no") String uniqueTransferNo ,@Body PlatformModels.PayoutRequest payload);
    
    @PATCH ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PlatformModels.UpdatePayoutResponse> activateAndDectivatePayout(@Path("company_id") Integer companyId , @Path("unique_transfer_no") String uniqueTransferNo ,@Body PlatformModels.UpdatePayoutRequest payload);
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/payouts/{unique_transfer_no}")
    Call<PlatformModels.DeletePayoutResponse> deletePayout(@Path("company_id") Integer companyId , @Path("unique_transfer_no") String uniqueTransferNo );
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    Call<PlatformModels.SubscriptionPaymentMethodResponse> getSubscriptionPaymentMethod(@Path("company_id") Integer companyId , @Query("unique_external_id") String uniqueExternalId );
    
    @DELETE ("/service/platform/payment/v1.0/company/{company_id}/subscription/methods")
    Call<PlatformModels.DeleteSubscriptionPaymentMethodResponse> deleteSubscriptionPaymentMethod(@Path("company_id") Integer companyId , @Query("unique_external_id") String uniqueExternalId , @Query("payment_method_id") String paymentMethodId );
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/subscription/configs")
    Call<PlatformModels.SubscriptionConfigResponse> getSubscriptionConfig(@Path("company_id") Integer companyId );
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/subscription/setup/intent")
    Call<PlatformModels.SaveSubscriptionSetupIntentResponse> saveSubscriptionSetupIntent(@Path("company_id") Integer companyId ,@Body PlatformModels.SaveSubscriptionSetupIntentRequest payload);
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/account")
    Call<PlatformModels.RefundAccountResponse> addBeneficiaryDetails(@Path("company_id") Integer companyId , @Path("application_id") String applicationId ,@Body PlatformModels.AddBeneficiaryDetailsRequest payload);
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/ifsc-code/verify")
    Call<PlatformModels.IfscCodeResponse> verifyIfscCode(@Path("company_id") Integer companyId , @Query("ifsc_code") String ifscCode );
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/order")
    Call<PlatformModels.OrderBeneficiaryResponse> getUserOrderBeneficiaries(@Query("order_id") String orderId , @Path("company_id") Integer companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/refund/accounts/user")
    Call<PlatformModels.OrderBeneficiaryResponse> getUserBeneficiaries(@Query("order_id") String orderId , @Path("company_id") Integer companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/payment/v1.0/company/{company_id}/application/{application_id}/payment/confirm")
    Call<PlatformModels.PaymentConfirmationResponse> confirmPayment(@Path("company_id") Integer companyId , @Path("application_id") String applicationId ,@Body PlatformModels.PaymentConfirmationRequest payload);
    
}

interface OrderApiList {
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/status")
    Call<PlatformModels.UpdateShipmentStatusResponse> shipmentStatusUpdate(@Path("company_id") String companyId ,@Body PlatformModels.UpdateShipmentStatusBody payload);
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/actions/activity/status")
    Call<PlatformModels.GetActivityStatus> activityStatus(@Path("company_id") String companyId , @Query("bag_id") String bagId );
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/store/process-shipments")
    Call<PlatformModels.UpdateProcessShipmenstRequestResponse> storeProcessShipmentUpdate(@Path("company_id") String companyId ,@Body PlatformModels.UpdateProcessShipmenstRequestBody payload);
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/actions/check-refund/{shipment_id}")
    Call<Object> checkRefund(@Path("company_id") String companyId , @Path("shipment_id") String shipmentId );
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/actions/can-break")
    Call<PlatformModels.CanBreakResponse> ShipmentBagsCanBreak(@Path("company_id") String companyId ,@Body PlatformModels.CanBreakRequestBody payload);
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders")
    Call<PlatformModels.OrderListing> getOrdersByCompanyId(@Path("company_id") String companyId , @Query("page_no") String pageNo , @Query("page_size") String pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate , @Query("is_priority_sort") Boolean isPrioritySort , @Query("lock_status") Boolean lockStatus , @Query("q") String q , @Query("stage") String stage , @Query("sales_channels") String salesChannels , @Query("order_id") String orderId , @Query("stores") String stores , @Query("deployment_stores") String deploymentStores , @Query("status") String status , @Query("dp") String dp , @Query("shorten_urls") Boolean shortenUrls , @Query("filter_type") String filterType );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/lane-count")
    Call<PlatformModels.OrderLanesCount> getOrderLanesCountByCompanyId(@Path("company_id") String companyId , @Query("page_no") String pageNo , @Query("page_size") String pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate , @Query("q") String q , @Query("stage") String stage , @Query("sales_channels") String salesChannels , @Query("order_id") String orderId , @Query("stores") String stores , @Query("status") String status , @Query("shorten_urls") Boolean shortenUrls , @Query("filter_type") String filterType );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/details")
    Call<PlatformModels.OrderDetails> getOrderDetails(@Path("company_id") String companyId , @Query("order_id") String orderId , @Query("next") String next , @Query("previous") String previous );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/details")
    Call<PlatformModels.OrderDetails> getOrderDetails(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("order_id") String orderId , @Query("next") String next , @Query("previous") String previous );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/picklist")
    Call<PlatformModels.OrderPicklistListing> getPicklistOrdersByCompanyId(@Path("company_id") String companyId , @Query("page_no") String pageNo , @Query("page_size") String pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate , @Query("q") String q , @Query("stage") String stage , @Query("sales_channels") String salesChannels , @Query("order_id") String orderId , @Query("stores") String stores , @Query("status") String status , @Query("shorten_urls") Boolean shortenUrls , @Query("filter_type") String filterType );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/track")
    Call<PlatformModels.PlatformShipmentTrack> trackShipmentPlatform(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("shipment_id") String shipmentId );
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/track")
    Call<PlatformModels.PlatformOrderTrack> trackOrder(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("order_id") String orderId );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/failed")
    Call<PlatformModels.FailedOrders> failedOrders(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/reprocess")
    Call<PlatformModels.UpdateOrderReprocessResponse> reprocessOrder(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("order_id") String orderId );
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/{shipment_id}/update")
    Call<PlatformModels.ShipmentUpdateResponse> updateShipment(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("shipment_id") String shipmentId ,@Body PlatformModels.ShipmentUpdateRequest payload);
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/shipments/reasons/{action}")
    Call<PlatformModels.ShipmentReasonsResponse> getPlatformShipmentReasons(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("action") String action );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders/{order_id}/shipments/{shipment_id}/track")
    Call<PlatformModels.ShipmentTrackResponse> getShipmentTrackDetails(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("order_id") String orderId , @Path("shipment_id") String shipmentId );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/orders/shipments/{shipment_id}/address/{address_category}")
    Call<PlatformModels.GetShipmentAddressResponse> getShipmentAddress(@Path("company_id") String companyId , @Path("shipment_id") String shipmentId , @Path("address_category") String addressCategory );
    
    @POST ("/service/platform/order/v1.0/company/{company_id}/orders/shipments/{shipment_id}/address/{address_category}")
    Call<PlatformModels.UpdateShipmentAddressResponse> updateShipmentAddress(@Path("company_id") String companyId , @Path("shipment_id") String shipmentId , @Path("address_category") String addressCategory ,@Body PlatformModels.UpdateShipmentAddressRequest payload);
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/application/{application_id}/orders")
    Call<PlatformModels.OrderListing> getOrdersByApplicationId(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") String pageNo , @Query("page_size") String pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate , @Query("q") String q , @Query("stage") String stage , @Query("sales_channels") String salesChannels , @Query("order_id") String orderId , @Query("stores") String stores , @Query("status") String status , @Query("dp") String dp , @Query("shorten_urls") Boolean shortenUrls , @Query("filter_type") String filterType );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/ping")
    Call<PlatformModels.GetPingResponse> getPing(@Path("company_id") String companyId );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/voice/callback")
    Call<PlatformModels.GetVoiceCallbackResponse> voiceCallback(@Path("company_id") String companyId );
    
    @GET ("/service/platform/order/v1.0/company/{company_id}/voice/click-to-call")
    Call<PlatformModels.GetClickToCallResponse> voiceClickToCall(@Path("company_id") String companyId , @Query("caller") String caller , @Query("receiver") String receiver );
    
}

interface CatalogApiList {
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    Call<PlatformModels.GetSearchWordsDetailResponse> getSearchKeywords(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    Call<PlatformModels.DeleteResponse> deleteSearchKeywords(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/{id}/")
    Call<PlatformModels.GetSearchWordsData> updateSearchKeywords(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.CreateSearchKeyword payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    Call<PlatformModels.GetSearchWordsResponse> getAllSearchKeyword(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/keyword/")
    Call<PlatformModels.GetSearchWordsData> createCustomKeyword(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateSearchKeyword payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    Call<PlatformModels.GetAutocompleteWordsResponse> getAutocompleteKeywordDetail(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    Call<PlatformModels.DeleteResponse> deleteAutocompleteKeyword(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/{id}/")
    Call<PlatformModels.GetAutocompleteWordsResponse> updateAutocompleteKeyword(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.CreateAutocompleteKeyword payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    Call<PlatformModels.GetAutocompleteWordsResponse> getAutocompleteConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/search/autocomplete/")
    Call<PlatformModels.CreateAutocompleteWordsResponse> createCustomAutocompleteRule(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateAutocompleteKeyword payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    Call<PlatformModels.GetProductBundleListingResponse> getProductBundle(@Path("company_id") String companyId , @Query("q") String q );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/")
    Call<PlatformModels.GetProductBundleCreateResponse> createProductBundle(@Path("company_id") String companyId ,@Body PlatformModels.ProductBundleRequest payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    Call<PlatformModels.GetProductBundleResponse> getProductBundleDetail(@Path("company_id") String companyId , @Path("id") String id );
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/product-bundle/{id}/")
    Call<PlatformModels.GetProductBundleCreateResponse> updateProductBundle(@Path("company_id") String companyId , @Path("id") String id ,@Body PlatformModels.ProductBundleUpdateRequest payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    Call<PlatformModels.ListSizeGuide> getSizeGuides(@Path("company_id") String companyId , @Query("active") Boolean active , @Query("q") String q , @Query("tag") String tag , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide")
    Call<PlatformModels.SuccessResponse> createSizeGuide(@Path("company_id") String companyId ,@Body PlatformModels.ValidateSizeGuide payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    Call<PlatformModels.SizeGuideResponse> getSizeGuide(@Path("company_id") String companyId , @Path("id") String id );
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/sizeguide/{id}/")
    Call<PlatformModels.SuccessResponse> updateSizeGuide(@Path("company_id") String companyId , @Path("id") String id ,@Body PlatformModels.ValidateSizeGuide payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/metadata/")
    Call<PlatformModels.GetCatalogConfigurationMetaData> getCatalogConfiguration(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    Call<PlatformModels.GetAppCatalogConfiguration> getConfigurations(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/")
    Call<PlatformModels.GetAppCatalogConfiguration> createConfigurationProductListing(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.AppConfiguration payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    Call<PlatformModels.GetAppCatalogEntityConfiguration> getConfigurationByType(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("type") String type );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/product-configuration/{type}/")
    Call<PlatformModels.GetAppCatalogConfiguration> createConfigurationByType(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("type") String type ,@Body PlatformModels.AppConfiguration payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/query-options/")
    Call<PlatformModels.GetCollectionQueryOptionResponse> getQueryFilters(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    Call<PlatformModels.GetCollectionListingResponse> getAllCollections(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/")
    Call<PlatformModels.CollectionCreateResponse> createCollection(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CreateCollection payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{slug}/")
    Call<PlatformModels.CollectionDetailResponse> getCollectionDetail(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("slug") String slug );
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    Call<PlatformModels.DeleteResponse> deleteCollection(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/")
    Call<PlatformModels.UpdateCollection> updateCollection(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.UpdateCollection payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    Call<PlatformModels.GetCollectionItemsResponse> getCollectionItems(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id , @Query("sort_on") String sortOn , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/collections/{id}/items/")
    Call<PlatformModels.UpdatedResponse> addCollectionItems(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.CollectionItemRequest payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/analytics/insights/")
    Call<PlatformModels.CatalogInsightResponse> getCatalogInsights(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("brand") String brand );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/cross-selling/{seller_app_id}/analytics/insights/")
    Call<PlatformModels.CrossSellingResponse> getSellerInsights(@Path("company_id") String companyId , @Path("seller_app_id") String sellerAppId );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/{marketplace}/optin/")
    Call<PlatformModels.UpdatedResponse> createMarketplaceOptin(@Path("company_id") Integer companyId , @Path("marketplace") String marketplace ,@Body PlatformModels.OptInPostRequest payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/")
    Call<PlatformModels.GetOptInPlatform> getMarketplaceOptinDetail(@Path("company_id") Integer companyId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-details/")
    Call<PlatformModels.OptinCompanyDetail> getCompanyDetail(@Path("company_id") Integer companyId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-brand-details/")
    Call<PlatformModels.OptinCompanyBrandDetailsView> getCompanyBrandDetail(@Path("company_id") Integer companyId , @Query("is_active") Boolean isActive , @Query("q") Boolean q , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("marketplace") String marketplace );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/company-metrics/")
    Call<PlatformModels.OptinCompanyMetrics> getCompanyMetrics(@Path("company_id") Integer companyId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/marketplaces/location-details/")
    Call<PlatformModels.OptinStoreDetails> getStoreDetail(@Path("company_id") Integer companyId , @Query("q") String q , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/product-attributes/{attribute_slug}")
    Call<PlatformModels.GenderDetail> getGenderAttribute(@Path("company_id") Integer companyId , @Path("attribute_slug") String attributeSlug );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/categories/")
    Call<PlatformModels.ProdcutTemplateCategoriesResponse> listProductTemplateCategories(@Path("company_id") String companyId , @Query("departments") String departments , @Query("item_type") String itemType );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/")
    Call<PlatformModels.DepartmentsResponse> listDepartmentsData(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("name") String name , @Query("search") String search , @Query("is_active") Boolean isActive );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/departments/{uid}/")
    Call<PlatformModels.DepartmentsResponse> getDepartmentData(@Path("company_id") String companyId , @Path("uid") String uid );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/")
    Call<PlatformModels.TemplatesResponse> listProductTemplate(@Path("company_id") String companyId , @Query("department") String department );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/validation/schema/")
    Call<PlatformModels.TemplatesValidationResponse> validateProductTemplate(@Path("company_id") String companyId , @Path("slug") String slug );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/templates/{slug}/download/")
    Call<Object> downloadProductTemplateViews(@Path("company_id") String companyId , @Path("slug") String slug );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/download/")
    Call<Object> downloadProductTemplateView(@Path("company_id") String companyId , @Query("item_type") String itemType );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/templates/validation/schema/")
    Call<PlatformModels.InventoryValidationResponse> validateProductTemplateSchema(@Path("company_id") String companyId , @Query("item_type") String itemType );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/hsn/")
    Call<PlatformModels.HSNCodesResponse> listHSNCodes(@Path("company_id") String companyId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/downloads/")
    Call<PlatformModels.ProductDownloadsResponse> listProductTemplateExportDetails(@Path("company_id") String companyId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/downloads/configuration/")
    Call<PlatformModels.ProductConfigurationDownloads> listTemplateBrandTypeValues(@Path("company_id") String companyId , @Query("filter") String filter );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    Call<PlatformModels.CategoryResponse> listCategories(@Path("company_id") String companyId , @Query("level") String level , @Query("departments") String departments , @Query("q") String q , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/category/")
    Call<PlatformModels.CategoryCreateResponse> createCategories(@Path("company_id") String companyId ,@Body PlatformModels.CategoryRequestBody payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    Call<PlatformModels.SingleCategoryResponse> getCategoryData(@Path("company_id") String companyId , @Path("uid") String uid );
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/category/{uid}/")
    Call<PlatformModels.CategoryUpdateResponse> updateCategory(@Path("company_id") String companyId , @Path("uid") String uid ,@Body PlatformModels.CategoryRequestBody payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/")
    Call<PlatformModels.ProductListingResponse> getProducts(@Path("company_id") Integer companyId , @Query("brand_ids") List<Integer> brandIds , @Query("category_ids") List<Integer> categoryIds , @Query("item_ids") List<Integer> itemIds , @Query("department_ids") List<Integer> departmentIds , @Query("item_code") List<Double> itemCode , @Query("q") String q , @Query("tags") List<String> tags , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/")
    Call<PlatformModels.SuccessResponse> createProduct(@Path("company_id") String companyId ,@Body PlatformModels.ProductCreateUpdate payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/")
    Call<PlatformModels.Product> getProduct(@Query("item_code") String itemCode , @Path("company_id") Integer companyId , @Path("item_id") Integer itemId , @Query("brand_uid") Integer brandUid );
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/")
    Call<PlatformModels.SuccessResponse> deleteProduct(@Path("company_id") String companyId , @Path("item_id") Integer itemId );
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/")
    Call<PlatformModels.SuccessResponse> editProduct(@Path("company_id") String companyId , @Path("item_id") Integer itemId ,@Body PlatformModels.ProductCreateUpdate payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/validation/")
    Call<PlatformModels.ValidateProduct> getProductValidation(@Path("company_id") Integer companyId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/")
    Call<PlatformModels.ProductListingResponse> getProductSize(@Query("item_code") String itemCode , @Path("company_id") Integer companyId , @Path("item_id") Integer itemId , @Query("brand_uid") Integer brandUid , @Query("uid") Integer uid );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    Call<PlatformModels.ProductBulkRequestList> getProductBulkUploadHistory(@Path("company_id") Integer companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk")
    Call<PlatformModels.SuccessResponse> updateProductAssetsInBulk(@Path("company_id") Integer companyId ,@Body PlatformModels.BulkJob payload);
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    Call<PlatformModels.SuccessResponse> createProductsInBulk(@Path("company_id") Integer companyId , @Path("batch_id") String batchId ,@Body PlatformModels.BulkProductRequest payload);
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/bulk/{batch_id}")
    Call<PlatformModels.SuccessResponse> deleteProductBulkJob(@Path("company_id") String companyId , @Path("batch_id") Integer batchId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/tags")
    Call<PlatformModels.ProductTagsViewResponse> getProductTags(@Path("company_id") Integer companyId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    Call<PlatformModels.BulkAssetResponse> getProductAssetsInBulk(@Path("company_id") Integer companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/assets/bulk/")
    Call<PlatformModels.SuccessResponse> createProductAssetsInBulk(@Path("company_id") Integer companyId ,@Body PlatformModels.ProductBulkAssets payload);
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<PlatformModels.ProductSizeDeleteResponse> deleteSize(@Path("company_id") String companyId , @Path("item_id") Integer itemId , @Path("size") Integer size );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<PlatformModels.InventoryResponse> getInventoryBySize(@Path("company_id") String companyId , @Path("item_id") String itemId , @Path("size") String size , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q , @Query("sellable") Boolean sellable );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}")
    Call<PlatformModels.SuccessResponse> addInventory(@Path("company_id") String companyId , @Path("item_id") Double itemId , @Path("size") String size ,@Body PlatformModels.InventoryRequest payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/inventory/{size_identifier}")
    Call<PlatformModels.InventoryResponse> getInventoryBySizeIdentifier(@Path("company_id") String companyId , @Path("item_id") String itemId , @Path("size_identifier") String sizeIdentifier , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q , @Query("location_ids") List<Integer> locationIds );
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/products/{item_id}/sizes/{size}/location/{location_id}/")
    Call<PlatformModels.InventoryDelete> deleteInventory(@Path("company_id") String companyId , @Path("size") String size , @Path("item_id") Integer itemId , @Path("location_id") Double locationId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    Call<PlatformModels.BulkInventoryGet> getInventoryBulkUploadHistory(@Path("company_id") Integer companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/")
    Call<PlatformModels.CommonResponse> createBulkInventoryJob(@Path("company_id") Integer companyId ,@Body PlatformModels.BulkJob payload);
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    Call<PlatformModels.SuccessResponse> createBulkInventory(@Path("company_id") Integer companyId , @Path("batch_id") String batchId ,@Body PlatformModels.InventoryBulkRequest payload);
    
    @DELETE ("/service/platform/catalog/v1.0/company/{company_id}/inventory/bulk/{batch_id}/")
    Call<PlatformModels.SuccessResponse> deleteBulkInventoryJob(@Path("company_id") String companyId , @Path("batch_id") String batchId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    Call<PlatformModels.InventoryExportJob> getInventoryExport(@Path("company_id") Integer companyId );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/")
    Call<PlatformModels.SuccessResponse> createInventoryExportJob(@Path("company_id") Integer companyId ,@Body PlatformModels.InventoryExportRequest payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/inventory/download/configuration/")
    Call<PlatformModels.InventoryConfig> exportInventoryConfig(@Path("company_id") String companyId , @Query("filter_type") String filterType );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/")
    Call<PlatformModels.HsnCodesListingResponse> getAllHsnCodes(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/hsn/")
    Call<PlatformModels.HsnCode> createHsnCode(@Path("company_id") String companyId ,@Body PlatformModels.HsnUpsert payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    Call<PlatformModels.HsnCode> getHsnCode(@Path("company_id") String companyId , @Path("id") String id );
    
    @PUT ("/service/platform/catalog/v1.0/company/{company_id}/hsn/{id}/")
    Call<PlatformModels.HsnCode> updateHsnCode(@Path("company_id") String companyId , @Path("id") String id ,@Body PlatformModels.HsnUpsert payload);
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/hsn/bulk/")
    Call<PlatformModels.BulkHsnResponse> bulkHsnCode(@Path("company_id") String companyId ,@Body PlatformModels.BulkHsnUpsert payload);
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/brands")
    Call<PlatformModels.BrandListingResponse> getApplicationBrands(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("department") String department , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/departments")
    Call<PlatformModels.DepartmentResponse> getDepartments(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/categories")
    Call<PlatformModels.CategoryListingResponse> getCategories(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("department") String department );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products")
    Call<PlatformModels.ApplicationProductListingResponse> getAppicationProducts(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("q") String q , @Query("f") String f , @Query("filters") Boolean filters , @Query("sort_on") String sortOn , @Query("page_id") String pageId , @Query("page_size") Integer pageSize , @Query("page_no") Integer pageNo , @Query("page_type") String pageType , @Query("item_ids") List<Integer> itemIds );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/products/{slug}")
    Call<PlatformModels.ProductDetail> getProductDetailBySlug(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("slug") String slug );
    
    @GET ("/service/platform/catalog/v1.0/company/{company_id}/application/{application_id}/raw-products/")
    Call<PlatformModels.ProductListingResponse> getAppProducts(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("brand_ids") List<Integer> brandIds , @Query("category_ids") List<Integer> categoryIds , @Query("department_ids") List<Integer> departmentIds , @Query("tags") List<String> tags , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q );
    
    @POST ("/service/platform/catalog/v1.0/company/{company_id}/location/reassign/")
    Call<PlatformModels.StoreAssignResponse> getOptimalLocations(@Path("company_id") String companyId ,@Body PlatformModels.AssignStore payload);
    
}

interface CompanyProfileApiList {
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}")
    Call<PlatformModels.GetCompanyProfileSerializerResponse> cbsOnboardGet(@Path("company_id") String companyId );
    
    @PATCH ("/service/platform/company-profile/v1.0/company/{company_id}")
    Call<PlatformModels.SuccessResponse> updateCompany(@Path("company_id") String companyId ,@Body PlatformModels.UpdateCompany payload);
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/metrics")
    Call<PlatformModels.MetricsSerializer> getCompanyMetrics(@Path("company_id") String companyId );
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    Call<PlatformModels.SuccessResponse> editBrand(@Path("company_id") String companyId , @Path("brand_id") String brandId ,@Body PlatformModels.CreateUpdateBrandRequestSerializer payload);
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/brand/{brand_id}")
    Call<PlatformModels.GetBrandResponseSerializer> getBrand(@Path("company_id") String companyId , @Path("brand_id") String brandId );
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/brand")
    Call<PlatformModels.SuccessResponse> createBrand(@Path("company_id") String companyId ,@Body PlatformModels.CreateUpdateBrandRequestSerializer payload);
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    Call<PlatformModels.SuccessResponse> createCompanyBrandMapping(@Path("company_id") String companyId ,@Body PlatformModels.CompanyBrandPostRequestSerializer payload);
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/company-brand")
    Call<PlatformModels.CompanyBrandListSerializer> getBrands(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q );
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    Call<PlatformModels.SuccessResponse> createLocation(@Path("company_id") String companyId ,@Body PlatformModels.LocationSerializer payload);
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location")
    Call<PlatformModels.LocationListSerializer> getLocations(@Path("company_id") String companyId , @Query("store_type") String storeType , @Query("q") String q , @Query("stage") String stage , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @PUT ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    Call<PlatformModels.SuccessResponse> updateLocation(@Path("company_id") String companyId , @Path("location_id") String locationId ,@Body PlatformModels.LocationSerializer payload);
    
    @GET ("/service/platform/company-profile/v1.0/company/{company_id}/location/{location_id}")
    Call<PlatformModels.GetLocationSerializer> getLocationDetail(@Path("company_id") String companyId , @Path("location_id") String locationId );
    
    @POST ("/service/platform/company-profile/v1.0/company/{company_id}/location/bulk")
    Call<PlatformModels.SuccessResponse> createLocationBulk(@Path("company_id") String companyId ,@Body PlatformModels.BulkLocationSerializer payload);
    
}

interface FileStorageApiList {
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/start/")
    Call<PlatformModels.StartResponse> startUpload(@Path("namespace") String namespace , @Path("company_id") Integer companyId ,@Body PlatformModels.StartRequest payload);
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/upload/complete/")
    Call<PlatformModels.CompleteResponse> completeUpload(@Path("namespace") String namespace , @Path("company_id") Integer companyId ,@Body PlatformModels.StartResponse payload);
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/start/")
    Call<PlatformModels.StartResponse> appStartUpload(@Path("namespace") String namespace , @Path("company_id") Integer companyId , @Path("application_id") String applicationId ,@Body PlatformModels.StartRequest payload);
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/upload/complete/")
    Call<PlatformModels.CompleteResponse> appCompleteUpload(@Path("namespace") String namespace , @Path("company_id") Integer companyId , @Path("application_id") String applicationId ,@Body PlatformModels.StartResponse payload);
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/sign-urls/")
    Call<PlatformModels.SignUrlResponse> getSignUrls(@Path("company_id") Integer companyId ,@Body PlatformModels.SignUrlRequest payload);
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/uploads/copy/")
    Call<PlatformModels.BulkResponse> copyFiles(@Query("sync") Boolean sync , @Path("company_id") Integer companyId ,@Body PlatformModels.BulkRequest payload);
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/uploads/copy/")
    Call<PlatformModels.BulkResponse> appCopyFiles(@Query("sync") Boolean sync , @Path("company_id") Integer companyId , @Path("application_id") Integer applicationId ,@Body PlatformModels.BulkRequest payload);
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/namespaces/{namespace}/browse/")
    Call<PlatformModels.BrowseResponse> browse(@Path("namespace") String namespace , @Path("company_id") Integer companyId , @Query("page_no") Integer pageNo );
    
    @GET ("/service/platform/assets/v1.0/company/{company_id}/application/{application_id}/namespaces/{namespace}/browse/")
    Call<PlatformModels.BrowseResponse> browse(@Path("namespace") String namespace , @Path("company_id") Integer companyId , @Path("application_id") Integer applicationId , @Query("page_no") Integer pageNo );
    
    @POST ("/service/platform/assets/v1.0/company/{company_id}/proxy/")
    Call<Object> proxy(@Path("company_id") Integer companyId , @Query("url") String url );
    
}

interface ShareApiList {
    
    @POST ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    Call<PlatformModels.ShortLinkRes> createShortLink(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.ShortLinkReq payload);
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/")
    Call<PlatformModels.ShortLinkList> getShortLinks(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("created_by") String createdBy , @Query("active") String active , @Query("q") String q );
    
    @GET ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{hash}/")
    Call<PlatformModels.ShortLinkRes> getShortLinkByHash(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("hash") String hash );
    
    @PATCH ("/service/platform/share/v1.0/company/{company_id}/application/{application_id}/links/short-link/{id}/")
    Call<PlatformModels.ShortLinkRes> updateShortLinkById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.ShortLinkReq payload);
    
}

interface InventoryApiList {
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    Call<PlatformModels.ResponseEnvelopeListJobConfigRawDTO> getJobsByCompany(@Path("company_id") Integer companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @PUT ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    Call<PlatformModels.ResponseEnvelopeString> updateJob(@Path("company_id") Integer companyId ,@Body PlatformModels.JobConfigDTO payload);
    
    @POST ("/service/platform/inventory/v1.0/company/{company_id}/jobs")
    Call<PlatformModels.ResponseEnvelopeString> createJob(@Path("company_id") Integer companyId ,@Body PlatformModels.JobConfigDTO payload);
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/steps/{job_id}")
    Call<PlatformModels.ResponseEnvelopeListJobStepsDTO> getJobSteps(@Path("company_id") Integer companyId , @Path("job_id") Integer jobId );
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/integration/{integration_id}")
    Call<PlatformModels.ResponseEnvelopeListJobConfigDTO> getJobByCompanyAndIntegration(@Path("company_id") Integer companyId , @Path("integration_id") String integrationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/disable/integration/{integration_id}")
    Call<PlatformModels.ResponseEnvelopeString> disable(@Path("company_id") Integer companyId , @Path("integration_id") String integrationId );
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/defaults")
    Call<PlatformModels.ResponseEnvelopeJobConfigDTO> getJobConfigDefaults(@Path("company_id") Integer companyId );
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}")
    Call<PlatformModels.ResponseEnvelopeJobConfigDTO> getJobByCode(@Path("company_id") Integer companyId , @Path("code") String code );
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/{code}/metrics")
    Call<PlatformModels.ResponseEnvelopeJobMetricsDto> getJobCodeMetrics(@Path("company_id") Integer companyId , @Path("code") String code , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("status") String status , @Query("date") String date );
    
    @GET ("/service/platform/inventory/v1.0/company/{company_id}/jobs/code/integration/{integration_id}")
    Call<PlatformModels.ResponseEnvelopeListJobConfigListDTO> getJobCodesByCompanyAndIntegration(@Path("company_id") Integer companyId , @Path("integration_id") String integrationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
}

interface ConfigurationApiList {
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    Call<PlatformModels.MobileAppConfiguration> getBuildConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("platform_type") String platformType );
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/configuration")
    Call<PlatformModels.MobileAppConfiguration> updateBuildConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("platform_type") String platformType ,@Body PlatformModels.MobileAppConfigRequest payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/build/{platform_type}/versions")
    Call<PlatformModels.BuildVersionHistory> getPreviousVersions(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("platform_type") String platformType );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<PlatformModels.AppFeatureResponse> getAppFeatures(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/feature")
    Call<PlatformModels.AppFeature> updateAppFeatures(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.AppFeatureRequest payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<PlatformModels.ApplicationDetail> getAppBasicDetails(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/detail")
    Call<PlatformModels.ApplicationDetail> updateAppBasicDetails(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.ApplicationDetail payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    Call<PlatformModels.ApplicationInformation> getAppContactInfo(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/information")
    Call<PlatformModels.ApplicationInformation> updateAppContactInfo(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.ApplicationInformation payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    Call<PlatformModels.TokenResponse> getAppApiTokens(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/token")
    Call<PlatformModels.TokenResponse> updateAppApiTokens(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.TokenResponse payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/companies")
    Call<PlatformModels.CompaniesResponse> getAppCompanies(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/stores")
    Call<PlatformModels.StoresResponse> getAppStores(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<PlatformModels.ApplicationInventory> getInventoryConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<PlatformModels.ApplicationInventory> updateInventoryConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.ApplicationInventory payload);
    
    @PATCH ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/configuration")
    Call<PlatformModels.ApplicationInventory> partiallyUpdateInventoryConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.AppInventoryPartialUpdate payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    Call<PlatformModels.AppSupportedCurrency> getAppCurrencyConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency")
    Call<PlatformModels.AppSupportedCurrency> updateAppCurrencyConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.AppSupportedCurrency payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/currency/supported")
    Call<PlatformModels.AppCurrencyResponse> getAppSupportedCurrency(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/stores/filter")
    Call<PlatformModels.OrderingStores> getOrderingStoresByFilter(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize ,@Body PlatformModels.FilterOrderingStoreRequest payload);
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store")
    Call<PlatformModels.DeploymentMeta> updateOrderingStoreConfig(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.OrderingStoreConfig payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/ordering-store/staff-stores")
    Call<PlatformModels.OrderingStoresResponse> getStaffOrderingStores(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<PlatformModels.DomainsResponse> getDomains(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain")
    Call<PlatformModels.Domain> addDomain(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.DomainAddRequest payload);
    
    @DELETE ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/{id}")
    Call<PlatformModels.SuccessMessageResponse> removeDomainById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/set-domain")
    Call<PlatformModels.DomainsResponse> changeDomainType(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.UpdateDomainTypeRequest payload);
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}/domain/domain-status")
    Call<PlatformModels.DomainStatusResponse> getDomainStatus(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.DomainStatusRequest payload);
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<PlatformModels.CreateAppResponse> createApplication(@Path("company_id") String companyId ,@Body PlatformModels.CreateApplicationRequest payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application")
    Call<PlatformModels.ApplicationsResponse> getApplications(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/application/{application_id}")
    Call<PlatformModels.Application> getApplicationById(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/currencies")
    Call<PlatformModels.CurrenciesResponse> getCurrencies(@Path("company_id") String companyId );
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/domain/suggestions")
    Call<PlatformModels.DomainSuggestionsResponse> getDomainAvailibility(@Path("company_id") String companyId ,@Body PlatformModels.DomainSuggestionsRequest payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration/{id}")
    Call<PlatformModels.Integration> getIntegrationById(@Path("company_id") String companyId , @Path("id") Integer id );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/available")
    Call<PlatformModels.GetIntegrationsOptInsResponse> getAvailableOptIns(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/selected/{level}/{uid}")
    Call<PlatformModels.GetIntegrationsOptInsResponse> getSelectedOptIns(@Path("company_id") String companyId , @Path("level") String level , @Path("uid") Integer uid , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/new/{id}/{level}")
    Call<PlatformModels.IntegrationConfigResponse> getIntegrationLevelConfig(@Path("company_id") String companyId , @Path("id") String id , @Path("level") String level , @Query("opted") Boolean opted , @Query("check_permission") Boolean checkPermission );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    Call<PlatformModels.IntegrationLevel> getIntegrationByLevelId(@Path("company_id") String companyId , @Path("id") String id , @Path("level") String level , @Path("uid") Integer uid );
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}/{uid}")
    Call<PlatformModels.IntegrationLevel> updateLevelUidIntegration(@Path("company_id") String companyId , @Path("id") String id , @Path("level") String level , @Path("uid") Integer uid ,@Body PlatformModels.IntegrationLevel payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/check/configuration/{id}/{level}/{uid}")
    Call<PlatformModels.OptedStoreIntegration> getLevelActiveIntegrations(@Path("company_id") String companyId , @Path("id") String id , @Path("level") String level , @Path("uid") Integer uid );
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/integration-opt-in/configuration/{id}/{level}")
    Call<PlatformModels.IntegrationLevel> updateLevelIntegration(@Path("company_id") String companyId , @Path("id") String id , @Path("level") String level ,@Body PlatformModels.UpdateIntegrationLevelRequest payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/inventory/brands-by-companies")
    Call<PlatformModels.BrandsByCompanyResponse> getBrandsByCompany(@Path("company_id") String companyId , @Query("q") String q );
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/companies-by-brands")
    Call<PlatformModels.CompanyByBrandsResponse> getCompanyByBrands(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize ,@Body PlatformModels.CompanyByBrandsRequest payload);
    
    @POST ("/service/platform/configuration/v1.0/company/{company_id}/inventory/stores-by-brands")
    Call<PlatformModels.StoreByBrandsResponse> getStoreByBrands(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize ,@Body PlatformModels.StoreByBrandsRequest payload);
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/")
    Call<PlatformModels.OtherSellerApplications> getOtherSellerApplications(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}")
    Call<PlatformModels.OptedApplicationResponse> getOtherSellerApplicationById(@Path("company_id") String companyId , @Path("id") String id );
    
    @PUT ("/service/platform/configuration/v1.0/company/{company_id}/other-seller-applications/{id}/opt_out")
    Call<PlatformModels.SuccessMessageResponse> optOutFromApplication(@Path("company_id") String companyId , @Path("id") String id ,@Body PlatformModels.OptOutInventory payload);
    
}

interface CartApiList {
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    Call<PlatformModels.CouponsResponse> getCoupons(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("is_archived") Boolean isArchived , @Query("title") String title , @Query("is_public") Boolean isPublic , @Query("is_display") Boolean isDisplay , @Query("type_slug") String typeSlug , @Query("code") String code );
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon")
    Call<PlatformModels.SuccessMessage> createCoupon(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.CouponAdd payload);
    
    @GET ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<PlatformModels.CouponUpdate> getCouponById(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<PlatformModels.SuccessMessage> updateCoupon(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.CouponUpdate payload);
    
    @PATCH ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/coupon/{id}")
    Call<PlatformModels.SuccessMessage> updateCouponPartially(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.CouponPartialUpdate payload);
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/validate")
    Call<PlatformModels.OpenapiCartDetailsResponse> fetchAndvalidateCartItems(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.OpenapiCartDetailsRequest payload);
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/serviceability")
    Call<PlatformModels.OpenApiCartServiceabilityResponse> checkCartServiceability(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.OpenApiCartServiceabilityRequest payload);
    
    @POST ("/service/platform/cart/v1.0/company/{company_id}/application/{application_id}/cart/checkout")
    Call<PlatformModels.OpenApiCheckoutResponse> checkoutCart(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.OpenApiPlatformCheckoutReq payload);
    
}

interface RewardsApiList {
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/")
    Call<PlatformModels.GiveawayResponse> getGiveaways(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @POST ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/")
    Call<PlatformModels.Giveaway> createGiveaway(@Path("company_id") String companyId , @Path("application_id") String applicationId ,@Body PlatformModels.Giveaway payload);
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}/")
    Call<PlatformModels.Giveaway> getGiveawayByID(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id );
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/giveaways/{id}/")
    Call<PlatformModels.Giveaway> updateGiveaway(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("id") String id ,@Body PlatformModels.Giveaway payload);
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/")
    Call<List<PlatformModels.Offer>> getOffers(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    Call<PlatformModels.Offer> getOfferByName(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Header("cookie") String cookie , @Path("name") String name );
    
    @PUT ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/offers/{name}/")
    Call<PlatformModels.Offer> updateOfferByName(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("name") String name ,@Body PlatformModels.Offer payload);
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    Call<PlatformModels.UserRes> getUserAvailablePoints(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("user_id") String userId );
    
    @PATCH ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/")
    Call<PlatformModels.AppUser> updateUserStatus(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("user_id") String userId ,@Body PlatformModels.AppUser payload);
    
    @GET ("/service/platform/rewards/v1.0/company/{company_id}/application/{application_id}/users/{user_id}/points/history/")
    Call<PlatformModels.HistoryRes> getUserPointsHistory(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("user_id") String userId , @Query("page_id") String pageId , @Query("page_limit") Integer pageLimit , @Query("page_size") Integer pageSize );
    
}

interface AnalyticsApiList {
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/group")
    Call<PlatformModels.StatsGroups> getStatiscticsGroups(@Path("company_id") String companyId , @Path("application_id") String applicationId );
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/group/{group_name}")
    Call<PlatformModels.StatsGroupComponents> getStatiscticsGroupComponents(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("group_name") String groupName );
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}.csv")
    Call<Object> getComponentStatsCSV(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("component_name") String componentName );
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}.pdf")
    Call<Object> getComponentStatsPDF(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("component_name") String componentName );
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/stats/component/{component_name}")
    Call<PlatformModels.StatsRes> getComponentStats(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("component_name") String componentName );
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/from/{from_date}/to/{to_date}/abandon-cart/")
    Call<PlatformModels.AbandonCartsList> getAbandonCartList(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("from_date") String fromDate , @Path("to_date") String toDate , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/{from_date}/to/{to_date}/abandon-cart.csv")
    Call<Object> getAbandonCartsCSV(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("from_date") String fromDate , @Path("to_date") String toDate );
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/application/{application_id}/cart/abandon-cart/{cart_id}")
    Call<PlatformModels.AbandonCartDetail> getAbandonCartDetail(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("cart_id") String cartId );
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/export/{export_type}")
    Call<PlatformModels.ExportJobRes> createExportJob(@Path("company_id") String companyId , @Path("export_type") String exportType ,@Body PlatformModels.ExportJobReq payload);
    
    @GET ("/service/platform/analytics/v1.0/company/{company_id}/export/{export_type}/job/{job_id}")
    Call<PlatformModels.ExportJobStatusRes> getExportJobStatus(@Path("company_id") String companyId , @Path("export_type") String exportType , @Path("job_id") String jobId );
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/logs/{log_type}")
    Call<PlatformModels.GetLogsListRes> getLogsList(@Path("company_id") String companyId , @Path("log_type") String logType , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize ,@Body PlatformModels.GetLogsListReq payload);
    
    @POST ("/service/platform/analytics/v1.0/company/{company_id}/logs/{log_type}/search")
    Call<PlatformModels.SearchLogRes> searchLogs(@Path("company_id") String companyId , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Path("log_type") String logType ,@Body PlatformModels.SearchLogReq payload);
    
}

interface DiscountApiList {
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/")
    Call<PlatformModels.ListOrCalender> getDiscounts(@Path("company_id") Integer companyId , @Query("view") String view , @Query("q") String q , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("archived") Boolean archived , @Query("month") Integer month , @Query("year") Integer year , @Query("type") String type , @Query("app_ids") List<String> appIds );
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/job/")
    Call<PlatformModels.DiscountJob> createDiscount(@Path("company_id") Integer companyId ,@Body PlatformModels.CreateUpdateDiscount payload);
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    Call<PlatformModels.DiscountJob> getDiscount(@Path("company_id") Integer companyId , @Path("id") String id );
    
    @PUT ("/service/platform/discount/v1.0/company/{company_id}/job/{id}/")
    Call<PlatformModels.DiscountJob> updateDiscount(@Path("company_id") Integer companyId , @Path("id") String id ,@Body PlatformModels.CreateUpdateDiscount payload);
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/application/{application_id}/job/")
    Call<PlatformModels.ListOrCalender> fetchDiscountJobs(@Path("company_id") Integer companyId , @Path("application_id") String applicationId );
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/application/{application_id}/discount/")
    Call<PlatformModels.DiscountList> getDiscountDetails(@Path("company_id") Integer companyId , @Path("application_id") String applicationId ,@Body PlatformModels.InternalDiscountQuery payload);
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/validation/")
    Call<PlatformModels.FileJobResponse> validateDiscountFile(@Path("company_id") Integer companyId , @Query("discount") String discount ,@Body PlatformModels.DiscountJob payload);
    
    @POST ("/service/platform/discount/v1.0/company/{company_id}/file/{type}/download/")
    Call<PlatformModels.FileJobResponse> downloadDiscountFile(@Path("company_id") Integer companyId , @Path("type") String type ,@Body PlatformModels.DownloadFileJob payload);
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    Call<PlatformModels.FileJobResponse> getValidationJob(@Path("company_id") Integer companyId , @Path("id") String id );
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/validation/{id}/")
    Call<PlatformModels.CancelJobResponse> cancelValidationJob(@Path("company_id") Integer companyId , @Path("id") String id );
    
    @GET ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    Call<PlatformModels.FileJobResponse> getDownloadJob(@Path("company_id") Integer companyId , @Path("id") String id );
    
    @DELETE ("/service/platform/discount/v1.0/company/{company_id}/file/download/{id}/")
    Call<PlatformModels.CancelJobResponse> cancelDownloadJob(@Path("company_id") Integer companyId , @Path("id") String id );
    
}

interface PartnerApiList {
    
    @POST ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}")
    Call<PlatformModels.AddProxyResponse> addProxyPath(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("extension_id") String extensionId ,@Body PlatformModels.AddProxyReq payload);
    
    @DELETE ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}/{attached_path}")
    Call<PlatformModels.RemoveProxyResponse> removeProxyPath(@Path("company_id") String companyId , @Path("application_id") String applicationId , @Path("extension_id") String extensionId , @Path("attached_path") String attachedPath );
    
}

interface WebhookApiList {
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    Call<PlatformModels.SubscriberResponse> getSubscribersByCompany(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Path("company_id") Integer companyId , @Query("extension_id") String extensionId );
    
    @POST ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    Call<PlatformModels.SubscriberConfig> registerSubscriberToEvent(@Path("company_id") Integer companyId ,@Body PlatformModels.SubscriberConfig payload);
    
    @PUT ("/service/platform/webhook/v1.0/company/{company_id}/subscriber")
    Call<PlatformModels.SubscriberConfig> updateSubscriberConfig(@Path("company_id") Integer companyId ,@Body PlatformModels.SubscriberConfig payload);
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/extension/{extension_id}/subscriber")
    Call<PlatformModels.SubscriberResponse> getSubscribersByExtensionId(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Path("company_id") Integer companyId , @Path("extension_id") String extensionId );
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/subscriber/{subscriber_id}")
    Call<PlatformModels.SubscriberResponse> getSubscriberById(@Path("company_id") Integer companyId , @Path("subscriber_id") Integer subscriberId );
    
    @GET ("/service/platform/webhook/v1.0/company/{company_id}/events")
    Call<PlatformModels.EventConfigList> fetchAllEventConfigurations(@Path("company_id") Integer companyId );
    
}
