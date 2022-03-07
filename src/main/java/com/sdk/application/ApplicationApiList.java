package com.sdk.application;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;


interface CatalogApiList {
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/")
    Call<ApplicationModels.ProductDetail> getProductDetailBySlug(@Path("slug") String slug );
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/sizes/")
    Call<ApplicationModels.ProductSizes> getProductSizesBySlug(@Path("slug") String slug , @Query("store_id") Integer storeId );
    
    @GET ("/service/application/catalog/v1.0/products/compare/")
    Call<ApplicationModels.ProductsComparisonResponse> getProductComparisonBySlugs(@Query("slug") List<String> slug );
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compare/")
    Call<ApplicationModels.ProductCompareResponse> getSimilarComparisonProductBySlug(@Path("slug") String slug );
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/compared-frequently/")
    Call<ApplicationModels.ProductFrequentlyComparedSimilarResponse> getComparedFrequentlyProductBySlug(@Path("slug") String slug );
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/similar/{similar_type}/")
    Call<ApplicationModels.SimilarProductByTypeResponse> getProductSimilarByIdentifier(@Path("slug") String slug , @Path("similar_type") String similarType );
    
    @GET ("/service/application/catalog/v1.0/products/{slug}/variants/")
    Call<ApplicationModels.ProductVariantsResponse> getProductVariantsBySlug(@Path("slug") String slug );
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/")
    Call<ApplicationModels.ProductStockStatusResponse> getProductStockByIds(@Query("item_id") String itemId , @Query("alu") String alu , @Query("sku_code") String skuCode , @Query("ean") String ean , @Query("upc") String upc );
    
    @GET ("/service/application/catalog/v1.0/products/stock-status/poll/")
    Call<ApplicationModels.ProductStockPolling> getProductStockForTimeByIds(@Query("timestamp") String timestamp , @Query("page_size") Integer pageSize , @Query("page_id") String pageId );
    
    @GET ("/service/application/catalog/v1.0/products/")
    Call<ApplicationModels.ProductListingResponse> getProducts(@Query("q") String q , @Query("f") String f , @Query("filters") Boolean filters , @Query("sort_on") String sortOn , @Query("page_id") String pageId , @Query("page_size") Integer pageSize , @Query("page_no") Integer pageNo , @Query("page_type") String pageType );
    
