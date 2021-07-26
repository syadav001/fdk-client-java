package com.sdk.application;

import com.sdk.common.*;
import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

public class ApplicationService {



@Getter
 public class CatalogService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CatalogApiList catalogApiList;

    CatalogService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.catalogApiList = generateCatalogApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private CatalogApiList generateCatalogApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CatalogApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.ProductDetail getProductDetailBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.ProductDetail> response = catalogApiList.getProductDetailBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductSizes getProductSizesBySlug(String slug , Integer storeId ) throws IOException {
    
        Response<ApplicationModels.ProductSizes> response = catalogApiList.getProductSizesBySlug(slug, storeId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductSizePriceResponse getProductPriceBySlug(String slug , String size , String pincode , Integer storeId ) throws IOException {
    
        Response<ApplicationModels.ProductSizePriceResponse> response = catalogApiList.getProductPriceBySlug(slug, size, pincode, storeId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductSizeSellersResponse getProductSellersBySlug(String slug , String size , String pincode , String strategy , Integer pageNo , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.ProductSizeSellersResponse> response = catalogApiList.getProductSellersBySlug(slug, size, pincode, strategy, pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getProductSellersBySlug
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.ProductSizeSellersResponse> getProductSellersBySlugPagination(
        
        String slug,
        String size,
        String pincode,
        String strategy,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ProductSizeSellersResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ProductSizeSellersResponse callback = this.getProductSellersBySlug(
                
                 slug,
                 size,
                 pincode,
                 strategy,
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
    
    
    public ApplicationModels.ProductsComparisonResponse getProductComparisonBySlugs(List<String> slug ) throws IOException {
    
        Response<ApplicationModels.ProductsComparisonResponse> response = catalogApiList.getProductComparisonBySlugs(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductCompareResponse getSimilarComparisonProductBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.ProductCompareResponse> response = catalogApiList.getSimilarComparisonProductBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductFrequentlyComparedSimilarResponse getComparedFrequentlyProductBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.ProductFrequentlyComparedSimilarResponse> response = catalogApiList.getComparedFrequentlyProductBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SimilarProductByTypeResponse getProductSimilarByIdentifier(String slug , String similarType ) throws IOException {
    
        Response<ApplicationModels.SimilarProductByTypeResponse> response = catalogApiList.getProductSimilarByIdentifier(slug, similarType).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductVariantsResponse getProductVariantsBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.ProductVariantsResponse> response = catalogApiList.getProductVariantsBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductStockStatusResponse getProductStockByIds(String itemId , String alu , String skuCode , String ean , String upc ) throws IOException {
    
        Response<ApplicationModels.ProductStockStatusResponse> response = catalogApiList.getProductStockByIds(itemId, alu, skuCode, ean, upc).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProductStockPolling getProductStockForTimeByIds(String timestamp , Integer pageSize , String pageId ) throws IOException {
    
        Response<ApplicationModels.ProductStockPolling> response = catalogApiList.getProductStockForTimeByIds(timestamp, pageSize, pageId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getProductStockForTimeByIds
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.ProductStockPolling> getProductStockForTimeByIdsPagination(
        
        String timestamp,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ProductStockPolling> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ProductStockPolling callback = this.getProductStockForTimeByIds(
                
                 timestamp,
                 paginator.getPageSize()
                ,
                 paginator.getNextId()
                
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
    
    
    public ApplicationModels.ProductListingResponse getProducts(String q , String f , Boolean filters , String sortOn , String pageId , Integer pageSize , Integer pageNo , String pageType ) throws IOException {
    
        Response<ApplicationModels.ProductListingResponse> response = catalogApiList.getProducts(q, f, filters, sortOn, pageId, pageSize, pageNo, pageType).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.ProductListingResponse> getProductsPagination(
        
        String q,
        String f,
        Boolean filters,
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ProductListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ProductListingResponse callback = this.getProducts(
                
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
    
    
    public ApplicationModels.BrandListingResponse getBrands(String department , Integer pageNo , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.BrandListingResponse> response = catalogApiList.getBrands(department, pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getBrands
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.BrandListingResponse> getBrandsPagination(
        
        String department,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.BrandListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.BrandListingResponse callback = this.getBrands(
                
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
    
    
    public ApplicationModels.BrandDetailResponse getBrandDetailBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.BrandDetailResponse> response = catalogApiList.getBrandDetailBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CategoryListingResponse getCategories(String department ) throws IOException {
    
        Response<ApplicationModels.CategoryListingResponse> response = catalogApiList.getCategories(department).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CategoryMetaResponse getCategoryDetailBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.CategoryMetaResponse> response = catalogApiList.getCategoryDetailBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.HomeListingResponse getHomeProducts(String sortOn , String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.HomeListingResponse> response = catalogApiList.getHomeProducts(sortOn, pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getHomeProducts
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.HomeListingResponse> getHomeProductsPagination(
        
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.HomeListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.HomeListingResponse callback = this.getHomeProducts(
                
                 sortOn,
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
    
    
    public ApplicationModels.DepartmentResponse getDepartments() throws IOException {
    
        Response<ApplicationModels.DepartmentResponse> response = catalogApiList.getDepartments().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AutoCompleteResponse getSearchResults(String q ) throws IOException {
    
        Response<ApplicationModels.AutoCompleteResponse> response = catalogApiList.getSearchResults(q).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetCollectionListingResponse getCollections(Integer pageNo , Integer pageSize , List<String> tag ) throws IOException {
    
        Response<ApplicationModels.GetCollectionListingResponse> response = catalogApiList.getCollections(pageNo, pageSize, tag).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getCollections
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.GetCollectionListingResponse> getCollectionsPagination(
        
        Integer pageSize,
        List<String> tag
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.GetCollectionListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.GetCollectionListingResponse callback = this.getCollections(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 tag
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
    
    
    public ApplicationModels.ProductListingResponse getCollectionItemsBySlug(String slug , String f , Boolean filters , String sortOn , String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.ProductListingResponse> response = catalogApiList.getCollectionItemsBySlug(slug, f, filters, sortOn, pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getCollectionItemsBySlug
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.ProductListingResponse> getCollectionItemsBySlugPagination(
        
        String slug,
        String f,
        Boolean filters,
        String sortOn,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ProductListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ProductListingResponse callback = this.getCollectionItemsBySlug(
                
                 slug,
                 f,
                 filters,
                 sortOn,
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
    
    
    public ApplicationModels.CollectionDetailResponse getCollectionDetailBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.CollectionDetailResponse> response = catalogApiList.getCollectionDetailBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetFollowListingResponse getFollowedListing(String collectionType , String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.GetFollowListingResponse> response = catalogApiList.getFollowedListing(collectionType, pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getFollowedListing
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.GetFollowListingResponse> getFollowedListingPagination(
        
        String collectionType,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.GetFollowListingResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.GetFollowListingResponse callback = this.getFollowedListing(
                
                 collectionType,
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
    
    
    public ApplicationModels.FollowPostResponse followById(String collectionType , String collectionId ) throws IOException {
    
        Response<ApplicationModels.FollowPostResponse> response = catalogApiList.followById(collectionType, collectionId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.FollowPostResponse unfollowById(String collectionType , String collectionId ) throws IOException {
    
        Response<ApplicationModels.FollowPostResponse> response = catalogApiList.unfollowById(collectionType, collectionId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.FollowerCountResponse getFollowerCountById(String collectionType , String collectionId ) throws IOException {
    
        Response<ApplicationModels.FollowerCountResponse> response = catalogApiList.getFollowerCountById(collectionType, collectionId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.FollowIdsResponse getFollowIds(String collectionType ) throws IOException {
    
        Response<ApplicationModels.FollowIdsResponse> response = catalogApiList.getFollowIds(collectionType).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.StoreListingResponse getStores(Integer pageNo , Integer pageSize , String q , Integer range , Double latitude , Double longitude ) throws IOException {
    
        Response<ApplicationModels.StoreListingResponse> response = catalogApiList.getStores(pageNo, pageSize, q, range, latitude, longitude).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getStores
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.StoreListingResponse> getStoresPagination(
        
        Integer pageSize,
        String q,
        Integer range,
        Double latitude,
        Double longitude
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.StoreListingResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.StoreListingResponse callback = this.getStores(
                
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 q,
                 range,
                 latitude,
                 longitude
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



@Getter
 public class CartService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CartApiList cartApiList;

    CartService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.cartApiList = generateCartApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private CartApiList generateCartApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CartApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.CartResponse getCart(Integer uid , Boolean i , Boolean b , Integer assignCardId ) throws IOException {
    
        Response<ApplicationModels.CartResponse> response = cartApiList.getCart(uid, i, b, assignCardId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object getCartLastModified(Integer uid ) throws IOException {
    
        Response<Object> response = cartApiList.getCartLastModified(uid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AddCartResponse addItems(Boolean i , Boolean b ,ApplicationModels.AddCartRequest body) throws IOException {
    
        Response<ApplicationModels.AddCartResponse> response = cartApiList.addItems(i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateCartResponse updateCart(Integer uid , Boolean i , Boolean b ,ApplicationModels.UpdateCartRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateCartResponse> response = cartApiList.updateCart(uid, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartItemCountResponse getItemCount(Integer uid ) throws IOException {
    
        Response<ApplicationModels.CartItemCountResponse> response = cartApiList.getItemCount(uid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetCouponResponse getCoupons(Integer uid ) throws IOException {
    
        Response<ApplicationModels.GetCouponResponse> response = cartApiList.getCoupons(uid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object applyCoupon(Boolean i , Boolean b , Boolean p , Integer uid ,ApplicationModels.ApplyCouponRequest body) throws IOException {
    
        Response<Object> response = cartApiList.applyCoupon(i, b, p, uid, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartResponse removeCoupon(Integer uid ) throws IOException {
    
        Response<ApplicationModels.CartResponse> response = cartApiList.removeCoupon(uid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.BulkPriceResponse getBulkDiscountOffers(Integer itemId , String articleId , Integer uid , String slug ) throws IOException {
    
        Response<ApplicationModels.BulkPriceResponse> response = cartApiList.getBulkDiscountOffers(itemId, articleId, uid, slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartResponse applyRewardPoints(Integer uid , Boolean i , Boolean b ,ApplicationModels.RewardPointRequest body) throws IOException {
    
        Response<ApplicationModels.CartResponse> response = cartApiList.applyRewardPoints(uid, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetAddressesResponse getAddresses(Integer uid , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
    
        Response<ApplicationModels.GetAddressesResponse> response = cartApiList.getAddresses(uid, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SaveAddressResponse addAddress(ApplicationModels.Address body) throws IOException {
    
        Response<ApplicationModels.SaveAddressResponse> response = cartApiList.addAddress( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Address getAddressById(Integer id , Integer uid , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
    
        Response<ApplicationModels.Address> response = cartApiList.getAddressById(id, uid, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object updateAddress(Integer id ,ApplicationModels.Address body) throws IOException {
    
        Response<Object> response = cartApiList.updateAddress(id, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object removeAddress(Integer id ) throws IOException {
    
        Response<Object> response = cartApiList.removeAddress(id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object selectAddress(Integer uid , Boolean i , Boolean b ,ApplicationModels.SelectCartAddressRequest body) throws IOException {
    
        Response<Object> response = cartApiList.selectAddress(uid, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartResponse selectPaymentMode(String uid ,ApplicationModels.UpdateCartPaymentRequest body) throws IOException {
    
        Response<ApplicationModels.CartResponse> response = cartApiList.selectPaymentMode(uid, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentCouponValidate validateCouponForPayment(String uid , String addressId , String paymentMode , String paymentIdentifier , String aggregatorName , String merchantCode ) throws IOException {
    
        Response<ApplicationModels.PaymentCouponValidate> response = cartApiList.validateCouponForPayment(uid, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartShipmentsResponse getShipments(Boolean p , Integer uid , Integer addressId , String areaCode ) throws IOException {
    
        Response<ApplicationModels.CartShipmentsResponse> response = cartApiList.getShipments(p, uid, addressId, areaCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartCheckoutResponse checkoutCart(ApplicationModels.CartCheckoutRequest body) throws IOException {
    
        Response<ApplicationModels.CartCheckoutResponse> response = cartApiList.checkoutCart( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartMetaResponse updateCartMeta(Integer uid ,ApplicationModels.CartMetaRequest body) throws IOException {
    
        Response<ApplicationModels.CartMetaResponse> response = cartApiList.updateCartMeta(uid, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetShareCartLinkResponse getCartShareLink(ApplicationModels.GetShareCartLinkRequest body) throws IOException {
    
        Response<ApplicationModels.GetShareCartLinkResponse> response = cartApiList.getCartShareLink( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SharedCartResponse getCartSharedItems(String token ) throws IOException {
    
        Response<ApplicationModels.SharedCartResponse> response = cartApiList.getCartSharedItems(token).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SharedCartResponse updateCartWithSharedItems(String token , String action ) throws IOException {
    
        Response<ApplicationModels.SharedCartResponse> response = cartApiList.updateCartWithSharedItems(token, action).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class CommonService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CommonApiList commonApiList;

    CommonService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.commonApiList = generateCommonApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private CommonApiList generateCommonApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CommonApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.Locations getLocations(String locationType , String id ) throws IOException {
    
        Response<ApplicationModels.Locations> response = commonApiList.getLocations(locationType, id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class LeadService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private LeadApiList leadApiList;

    LeadService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.leadApiList = generateLeadApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private LeadApiList generateLeadApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),LeadApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.Ticket getTicket(String id ) throws IOException {
    
        Response<ApplicationModels.Ticket> response = leadApiList.getTicket(id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.TicketHistory createHistory(String id ,ApplicationModels.TicketHistoryPayload body) throws IOException {
    
        Response<ApplicationModels.TicketHistory> response = leadApiList.createHistory(id, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Ticket createTicket(ApplicationModels.AddTicketPayload body) throws IOException {
    
        Response<ApplicationModels.Ticket> response = leadApiList.createTicket( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CustomForm getCustomForm(String slug ) throws IOException {
    
        Response<ApplicationModels.CustomForm> response = leadApiList.getCustomForm(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SubmitCustomFormResponse submitCustomForm(String slug ,ApplicationModels.CustomFormSubmissionPayload body) throws IOException {
    
        Response<ApplicationModels.SubmitCustomFormResponse> response = leadApiList.submitCustomForm(slug, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetParticipantsInsideVideoRoomResponse getParticipantsInsideVideoRoom(String uniqueName ) throws IOException {
    
        Response<ApplicationModels.GetParticipantsInsideVideoRoomResponse> response = leadApiList.getParticipantsInsideVideoRoom(uniqueName).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetTokenForVideoRoomResponse getTokenForVideoRoom(String uniqueName ) throws IOException {
    
        Response<ApplicationModels.GetTokenForVideoRoomResponse> response = leadApiList.getTokenForVideoRoom(uniqueName).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class ThemeService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ThemeApiList themeApiList;

    ThemeService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.themeApiList = generateThemeApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private ThemeApiList generateThemeApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ThemeApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.AllAvailablePageSchema getAllPages(String themeId ) throws IOException {
    
        Response<ApplicationModels.AllAvailablePageSchema> response = themeApiList.getAllPages(themeId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AvailablePageSchema getPage(String themeId , String pageValue ) throws IOException {
    
        Response<ApplicationModels.AvailablePageSchema> response = themeApiList.getPage(themeId, pageValue).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ThemesSchema getAppliedTheme() throws IOException {
    
        Response<ApplicationModels.ThemesSchema> response = themeApiList.getAppliedTheme().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ThemesSchema getThemeForPreview(String themeId ) throws IOException {
    
        Response<ApplicationModels.ThemesSchema> response = themeApiList.getThemeForPreview(themeId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class UserService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private UserApiList userApiList;

    UserService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.userApiList = generateUserApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private UserApiList generateUserApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),UserApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.AuthSuccess loginWithFacebook(ApplicationModels.OAuthRequestSchema body) throws IOException {
    
        Response<ApplicationModels.AuthSuccess> response = userApiList.loginWithFacebook( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AuthSuccess loginWithGoogle(ApplicationModels.OAuthRequestSchema body) throws IOException {
    
        Response<ApplicationModels.AuthSuccess> response = userApiList.loginWithGoogle( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AuthSuccess loginWithGoogleAndroid(ApplicationModels.OAuthRequestSchema body) throws IOException {
    
        Response<ApplicationModels.AuthSuccess> response = userApiList.loginWithGoogleAndroid( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AuthSuccess loginWithGoogleIOS(ApplicationModels.OAuthRequestSchema body) throws IOException {
    
        Response<ApplicationModels.AuthSuccess> response = userApiList.loginWithGoogleIOS( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SendOtpResponse loginWithOTP(String platform ,ApplicationModels.SendOtpRequestSchema body) throws IOException {
    
        Response<ApplicationModels.SendOtpResponse> response = userApiList.loginWithOTP(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess loginWithEmailAndPassword(ApplicationModels.PasswordLoginRequestSchema body) throws IOException {
    
        Response<ApplicationModels.LoginSuccess> response = userApiList.loginWithEmailAndPassword( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResetPasswordSuccess sendResetPasswordEmail(String platform ,ApplicationModels.SendResetPasswordEmailRequestSchema body) throws IOException {
    
        Response<ApplicationModels.ResetPasswordSuccess> response = userApiList.sendResetPasswordEmail(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess forgotPassword(ApplicationModels.ForgotPasswordRequestSchema body) throws IOException {
    
        Response<ApplicationModels.LoginSuccess> response = userApiList.forgotPassword( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ResetPasswordSuccess sendResetToken(ApplicationModels.CodeRequestBodySchema body) throws IOException {
    
        Response<ApplicationModels.ResetPasswordSuccess> response = userApiList.sendResetToken( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess loginWithToken(ApplicationModels.TokenRequestBodySchema body) throws IOException {
    
        Response<ApplicationModels.LoginSuccess> response = userApiList.loginWithToken( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RegisterFormSuccess registerWithForm(String platform ,ApplicationModels.FormRegisterRequestSchema body) throws IOException {
    
        Response<ApplicationModels.RegisterFormSuccess> response = userApiList.registerWithForm(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyEmailSuccess verifyEmail(ApplicationModels.CodeRequestBodySchema body) throws IOException {
    
        Response<ApplicationModels.VerifyEmailSuccess> response = userApiList.verifyEmail( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyEmailSuccess verifyMobile(ApplicationModels.CodeRequestBodySchema body) throws IOException {
    
        Response<ApplicationModels.VerifyEmailSuccess> response = userApiList.verifyMobile( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.HasPasswordSuccess hasPassword() throws IOException {
    
        Response<ApplicationModels.HasPasswordSuccess> response = userApiList.hasPassword().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyEmailSuccess updatePassword(ApplicationModels.UpdatePasswordRequestSchema body) throws IOException {
    
        Response<ApplicationModels.VerifyEmailSuccess> response = userApiList.updatePassword( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LogoutSuccess logout() throws IOException {
    
        Response<ApplicationModels.LogoutSuccess> response = userApiList.logout().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OtpSuccess sendOTPOnMobile(String platform ,ApplicationModels.SendMobileOtpRequestSchema body) throws IOException {
    
        Response<ApplicationModels.OtpSuccess> response = userApiList.sendOTPOnMobile(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyOtpSuccess verifyMobileOTP(String platform ,ApplicationModels.VerifyOtpRequestSchema body) throws IOException {
    
        Response<ApplicationModels.VerifyOtpSuccess> response = userApiList.verifyMobileOTP(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.EmailOtpSuccess sendOTPOnEmail(String platform ,ApplicationModels.SendEmailOtpRequestSchema body) throws IOException {
    
        Response<ApplicationModels.EmailOtpSuccess> response = userApiList.sendOTPOnEmail(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyOtpSuccess verifyEmailOTP(String platform ,ApplicationModels.VerifyEmailOtpRequestSchema body) throws IOException {
    
        Response<ApplicationModels.VerifyOtpSuccess> response = userApiList.verifyEmailOTP(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UserObjectSchema getLoggedInUser() throws IOException {
    
        Response<ApplicationModels.UserObjectSchema> response = userApiList.getLoggedInUser().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SessionListSuccess getListOfActiveSessions() throws IOException {
    
        Response<ApplicationModels.SessionListSuccess> response = userApiList.getListOfActiveSessions().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PlatformSchema getPlatformConfig(String name ) throws IOException {
    
        Response<ApplicationModels.PlatformSchema> response = userApiList.getPlatformConfig(name).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ProfileEditSuccess updateProfile(String platform ,ApplicationModels.EditProfileRequestSchema body) throws IOException {
    
        Response<ApplicationModels.ProfileEditSuccess> response = userApiList.updateProfile(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyMobileOTPSuccess addMobileNumber(String platform ,ApplicationModels.EditMobileRequestSchema body) throws IOException {
    
        Response<ApplicationModels.VerifyMobileOTPSuccess> response = userApiList.addMobileNumber(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess deleteMobileNumber(String platform , Boolean active , Boolean primary , Boolean verified , String countryCode , String phone ) throws IOException {
    
        Response<ApplicationModels.LoginSuccess> response = userApiList.deleteMobileNumber(platform, active, primary, verified, countryCode, phone).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess setMobileNumberAsPrimary(ApplicationModels.SendVerificationLinkMobileRequestSchema body) throws IOException {
    
        Response<ApplicationModels.LoginSuccess> response = userApiList.setMobileNumberAsPrimary( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SendMobileVerifyLinkSuccess sendVerificationLinkToMobile(String platform ,ApplicationModels.SendVerificationLinkMobileRequestSchema body) throws IOException {
    
        Response<ApplicationModels.SendMobileVerifyLinkSuccess> response = userApiList.sendVerificationLinkToMobile(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.VerifyEmailOTPSuccess addEmail(String platform ,ApplicationModels.EditEmailRequestSchema body) throws IOException {
    
        Response<ApplicationModels.VerifyEmailOTPSuccess> response = userApiList.addEmail(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess deleteEmail(String platform , Boolean active , Boolean primary , Boolean verified , String email ) throws IOException {
    
        Response<ApplicationModels.LoginSuccess> response = userApiList.deleteEmail(platform, active, primary, verified, email).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LoginSuccess setEmailAsPrimary(ApplicationModels.EditEmailRequestSchema body) throws IOException {
    
        Response<ApplicationModels.LoginSuccess> response = userApiList.setEmailAsPrimary( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SendEmailVerifyLinkSuccess sendVerificationLinkToEmail(String platform ,ApplicationModels.EditEmailRequestSchema body) throws IOException {
    
        Response<ApplicationModels.SendEmailVerifyLinkSuccess> response = userApiList.sendVerificationLinkToEmail(platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class ContentService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ContentApiList contentApiList;

    ContentService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.contentApiList = generateContentApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private ContentApiList generateContentApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ContentApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.AnnouncementsResponseSchema getAnnouncements() throws IOException {
    
        Response<ApplicationModels.AnnouncementsResponseSchema> response = contentApiList.getAnnouncements().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.BlogSchema getBlog(String slug , String rootId ) throws IOException {
    
        Response<ApplicationModels.BlogSchema> response = contentApiList.getBlog(slug, rootId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.BlogGetResponse getBlogs(Integer pageNo , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.BlogGetResponse> response = contentApiList.getBlogs(pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getBlogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.BlogGetResponse> getBlogsPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.BlogGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.BlogGetResponse callback = this.getBlogs(
                
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
    
    
    public ApplicationModels.FaqResponseSchema getFaqs() throws IOException {
    
        Response<ApplicationModels.FaqResponseSchema> response = contentApiList.getFaqs().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetFaqCategoriesSchema getFaqCategories() throws IOException {
    
        Response<ApplicationModels.GetFaqCategoriesSchema> response = contentApiList.getFaqCategories().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.FaqSchema getFaqBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.FaqSchema> response = contentApiList.getFaqBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetFaqCategoryBySlugSchema getFaqCategoryBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.GetFaqCategoryBySlugSchema> response = contentApiList.getFaqCategoryBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetFaqSchema getFaqsByCategorySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.GetFaqSchema> response = contentApiList.getFaqsByCategorySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LandingPageSchema getLandingPage() throws IOException {
    
        Response<ApplicationModels.LandingPageSchema> response = contentApiList.getLandingPage().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ApplicationLegal getLegalInformation() throws IOException {
    
        Response<ApplicationModels.ApplicationLegal> response = contentApiList.getLegalInformation().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.NavigationGetResponse getNavigations(Integer pageNo , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.NavigationGetResponse> response = contentApiList.getNavigations(pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getNavigations
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.NavigationGetResponse> getNavigationsPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.NavigationGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.NavigationGetResponse callback = this.getNavigations(
                
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
    
    
    public ApplicationModels.CustomPageSchema getPage(String slug , String rootId ) throws IOException {
    
        Response<ApplicationModels.CustomPageSchema> response = contentApiList.getPage(slug, rootId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PageGetResponse getPages(Integer pageNo , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.PageGetResponse> response = contentApiList.getPages(pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getPages
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.PageGetResponse> getPagesPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.PageGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.PageGetResponse callback = this.getPages(
                
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
    
    
    public ApplicationModels.SeoComponent getSEOConfiguration() throws IOException {
    
        Response<ApplicationModels.SeoComponent> response = contentApiList.getSEOConfiguration().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SlideshowGetResponse getSlideshows(Integer pageNo , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.SlideshowGetResponse> response = contentApiList.getSlideshows(pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSlideshows
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.SlideshowGetResponse> getSlideshowsPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.SlideshowGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.SlideshowGetResponse callback = this.getSlideshows(
                
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
    
    
    public ApplicationModels.SlideshowSchema getSlideshow(String slug ) throws IOException {
    
        Response<ApplicationModels.SlideshowSchema> response = contentApiList.getSlideshow(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Support getSupportInformation() throws IOException {
    
        Response<ApplicationModels.Support> response = contentApiList.getSupportInformation().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.TagsSchema getTags() throws IOException {
    
        Response<ApplicationModels.TagsSchema> response = contentApiList.getTags().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class CommunicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CommunicationApiList communicationApiList;

    CommunicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.communicationApiList = generateCommunicationApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private CommunicationApiList generateCommunicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),CommunicationApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.CommunicationConsent getCommunicationConsent() throws IOException {
    
        Response<ApplicationModels.CommunicationConsent> response = communicationApiList.getCommunicationConsent().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CommunicationConsentRes upsertCommunicationConsent(ApplicationModels.CommunicationConsentReq body) throws IOException {
    
        Response<ApplicationModels.CommunicationConsentRes> response = communicationApiList.upsertCommunicationConsent( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PushtokenRes upsertAppPushtoken(ApplicationModels.PushtokenReq body) throws IOException {
    
        Response<ApplicationModels.PushtokenRes> response = communicationApiList.upsertAppPushtoken( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class ShareService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ShareApiList shareApiList;

    ShareService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.shareApiList = generateShareApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private ShareApiList generateShareApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ShareApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.QRCodeResp getApplicationQRCode() throws IOException {
    
        Response<ApplicationModels.QRCodeResp> response = shareApiList.getApplicationQRCode().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.QRCodeResp getProductQRCodeBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.QRCodeResp> response = shareApiList.getProductQRCodeBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.QRCodeResp getCollectionQRCodeBySlug(String slug ) throws IOException {
    
        Response<ApplicationModels.QRCodeResp> response = shareApiList.getCollectionQRCodeBySlug(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.QRCodeResp getUrlQRCode(String url ) throws IOException {
    
        Response<ApplicationModels.QRCodeResp> response = shareApiList.getUrlQRCode(url).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShortLinkRes createShortLink(ApplicationModels.ShortLinkReq body) throws IOException {
    
        Response<ApplicationModels.ShortLinkRes> response = shareApiList.createShortLink( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShortLinkRes getShortLinkByHash(String hash ) throws IOException {
    
        Response<ApplicationModels.ShortLinkRes> response = shareApiList.getShortLinkByHash(hash).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShortLinkRes getOriginalShortLinkByHash(String hash ) throws IOException {
    
        Response<ApplicationModels.ShortLinkRes> response = shareApiList.getOriginalShortLinkByHash(hash).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
public class FileStorageService extends FileStorage { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private FileStorageApiList filestorageApiList;

    FileStorageService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.filestorageApiList = generateFilestorageApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private FileStorageApiList generateFilestorageApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),FileStorageApiList.class, interceptorList, cookieStore);
    }

    
    public ApplicationModels.CompleteResponse uploadMedia(String fileName, String contentType, int size, String namespace, File file) {
        return super.uploadMedia(fileName, contentType, size, namespace, file, this);
    }
    

    
    
    public ApplicationModels.StartResponse startUpload(String namespace ,ApplicationModels.StartRequest body) throws IOException {
    
        Response<ApplicationModels.StartResponse> response = filestorageApiList.startUpload(namespace, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CompleteResponse completeUpload(String namespace ,ApplicationModels.StartResponse body) throws IOException {
    
        Response<ApplicationModels.CompleteResponse> response = filestorageApiList.completeUpload(namespace, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class ConfigurationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ConfigurationApiList configurationApiList;

    ConfigurationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.configurationApiList = generateConfigurationApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private ConfigurationApiList generateConfigurationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ConfigurationApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.Application getApplication() throws IOException {
    
        Response<ApplicationModels.Application> response = configurationApiList.getApplication().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ApplicationAboutResponse getOwnerInfo() throws IOException {
    
        Response<ApplicationModels.ApplicationAboutResponse> response = configurationApiList.getOwnerInfo().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ApplicationDetail getBasicDetails() throws IOException {
    
        Response<ApplicationModels.ApplicationDetail> response = configurationApiList.getBasicDetails().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AppTokenResponse getIntegrationTokens() throws IOException {
    
        Response<ApplicationModels.AppTokenResponse> response = configurationApiList.getIntegrationTokens().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderingStores getOrderingStores(Integer pageNo , Integer pageSize , String q ) throws IOException {
    
        Response<ApplicationModels.OrderingStores> response = configurationApiList.getOrderingStores(pageNo, pageSize, q).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getOrderingStores
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.OrderingStores> getOrderingStoresPagination(
        
        Integer pageSize,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.OrderingStores> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.OrderingStores callback = this.getOrderingStores(
                
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
    
    
    public ApplicationModels.AppFeatureResponse getFeatures() throws IOException {
    
        Response<ApplicationModels.AppFeatureResponse> response = configurationApiList.getFeatures().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ApplicationInformation getContactInfo() throws IOException {
    
        Response<ApplicationModels.ApplicationInformation> response = configurationApiList.getContactInfo().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CurrenciesResponse getCurrencies() throws IOException {
    
        Response<ApplicationModels.CurrenciesResponse> response = configurationApiList.getCurrencies().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Currency getCurrencyById(String id ) throws IOException {
    
        Response<ApplicationModels.Currency> response = configurationApiList.getCurrencyById(id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.LanguageResponse getLanguages() throws IOException {
    
        Response<ApplicationModels.LanguageResponse> response = configurationApiList.getLanguages().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SuccessMessageResponse getOrderingStoreCookie(ApplicationModels.OrderingStoreSelectRequest body) throws IOException {
    
        Response<ApplicationModels.SuccessMessageResponse> response = configurationApiList.getOrderingStoreCookie( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SuccessMessageResponse removeOrderingStoreCookie() throws IOException {
    
        Response<ApplicationModels.SuccessMessageResponse> response = configurationApiList.removeOrderingStoreCookie().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AppStaffResponse getAppStaffs(Boolean orderIncent , Integer orderingStore , String user ) throws IOException {
    
        Response<ApplicationModels.AppStaffResponse> response = configurationApiList.getAppStaffs(orderIncent, orderingStore, user).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class PaymentService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private PaymentApiList paymentApiList;

    PaymentService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.paymentApiList = generatePaymentApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private PaymentApiList generatePaymentApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),PaymentApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.AggregatorsConfigDetailResponse getAggregatorsConfig(String xApiToken , Boolean refresh ) throws IOException {
    
        Response<ApplicationModels.AggregatorsConfigDetailResponse> response = paymentApiList.getAggregatorsConfig(xApiToken, refresh).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AttachCardsResponse attachCardToCustomer(ApplicationModels.AttachCardRequest body) throws IOException {
    
        Response<ApplicationModels.AttachCardsResponse> response = paymentApiList.attachCardToCustomer( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ActiveCardPaymentGatewayResponse getActiveCardAggregator(Boolean refresh ) throws IOException {
    
        Response<ApplicationModels.ActiveCardPaymentGatewayResponse> response = paymentApiList.getActiveCardAggregator(refresh).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ListCardsResponse getActiveUserCards(Boolean forceRefresh ) throws IOException {
    
        Response<ApplicationModels.ListCardsResponse> response = paymentApiList.getActiveUserCards(forceRefresh).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.DeleteCardsResponse deleteUserCard(ApplicationModels.DeletehCardRequest body) throws IOException {
    
        Response<ApplicationModels.DeleteCardsResponse> response = paymentApiList.deleteUserCard( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ValidateCustomerResponse verifyCustomerForPayment(ApplicationModels.ValidateCustomerRequest body) throws IOException {
    
        Response<ApplicationModels.ValidateCustomerResponse> response = paymentApiList.verifyCustomerForPayment( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ChargeCustomerResponse verifyAndChargePayment(ApplicationModels.ChargeCustomerRequest body) throws IOException {
    
        Response<ApplicationModels.ChargeCustomerResponse> response = paymentApiList.verifyAndChargePayment( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentInitializationResponse initialisePayment(ApplicationModels.PaymentInitializationRequest body) throws IOException {
    
        Response<ApplicationModels.PaymentInitializationResponse> response = paymentApiList.initialisePayment( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentStatusUpdateResponse checkAndUpdatePaymentStatus(ApplicationModels.PaymentStatusUpdateRequest body) throws IOException {
    
        Response<ApplicationModels.PaymentStatusUpdateResponse> response = paymentApiList.checkAndUpdatePaymentStatus( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentModeRouteResponse getPaymentModeRoutes(Integer amount , String cartId , String pincode , String checkoutMode , Boolean refresh , String assignCardId , String userDetails ) throws IOException {
    
        Response<ApplicationModels.PaymentModeRouteResponse> response = paymentApiList.getPaymentModeRoutes(amount, cartId, pincode, checkoutMode, refresh, assignCardId, userDetails).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentModeRouteResponse getPosPaymentModeRoutes(Integer amount , String cartId , String pincode , String checkoutMode , Boolean refresh , String assignCardId , String orderType , String userDetails ) throws IOException {
    
        Response<ApplicationModels.PaymentModeRouteResponse> response = paymentApiList.getPosPaymentModeRoutes(amount, cartId, pincode, checkoutMode, refresh, assignCardId, orderType, userDetails).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RupifiBannerResponse getRupifiBannerDetails() throws IOException {
    
        Response<ApplicationModels.RupifiBannerResponse> response = paymentApiList.getRupifiBannerDetails().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.TransferModeResponse getActiveRefundTransferModes() throws IOException {
    
        Response<ApplicationModels.TransferModeResponse> response = paymentApiList.getActiveRefundTransferModes().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateRefundTransferModeResponse enableOrDisableRefundTransferMode(ApplicationModels.UpdateRefundTransferModeRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateRefundTransferModeResponse> response = paymentApiList.enableOrDisableRefundTransferMode( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderBeneficiaryResponse getUserBeneficiariesDetail(String orderId ) throws IOException {
    
        Response<ApplicationModels.OrderBeneficiaryResponse> response = paymentApiList.getUserBeneficiariesDetail(orderId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.IfscCodeResponse verifyIfscCode(String ifscCode ) throws IOException {
    
        Response<ApplicationModels.IfscCodeResponse> response = paymentApiList.verifyIfscCode(ifscCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderBeneficiaryResponse getOrderBeneficiariesDetail(String orderId ) throws IOException {
    
        Response<ApplicationModels.OrderBeneficiaryResponse> response = paymentApiList.getOrderBeneficiariesDetail(orderId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AddBeneficiaryViaOtpVerificationResponse verifyOtpAndAddBeneficiaryForBank(ApplicationModels.AddBeneficiaryViaOtpVerificationRequest body) throws IOException {
    
        Response<ApplicationModels.AddBeneficiaryViaOtpVerificationResponse> response = paymentApiList.verifyOtpAndAddBeneficiaryForBank( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RefundAccountResponse addBeneficiaryDetails(ApplicationModels.AddBeneficiaryDetailsRequest body) throws IOException {
    
        Response<ApplicationModels.RefundAccountResponse> response = paymentApiList.addBeneficiaryDetails( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.WalletOtpResponse verifyOtpAndAddBeneficiaryForWallet(ApplicationModels.WalletOtpRequest body) throws IOException {
    
        Response<ApplicationModels.WalletOtpResponse> response = paymentApiList.verifyOtpAndAddBeneficiaryForWallet( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SetDefaultBeneficiaryResponse updateDefaultBeneficiary(ApplicationModels.SetDefaultBeneficiaryRequest body) throws IOException {
    
        Response<ApplicationModels.SetDefaultBeneficiaryResponse> response = paymentApiList.updateDefaultBeneficiary( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class OrderService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private OrderApiList orderApiList;

    OrderService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.orderApiList = generateOrderApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private OrderApiList generateOrderApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),OrderApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.OrderList getOrders(Integer pageNo , Integer pageSize , String fromDate , String toDate , Integer status ) throws IOException {
    
        Response<ApplicationModels.OrderList> response = orderApiList.getOrders(pageNo, pageSize, fromDate, toDate, status).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderById getOrderById(String orderId ) throws IOException {
    
        Response<ApplicationModels.OrderById> response = orderApiList.getOrderById(orderId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShipmentById getShipmentById(String shipmentId ) throws IOException {
    
        Response<ApplicationModels.ShipmentById> response = orderApiList.getShipmentById(shipmentId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShipmentReasons getShipmentReasons(String shipmentId ) throws IOException {
    
        Response<ApplicationModels.ShipmentReasons> response = orderApiList.getShipmentReasons(shipmentId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShipmentStatusUpdate updateShipmentStatus(String shipmentId ,ApplicationModels.ShipmentStatusUpdateBody body) throws IOException {
    
        Response<ApplicationModels.ShipmentStatusUpdate> response = orderApiList.updateShipmentStatus(shipmentId, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ShipmentTrack trackShipment(String shipmentId ) throws IOException {
    
        Response<ApplicationModels.ShipmentTrack> response = orderApiList.trackShipment(shipmentId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PosOrderById getPosOrderById(String orderId ) throws IOException {
    
        Response<ApplicationModels.PosOrderById> response = orderApiList.getPosOrderById(orderId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class RewardsService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private RewardsApiList rewardsApiList;

    RewardsService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.rewardsApiList = generateRewardsApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private RewardsApiList generateRewardsApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),RewardsApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.CatalogueOrderResponse getPointsOnProduct(ApplicationModels.CatalogueOrderRequest body) throws IOException {
    
        Response<ApplicationModels.CatalogueOrderResponse> response = rewardsApiList.getPointsOnProduct( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Offer getOfferByName(String name ) throws IOException {
    
        Response<ApplicationModels.Offer> response = rewardsApiList.getOfferByName(name).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.OrderDiscountResponse getOrderDiscount(ApplicationModels.OrderDiscountRequest body) throws IOException {
    
        Response<ApplicationModels.OrderDiscountResponse> response = rewardsApiList.getOrderDiscount( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PointsResponse getUserPoints() throws IOException {
    
        Response<ApplicationModels.PointsResponse> response = rewardsApiList.getUserPoints().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PointsHistoryResponse getUserPointsHistory(String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.PointsHistoryResponse> response = rewardsApiList.getUserPointsHistory(pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getUserPointsHistory
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.PointsHistoryResponse> getUserPointsHistoryPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.PointsHistoryResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.PointsHistoryResponse callback = this.getUserPointsHistory(
                
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
    
    
    public ApplicationModels.ReferralDetailsResponse getUserReferralDetails() throws IOException {
    
        Response<ApplicationModels.ReferralDetailsResponse> response = rewardsApiList.getUserReferralDetails().execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.RedeemReferralCodeResponse redeemReferralCode(ApplicationModels.RedeemReferralCodeRequest body) throws IOException {
    
        Response<ApplicationModels.RedeemReferralCodeResponse> response = rewardsApiList.redeemReferralCode( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class FeedbackService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private FeedbackApiList feedbackApiList;

    FeedbackService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.feedbackApiList = generateFeedbackApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private FeedbackApiList generateFeedbackApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),FeedbackApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.InsertResponse createAbuseReport(ApplicationModels.ReportAbuseRequest body) throws IOException {
    
        Response<ApplicationModels.InsertResponse> response = feedbackApiList.createAbuseReport( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateResponse updateAbuseReport(ApplicationModels.UpdateAbuseStatusRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateResponse> response = feedbackApiList.updateAbuseReport( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ReportAbuseGetResponse getAbuseReports(String entityId , String entityType , String id , String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.ReportAbuseGetResponse> response = feedbackApiList.getAbuseReports(entityId, entityType, id, pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAbuseReports
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.ReportAbuseGetResponse> getAbuseReportsPagination(
        
        String entityId,
        String entityType,
        String id,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ReportAbuseGetResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ReportAbuseGetResponse callback = this.getAbuseReports(
                
                 entityId,
                 entityType,
                 id,
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
    
    
    public ApplicationModels.AttributeResponse getAttributes(Integer pageNo , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.AttributeResponse> response = feedbackApiList.getAttributes(pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAttributes
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.AttributeResponse> getAttributesPagination(
        
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.AttributeResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.AttributeResponse callback = this.getAttributes(
                
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
    
    
    public ApplicationModels.InsertResponse createAttribute(ApplicationModels.SaveAttributeRequest body) throws IOException {
    
        Response<ApplicationModels.InsertResponse> response = feedbackApiList.createAttribute( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Attribute getAttribute(String slug ) throws IOException {
    
        Response<ApplicationModels.Attribute> response = feedbackApiList.getAttribute(slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateResponse updateAttribute(String slug ,ApplicationModels.UpdateAttributeRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateResponse> response = feedbackApiList.updateAttribute(slug, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.InsertResponse createComment(ApplicationModels.CommentRequest body) throws IOException {
    
        Response<ApplicationModels.InsertResponse> response = feedbackApiList.createComment( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateResponse updateComment(ApplicationModels.UpdateCommentRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateResponse> response = feedbackApiList.updateComment( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CommentGetResponse getComments(String entityType , String id , String entityId , String userId , String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.CommentGetResponse> response = feedbackApiList.getComments(entityType, id, entityId, userId, pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getComments
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.CommentGetResponse> getCommentsPagination(
        
        String entityType,
        String id,
        String entityId,
        String userId,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.CommentGetResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.CommentGetResponse callback = this.getComments(
                
                 entityType,
                 id,
                 entityId,
                 userId,
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
    
    
    public ApplicationModels.CheckEligibilityResponse checkEligibility(String entityType , String entityId ) throws IOException {
    
        Response<ApplicationModels.CheckEligibilityResponse> response = feedbackApiList.checkEligibility(entityType, entityId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateResponse deleteMedia(List<String> ids ) throws IOException {
    
        Response<ApplicationModels.UpdateResponse> response = feedbackApiList.deleteMedia(ids).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.InsertResponse createMedia(ApplicationModels.AddMediaListRequest body) throws IOException {
    
        Response<ApplicationModels.InsertResponse> response = feedbackApiList.createMedia( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateResponse updateMedia(ApplicationModels.UpdateMediaListRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateResponse> response = feedbackApiList.updateMedia( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.MediaGetResponse getMedias(String entityType , String entityId , String id , String type , String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.MediaGetResponse> response = feedbackApiList.getMedias(entityType, entityId, id, type, pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getMedias
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.MediaGetResponse> getMediasPagination(
        
        String entityType,
        String entityId,
        String id,
        String type,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.MediaGetResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.MediaGetResponse callback = this.getMedias(
                
                 entityType,
                 entityId,
                 id,
                 type,
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
    
    
    public ApplicationModels.ReviewMetricGetResponse getReviewSummaries(String entityType , String entityId , String id , String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.ReviewMetricGetResponse> response = feedbackApiList.getReviewSummaries(entityType, entityId, id, pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getReviewSummaries
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.ReviewMetricGetResponse> getReviewSummariesPagination(
        
        String entityType,
        String entityId,
        String id,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ReviewMetricGetResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ReviewMetricGetResponse callback = this.getReviewSummaries(
                
                 entityType,
                 entityId,
                 id,
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
    
    
    public ApplicationModels.UpdateResponse createReview(ApplicationModels.UpdateReviewRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateResponse> response = feedbackApiList.createReview( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateResponse updateReview(ApplicationModels.UpdateReviewRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateResponse> response = feedbackApiList.updateReview( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.ReviewGetResponse getReviews(String entityType , String entityId , String id , String userId , String media , List<Double> rating , List<String> attributeRating , Boolean facets , String sort , Boolean active , Boolean approve , String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.ReviewGetResponse> response = feedbackApiList.getReviews(entityType, entityId, id, userId, media, rating, attributeRating, facets, sort, active, approve, pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getReviews
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.ReviewGetResponse> getReviewsPagination(
        
        String entityType,
        String entityId,
        String id,
        String userId,
        String media,
        List<Double> rating,
        List<String> attributeRating,
        Boolean facets,
        String sort,
        Boolean active,
        Boolean approve,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.ReviewGetResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.ReviewGetResponse callback = this.getReviews(
                
                 entityType,
                 entityId,
                 id,
                 userId,
                 media,
                 rating,
                 attributeRating,
                 facets,
                 sort,
                 active,
                 approve,
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
    
    
    public ApplicationModels.TemplateGetResponse getTemplates(String templateId , String entityId , String entityType ) throws IOException {
    
        Response<ApplicationModels.TemplateGetResponse> response = feedbackApiList.getTemplates(templateId, entityId, entityType).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.InsertResponse createQuestion(ApplicationModels.CreateQNARequest body) throws IOException {
    
        Response<ApplicationModels.InsertResponse> response = feedbackApiList.createQuestion( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateResponse updateQuestion(ApplicationModels.UpdateQNARequest body) throws IOException {
    
        Response<ApplicationModels.UpdateResponse> response = feedbackApiList.updateQuestion( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.QNAGetResponse getQuestionAndAnswers(String entityType , String entityId , String id , String userId , Boolean showAnswer , String pageId , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.QNAGetResponse> response = feedbackApiList.getQuestionAndAnswers(entityType, entityId, id, userId, showAnswer, pageId, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getQuestionAndAnswers
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.QNAGetResponse> getQuestionAndAnswersPagination(
        
        String entityType,
        String entityId,
        String id,
        String userId,
        Boolean showAnswer,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.QNAGetResponse> paginator = new Paginator<>(pageSize, "cursor");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.QNAGetResponse callback = this.getQuestionAndAnswers(
                
                 entityType,
                 entityId,
                 id,
                 userId,
                 showAnswer,
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
    
    
    public ApplicationModels.VoteResponse getVotes(String id , String refType , Integer pageNo , Integer pageSize ) throws IOException {
    
        Response<ApplicationModels.VoteResponse> response = feedbackApiList.getVotes(id, refType, pageNo, pageSize).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getVotes
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ApplicationModels.VoteResponse> getVotesPagination(
        
        String id,
        String refType,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ApplicationModels.VoteResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ApplicationModels.VoteResponse callback = this.getVotes(
                
                 id,
                 refType,
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
    
    
    public ApplicationModels.InsertResponse createVote(ApplicationModels.VoteRequest body) throws IOException {
    
        Response<ApplicationModels.InsertResponse> response = feedbackApiList.createVote( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateResponse updateVote(ApplicationModels.UpdateVoteRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateResponse> response = feedbackApiList.updateVote( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class PosCartService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private PosCartApiList poscartApiList;

    PosCartService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.poscartApiList = generatePoscartApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private PosCartApiList generatePoscartApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),PosCartApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.CartResponse getCart(Integer uid , Boolean i , Boolean b , Integer assignCardId ) throws IOException {
    
        Response<ApplicationModels.CartResponse> response = poscartApiList.getCart(uid, i, b, assignCardId).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object getCartLastModified(Integer uid ) throws IOException {
    
        Response<Object> response = poscartApiList.getCartLastModified(uid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.AddCartResponse addItems(Boolean i , Boolean b ,ApplicationModels.AddCartRequest body) throws IOException {
    
        Response<ApplicationModels.AddCartResponse> response = poscartApiList.addItems(i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.UpdateCartResponse updateCart(Integer uid , Boolean i , Boolean b ,ApplicationModels.UpdateCartRequest body) throws IOException {
    
        Response<ApplicationModels.UpdateCartResponse> response = poscartApiList.updateCart(uid, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartItemCountResponse getItemCount(Integer uid ) throws IOException {
    
        Response<ApplicationModels.CartItemCountResponse> response = poscartApiList.getItemCount(uid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetCouponResponse getCoupons(Integer uid ) throws IOException {
    
        Response<ApplicationModels.GetCouponResponse> response = poscartApiList.getCoupons(uid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object applyCoupon(Boolean i , Boolean b , Boolean p , Integer uid ,ApplicationModels.ApplyCouponRequest body) throws IOException {
    
        Response<Object> response = poscartApiList.applyCoupon(i, b, p, uid, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartResponse removeCoupon(Integer uid ) throws IOException {
    
        Response<ApplicationModels.CartResponse> response = poscartApiList.removeCoupon(uid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.BulkPriceResponse getBulkDiscountOffers(Integer itemId , String articleId , Integer uid , String slug ) throws IOException {
    
        Response<ApplicationModels.BulkPriceResponse> response = poscartApiList.getBulkDiscountOffers(itemId, articleId, uid, slug).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartResponse applyRewardPoints(Integer uid , Boolean i , Boolean b ,ApplicationModels.RewardPointRequest body) throws IOException {
    
        Response<ApplicationModels.CartResponse> response = poscartApiList.applyRewardPoints(uid, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetAddressesResponse getAddresses(Integer uid , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
    
        Response<ApplicationModels.GetAddressesResponse> response = poscartApiList.getAddresses(uid, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SaveAddressResponse addAddress(ApplicationModels.Address body) throws IOException {
    
        Response<ApplicationModels.SaveAddressResponse> response = poscartApiList.addAddress( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.Address getAddressById(Integer id , Integer uid , String mobileNo , String checkoutMode , String tags , Boolean isDefault ) throws IOException {
    
        Response<ApplicationModels.Address> response = poscartApiList.getAddressById(id, uid, mobileNo, checkoutMode, tags, isDefault).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object updateAddress(Integer id ,ApplicationModels.Address body) throws IOException {
    
        Response<Object> response = poscartApiList.updateAddress(id, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object removeAddress(Integer id ) throws IOException {
    
        Response<Object> response = poscartApiList.removeAddress(id).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public Object selectAddress(Integer uid , Boolean i , Boolean b ,ApplicationModels.SelectCartAddressRequest body) throws IOException {
    
        Response<Object> response = poscartApiList.selectAddress(uid, i, b, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartResponse selectPaymentMode(String uid ,ApplicationModels.UpdateCartPaymentRequest body) throws IOException {
    
        Response<ApplicationModels.CartResponse> response = poscartApiList.selectPaymentMode(uid, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.PaymentCouponValidate validateCouponForPayment(String uid , String addressId , String paymentMode , String paymentIdentifier , String aggregatorName , String merchantCode ) throws IOException {
    
        Response<ApplicationModels.PaymentCouponValidate> response = poscartApiList.validateCouponForPayment(uid, addressId, paymentMode, paymentIdentifier, aggregatorName, merchantCode).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartShipmentsResponse getShipments(Integer pickAtStoreUid , Integer orderingStoreId , Boolean p , Integer uid , Integer addressId , String areaCode , String orderType ) throws IOException {
    
        Response<ApplicationModels.CartShipmentsResponse> response = poscartApiList.getShipments(pickAtStoreUid, orderingStoreId, p, uid, addressId, areaCode, orderType).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartShipmentsResponse updateShipments(Boolean i , Boolean p , Integer uid , Integer addressId , String orderType ,ApplicationModels.UpdateCartShipmentRequest body) throws IOException {
    
        Response<ApplicationModels.CartShipmentsResponse> response = poscartApiList.updateShipments(i, p, uid, addressId, orderType, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartCheckoutResponse checkoutCart(Integer uid ,ApplicationModels.CartPosCheckoutRequest body) throws IOException {
    
        Response<ApplicationModels.CartCheckoutResponse> response = poscartApiList.checkoutCart(uid, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartMetaResponse updateCartMeta(Integer uid ,ApplicationModels.CartMetaRequest body) throws IOException {
    
        Response<ApplicationModels.CartMetaResponse> response = poscartApiList.updateCartMeta(uid, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.CartDeliveryModesResponse getAvailableDeliveryModes(String areaCode , Integer uid ) throws IOException {
    
        Response<ApplicationModels.CartDeliveryModesResponse> response = poscartApiList.getAvailableDeliveryModes(areaCode, uid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.StoreDetailsResponse getStoreAddressByUid(Integer storeUid ) throws IOException {
    
        Response<ApplicationModels.StoreDetailsResponse> response = poscartApiList.getStoreAddressByUid(storeUid).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetShareCartLinkResponse getCartShareLink(ApplicationModels.GetShareCartLinkRequest body) throws IOException {
    
        Response<ApplicationModels.GetShareCartLinkResponse> response = poscartApiList.getCartShareLink( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SharedCartResponse getCartSharedItems(String token ) throws IOException {
    
        Response<ApplicationModels.SharedCartResponse> response = poscartApiList.getCartSharedItems(token).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.SharedCartResponse updateCartWithSharedItems(String token , String action ) throws IOException {
    
        Response<ApplicationModels.SharedCartResponse> response = poscartApiList.updateCartWithSharedItems(token, action).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      
}



@Getter
 public class LogisticService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private LogisticApiList logisticApiList;

    LogisticService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.logisticApiList = generateLogisticApiList(this.applicationConfig.getPersistentCookieStore());
    }

    private LogisticApiList generateLogisticApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),LogisticApiList.class, interceptorList, cookieStore);
    }

    

    
    
    public ApplicationModels.GetTatProductResponse getTatProduct(ApplicationModels.GetTatProductReqBody body) throws IOException {
    
        Response<ApplicationModels.GetTatProductResponse> response = logisticApiList.getTatProduct( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ApplicationModels.GetPincodeCityResponse getPincodeCity(String pincode ) throws IOException {
    
        Response<ApplicationModels.GetPincodeCityResponse> response = logisticApiList.getPincodeCity(pincode).execute();
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