    @GET ("/service/application/catalog/v1.0/brands/")
    Call<ApplicationModels.BrandListingResponse> getBrands(@Query("department") String department , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/catalog/v1.0/brands/{slug}/")
    Call<ApplicationModels.BrandDetailResponse> getBrandDetailBySlug(@Path("slug") String slug );
    
    @GET ("/service/application/catalog/v1.0/categories/")
    Call<ApplicationModels.CategoryListingResponse> getCategories(@Query("department") String department );
    
    @GET ("/service/application/catalog/v1.0/categories/{slug}/")
    Call<ApplicationModels.CategoryMetaResponse> getCategoryDetailBySlug(@Path("slug") String slug );
    
    @GET ("/service/application/catalog/v1.0/home/listing/")
    Call<ApplicationModels.HomeListingResponse> getHomeProducts(@Query("sort_on") String sortOn , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/catalog/v1.0/departments/")
    Call<ApplicationModels.DepartmentResponse> getDepartments();
    
    @GET ("/service/application/catalog/v1.0/auto-complete/")
    Call<ApplicationModels.AutoCompleteResponse> getSearchResults(@Query("q") String q );
    
    @GET ("/service/application/catalog/v1.0/collections/")
    Call<ApplicationModels.GetCollectionListingResponse> getCollections(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("tag") List<String> tag );
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/items/")
    Call<ApplicationModels.ProductListingResponse> getCollectionItemsBySlug(@Path("slug") String slug , @Query("f") String f , @Query("filters") Boolean filters , @Query("sort_on") String sortOn , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/catalog/v1.0/collections/{slug}/")
    Call<ApplicationModels.CollectionDetailResponse> getCollectionDetailBySlug(@Path("slug") String slug );
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/")
    Call<ApplicationModels.GetFollowListingResponse> getFollowedListing(@Path("collection_type") String collectionType , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @DELETE ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    Call<ApplicationModels.FollowPostResponse> unfollowById(@Path("collection_type") String collectionType , @Path("collection_id") String collectionId );
    
    @POST ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/")
    Call<ApplicationModels.FollowPostResponse> followById(@Path("collection_type") String collectionType , @Path("collection_id") String collectionId );
    
    @GET ("/service/application/catalog/v1.0/follow/{collection_type}/{collection_id}/count/")
    Call<ApplicationModels.FollowerCountResponse> getFollowerCountById(@Path("collection_type") String collectionType , @Path("collection_id") String collectionId );
    
    @GET ("/service/application/catalog/v1.0/follow/ids/")
    Call<ApplicationModels.FollowIdsResponse> getFollowIds(@Query("collection_type") String collectionType );
    
    @GET ("/service/application/catalog/v1.0/locations/")
    Call<ApplicationModels.StoreListingResponse> getStores(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q , @Query("city") String city , @Query("range") Integer range , @Query("latitude") Double latitude , @Query("longitude") Double longitude );
    
    @GET ("/service/application/catalog/v1.0/in-stock/locations/")
    Call<ApplicationModels.ApplicationStoreListing> getInStockLocations(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q , @Query("city") String city , @Query("range") Integer range , @Query("latitude") Double latitude , @Query("longitude") Double longitude );
    
    @GET ("/service/application/catalog/v1.0/locations/{location_id}/")
    Call<ApplicationModels.StoreDetails> getLocationDetailsById(@Path("location_id") Integer locationId );
    
    @GET ("/service/application/catalog/v1.0/product-grouping/")
    Call<ApplicationModels.ProductBundle> getProductBundlesBySlug(@Query("slug") String slug , @Query("id") String id );
    
    @GET ("/service/application/catalog/v2.0/products/{slug}/sizes/{size}/price/")
    Call<ApplicationModels.ProductSizePriceResponseV2> getProductPriceBySlug(@Path("slug") String slug , @Path("size") String size , @Query("store_id") Integer storeId , @Query("pincode") String pincode );
    
    @GET ("/service/application/catalog/v2.0/products/{slug}/sizes/{size}/sellers/")
    Call<ApplicationModels.ProductSizeSellersResponseV2> getProductSellersBySlug(@Path("slug") String slug , @Path("size") String size , @Query("pincode") String pincode , @Query("strategy") String strategy , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
}

interface CartApiList {
    
    @GET ("/service/application/cart/v1.0/detail")
    Call<ApplicationModels.CartDetailResponse> getCart(@Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("assign_card_id") Integer assignCardId );
    
    @HEAD ("/service/application/cart/v1.0/detail")
    Call<Object> getCartLastModified(@Query("id") String id );
    
    @POST ("/service/application/cart/v1.0/detail")
    Call<ApplicationModels.AddCartDetailResponse> addItems(@Query("i") Boolean i , @Query("b") Boolean b ,@Body ApplicationModels.AddCartRequest payload);
    
    @PUT ("/service/application/cart/v1.0/detail")
    Call<ApplicationModels.UpdateCartDetailResponse> updateCart(@Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b ,@Body ApplicationModels.UpdateCartRequest payload);
    
    @GET ("/service/application/cart/v1.0/basic")
    Call<ApplicationModels.CartItemCountResponse> getItemCount(@Query("id") String id );
    
    @GET ("/service/application/cart/v1.0/coupon")
    Call<ApplicationModels.GetCouponResponse> getCoupons(@Query("id") String id );
    
    @POST ("/service/application/cart/v1.0/coupon")
    Call<ApplicationModels.CartDetailResponse> applyCoupon(@Query("i") Boolean i , @Query("b") Boolean b , @Query("p") Boolean p , @Query("id") String id ,@Body ApplicationModels.ApplyCouponRequest payload);
    
    @DELETE ("/service/application/cart/v1.0/coupon")
    Call<ApplicationModels.CartDetailResponse> removeCoupon(@Query("id") String id );
    
    @GET ("/service/application/cart/v1.0/bulk-price")
    Call<ApplicationModels.BulkPriceResponse> getBulkDiscountOffers(@Query("item_id") Integer itemId , @Query("article_id") String articleId , @Query("uid") Integer uid , @Query("slug") String slug );
    
    @POST ("/service/application/cart/v1.0/redeem/points/")
    Call<ApplicationModels.CartDetailResponse> applyRewardPoints(@Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b ,@Body ApplicationModels.RewardPointRequest payload);
    
    @GET ("/service/application/cart/v1.0/address")
    Call<ApplicationModels.GetAddressesResponse> getAddresses(@Query("cart_id") String cartId , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @POST ("/service/application/cart/v1.0/address")
    Call<ApplicationModels.SaveAddressResponse> addAddress(@Body ApplicationModels.Address payload);
    
    @GET ("/service/application/cart/v1.0/address/{id}")
    Call<ApplicationModels.Address> getAddressById(@Path("id") String id , @Query("cart_id") String cartId , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @PUT ("/service/application/cart/v1.0/address/{id}")
    Call<ApplicationModels.UpdateAddressResponse> updateAddress(@Path("id") String id ,@Body ApplicationModels.Address payload);
    
    @DELETE ("/service/application/cart/v1.0/address/{id}")
    Call<ApplicationModels.DeleteAddressResponse> removeAddress(@Path("id") String id );
    
    @POST ("/service/application/cart/v1.0/select-address")
    Call<ApplicationModels.CartDetailResponse> selectAddress(@Query("cart_id") String cartId , @Query("i") Boolean i , @Query("b") Boolean b ,@Body ApplicationModels.SelectCartAddressRequest payload);
    
    @PUT ("/service/application/cart/v1.0/payment")
    Call<ApplicationModels.CartDetailResponse> selectPaymentMode(@Query("id") String id ,@Body ApplicationModels.UpdateCartPaymentRequest payload);
    
    @GET ("/service/application/cart/v1.0/payment/validate/")
    Call<ApplicationModels.PaymentCouponValidate> validateCouponForPayment(@Query("id") String id , @Query("address_id") String addressId , @Query("payment_mode") String paymentMode , @Query("payment_identifier") String paymentIdentifier , @Query("aggregator_name") String aggregatorName , @Query("merchant_code") String merchantCode );
    
    @GET ("/service/application/cart/v1.0/shipment")
    Call<ApplicationModels.CartShipmentsResponse> getShipments(@Query("p") Boolean p , @Query("id") String id , @Query("address_id") String addressId , @Query("area_code") String areaCode );
    
    @POST ("/service/application/cart/v1.0/checkout")
    Call<ApplicationModels.CartCheckoutResponse> checkoutCart(@Body ApplicationModels.CartCheckoutDetailRequest payload);
    
    @PUT ("/service/application/cart/v1.0/meta")
    Call<ApplicationModels.CartMetaResponse> updateCartMeta(@Query("id") String id ,@Body ApplicationModels.CartMetaRequest payload);
    
    @POST ("/service/application/cart/v1.0/share-cart")
    Call<ApplicationModels.GetShareCartLinkResponse> getCartShareLink(@Body ApplicationModels.GetShareCartLinkRequest payload);
    
    @GET ("/service/application/cart/v1.0/share-cart/{token}")
    Call<ApplicationModels.SharedCartResponse> getCartSharedItems(@Path("token") String token );
    
    @POST ("/service/application/cart/v1.0/share-cart/{token}/{action}")
    Call<ApplicationModels.SharedCartResponse> updateCartWithSharedItems(@Path("token") String token , @Path("action") String action );
    
}

interface CommonApiList {
    
    @GET ("/service/common/configuration/v1.0/application/search-application")
    Call<ApplicationModels.ApplicationResponse> searchApplication(@Header("authorization") String authorization , @Query("query") String query );
    
    @GET ("/service/common/configuration/v1.0/location")
    Call<ApplicationModels.Locations> getLocations(@Query("location_type") String locationType , @Query("id") String id );
    
}

interface LeadApiList {
    
    @GET ("/service/application/lead/v1.0/ticket/{id}")
    Call<ApplicationModels.Ticket> getTicket(@Path("id") String id );
    
    @POST ("/service/application/lead/v1.0/ticket/{id}/history")
    Call<ApplicationModels.TicketHistory> createHistory(@Path("id") String id ,@Body ApplicationModels.TicketHistoryPayload payload);
    
    @POST ("/service/application/lead/v1.0/ticket/")
    Call<ApplicationModels.Ticket> createTicket(@Body ApplicationModels.AddTicketPayload payload);
    
    @GET ("/service/application/lead/v1.0/form/{slug}")
    Call<ApplicationModels.CustomForm> getCustomForm(@Path("slug") String slug );
    
    @POST ("/service/application/lead/v1.0/form/{slug}/submit")
    Call<ApplicationModels.SubmitCustomFormResponse> submitCustomForm(@Path("slug") String slug ,@Body ApplicationModels.CustomFormSubmissionPayload payload);
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/participants")
    Call<ApplicationModels.GetParticipantsInsideVideoRoomResponse> getParticipantsInsideVideoRoom(@Path("unique_name") String uniqueName );
    
    @GET ("/service/application/lead/v1.0/video/room/{unique_name}/token")
    Call<ApplicationModels.GetTokenForVideoRoomResponse> getTokenForVideoRoom(@Path("unique_name") String uniqueName );
    
}

interface ThemeApiList {
    
    @GET ("/service/application/theme/v1.0/{theme_id}/page")
    Call<ApplicationModels.AllAvailablePageSchema> getAllPages(@Path("theme_id") String themeId );
    
    @GET ("/service/application/theme/v1.0/{theme_id}/{page_value}")
    Call<ApplicationModels.AvailablePageSchema> getPage(@Path("theme_id") String themeId , @Path("page_value") String pageValue );
    
    @GET ("/service/application/theme/v1.0/applied-theme")
    Call<ApplicationModels.ThemesSchema> getAppliedTheme();
    
    @GET ("/service/application/theme/v1.0/{theme_id}/preview")
    Call<ApplicationModels.ThemesSchema> getThemeForPreview(@Path("theme_id") String themeId );
    
}

interface UserApiList {
    
    @POST ("/service/application/user/authentication/v1.0/login/facebook-token")
    Call<ApplicationModels.AuthSuccess> loginWithFacebook(@Query("platform") String platform ,@Body ApplicationModels.OAuthRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/google-token")
    Call<ApplicationModels.AuthSuccess> loginWithGoogle(@Query("platform") String platform ,@Body ApplicationModels.OAuthRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/google-android")
    Call<ApplicationModels.AuthSuccess> loginWithGoogleAndroid(@Query("platform") String platform ,@Body ApplicationModels.OAuthRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/google-ios")
    Call<ApplicationModels.AuthSuccess> loginWithGoogleIOS(@Query("platform") String platform ,@Body ApplicationModels.OAuthRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/apple-ios")
    Call<ApplicationModels.AuthSuccess> loginWithAppleIOS(@Query("platform") String platform ,@Body ApplicationModels.OAuthRequestAppleSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/otp")
    Call<ApplicationModels.SendOtpResponse> loginWithOTP(@Query("platform") String platform ,@Body ApplicationModels.SendOtpRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/password")
    Call<ApplicationModels.LoginSuccess> loginWithEmailAndPassword(@Body ApplicationModels.PasswordLoginRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset")
    Call<ApplicationModels.ResetPasswordSuccess> sendResetPasswordEmail(@Query("platform") String platform ,@Body ApplicationModels.SendResetPasswordEmailRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset/forgot")
    Call<ApplicationModels.LoginSuccess> forgotPassword(@Body ApplicationModels.ForgotPasswordRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/password/reset/token")
    Call<ApplicationModels.ResetPasswordSuccess> sendResetToken(@Body ApplicationModels.CodeRequestBodySchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/login/token")
    Call<ApplicationModels.LoginSuccess> loginWithToken(@Body ApplicationModels.TokenRequestBodySchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/register/form")
    Call<ApplicationModels.RegisterFormSuccess> registerWithForm(@Query("platform") String platform ,@Body ApplicationModels.FormRegisterRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/verify/email")
    Call<ApplicationModels.VerifyEmailSuccess> verifyEmail(@Body ApplicationModels.CodeRequestBodySchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/verify/mobile")
    Call<ApplicationModels.VerifyEmailSuccess> verifyMobile(@Body ApplicationModels.CodeRequestBodySchema payload);
    
    @GET ("/service/application/user/authentication/v1.0/has-password")
    Call<ApplicationModels.HasPasswordSuccess> hasPassword();
    
    @POST ("/service/application/user/authentication/v1.0/password")
    Call<ApplicationModels.VerifyEmailSuccess> updatePassword(@Body ApplicationModels.UpdatePasswordRequestSchema payload);
    
    @GET ("/service/application/user/authentication/v1.0/logout")
    Call<ApplicationModels.LogoutSuccess> logout();
    
    @POST ("/service/application/user/authentication/v1.0/otp/mobile/send")
    Call<ApplicationModels.OtpSuccess> sendOTPOnMobile(@Query("platform") String platform ,@Body ApplicationModels.SendMobileOtpRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/otp/mobile/verify")
    Call<ApplicationModels.VerifyOtpSuccess> verifyMobileOTP(@Query("platform") String platform ,@Body ApplicationModels.VerifyOtpRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/send")
    Call<ApplicationModels.EmailOtpSuccess> sendOTPOnEmail(@Query("platform") String platform ,@Body ApplicationModels.SendEmailOtpRequestSchema payload);
    
    @POST ("/service/application/user/authentication/v1.0/otp/email/verify")
    Call<ApplicationModels.VerifyOtpSuccess> verifyEmailOTP(@Query("platform") String platform ,@Body ApplicationModels.VerifyEmailOtpRequestSchema payload);
    
    @GET ("/service/application/user/authentication/v1.0/session")
    Call<ApplicationModels.UserObjectSchema> getLoggedInUser();
    
    @GET ("/service/application/user/authentication/v1.0/sessions")
    Call<ApplicationModels.SessionListSuccess> getListOfActiveSessions();
    
    @GET ("/service/application/user/platform/v1.0/config")
    Call<ApplicationModels.PlatformSchema> getPlatformConfig(@Query("name") String name );
    
    @POST ("/service/application/user/profile/v1.0/detail")
    Call<ApplicationModels.ProfileEditSuccess> updateProfile(@Query("platform") String platform ,@Body ApplicationModels.EditProfileRequestSchema payload);
    
    @PUT ("/service/application/user/profile/v1.0/mobile")
    Call<ApplicationModels.VerifyMobileOTPSuccess> addMobileNumber(@Query("platform") String platform ,@Body ApplicationModels.EditMobileRequestSchema payload);
    
    @DELETE ("/service/application/user/profile/v1.0/mobile")
    Call<ApplicationModels.LoginSuccess> deleteMobileNumber(@Query("platform") String platform , @Query("active") Boolean active , @Query("primary") Boolean primary , @Query("verified") Boolean verified , @Query("country_code") String countryCode , @Query("phone") String phone );
    
    @POST ("/service/application/user/profile/v1.0/mobile/primary")
    Call<ApplicationModels.LoginSuccess> setMobileNumberAsPrimary(@Body ApplicationModels.SendVerificationLinkMobileRequestSchema payload);
    
    @POST ("/service/application/user/profile/v1.0/mobile/link/send")
    Call<ApplicationModels.SendMobileVerifyLinkSuccess> sendVerificationLinkToMobile(@Query("platform") String platform ,@Body ApplicationModels.SendVerificationLinkMobileRequestSchema payload);
    
    @PUT ("/service/application/user/profile/v1.0/email")
    Call<ApplicationModels.VerifyEmailOTPSuccess> addEmail(@Query("platform") String platform ,@Body ApplicationModels.EditEmailRequestSchema payload);
    
    @DELETE ("/service/application/user/profile/v1.0/email")
    Call<ApplicationModels.LoginSuccess> deleteEmail(@Query("platform") String platform , @Query("active") Boolean active , @Query("primary") Boolean primary , @Query("verified") Boolean verified , @Query("email") String email );
    
    @POST ("/service/application/user/profile/v1.0/email/primary")
    Call<ApplicationModels.LoginSuccess> setEmailAsPrimary(@Body ApplicationModels.EditEmailRequestSchema payload);
    
    @POST ("/service/application/user/profile/v1.0/email/link/send")
    Call<ApplicationModels.SendEmailVerifyLinkSuccess> sendVerificationLinkToEmail(@Query("platform") String platform ,@Body ApplicationModels.EditEmailRequestSchema payload);
    
}

interface ContentApiList {
    
    @GET ("/service/application/content/v1.0/announcements")
    Call<ApplicationModels.AnnouncementsResponseSchema> getAnnouncements();
    
    @GET ("/service/application/content/v1.0/blogs/{slug}")
    Call<ApplicationModels.BlogSchema> getBlog(@Path("slug") String slug , @Query("root_id") String rootId );
    
    @GET ("/service/application/content/v1.0/blogs/")
    Call<ApplicationModels.BlogGetResponse> getBlogs(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/content/v1.0/data-loader")
    Call<ApplicationModels.DataLoaderSchema> getDataLoaders();
    
    @GET ("/service/application/content/v1.0/faq")
    Call<ApplicationModels.FaqResponseSchema> getFaqs();
    
    @GET ("/service/application/content/v1.0/faq/categories")
    Call<ApplicationModels.GetFaqCategoriesSchema> getFaqCategories();
    
    @GET ("/service/application/content/v1.0/faq/{slug}")
    Call<ApplicationModels.FaqSchema> getFaqBySlug(@Path("slug") String slug );
    
    @GET ("/service/application/content/v1.0/faq/category/{slug}")
    Call<ApplicationModels.GetFaqCategoryBySlugSchema> getFaqCategoryBySlug(@Path("slug") String slug );
    
    @GET ("/service/application/content/v1.0/faq/category/{slug}/faqs")
    Call<ApplicationModels.GetFaqSchema> getFaqsByCategorySlug(@Path("slug") String slug );
    
    @GET ("/service/application/content/v1.0/landing-page")
    Call<ApplicationModels.LandingPageSchema> getLandingPage();
    
    @GET ("/service/application/content/v1.0/legal")
    Call<ApplicationModels.ApplicationLegal> getLegalInformation();
    
    @GET ("/service/application/content/v1.0/navigations/")
    Call<ApplicationModels.NavigationGetResponse> getNavigations(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/content/v1.0/seo")
    Call<ApplicationModels.SeoComponent> getSEOConfiguration();
    
    @GET ("/service/application/content/v1.0/slideshow/")
    Call<ApplicationModels.SlideshowGetResponse> getSlideshows(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/content/v1.0/slideshow/{slug}")
    Call<ApplicationModels.SlideshowSchema> getSlideshow(@Path("slug") String slug );
    
    @GET ("/service/application/content/v1.0/support")
    Call<ApplicationModels.Support> getSupportInformation();
    
    @GET ("/service/application/content/v1.0/tags")
    Call<ApplicationModels.TagsSchema> getTags();
    
    @GET ("/service/application/content/v2.0/pages/{slug}")
    Call<ApplicationModels.PageSchema> getPage(@Path("slug") String slug , @Query("root_id") String rootId );
    
    @GET ("/service/application/content/v2.0/pages/")
    Call<ApplicationModels.PageGetResponse> getPages(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
}

interface CommunicationApiList {
    
    @GET ("/service/application/communication/v1.0/consent")
    Call<ApplicationModels.CommunicationConsent> getCommunicationConsent();
    
    @POST ("/service/application/communication/v1.0/consent")
    Call<ApplicationModels.CommunicationConsentRes> upsertCommunicationConsent(@Body ApplicationModels.CommunicationConsentReq payload);
    
    @POST ("/service/application/communication/v1.0/pn-token")
    Call<ApplicationModels.PushtokenRes> upsertAppPushtoken(@Body ApplicationModels.PushtokenReq payload);
    
}

interface ShareApiList {
    
    @POST ("/service/application/share/v1.0/qr/")
    Call<ApplicationModels.QRCodeResp> getApplicationQRCode();
    
    @POST ("/service/application/share/v1.0/qr/products/{slug}/")
    Call<ApplicationModels.QRCodeResp> getProductQRCodeBySlug(@Path("slug") String slug );
    
    @POST ("/service/application/share/v1.0/qr/collection/{slug}/")
    Call<ApplicationModels.QRCodeResp> getCollectionQRCodeBySlug(@Path("slug") String slug );
    
    @POST ("/service/application/share/v1.0/qr/url/")
    Call<ApplicationModels.QRCodeResp> getUrlQRCode(@Query("url") String url );
    
    @POST ("/service/application/share/v1.0/links/short-link/")
    Call<ApplicationModels.ShortLinkRes> createShortLink(@Body ApplicationModels.ShortLinkReq payload);
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/")
    Call<ApplicationModels.ShortLinkRes> getShortLinkByHash(@Path("hash") String hash );
    
    @GET ("/service/application/share/v1.0/links/short-link/{hash}/original/")
    Call<ApplicationModels.ShortLinkRes> getOriginalShortLinkByHash(@Path("hash") String hash );
    
}

interface FileStorageApiList {
    
    @POST ("/service/application/assets/v1.0/namespaces/{namespace}/upload/start/")
    Call<ApplicationModels.StartResponse> startUpload(@Path("namespace") String namespace ,@Body ApplicationModels.StartRequest payload);
    
    @POST ("/service/application/assets/v1.0/namespaces/{namespace}/upload/complete/")
    Call<ApplicationModels.CompleteResponse> completeUpload(@Path("namespace") String namespace ,@Body ApplicationModels.StartResponse payload);
    
    @POST ("/service/application/assets/v1.0/sign-urls/")
    Call<ApplicationModels.SignUrlResponse> signUrls(@Body ApplicationModels.SignUrlRequest payload);
    
}

interface ConfigurationApiList {
    
    @GET ("/service/application/configuration/v1.0/application")
    Call<ApplicationModels.Application> getApplication();
    
    @GET ("/service/application/configuration/v1.0/about")
    Call<ApplicationModels.ApplicationAboutResponse> getOwnerInfo();
    
    @GET ("/service/application/configuration/v1.0/detail")
    Call<ApplicationModels.ApplicationDetail> getBasicDetails();
    
    @GET ("/service/application/configuration/v1.0/token")
    Call<ApplicationModels.AppTokenResponse> getIntegrationTokens();
    
    @GET ("/service/application/configuration/v1.0/ordering-store/stores")
    Call<ApplicationModels.OrderingStores> getOrderingStores(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q );
    
    @GET ("/service/application/configuration/v1.0/ordering-store/stores/{store_id}")
    Call<ApplicationModels.OrderingStore> getStoreDetailById(@Path("store_id") Integer storeId );
    
    @GET ("/service/application/configuration/v1.0/feature")
    Call<ApplicationModels.AppFeatureResponse> getFeatures();
    
    @GET ("/service/application/configuration/v1.0/information")
    Call<ApplicationModels.ApplicationInformation> getContactInfo();
    
    @GET ("/service/application/configuration/v1.0/currencies")
    Call<ApplicationModels.CurrenciesResponse> getCurrencies();
    
    @GET ("/service/application/configuration/v1.0/currency/{id}")
    Call<ApplicationModels.Currency> getCurrencyById(@Path("id") String id );
    
    @GET ("/service/application/configuration/v1.0/currency")
    Call<ApplicationModels.AppCurrencyResponse> getAppCurrencies();
    
    @GET ("/service/application/configuration/v1.0/languages")
    Call<ApplicationModels.LanguageResponse> getLanguages();
    
    @POST ("/service/application/configuration/v1.0/ordering-store/select")
    Call<ApplicationModels.SuccessMessageResponse> getOrderingStoreCookie(@Body ApplicationModels.OrderingStoreSelectRequest payload);
    
    @DELETE ("/service/application/configuration/v1.0/ordering-store/select")
    Call<ApplicationModels.SuccessMessageResponse> removeOrderingStoreCookie();
    
    @GET ("/service/application/configuration/v1.0/staff")
    Call<ApplicationModels.AppStaffResponse> getAppStaffs(@Query("order_incent") Boolean orderIncent , @Query("ordering_store") Integer orderingStore , @Query("user") String user );
    
}

interface PaymentApiList {
    
    @GET ("/service/application/payment/v1.0/config/aggregators/key")
    Call<ApplicationModels.AggregatorsConfigDetailResponse> getAggregatorsConfig(@Header("x-api-token") String xApiToken , @Query("refresh") Boolean refresh );
    
    @POST ("/service/application/payment/v1.0/card/attach")
    Call<ApplicationModels.AttachCardsResponse> attachCardToCustomer(@Body ApplicationModels.AttachCardRequest payload);
    
    @GET ("/service/application/payment/v1.0/card/aggregator")
    Call<ApplicationModels.ActiveCardPaymentGatewayResponse> getActiveCardAggregator(@Query("refresh") Boolean refresh );
    
    @GET ("/service/application/payment/v1.0/cards")
    Call<ApplicationModels.ListCardsResponse> getActiveUserCards(@Query("force_refresh") Boolean forceRefresh );
    
    @POST ("/service/application/payment/v1.0/card/remove")
    Call<ApplicationModels.DeleteCardsResponse> deleteUserCard(@Body ApplicationModels.DeletehCardRequest payload);
    
    @POST ("/service/application/payment/v1.0/payment/customer/validation")
    Call<ApplicationModels.ValidateCustomerResponse> verifyCustomerForPayment(@Body ApplicationModels.ValidateCustomerRequest payload);
    
    @POST ("/service/application/payment/v1.0/payment/confirm/charge")
    Call<ApplicationModels.ChargeCustomerResponse> verifyAndChargePayment(@Body ApplicationModels.ChargeCustomerRequest payload);
    
    @POST ("/service/application/payment/v1.0/payment/request")
    Call<ApplicationModels.PaymentInitializationResponse> initialisePayment(@Body ApplicationModels.PaymentInitializationRequest payload);
    
    @POST ("/service/application/payment/v1.0/payment/confirm/polling")
    Call<ApplicationModels.PaymentStatusUpdateResponse> checkAndUpdatePaymentStatus(@Body ApplicationModels.PaymentStatusUpdateRequest payload);
    
    @GET ("/service/application/payment/v1.0/payment/options")
    Call<ApplicationModels.PaymentModeRouteResponse> getPaymentModeRoutes(@Query("amount") Integer amount , @Query("cart_id") String cartId , @Query("pincode") String pincode , @Query("checkout_mode") String checkoutMode , @Query("refresh") Boolean refresh , @Query("card_reference") String cardReference , @Query("user_details") String userDetails );
    
    @GET ("/service/application/payment/v1.0/payment/options/pos")
    Call<ApplicationModels.PaymentModeRouteResponse> getPosPaymentModeRoutes(@Query("amount") Integer amount , @Query("cart_id") String cartId , @Query("pincode") String pincode , @Query("checkout_mode") String checkoutMode , @Query("refresh") Boolean refresh , @Query("card_reference") String cardReference , @Query("order_type") String orderType , @Query("user_details") String userDetails );
    
    @GET ("/service/application/payment/v1.0/rupifi/banner")
    Call<ApplicationModels.RupifiBannerResponse> getRupifiBannerDetails();
    
    @GET ("/service/application/payment/v1.0/refund/transfer-mode")
    Call<ApplicationModels.TransferModeResponse> getActiveRefundTransferModes();
    
    @PUT ("/service/application/payment/v1.0/refund/transfer-mode")
    Call<ApplicationModels.UpdateRefundTransferModeResponse> enableOrDisableRefundTransferMode(@Body ApplicationModels.UpdateRefundTransferModeRequest payload);
    
    @GET ("/service/application/payment/v1.0/refund/user/beneficiary")
    Call<ApplicationModels.OrderBeneficiaryResponse> getUserBeneficiariesDetail(@Query("order_id") String orderId );
    
    @GET ("/service/application/payment/v1.0/ifsc-code/verify")
    Call<ApplicationModels.IfscCodeResponse> verifyIfscCode(@Query("ifsc_code") String ifscCode );
    
    @GET ("/service/application/payment/v1.0/refund/order/beneficiaries")
    Call<ApplicationModels.OrderBeneficiaryResponse> getOrderBeneficiariesDetail(@Query("order_id") String orderId );
    
    @POST ("/service/application/payment/v1.0/refund/verification/bank")
    Call<ApplicationModels.AddBeneficiaryViaOtpVerificationResponse> verifyOtpAndAddBeneficiaryForBank(@Body ApplicationModels.AddBeneficiaryViaOtpVerificationRequest payload);
    
    @POST ("/service/application/payment/v1.0/refund/account")
    Call<ApplicationModels.RefundAccountResponse> addBeneficiaryDetails(@Body ApplicationModels.AddBeneficiaryDetailsRequest payload);
    
    @POST ("/service/application/payment/v1.0/refund/account/otp")
    Call<ApplicationModels.RefundAccountResponse> addRefundBankAccountUsingOTP(@Body ApplicationModels.AddBeneficiaryDetailsOTPRequest payload);
    
    @POST ("/service/application/payment/v1.0/refund/verification/wallet")
    Call<ApplicationModels.WalletOtpResponse> verifyOtpAndAddBeneficiaryForWallet(@Body ApplicationModels.WalletOtpRequest payload);
    
    @POST ("/service/application/payment/v1.0/refund/beneficiary/default")
    Call<ApplicationModels.SetDefaultBeneficiaryResponse> updateDefaultBeneficiary(@Body ApplicationModels.SetDefaultBeneficiaryRequest payload);
    
}

interface OrderApiList {
    
    @GET ("/service/application/order/v1.0/orders")
    Call<ApplicationModels.OrderList> getOrders(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate , @Query("status") Integer status );
    
    @GET ("/service/application/order/v1.0/orders/{order_id}")
    Call<ApplicationModels.OrderById> getOrderById(@Path("order_id") String orderId );
    
    @GET ("/service/application/order/v1.0/orders/shipments/{shipment_id}")
    Call<ApplicationModels.ShipmentById> getShipmentById(@Path("shipment_id") String shipmentId );
    
    @GET ("/service/application/order/v1.0/orders/shipments/{shipment_id}/reasons")
    Call<ApplicationModels.ShipmentReasons> getShipmentReasons(@Path("shipment_id") String shipmentId );
    
    @PUT ("/service/application/order/v1.0/orders/shipments/{shipment_id}/status")
    Call<ApplicationModels.ShipmentStatusUpdate> updateShipmentStatus(@Path("shipment_id") String shipmentId ,@Body ApplicationModels.ShipmentStatusUpdateBody payload);
    
    @GET ("/service/application/order/v1.0/orders/shipments/{shipment_id}/track")
    Call<ApplicationModels.ShipmentTrack> trackShipment(@Path("shipment_id") String shipmentId );
    
    @GET ("/service/application/order/v1.0/orders/pos-order/{order_id}")
    Call<ApplicationModels.PosOrderById> getPosOrderById(@Path("order_id") String orderId );
    
    @GET ("/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/customer-details")
    Call<ApplicationModels.CustomerDetailsByShipmentId> getCustomerDetailsByShipmentId(@Path("order_id") String orderId , @Path("shipment_id") String shipmentId );
    
    @POST ("/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/send/")
    Call<ApplicationModels.sendOTPApplicationResponse> sendOtpToShipmentCustomer(@Path("order_id") String orderId , @Path("shipment_id") String shipmentId );
    
    @POST ("/service/application/order/v1.0/orders/{order_id}/shipments/{shipment_id}/otp/verify")
    Call<ApplicationModels.ResponseVerifyOTPShipment> verifyOtpShipmentCustomer(@Path("order_id") String orderId , @Path("shipment_id") String shipmentId ,@Body ApplicationModels.ReqBodyVerifyOTPShipment payload);
    
}

interface RewardsApiList {
    
    @POST ("/service/application/rewards/v1.0/catalogue/offer/order/")
    Call<ApplicationModels.CatalogueOrderResponse> getPointsOnProduct(@Body ApplicationModels.CatalogueOrderRequest payload);
    
    @GET ("/service/application/rewards/v1.0/offers/{name}/")
    Call<ApplicationModels.Offer> getOfferByName(@Path("name") String name );
    
    @POST ("/service/application/rewards/v1.0/user/offers/order-discount/")
    Call<ApplicationModels.OrderDiscountResponse> getOrderDiscount(@Body ApplicationModels.OrderDiscountRequest payload);
    
    @GET ("/service/application/rewards/v1.0/user/points/")
    Call<ApplicationModels.PointsResponse> getUserPoints();
    
    @GET ("/service/application/rewards/v1.0/user/points/history/")
    Call<ApplicationModels.PointsHistoryResponse> getUserPointsHistory(@Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/rewards/v1.0/user/referral/")
    Call<ApplicationModels.ReferralDetailsResponse> getUserReferralDetails();
    
    @POST ("/service/application/rewards/v1.0/user/referral/redeem/")
    Call<ApplicationModels.RedeemReferralCodeResponse> redeemReferralCode(@Body ApplicationModels.RedeemReferralCodeRequest payload);
    
}

interface FeedbackApiList {
    
    @POST ("/service/application/feedback/v1.0/abuse/")
    Call<ApplicationModels.InsertResponse> createAbuseReport(@Body ApplicationModels.ReportAbuseRequest payload);
    
    @PUT ("/service/application/feedback/v1.0/abuse/")
    Call<ApplicationModels.UpdateResponse> updateAbuseReport(@Body ApplicationModels.UpdateAbuseStatusRequest payload);
    
    @GET ("/service/application/feedback/v1.0/abuse/entity/{entity_type}/entity-id/{entity_id}")
    Call<ApplicationModels.ReportAbuseGetResponse> getAbuseReports(@Path("entity_id") String entityId , @Path("entity_type") String entityType , @Query("id") String id , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/feedback/v1.0/attributes/")
    Call<ApplicationModels.AttributeResponse> getAttributes(@Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/application/feedback/v1.0/attributes/")
    Call<ApplicationModels.InsertResponse> createAttribute(@Body ApplicationModels.SaveAttributeRequest payload);
    
    @GET ("/service/application/feedback/v1.0/attributes/{slug}")
    Call<ApplicationModels.Attribute> getAttribute(@Path("slug") String slug );
    
    @PUT ("/service/application/feedback/v1.0/attributes/{slug}")
    Call<ApplicationModels.UpdateResponse> updateAttribute(@Path("slug") String slug ,@Body ApplicationModels.UpdateAttributeRequest payload);
    
    @POST ("/service/application/feedback/v1.0/comment/")
    Call<ApplicationModels.InsertResponse> createComment(@Body ApplicationModels.CommentRequest payload);
    
    @PUT ("/service/application/feedback/v1.0/comment/")
    Call<ApplicationModels.UpdateResponse> updateComment(@Body ApplicationModels.UpdateCommentRequest payload);
    
    @GET ("/service/application/feedback/v1.0/comment/entity/{entity_type}")
    Call<ApplicationModels.CommentGetResponse> getComments(@Path("entity_type") String entityType , @Query("id") String id , @Query("entity_id") String entityId , @Query("user_id") String userId , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/feedback/v1.0/config/entity/{entity_type}/entity-id/{entity_id}")
    Call<ApplicationModels.CheckEligibilityResponse> checkEligibility(@Path("entity_type") String entityType , @Path("entity_id") String entityId );
    
    @DELETE ("/service/application/feedback/v1.0/media/")
    Call<ApplicationModels.UpdateResponse> deleteMedia(@Query("ids") List<String> ids );
    
    @POST ("/service/application/feedback/v1.0/media/")
    Call<ApplicationModels.InsertResponse> createMedia(@Body ApplicationModels.AddMediaListRequest payload);
    
    @PUT ("/service/application/feedback/v1.0/media/")
    Call<ApplicationModels.UpdateResponse> updateMedia(@Body ApplicationModels.UpdateMediaListRequest payload);
    
    @GET ("/service/application/feedback/v1.0/media/entity/{entity_type}/entity-id/{entity_id}")
    Call<ApplicationModels.MediaGetResponse> getMedias(@Path("entity_type") String entityType , @Path("entity_id") String entityId , @Query("id") String id , @Query("type") String type , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/feedback/v1.0/rating/summary/entity/{entity_type}/entity-id/{entity_id}")
    Call<ApplicationModels.ReviewMetricGetResponse> getReviewSummaries(@Path("entity_type") String entityType , @Path("entity_id") String entityId , @Query("id") String id , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @POST ("/service/application/feedback/v1.0/review/")
    Call<ApplicationModels.UpdateResponse> createReview(@Body ApplicationModels.UpdateReviewRequest payload);
    
    @PUT ("/service/application/feedback/v1.0/review/")
    Call<ApplicationModels.UpdateResponse> updateReview(@Body ApplicationModels.UpdateReviewRequest payload);
    
    @GET ("/service/application/feedback/v1.0/review/entity/{entity_type}/entity-id/{entity_id}")
    Call<ApplicationModels.ReviewGetResponse> getReviews(@Path("entity_type") String entityType , @Path("entity_id") String entityId , @Query("id") String id , @Query("user_id") String userId , @Query("media") String media , @Query("rating") List<Double> rating , @Query("attribute_rating") List<String> attributeRating , @Query("facets") Boolean facets , @Query("sort") String sort , @Query("active") Boolean active , @Query("approve") Boolean approve , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/feedback/v1.0/template/")
    Call<ApplicationModels.TemplateGetResponse> getTemplates(@Query("template_id") String templateId , @Query("entity_id") String entityId , @Query("entity_type") String entityType );
    
    @POST ("/service/application/feedback/v1.0/template/qna/")
    Call<ApplicationModels.InsertResponse> createQuestion(@Body ApplicationModels.CreateQNARequest payload);
    
    @PUT ("/service/application/feedback/v1.0/template/qna/")
    Call<ApplicationModels.UpdateResponse> updateQuestion(@Body ApplicationModels.UpdateQNARequest payload);
    
    @GET ("/service/application/feedback/v1.0/template/qna/entity/{entity_type}/entity-id/{entity_id}")
    Call<ApplicationModels.QNAGetResponse> getQuestionAndAnswers(@Path("entity_type") String entityType , @Path("entity_id") String entityId , @Query("id") String id , @Query("user_id") String userId , @Query("show_answer") Boolean showAnswer , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET ("/service/application/feedback/v1.0/vote/")
    Call<ApplicationModels.VoteResponse> getVotes(@Query("id") String id , @Query("ref_type") String refType , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @POST ("/service/application/feedback/v1.0/vote/")
    Call<ApplicationModels.InsertResponse> createVote(@Body ApplicationModels.VoteRequest payload);
    
    @PUT ("/service/application/feedback/v1.0/vote/")
    Call<ApplicationModels.UpdateResponse> updateVote(@Body ApplicationModels.UpdateVoteRequest payload);
    
}

interface PosCartApiList {
    
    @GET ("/service/application/pos/cart/v1.0/detail")
    Call<ApplicationModels.CartDetailResponse> getCart(@Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("assign_card_id") Integer assignCardId );
    
    @HEAD ("/service/application/pos/cart/v1.0/detail")
    Call<Object> getCartLastModified(@Query("id") String id );
    
    @POST ("/service/application/pos/cart/v1.0/detail")
    Call<ApplicationModels.AddCartDetailResponse> addItems(@Query("i") Boolean i , @Query("b") Boolean b ,@Body ApplicationModels.AddCartRequest payload);
    
    @PUT ("/service/application/pos/cart/v1.0/detail")
    Call<ApplicationModels.UpdateCartDetailResponse> updateCart(@Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b ,@Body ApplicationModels.UpdateCartRequest payload);
    
    @GET ("/service/application/pos/cart/v1.0/basic")
    Call<ApplicationModels.CartItemCountResponse> getItemCount(@Query("id") String id );
    
    @GET ("/service/application/pos/cart/v1.0/coupon")
    Call<ApplicationModels.GetCouponResponse> getCoupons(@Query("id") String id );
    
    @POST ("/service/application/pos/cart/v1.0/coupon")
    Call<ApplicationModels.CartDetailResponse> applyCoupon(@Query("i") Boolean i , @Query("b") Boolean b , @Query("p") Boolean p , @Query("id") String id ,@Body ApplicationModels.ApplyCouponRequest payload);
    
    @DELETE ("/service/application/pos/cart/v1.0/coupon")
    Call<ApplicationModels.CartDetailResponse> removeCoupon(@Query("id") String id );
    
    @GET ("/service/application/pos/cart/v1.0/bulk-price")
    Call<ApplicationModels.BulkPriceResponse> getBulkDiscountOffers(@Query("item_id") Integer itemId , @Query("article_id") String articleId , @Query("uid") Integer uid , @Query("slug") String slug );
    
    @POST ("/service/application/pos/cart/v1.0/redeem/points/")
    Call<ApplicationModels.CartDetailResponse> applyRewardPoints(@Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b ,@Body ApplicationModels.RewardPointRequest payload);
    
    @GET ("/service/application/pos/cart/v1.0/address")
    Call<ApplicationModels.GetAddressesResponse> getAddresses(@Query("cart_id") String cartId , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @POST ("/service/application/pos/cart/v1.0/address")
    Call<ApplicationModels.SaveAddressResponse> addAddress(@Body ApplicationModels.Address payload);
    
    @GET ("/service/application/pos/cart/v1.0/address/{id}")
    Call<ApplicationModels.Address> getAddressById(@Path("id") String id , @Query("cart_id") String cartId , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @PUT ("/service/application/pos/cart/v1.0/address/{id}")
    Call<ApplicationModels.UpdateAddressResponse> updateAddress(@Path("id") String id ,@Body ApplicationModels.Address payload);
    
    @DELETE ("/service/application/pos/cart/v1.0/address/{id}")
    Call<ApplicationModels.DeleteAddressResponse> removeAddress(@Path("id") String id );
    
    @POST ("/service/application/pos/cart/v1.0/select-address")
    Call<ApplicationModels.CartDetailResponse> selectAddress(@Query("cart_id") String cartId , @Query("i") Boolean i , @Query("b") Boolean b ,@Body ApplicationModels.SelectCartAddressRequest payload);
    
    @PUT ("/service/application/pos/cart/v1.0/payment")
    Call<ApplicationModels.CartDetailResponse> selectPaymentMode(@Query("id") String id ,@Body ApplicationModels.UpdateCartPaymentRequest payload);
    
    @GET ("/service/application/pos/cart/v1.0/payment/validate/")
    Call<ApplicationModels.PaymentCouponValidate> validateCouponForPayment(@Query("id") String id , @Query("address_id") String addressId , @Query("payment_mode") String paymentMode , @Query("payment_identifier") String paymentIdentifier , @Query("aggregator_name") String aggregatorName , @Query("merchant_code") String merchantCode );
    
    @GET ("/service/application/pos/cart/v1.0/shipment")
    Call<ApplicationModels.CartShipmentsResponse> getShipments(@Query("pick_at_store_uid") Integer pickAtStoreUid , @Query("ordering_store_id") Integer orderingStoreId , @Query("p") Boolean p , @Query("id") String id , @Query("address_id") String addressId , @Query("area_code") String areaCode , @Query("order_type") String orderType );
    
    @PUT ("/service/application/pos/cart/v1.0/shipment")
    Call<ApplicationModels.CartShipmentsResponse> updateShipments(@Query("i") Boolean i , @Query("p") Boolean p , @Query("id") String id , @Query("address_id") String addressId , @Query("order_type") String orderType ,@Body ApplicationModels.UpdateCartShipmentRequest payload);
    
    @POST ("/service/application/pos/cart/v1.0/checkout")
    Call<ApplicationModels.CartCheckoutResponse> checkoutCart(@Query("id") String id ,@Body ApplicationModels.CartPosCheckoutDetailRequest payload);
    
    @PUT ("/service/application/pos/cart/v1.0/meta")
    Call<ApplicationModels.CartMetaResponse> updateCartMeta(@Query("id") String id ,@Body ApplicationModels.CartMetaRequest payload);
    
    @GET ("/service/application/pos/cart/v1.0/available-delivery-mode")
    Call<ApplicationModels.CartDeliveryModesResponse> getAvailableDeliveryModes(@Query("area_code") String areaCode , @Query("id") String id );
    
    @GET ("/service/application/pos/cart/v1.0/store-address")
    Call<ApplicationModels.StoreDetailsResponse> getStoreAddressByUid(@Query("store_uid") Integer storeUid );
    
    @POST ("/service/application/pos/cart/v1.0/share-cart")
    Call<ApplicationModels.GetShareCartLinkResponse> getCartShareLink(@Body ApplicationModels.GetShareCartLinkRequest payload);
    
    @GET ("/service/application/pos/cart/v1.0/share-cart/{token}")
    Call<ApplicationModels.SharedCartResponse> getCartSharedItems(@Path("token") String token );
    
    @POST ("/service/application/pos/cart/v1.0/share-cart/{token}/{action}")
    Call<ApplicationModels.SharedCartResponse> updateCartWithSharedItems(@Path("token") String token , @Path("action") String action );
    
}

interface LogisticApiList {
    
    @POST ("/service/application/logistics/v1.0")
    Call<ApplicationModels.GetTatProductResponse> getTatProduct(@Body ApplicationModels.GetTatProductReqBody payload);
    
    @GET ("/service/application/logistics/v1.0/pincode/{pincode}")
    Call<ApplicationModels.GetPincodeCityResponse> getPincodeCity(@Path("pincode") String pincode );
    
}
