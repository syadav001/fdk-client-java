package com.sdk.application;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.*;

public class ApplicationModels {


/*
    Model: Price
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Price{
    
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
}


/*
    Model: ProductListingPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductListingPrice{
    
    
    
    
    
    @JsonProperty("effective")
    private Price effective;
    
    
    
    
    
    @JsonProperty("marked")
    private Price marked;
    
    
    
}


/*
    Model: ProductListingActionPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductListingActionPage{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
}


/*
    Model: ProductListingAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductListingAction{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("page")
    private ProductListingActionPage page;
    
    
    
}


/*
    Model: Meta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Meta{
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: Media
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Media{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("meta")
    private Meta meta;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: ProductBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductBrand{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: ProductDetailAttribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductDetailAttribute{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: ProductDetailGroupedAttribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductDetailGroupedAttribute{
    
    
    
    
    
    @JsonProperty("details")
    private List<ProductDetailAttribute> details;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: ProductDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductDetail{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    
    @JsonProperty("medias")
    private List<Media> medias;
    
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("categories")
    private List<ProductBrand> categories;
    
    
    
    
    
    @JsonProperty("teaser_tag")
    private String teaserTag;
    
    
    
}


/*
    Model: ErrorResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ErrorResponse{
    
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}


/*
    Model: ProductSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSize{
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: SizeChartValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SizeChartValues{
    
    
    
    
    
    @JsonProperty("col_6")
    private String col6;
    
    
    
    
    
    @JsonProperty("col_2")
    private String col2;
    
    
    
    
    
    @JsonProperty("col_4")
    private String col4;
    
    
    
    
    
    @JsonProperty("col_3")
    private String col3;
    
    
    
    
    
    @JsonProperty("col_1")
    private String col1;
    
    
    
    
    
    @JsonProperty("col_5")
    private String col5;
    
    
    
}


/*
    Model: ColumnHeader
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ColumnHeader{
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("convertable")
    private Boolean convertable;
    
    
    
}


/*
    Model: ColumnHeaders
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ColumnHeaders{
    
    
    
    
    
    @JsonProperty("col_6")
    private ColumnHeader col6;
    
    
    
    
    
    @JsonProperty("col_2")
    private ColumnHeader col2;
    
    
    
    
    
    @JsonProperty("col_4")
    private ColumnHeader col4;
    
    
    
    
    
    @JsonProperty("col_3")
    private ColumnHeader col3;
    
    
    
    
    
    @JsonProperty("col_1")
    private ColumnHeader col1;
    
    
    
    
    
    @JsonProperty("col_5")
    private ColumnHeader col5;
    
    
    
}


/*
    Model: SizeChart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SizeChart{
    
    
    
    
    
    @JsonProperty("sizes")
    private List<SizeChartValues> sizes;
    
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    
    @JsonProperty("headers")
    private ColumnHeaders headers;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("size_tip")
    private String sizeTip;
    
    
    
}


/*
    Model: ProductSizeStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSizeStores{
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: ProductSizes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSizes{
    
    
    
    
    
    @JsonProperty("sizes")
    private List<ProductSize> sizes;
    
    
    
    
    
    @JsonProperty("size_chart")
    private SizeChart sizeChart;
    
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    
    @JsonProperty("stores")
    private ProductSizeStores stores;
    
    
    
}


/*
    Model: ProductStockPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductStockPrice{
    
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
}


/*
    Model: Details
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Details{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: MarketPlaceSttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class MarketPlaceSttributes{
    
    
    
    
    
    @JsonProperty("details")
    private List<Details> details;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: Seller
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Seller{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: ArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ArticleAssignment{
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
}


/*
    Model: ProductSetDistributionSize
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSetDistributionSize{
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("pieces")
    private Integer pieces;
    
    
    
}


/*
    Model: ProductSetDistribution
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSetDistribution{
    
    
    
    
    
    @JsonProperty("sizes")
    private List<ProductSetDistributionSize> sizes;
    
    
    
}


/*
    Model: ProductSet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSet{
    
    
    
    
    
    @JsonProperty("size_distribution")
    private ProductSetDistribution sizeDistribution;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: StrategyWiseListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StrategyWiseListing{
    
    
    
    
    
    @JsonProperty("distance")
    private Integer distance;
    
    
    
    
    
    @JsonProperty("tat")
    private Integer tat;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: ReturnConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReturnConfig{
    
    
    
    
    
    @JsonProperty("returnable")
    private Boolean returnable;
    
    
    
    
    
    @JsonProperty("unit")
    private String unit;
    
    
    
    
    
    @JsonProperty("time")
    private Integer time;
    
    
    
}


/*
    Model: Store
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Store{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: ProductSizePriceResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSizePriceResponse{
    
    
    
    
    
    @JsonProperty("long_lat")
    private List<Double> longLat;
    
    
    
    
    
    @JsonProperty("price")
    private ProductStockPrice price;
    
    
    
    
    
    @JsonProperty("marketplace_attributes")
    private List<MarketPlaceSttributes> marketplaceAttributes;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("seller_count")
    private Integer sellerCount;
    
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    
    @JsonProperty("seller")
    private Seller seller;
    
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    
    @JsonProperty("article_assignment")
    private ArticleAssignment articleAssignment;
    
    
    
    
    
    @JsonProperty("price_per_piece")
    private ProductStockPrice pricePerPiece;
    
    
    
    
    
    @JsonProperty("special_badge")
    private String specialBadge;
    
    
    
    
    
    @JsonProperty("set")
    private ProductSet set;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("strategy_wise_listing")
    private List<StrategyWiseListing> strategyWiseListing;
    
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    
    @JsonProperty("return_config")
    private ReturnConfig returnConfig;
    
    
    
    
    
    @JsonProperty("store")
    private Store store;
    
    
    
}


/*
    Model: ProductSizeSellerFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSizeSellerFilter{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
}


/*
    Model: ProductSizeSellersResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSizeSellersResponse{
    
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSizeSellerFilter> sortOn;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductSizePriceResponse> items;
    
    
    
}


/*
    Model: AttributeDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AttributeDetail{
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: AttributeMetadata
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AttributeMetadata{
    
    
    
    
    
    @JsonProperty("details")
    private List<AttributeDetail> details;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: ProductsComparisonResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductsComparisonResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductDetail> items;
    
    
    
    
    
    @JsonProperty("attributes_metadata")
    private List<AttributeMetadata> attributesMetadata;
    
    
    
}


/*
    Model: ProductCompareResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductCompareResponse{
    
    
    
    
    
    @JsonProperty("attributes_metadata")
    private List<AttributeMetadata> attributesMetadata;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductDetail> items;
    
    
    
}


/*
    Model: ProductFrequentlyComparedSimilarResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductFrequentlyComparedSimilarResponse{
    
    
    
    
    
    @JsonProperty("similars")
    private ProductCompareResponse similars;
    
    
    
}


/*
    Model: ProductSimilarItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSimilarItem{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductDetail> items;
    
    
    
}


/*
    Model: SimilarProductByTypeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SimilarProductByTypeResponse{
    
    
    
    
    
    @JsonProperty("similars")
    private ProductSimilarItem similars;
    
    
    
}


/*
    Model: ProductVariantItemResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductVariantItemResponse{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    
    @JsonProperty("is_available")
    private Boolean isAvailable;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("color_name")
    private String colorName;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("medias")
    private List<Media> medias;
    
    
    
}


/*
    Model: ProductVariantResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductVariantResponse{
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("display_type")
    private String displayType;
    
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductVariantItemResponse> items;
    
    
    
}


/*
    Model: ProductVariantsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductVariantsResponse{
    
    
    
    
    
    @JsonProperty("variants")
    private List<ProductVariantResponse> variants;
    
    
    
}


/*
    Model: StoreDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreDetail{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
}


/*
    Model: CompanyDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CompanyDetail{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
}


/*
    Model: ProductStockStatusItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductStockStatusItem{
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("price")
    private ProductStockPrice price;
    
    
    
    
    
    @JsonProperty("store")
    private StoreDetail store;
    
    
    
    
    
    @JsonProperty("seller")
    private Seller seller;
    
    
    
    
    
    @JsonProperty("company")
    private CompanyDetail company;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("identifier")
    private Object identifier;
    
    
    
}


/*
    Model: ProductStockStatusResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductStockStatusResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductStockStatusItem> items;
    
    
    
}


/*
    Model: ProductStockPolling
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductStockPolling{
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductStockStatusItem> items;
    
    
    
}


/*
    Model: ProductSortOn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductSortOn{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
}


/*
    Model: ProductListingDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductListingDetail{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("price")
    private ProductListingPrice price;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("similars")
    private List<String> similars;
    
    
    
    
    
    @JsonProperty("medias")
    private List<Media> medias;
    
    
    
    
    
    @JsonProperty("highlights")
    private List<String> highlights;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("item_type")
    private String itemType;
    
    
    
    
    
    @JsonProperty("brand")
    private ProductBrand brand;
    
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    
    @JsonProperty("tryouts")
    private List<String> tryouts;
    
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    
    @JsonProperty("short_description")
    private String shortDescription;
    
    
    
    
    
    @JsonProperty("item_code")
    private String itemCode;
    
    
    
    
    
    @JsonProperty("product_online_date")
    private String productOnlineDate;
    
    
    
    
    
    @JsonProperty("has_variant")
    private Boolean hasVariant;
    
    
    
    
    
    @JsonProperty("grouped_attributes")
    private List<ProductDetailGroupedAttribute> groupedAttributes;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    
    @JsonProperty("sellable")
    private Boolean sellable;
    
    
    
    
    
    @JsonProperty("image_nature")
    private String imageNature;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("categories")
    private List<ProductBrand> categories;
    
    
    
    
    
    @JsonProperty("teaser_tag")
    private String teaserTag;
    
    
    
}


/*
    Model: ProductFiltersKey
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductFiltersKey{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
}


/*
    Model: ProductFiltersValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductFiltersValue{
    
    
    
    
    
    @JsonProperty("display_format")
    private String displayFormat;
    
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
    
    
    @JsonProperty("query_format")
    private String queryFormat;
    
    
    
    
    
    @JsonProperty("selected_min")
    private Integer selectedMin;
    
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    
    @JsonProperty("selected_max")
    private Integer selectedMax;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
}


/*
    Model: ProductFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductFilters{
    
    
    
    
    
    @JsonProperty("key")
    private ProductFiltersKey key;
    
    
    
    
    
    @JsonProperty("values")
    private List<ProductFiltersValue> values;
    
    
    
}


/*
    Model: ProductListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductListingResponse{
    
    
    
    
    
    @JsonProperty("sort_on")
    private List<ProductSortOn> sortOn;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
    
    
    @JsonProperty("filters")
    private List<ProductFilters> filters;
    
    
    
}


/*
    Model: ImageUrls
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ImageUrls{
    
    
    
    
    
    @JsonProperty("portrait")
    private Media portrait;
    
    
    
    
    
    @JsonProperty("landscape")
    private Media landscape;
    
    
    
}


/*
    Model: BrandItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BrandItem{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("departments")
    private List<String> departments;
    
    
    
}


/*
    Model: BrandListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BrandListingResponse{
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private List<BrandItem> items;
    
    
    
}


/*
    Model: BrandDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BrandDetailResponse{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: DepartmentIdentifier
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DepartmentIdentifier{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: ThirdLevelChild
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ThirdLevelChild{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("childs")
    private List<Object> childs;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: SecondLevelChild
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SecondLevelChild{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("childs")
    private List<ThirdLevelChild> childs;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: Child
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Child{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("childs")
    private List<SecondLevelChild> childs;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: CategoryItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CategoryItems{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("childs")
    private List<Child> childs;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: DepartmentCategoryTree
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DepartmentCategoryTree{
    
    
    
    
    
    @JsonProperty("items")
    private List<CategoryItems> items;
    
    
    
    
    
    @JsonProperty("department")
    private String department;
    
    
    
}


/*
    Model: CategoryListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CategoryListingResponse{
    
    
    
    
    
    @JsonProperty("departments")
    private List<DepartmentIdentifier> departments;
    
    
    
    
    
    @JsonProperty("data")
    private List<DepartmentCategoryTree> data;
    
    
    
}


/*
    Model: CategoryMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CategoryMetaResponse{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: HomeListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class HomeListingResponse{
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
}


/*
    Model: Department
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Department{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
}


/*
    Model: DepartmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DepartmentResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<Department> items;
    
    
    
}


/*
    Model: AutocompleteItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AutocompleteItem{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
}


/*
    Model: AutoCompleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AutoCompleteResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<AutocompleteItem> items;
    
    
    
}


/*
    Model: CollectionListingFilterType
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CollectionListingFilterType{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
}


/*
    Model: CollectionListingFilterTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CollectionListingFilterTag{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
}


/*
    Model: CollectionListingFilter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CollectionListingFilter{
    
    
    
    
    
    @JsonProperty("type")
    private List<CollectionListingFilterType> type;
    
    
    
    
    
    @JsonProperty("tags")
    private List<CollectionListingFilterTag> tags;
    
    
    
}


/*
    Model: GetCollectionDetailNest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetCollectionDetailNest{
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private ProductListingAction action;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
}


/*
    Model: GetCollectionListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetCollectionListingResponse{
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("filters")
    private CollectionListingFilter filters;
    
    
    
    
    
    @JsonProperty("items")
    private List<GetCollectionDetailNest> items;
    
    
    
}


/*
    Model: CollectionDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CollectionDetailResponse{
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("banners")
    private ImageUrls banners;
    
    
    
    
    
    @JsonProperty("_schedule")
    private Object schedule;
    
    
    
    
    
    @JsonProperty("allow_facets")
    private Boolean allowFacets;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo")
    private Media logo;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("badge")
    private Object badge;
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("visible_facets_keys")
    private List<String> visibleFacetsKeys;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    
    @JsonProperty("cron")
    private Object cron;
    
    
    
    
    
    @JsonProperty("allow_sort")
    private Boolean allowSort;
    
    
    
}


/*
    Model: GetFollowListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetFollowListingResponse{
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private List<ProductListingDetail> items;
    
    
    
}


/*
    Model: FollowPostResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FollowPostResponse{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: FollowerCountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FollowerCountResponse{
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: FollowIdsData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FollowIdsData{
    
    
    
    
    
    @JsonProperty("collections")
    private List<Integer> collections;
    
    
    
    
    
    @JsonProperty("products")
    private List<Integer> products;
    
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
}


/*
    Model: FollowIdsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FollowIdsResponse{
    
    
    
    
    
    @JsonProperty("data")
    private FollowIdsData data;
    
    
    
}


/*
    Model: LatLong
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LatLong{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("coordinates")
    private List<Double> coordinates;
    
    
    
}


/*
    Model: Store1
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Store1{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("lat_long")
    private LatLong latLong;
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("store_email")
    private String storeEmail;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
}


/*
    Model: StoreListingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreListingResponse{
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private List<Store1> items;
    
    
    
}


/*
    Model: StoreDepartments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreDepartments{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("priority_order")
    private Integer priorityOrder;
    
    
    
}


/*
    Model: PhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PhoneNumber{
    
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
}


/*
    Model: StoreManagerSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreManagerSerializer{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("mobile_no")
    private PhoneNumber mobileNo;
    
    
    
}


/*
    Model: StoreAddressSerializer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreAddressSerializer{
    
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
}


/*
    Model: CompanyStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CompanyStore{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("business_type")
    private String businessType;
    
    
    
    
    
    @JsonProperty("company_type")
    private String companyType;
    
    
    
}


/*
    Model: AppStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AppStore{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("manager")
    private StoreManagerSerializer manager;
    
    
    
    
    
    @JsonProperty("address")
    private StoreAddressSerializer address;
    
    
    
    
    
    @JsonProperty("company")
    private CompanyStore company;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("departments")
    private List<StoreDepartments> departments;
    
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<PhoneNumber> contactNumbers;
    
    
    
}


/*
    Model: ApplicationStoreListing
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationStoreListing{
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("filters")
    private List<StoreDepartments> filters;
    
    
    
    
    
    @JsonProperty("items")
    private List<AppStore> items;
    
    
    
}


/*
    Model: Time
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Time{
    
    
    
    
    
    @JsonProperty("hour")
    private Integer hour;
    
    
    
    
    
    @JsonProperty("minute")
    private Integer minute;
    
    
    
}


/*
    Model: StoreTiming
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreTiming{
    
    
    
    
    
    @JsonProperty("open")
    private Boolean open;
    
    
    
    
    
    @JsonProperty("weekday")
    private String weekday;
    
    
    
    
    
    @JsonProperty("opening")
    private Time opening;
    
    
    
    
    
    @JsonProperty("closing")
    private Time closing;
    
    
    
}


/*
    Model: StoreDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreDetails{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("manager")
    private StoreManagerSerializer manager;
    
    
    
    
    
    @JsonProperty("timing")
    private List<StoreTiming> timing;
    
    
    
    
    
    @JsonProperty("address")
    private StoreAddressSerializer address;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("company")
    private CompanyStore company;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("departments")
    private List<StoreDepartments> departments;
    
    
    
    
    
    @JsonProperty("contact_numbers")
    private List<PhoneNumber> contactNumbers;
    
    
    
}




/*
    Model: PromiseFormatted
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PromiseFormatted{
    
    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
}


/*
    Model: PromiseTimestamp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PromiseTimestamp{
    
    
    
    
    
    @JsonProperty("min")
    private Double min;
    
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
}


/*
    Model: ShipmentPromise
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentPromise{
    
    
    
    
    
    @JsonProperty("formatted")
    private PromiseFormatted formatted;
    
    
    
    
    
    @JsonProperty("timestamp")
    private PromiseTimestamp timestamp;
    
    
    
}


/*
    Model: RawBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RawBreakup{
    
    
    
    
    
    @JsonProperty("cod_charge")
    private Double codCharge;
    
    
    
    
    
    @JsonProperty("subtotal")
    private Double subtotal;
    
    
    
    
    
    @JsonProperty("you_saved")
    private Double youSaved;
    
    
    
    
    
    @JsonProperty("vog")
    private Double vog;
    
    
    
    
    
    @JsonProperty("coupon")
    private Double coupon;
    
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    
    @JsonProperty("gst_charges")
    private Double gstCharges;
    
    
    
    
    
    @JsonProperty("convenience_fee")
    private Double convenienceFee;
    
    
    
    
    
    @JsonProperty("fynd_cash")
    private Double fyndCash;
    
    
    
    
    
    @JsonProperty("mrp_total")
    private String mrpTotal;
    
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
}


/*
    Model: DisplayBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DisplayBreakup{
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("message")
    private List<String> message;
    
    
    
}


/*
    Model: CouponBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CouponBreakup{
    
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: LoyaltyPoints
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LoyaltyPoints{
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    
    @JsonProperty("applicable")
    private Double applicable;
    
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
}


/*
    Model: CartBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartBreakup{
    
    
    
    
    
    @JsonProperty("raw")
    private RawBreakup raw;
    
    
    
    
    
    @JsonProperty("display")
    private List<DisplayBreakup> display;
    
    
    
    
    
    @JsonProperty("coupon")
    private CouponBreakup coupon;
    
    
    
    
    
    @JsonProperty("loyalty_points")
    private LoyaltyPoints loyaltyPoints;
    
    
    
}


/*
    Model: PaymentSelectionLock
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentSelectionLock{
    
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    
    @JsonProperty("default_options")
    private String defaultOptions;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: BasePrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BasePrice{
    
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
}


/*
    Model: ArticlePriceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ArticlePriceInfo{
    
    
    
    
    
    @JsonProperty("converted")
    private BasePrice converted;
    
    
    
    
    
    @JsonProperty("base")
    private BasePrice base;
    
    
    
}


/*
    Model: BaseInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BaseInfo{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: ProductArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductArticle{
    
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("price")
    private ArticlePriceInfo price;
    
    
    
    
    
    @JsonProperty("store")
    private BaseInfo store;
    
    
    
    
    
    @JsonProperty("seller")
    private BaseInfo seller;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: CartProductIdentifer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartProductIdentifer{
    
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
}


/*
    Model: ProductAvailability
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductAvailability{
    
    
    
    
    
    @JsonProperty("other_store_quantity")
    private Integer otherStoreQuantity;
    
    
    
    
    
    @JsonProperty("out_of_stock")
    private Boolean outOfStock;
    
    
    
    
    
    @JsonProperty("sizes")
    private List<String> sizes;
    
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    
    @JsonProperty("deliverable")
    private Boolean deliverable;
    
    
    
}


/*
    Model: ActionQuery
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ActionQuery{
    
    
    
    
    
    @JsonProperty("product_slug")
    private List<String> productSlug;
    
    
    
}


/*
    Model: ProductAction
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductAction{
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("query")
    private ActionQuery query;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ProductImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductImage{
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: CategoryInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CategoryInfo{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: CartProduct
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartProduct{
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("action")
    private ProductAction action;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("images")
    private List<ProductImage> images;
    
    
    
    
    
    @JsonProperty("categories")
    private List<CategoryInfo> categories;
    
    
    
    
    
    @JsonProperty("brand")
    private BaseInfo brand;
    
    
    
}


/*
    Model: ProductPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductPrice{
    
    
    
    
    
    @JsonProperty("add_on")
    private Double addOn;
    
    
    
    
    
    @JsonProperty("selling")
    private Double selling;
    
    
    
    
    
    @JsonProperty("marked")
    private Double marked;
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("effective")
    private Double effective;
    
    
    
}


/*
    Model: ProductPriceInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductPriceInfo{
    
    
    
    
    
    @JsonProperty("converted")
    private ProductPrice converted;
    
    
    
    
    
    @JsonProperty("base")
    private ProductPrice base;
    
    
    
}


/*
    Model: PromoMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PromoMeta{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CartProductInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartProductInfo{
    
    
    
    
    
    @JsonProperty("article")
    private ProductArticle article;
    
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
    
    @JsonProperty("bulk_offer")
    private Object bulkOffer;
    
    
    
    
    
    @JsonProperty("availability")
    private ProductAvailability availability;
    
    
    
    
    
    @JsonProperty("product")
    private CartProduct product;
    
    
    
    
    
    @JsonProperty("price_per_unit")
    private ProductPriceInfo pricePerUnit;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("price")
    private ProductPriceInfo price;
    
    
    
    
    
    @JsonProperty("coupon_message")
    private String couponMessage;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("promo_meta")
    private PromoMeta promoMeta;
    
    
    
    
    
    @JsonProperty("is_set")
    private Boolean isSet;
    
    
    
    
    
    @JsonProperty("discount")
    private String discount;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: CartCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartCurrency{
    
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: CartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartDetailResponse{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
}


/*
    Model: AddProductCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddProductCart{
    
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    
    @JsonProperty("article_assignment")
    private Object articleAssignment;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: AddCartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddCartRequest{
    
    
    
    
    
    @JsonProperty("items")
    private List<AddProductCart> items;
    
    
    
}


/*
    Model: AddCartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddCartDetailResponse{
    
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
    
    
    @JsonProperty("partial")
    private Boolean partial;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: UpdateProductCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateProductCart{
    
    
    
    
    
    @JsonProperty("identifiers")
    private CartProductIdentifer identifiers;
    
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    
    @JsonProperty("article_id")
    private String articleId;
    
    
    
    
    
    @JsonProperty("item_index")
    private Integer itemIndex;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: UpdateCartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateCartRequest{
    
    
    
    
    
    @JsonProperty("items")
    private List<UpdateProductCart> items;
    
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
}


/*
    Model: UpdateCartDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateCartDetailResponse{
    
    
    
    
    
    @JsonProperty("cart")
    private CartDetailResponse cart;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CartItemCountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartItemCountResponse{
    
    
    
    
    
    @JsonProperty("user_cart_items_count")
    private Integer userCartItemsCount;
    
    
    
}


/*
    Model: Coupon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Coupon{
    
    
    
    
    
    @JsonProperty("expires_on")
    private String expiresOn;
    
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    
    @JsonProperty("is_applied")
    private Boolean isApplied;
    
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("is_applicable")
    private Boolean isApplicable;
    
    
    
    
    
    @JsonProperty("max_discount_value")
    private Double maxDiscountValue;
    
    
    
    
    
    @JsonProperty("minimum_cart_value")
    private Double minimumCartValue;
    
    
    
}


/*
    Model: PageCoupon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageCoupon{
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    
    @JsonProperty("total_item_count")
    private Integer totalItemCount;
    
    
    
    
    
    @JsonProperty("total")
    private Integer total;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
}


/*
    Model: GetCouponResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetCouponResponse{
    
    
    
    
    
    @JsonProperty("available_coupon_list")
    private List<Coupon> availableCouponList;
    
    
    
    
    
    @JsonProperty("page")
    private PageCoupon page;
    
    
    
}


/*
    Model: ApplyCouponRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplyCouponRequest{
    
    
    
    
    
    @JsonProperty("coupon_code")
    private String couponCode;
    
    
    
}


/*
    Model: OfferSeller
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OfferSeller{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: OfferPrice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OfferPrice{
    
    
    
    
    
    @JsonProperty("marked")
    private Integer marked;
    
    
    
    
    
    @JsonProperty("bulk_effective")
    private Double bulkEffective;
    
    
    
    
    
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    
    
    
    
    
    @JsonProperty("currency_code")
    private String currencyCode;
    
    
    
    
    
    @JsonProperty("effective")
    private Integer effective;
    
    
    
}


/*
    Model: OfferItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OfferItem{
    
    
    
    
    
    @JsonProperty("total")
    private Double total;
    
    
    
    
    
    @JsonProperty("best")
    private Boolean best;
    
    
    
    
    
    @JsonProperty("auto_applied")
    private Boolean autoApplied;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("price")
    private OfferPrice price;
    
    
    
    
    
    @JsonProperty("margin")
    private Integer margin;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
}


/*
    Model: BulkPriceOffer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BulkPriceOffer{
    
    
    
    
    
    @JsonProperty("seller")
    private OfferSeller seller;
    
    
    
    
    
    @JsonProperty("offers")
    private List<OfferItem> offers;
    
    
    
}


/*
    Model: BulkPriceResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BulkPriceResponse{
    
    
    
    
    
    @JsonProperty("data")
    private List<BulkPriceOffer> data;
    
    
    
}


/*
    Model: RewardPointRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RewardPointRequest{
    
    
    
    
    
    @JsonProperty("points")
    private Boolean points;
    
    
    
}


/*
    Model: GeoLocation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GeoLocation{
    
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
}


/*
    Model: Address
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Address{
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("geo_location")
    private GeoLocation geoLocation;
    
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("google_map_point")
    private Object googleMapPoint;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: GetAddressesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetAddressesResponse{
    
    
    
    
    
    @JsonProperty("address")
    private List<Address> address;
    
    
    
}


/*
    Model: SaveAddressResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SaveAddressResponse{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
}


/*
    Model: UpdateAddressResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateAddressResponse{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("is_default_address")
    private Boolean isDefaultAddress;
    
    
    
    
    
    @JsonProperty("is_updated")
    private Boolean isUpdated;
    
    
    
}


/*
    Model: DeleteAddressResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DeleteAddressResponse{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("is_deleted")
    private Boolean isDeleted;
    
    
    
}


/*
    Model: SelectCartAddressRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SelectCartAddressRequest{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
}


/*
    Model: UpdateCartPaymentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateCartPaymentRequest{
    
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
}


/*
    Model: CouponValidity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CouponValidity{
    
    
    
    
    
    @JsonProperty("display_message_en")
    private String displayMessageEn;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    
    @JsonProperty("valid")
    private Boolean valid;
    
    
    
}


/*
    Model: PaymentCouponValidate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentCouponValidate{
    
    
    
    
    
    @JsonProperty("coupon_validity")
    private CouponValidity couponValidity;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ShipmentResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentResponse{
    
    
    
    
    
    @JsonProperty("dp_options")
    private Object dpOptions;
    
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
    
    
    @JsonProperty("promise")
    private ShipmentPromise promise;
    
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    
    @JsonProperty("dp_id")
    private Integer dpId;
    
    
    
    
    
    @JsonProperty("shipments")
    private Integer shipments;
    
    
    
    
    
    @JsonProperty("box_type")
    private String boxType;
    
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    
    @JsonProperty("fulfillment_type")
    private String fulfillmentType;
    
    
    
}


/*
    Model: CartShipmentsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartShipmentsResponse{
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    
    @JsonProperty("error")
    private Boolean error;
    
    
    
    
    
    @JsonProperty("shipments")
    private List<ShipmentResponse> shipments;
    
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
}


/*
    Model: StaffCheckout
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StaffCheckout{
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: CartCheckoutDetailRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartCheckoutDetailRequest{
    
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    
    @JsonProperty("payment_auto_confirm")
    private Boolean paymentAutoConfirm;
    
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    
    @JsonProperty("delivery_address")
    private Object deliveryAddress;
    
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    
    @JsonProperty("payment_params")
    private Object paymentParams;
    
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    
    @JsonProperty("staff")
    private StaffCheckout staff;
    
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("fyndstore_emp_id")
    private String fyndstoreEmpId;
    
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
}


/*
    Model: CheckCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CheckCart{
    
    
    
    
    
    @JsonProperty("delivery_charge_order_value")
    private Integer deliveryChargeOrderValue;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    
    @JsonProperty("user_type")
    private String userType;
    
    
    
    
    
    @JsonProperty("cod_charges")
    private Integer codCharges;
    
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    
    @JsonProperty("store_emps")
    private List<Object> storeEmps;
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    
    @JsonProperty("cod_available")
    private Boolean codAvailable;
    
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    
    @JsonProperty("cod_message")
    private String codMessage;
    
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    
    @JsonProperty("error_message")
    private String errorMessage;
    
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    
    @JsonProperty("delivery_charges")
    private Integer deliveryCharges;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CartCheckoutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartCheckoutResponse{
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("cart")
    private CheckCart cart;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    
    @JsonProperty("app_intercept_url")
    private String appInterceptUrl;
    
    
    
}


/*
    Model: CartMetaRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartMetaRequest{
    
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    
    @JsonProperty("pick_up_customer_details")
    private Object pickUpCustomerDetails;
    
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
}


/*
    Model: CartMetaResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartMetaResponse{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CartMetaMissingResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartMetaMissingResponse{
    
    
    
    
    
    @JsonProperty("errors")
    private List<String> errors;
    
    
    
}


/*
    Model: GetShareCartLinkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetShareCartLinkRequest{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: GetShareCartLinkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetShareCartLinkResponse{
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("share_url")
    private String shareUrl;
    
    
    
}


/*
    Model: SharedCartDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SharedCartDetails{
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("source")
    private Object source;
    
    
    
}


/*
    Model: SharedCart
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SharedCart{
    
    
    
    
    
    @JsonProperty("cart_id")
    private Integer cartId;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("checkout_mode")
    private String checkoutMode;
    
    
    
    
    
    @JsonProperty("restrict_checkout")
    private Boolean restrictCheckout;
    
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    
    @JsonProperty("delivery_promise")
    private ShipmentPromise deliveryPromise;
    
    
    
    
    
    @JsonProperty("coupon_text")
    private String couponText;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("breakup_values")
    private CartBreakup breakupValues;
    
    
    
    
    
    @JsonProperty("gstin")
    private String gstin;
    
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    
    @JsonProperty("payment_selection_lock")
    private PaymentSelectionLock paymentSelectionLock;
    
    
    
    
    
    @JsonProperty("items")
    private List<CartProductInfo> items;
    
    
    
    
    
    @JsonProperty("is_valid")
    private Boolean isValid;
    
    
    
    
    
    @JsonProperty("delivery_charge_info")
    private String deliveryChargeInfo;
    
    
    
    
    
    @JsonProperty("shared_cart_details")
    private SharedCartDetails sharedCartDetails;
    
    
    
    
    
    @JsonProperty("currency")
    private CartCurrency currency;
    
    
    
}


/*
    Model: SharedCartResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SharedCartResponse{
    
    
    
    
    
    @JsonProperty("cart")
    private SharedCart cart;
    
    
    
    
    
    @JsonProperty("error")
    private String error;
    
    
    
}




/*
    Model: LocationDefaultLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LocationDefaultLanguage{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: LocationDefaultCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LocationDefaultCurrency{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: LocationCountry
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LocationCountry{
    
    
    
    
    
    @JsonProperty("capital")
    private String capital;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("iso2")
    private String iso2;
    
    
    
    
    
    @JsonProperty("iso3")
    private String iso3;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("parent")
    private String parent;
    
    
    
    
    
    @JsonProperty("phone_code")
    private String phoneCode;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("default_currency")
    private LocationDefaultCurrency defaultCurrency;
    
    
    
    
    
    @JsonProperty("default_language")
    private LocationDefaultLanguage defaultLanguage;
    
    
    
}


/*
    Model: Locations
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Locations{
    
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
}




/*
    Model: TicketList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketList{
    
    
    
    
    
    @JsonProperty("items")
    private List<Ticket> items;
    
    
    
    
    
    @JsonProperty("filters")
    private Filter filters;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: Page
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Page{
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    
    @JsonProperty("next_id")
    private String nextId;
    
    
    
    
    
    @JsonProperty("has_previous")
    private Boolean hasPrevious;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
}


/*
    Model: TicketHistoryList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketHistoryList{
    
    
    
    
    
    @JsonProperty("items")
    private List<TicketHistory> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CustomFormList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CustomFormList{
    
    
    
    
    
    @JsonProperty("items")
    private List<CustomForm> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CreateCustomFormPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateCustomFormPayload{
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("inputs")
    private List<Object> inputs;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("header_image")
    private String headerImage;
    
    
    
    
    
    @JsonProperty("priority")
    private ApplicationClient.PriorityEnum priority;
    
    
    
    
    
    @JsonProperty("should_notify")
    private Boolean shouldNotify;
    
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    
    @JsonProperty("poll_for_assignment")
    private PollForAssignment pollForAssignment;
    
    
    
}


/*
    Model: EditCustomFormPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EditCustomFormPayload{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("inputs")
    private List<Object> inputs;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("priority")
    private ApplicationClient.PriorityEnum priority;
    
    
    
    
    
    @JsonProperty("header_image")
    private String headerImage;
    
    
    
    
    
    @JsonProperty("should_notify")
    private Boolean shouldNotify;
    
    
    
    
    
    @JsonProperty("login_required")
    private Boolean loginRequired;
    
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    
    @JsonProperty("poll_for_assignment")
    private PollForAssignment pollForAssignment;
    
    
    
}


/*
    Model: EditTicketPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EditTicketPayload{
    
    
    
    
    
    @JsonProperty("content")
    private TicketContent content;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    
    @JsonProperty("sub_category")
    private String subCategory;
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("priority")
    private ApplicationClient.PriorityEnum priority;
    
    
    
    
    
    @JsonProperty("assigned_to")
    private AgentChangePayload assignedTo;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: AgentChangePayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AgentChangePayload{
    
    
    
    
    
    @JsonProperty("agent_id")
    private String agentId;
    
    
    
}


/*
    Model: CreateVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateVideoRoomResponse{
    
    
    
    
    
    @JsonProperty("unique_name")
    private String uniqueName;
    
    
    
}


/*
    Model: CloseVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CloseVideoRoomResponse{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: CreateVideoRoomPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateVideoRoomPayload{
    
    
    
    
    
    @JsonProperty("unique_name")
    private String uniqueName;
    
    
    
    
    
    @JsonProperty("notify")
    private List<NotifyUser> notify;
    
    
    
}


/*
    Model: NotifyUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NotifyUser{
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
}


/*
    Model: Filter
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Filter{
    
    
    
    
    
    @JsonProperty("priorities")
    private List<Priority> priorities;
    
    
    
    
    
    @JsonProperty("categories")
    private List<TicketCategory> categories;
    
    
    
    
    
    @JsonProperty("statuses")
    private List<Status> statuses;
    
    
    
    
    
    @JsonProperty("assignees")
    private List<Object> assignees;
    
    
    
}


/*
    Model: TicketHistoryPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketHistoryPayload{
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    
    @JsonProperty("type")
    private ApplicationClient.HistoryTypeEnum type;
    
    
    
}


/*
    Model: CustomFormSubmissionPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CustomFormSubmissionPayload{
    
    
    
    
    
    @JsonProperty("response")
    private List<KeyValue> response;
    
    
    
    
    
    @JsonProperty("attachments")
    private List<TicketAsset> attachments;
    
    
    
}


/*
    Model: KeyValue
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class KeyValue{
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
}


/*
    Model: GetTokenForVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetTokenForVideoRoomResponse{
    
    
    
    
    
    @JsonProperty("access_token")
    private String accessToken;
    
    
    
}


/*
    Model: GetParticipantsInsideVideoRoomResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetParticipantsInsideVideoRoomResponse{
    
    
    
    
    
    @JsonProperty("participants")
    private List<Participant> participants;
    
    
    
}


/*
    Model: Participant
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Participant{
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("identity")
    private String identity;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: Email
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Email{
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
}


/*
    Model: Debug
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Debug{
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
}


/*
    Model: SubmitCustomFormResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SubmitCustomFormResponse{
    
    
    
    
    
    @JsonProperty("ticket")
    private Ticket ticket;
    
    
    
}


/*
    Model: TicketContext
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketContext{
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
}


/*
    Model: CreatedOn
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreatedOn{
    
    
    
    
    
    @JsonProperty("user_agent")
    private String userAgent;
    
    
    
}


/*
    Model: TicketAsset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketAsset{
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("type")
    private Object type;
    
    
    
}


/*
    Model: TicketContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketContent{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    @Getter(AccessLevel.NONE)
    private String description_b64;

    public String getDescription_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.description_b64));
    }
    
    
    
    
    
    @JsonProperty("attachments")
    private List<TicketAsset> attachments;
    
    
    
}


/*
    Model: AddTicketPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddTicketPayload{
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("priority")
    private ApplicationClient.PriorityEnum priority;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    
    @JsonProperty("content")
    private TicketContent content;
    
    
    
}


/*
    Model: Priority
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Priority{
    
    
    
    
    
    @JsonProperty("key")
    private ApplicationClient.PriorityEnum key;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
}


/*
    Model: Status
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Status{
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("color")
    private String color;
    
    
    
}


/*
    Model: TicketCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketCategory{
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("form")
    private CustomForm form;
    
    
    
    
    
    @JsonProperty("sub_categories")
    private List<TicketSubCategory> subCategories;
    
    
    
    
    
    @JsonProperty("feedback_form")
    private TicketFeedbackForm feedbackForm;
    
    
    
}


/*
    Model: TicketSubCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketSubCategory{
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
}


/*
    Model: TicketFeedbackForm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketFeedbackForm{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("display")
    private List<Object> display;
    
    
    
}


/*
    Model: TicketFeedbackList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketFeedbackList{
    
    
    
    
    
    @JsonProperty("items")
    private List<TicketFeedback> items;
    
    
    
}


/*
    Model: TicketFeedbackPayload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketFeedbackPayload{
    
    
    
    
    
    @JsonProperty("form_response")
    private Object formResponse;
    
    
    
}


/*
    Model: SubmitButton
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SubmitButton{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("title_color")
    private String titleColor;
    
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
}


/*
    Model: PollForAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PollForAssignment{
    
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    
    @JsonProperty("failure_message")
    private String failureMessage;
    
    
    
}


/*
    Model: CustomForm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CustomForm{
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("header_image")
    private String headerImage;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("priority")
    private Priority priority;
    
    
    
    
    
    @JsonProperty("login_required")
    private Boolean loginRequired;
    
    
    
    
    
    @JsonProperty("should_notify")
    private Boolean shouldNotify;
    
    
    
    
    
    @JsonProperty("success_message")
    private String successMessage;
    
    
    
    
    
    @JsonProperty("submit_button")
    private SubmitButton submitButton;
    
    
    
    
    
    @JsonProperty("inputs")
    private List<Object> inputs;
    
    
    
    
    
    @JsonProperty("created_on")
    private CreatedOn createdOn;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("poll_for_assignment")
    private PollForAssignment pollForAssignment;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: FeedbackResponseItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FeedbackResponseItem{
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: TicketFeedback
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketFeedback{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    
    @JsonProperty("company_id")
    private String companyId;
    
    
    
    
    
    @JsonProperty("response")
    private List<FeedbackResponseItem> response;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    
    @JsonProperty("user")
    private Object user;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: TicketHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TicketHistory{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    
    @JsonProperty("created_on")
    private CreatedOn createdOn;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: Ticket
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Ticket{
    
    
    
    
    
    @JsonProperty("context")
    private TicketContext context;
    
    
    
    
    
    @JsonProperty("created_on")
    private CreatedOn createdOn;
    
    
    
    
    
    @JsonProperty("response_id")
    private String responseId;
    
    
    
    
    
    @JsonProperty("content")
    private TicketContent content;
    
    
    
    
    
    @JsonProperty("ticket_id")
    private String ticketId;
    
    
    
    
    
    @JsonProperty("category")
    private TicketCategory category;
    
    
    
    
    
    @JsonProperty("sub_category")
    private TicketSubCategory subCategory;
    
    
    
    
    
    @JsonProperty("source")
    private ApplicationClient.TicketSourceEnum source;
    
    
    
    
    
    @JsonProperty("status")
    private Status status;
    
    
    
    
    
    @JsonProperty("priority")
    private Priority priority;
    
    
    
    
    
    @JsonProperty("created_by")
    private Object createdBy;
    
    
    
    
    
    @JsonProperty("assigned_to")
    private Object assignedTo;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("is_feedback_pending")
    private Boolean isFeedbackPending;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}




/*
    Model: AvailablePageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AvailablePageSchema{
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("path")
    private String path;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("sections")
    private List<AvailablePageSchemaSections> sections;
    
    
    
    
    
    @JsonProperty("sections_meta")
    private List<AvailablePageSectionMetaAttributes> sectionsMeta;
    
    
    
    
    
    @JsonProperty("theme")
    private String theme;
    
    
    
    
    
    @JsonProperty("seo")
    private AvailablePageSeo seo;
    
    
    
    
    
    @JsonProperty("props")
    private List<Object> props;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: AvailablePageSectionMetaAttributes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AvailablePageSectionMetaAttributes{
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
}


/*
    Model: AvailablePageSeo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AvailablePageSeo{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: AvailablePageSchemaSections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AvailablePageSchemaSections{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    
    @JsonProperty("props")
    private Object props;
    
    
    
    
    
    @JsonProperty("blocks")
    private List<Object> blocks;
    
    
    
    
    
    @JsonProperty("preset")
    private Object preset;
    
    
    
    
    
    @JsonProperty("predicate")
    private AvailablePagePredicate predicate;
    
    
    
}


/*
    Model: AvailablePageScreenPredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AvailablePageScreenPredicate{
    
    
    
    
    
    @JsonProperty("mobile")
    private Boolean mobile;
    
    
    
    
    
    @JsonProperty("desktop")
    private Boolean desktop;
    
    
    
    
    
    @JsonProperty("tablet")
    private Boolean tablet;
    
    
    
}


/*
    Model: AvailablePageUserPredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AvailablePageUserPredicate{
    
    
    
    
    
    @JsonProperty("authenticated")
    private Boolean authenticated;
    
    
    
    
    
    @JsonProperty("anonymous")
    private Boolean anonymous;
    
    
    
}


/*
    Model: AvailablePageRoutePredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AvailablePageRoutePredicate{
    
    
    
    
    
    @JsonProperty("selected")
    private String selected;
    
    
    
    
    
    @JsonProperty("exact_url")
    private String exactUrl;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
}


/*
    Model: AvailablePagePredicate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AvailablePagePredicate{
    
    
    
    
    
    @JsonProperty("screen")
    private AvailablePageScreenPredicate screen;
    
    
    
    
    
    @JsonProperty("user")
    private AvailablePageUserPredicate user;
    
    
    
    
    
    @JsonProperty("route")
    private AvailablePageRoutePredicate route;
    
    
    
}


/*
    Model: AllAvailablePageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AllAvailablePageSchema{
    
    
    
    
    
    @JsonProperty("pages")
    private List<AvailablePageSchema> pages;
    
    
    
}


/*
    Model: PaginationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaginationSchema{
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
}


/*
    Model: ThemesListingResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ThemesListingResponseSchema{
    
    
    
    
    
    @JsonProperty("items")
    private List<ThemesSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private PaginationSchema page;
    
    
    
}


/*
    Model: AddThemeRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddThemeRequestSchema{
    
    
    
    
    
    @JsonProperty("theme_id")
    private String themeId;
    
    
    
}


/*
    Model: UpgradableThemeSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpgradableThemeSchema{
    
    
    
    
    
    @JsonProperty("parent_theme")
    private String parentTheme;
    
    
    
    
    
    @JsonProperty("applied_theme")
    private String appliedTheme;
    
    
    
    
    
    @JsonProperty("upgrade")
    private Boolean upgrade;
    
    
    
}


/*
    Model: FontsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FontsSchema{
    
    
    
    
    
    @JsonProperty("items")
    private FontsSchemaItems items;
    
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
}


/*
    Model: BlitzkriegApiErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BlitzkriegApiErrorSchema{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: BlitzkriegNotFoundSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BlitzkriegNotFoundSchema{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: BlitzkriegInternalServerErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BlitzkriegInternalServerErrorSchema{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: FontsSchemaItems
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FontsSchemaItems{
    
    
    
    
    
    @JsonProperty("family")
    private String family;
    
    
    
    
    
    @JsonProperty("variants")
    private List<String> variants;
    
    
    
    
    
    @JsonProperty("subsets")
    private List<String> subsets;
    
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    
    @JsonProperty("last_modified")
    private String lastModified;
    
    
    
    
    
    @JsonProperty("files")
    private FontsSchemaItemsFiles files;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
    
    
    @JsonProperty("kind")
    private String kind;
    
    
    
}


/*
    Model: FontsSchemaItemsFiles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FontsSchemaItemsFiles{
    
    
    
    
    
    @JsonProperty("regular")
    private String regular;
    
    
    
    
    
    @JsonProperty("italic")
    private String italic;
    
    
    
    
    
    @JsonProperty("bold")
    private String bold;
    
    
    
}


/*
    Model: ThemesSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ThemesSchema{
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("applied")
    private Boolean applied;
    
    
    
    
    
    @JsonProperty("customized")
    private Boolean customized;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    
    @JsonProperty("parent_theme_version")
    private String parentThemeVersion;
    
    
    
    
    
    @JsonProperty("parent_theme")
    private String parentTheme;
    
    
    
    
    
    @JsonProperty("information")
    private Information information;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("src")
    private Src src;
    
    
    
    
    
    @JsonProperty("assets")
    private AssetsSchema assets;
    
    
    
    
    
    @JsonProperty("available_sections")
    private List<availableSectionSchema> availableSections;
    
    
    
    
    
    @JsonProperty("constants")
    private Object constants;
    
    
    
    
    
    @JsonProperty("styles")
    private Object styles;
    
    
    
    
    
    @JsonProperty("config")
    private Config config;
    
    
    
    
    
    @JsonProperty("settings")
    private Object settings;
    
    
    
    
    
    @JsonProperty("font")
    private Font font;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    
    @JsonProperty("colors")
    private Colors colors;
    
    
    
}


/*
    Model: availableSectionSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class availableSectionSchema{
    
    
    
    
    
    @JsonProperty("blocks")
    private List<Blocks> blocks;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    
    @JsonProperty("props")
    private List<BlocksProps> props;
    
    
    
}


/*
    Model: Information
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Information{
    
    
    
    
    
    @JsonProperty("images")
    private Images images;
    
    
    
    
    
    @JsonProperty("features")
    private List<String> features;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: Images
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Images{
    
    
    
    
    
    @JsonProperty("desktop")
    private List<String> desktop;
    
    
    
    
    
    @JsonProperty("android")
    private List<String> android;
    
    
    
    
    
    @JsonProperty("ios")
    private List<String> ios;
    
    
    
    
    
    @JsonProperty("thumbnail")
    private List<String> thumbnail;
    
    
    
}


/*
    Model: Src
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Src{
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: AssetsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AssetsSchema{
    
    
    
    
    
    @JsonProperty("umd_js")
    private UmdJs umdJs;
    
    
    
    
    
    @JsonProperty("common_js")
    private CommonJs commonJs;
    
    
    
    
    
    @JsonProperty("css")
    private Css css;
    
    
    
}


/*
    Model: UmdJs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UmdJs{
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: CommonJs
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommonJs{
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: Css
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Css{
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: Seo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Seo{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: Sections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Sections{
    
    
    
    
    
    @JsonProperty("attributes")
    private String attributes;
    
    
    
}


/*
    Model: Config
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Config{
    
    
    
    
    
    @JsonProperty("preset")
    private Preset preset;
    
    
    
    
    
    @JsonProperty("global_schema")
    private GlobalSchema globalSchema;
    
    
    
    
    
    @JsonProperty("current")
    private String current;
    
    
    
    
    
    @JsonProperty("list")
    private List<ListSchemaItem> list;
    
    
    
}


/*
    Model: Preset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Preset{
    
    
    
    
    
    @JsonProperty("pages")
    private List<AvailablePageSchema> pages;
    
    
    
}


/*
    Model: GlobalSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GlobalSchema{
    
    
    
    
    
    @JsonProperty("props")
    private List<GlobalSchemaProps> props;
    
    
    
}


/*
    Model: ListSchemaItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ListSchemaItem{
    
    
    
    
    
    @JsonProperty("global")
    private Object global;
    
    
    
    
    
    @JsonProperty("page")
    private List<ConfigPage> page;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: Colors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Colors{
    
    
    
    
    
    @JsonProperty("bg_color")
    private String bgColor;
    
    
    
    
    
    @JsonProperty("primary_color")
    private String primaryColor;
    
    
    
    
    
    @JsonProperty("secondary_color")
    private String secondaryColor;
    
    
    
    
    
    @JsonProperty("accent_color")
    private String accentColor;
    
    
    
    
    
    @JsonProperty("link_color")
    private String linkColor;
    
    
    
    
    
    @JsonProperty("button_secondary_color")
    private String buttonSecondaryColor;
    
    
    
}


/*
    Model: Custom
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Custom{
    
    
    
    
    
    @JsonProperty("props")
    private Object props;
    
    
    
}


/*
    Model: ConfigPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ConfigPage{
    
    
    
    
    
    @JsonProperty("settings")
    private Object settings;
    
    
    
    
    
    @JsonProperty("page")
    private String page;
    
    
    
}


/*
    Model: Font
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Font{
    
    
    
    
    
    @JsonProperty("family")
    private String family;
    
    
    
    
    
    @JsonProperty("variants")
    private Variants variants;
    
    
    
}


/*
    Model: Variants
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Variants{
    
    
    
    
    
    @JsonProperty("medium")
    private Medium medium;
    
    
    
    
    
    @JsonProperty("semi_bold")
    private SemiBold semiBold;
    
    
    
    
    
    @JsonProperty("bold")
    private Bold bold;
    
    
    
    
    
    @JsonProperty("light")
    private Light light;
    
    
    
    
    
    @JsonProperty("regular")
    private Regular regular;
    
    
    
}


/*
    Model: Medium
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Medium{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
}


/*
    Model: SemiBold
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SemiBold{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
}


/*
    Model: Bold
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Bold{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
}


/*
    Model: Light
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Light{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
}


/*
    Model: Regular
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Regular{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("file")
    private String file;
    
    
    
}


/*
    Model: Blocks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Blocks{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("props")
    private List<BlocksProps> props;
    
    
    
}


/*
    Model: GlobalSchemaProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GlobalSchemaProps{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("category")
    private String category;
    
    
    
}


/*
    Model: BlocksProps
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BlocksProps{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("label")
    private String label;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}




/*
    Model: EditEmailRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EditEmailRequestSchema{
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: SendVerificationLinkMobileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SendVerificationLinkMobileRequestSchema{
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
}


/*
    Model: EditMobileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EditMobileRequestSchema{
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
}


/*
    Model: EditProfileRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EditProfileRequestSchema{
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("mobile")
    private EditProfileMobileSchema mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    
    @JsonProperty("profile_pic_url")
    private String profilePicUrl;
    
    
    
    
    
    @JsonProperty("android_hash")
    private String androidHash;
    
    
    
    
    
    @JsonProperty("sender")
    private String sender;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
}


/*
    Model: EditProfileMobileSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EditProfileMobileSchema{
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: SendEmailOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SendEmailOtpRequestSchema{
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
}


/*
    Model: VerifyEmailOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VerifyEmailOtpRequestSchema{
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
}


/*
    Model: VerifyOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VerifyOtpRequestSchema{
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
}


/*
    Model: SendMobileOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SendMobileOtpRequestSchema{
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("android_hash")
    private String androidHash;
    
    
    
    
    
    @JsonProperty("force")
    private String force;
    
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
}


/*
    Model: UpdatePasswordRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdatePasswordRequestSchema{
    
    
    
    
    
    @JsonProperty("old_password")
    private String oldPassword;
    
    
    
    
    
    @JsonProperty("new_password")
    private String newPassword;
    
    
    
}


/*
    Model: FormRegisterRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FormRegisterRequestSchema{
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("phone")
    private FormRegisterRequestSchemaPhone phone;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
}


/*
    Model: TokenRequestBodySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TokenRequestBodySchema{
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
}


/*
    Model: ForgotPasswordRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ForgotPasswordRequestSchema{
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
}


/*
    Model: CodeRequestBodySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CodeRequestBodySchema{
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: SendResetPasswordEmailRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SendResetPasswordEmailRequestSchema{
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
}


/*
    Model: PasswordLoginRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PasswordLoginRequestSchema{
    
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
    
    @JsonProperty("password")
    private String password;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
}


/*
    Model: SendOtpRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SendOtpRequestSchema{
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("captcha_code")
    private String captchaCode;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
}


/*
    Model: OAuthRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OAuthRequestSchema{
    
    
    
    
    
    @JsonProperty("is_signed_in")
    private Boolean isSignedIn;
    
    
    
    
    
    @JsonProperty("oauth2")
    private OAuthRequestSchemaOauth2 oauth2;
    
    
    
    
    
    @JsonProperty("profile")
    private OAuthRequestSchemaProfile profile;
    
    
    
}


/*
    Model: UserObjectSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UserObjectSchema{
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
}


/*
    Model: AuthSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AuthSuccess{
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
}


/*
    Model: SendOtpResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SendOtpResponse{
    
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("resend_email_token")
    private String resendEmailToken;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
}


/*
    Model: ProfileEditSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProfileEditSuccess{
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: LoginSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LoginSuccess{
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
}


/*
    Model: VerifyOtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VerifyOtpSuccess{
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
}


/*
    Model: ResetPasswordSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ResetPasswordSuccess{
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: RegisterFormSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RegisterFormSuccess{
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
    
    @JsonProperty("resend_email_token")
    private String resendEmailToken;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
}


/*
    Model: VerifyEmailSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VerifyEmailSuccess{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: HasPasswordSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class HasPasswordSuccess{
    
    
    
    
    
    @JsonProperty("result")
    private Boolean result;
    
    
    
}


/*
    Model: LogoutSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LogoutSuccess{
    
    
    
    
    
    @JsonProperty("logout")
    private Boolean logout;
    
    
    
}


/*
    Model: OtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OtpSuccess{
    
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
    
    
    @JsonProperty("resend_token")
    private String resendToken;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
}


/*
    Model: EmailOtpSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EmailOtpSuccess{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: SessionListSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SessionListSuccess{
    
    
    
    
    
    @JsonProperty("sessions")
    private List<String> sessions;
    
    
    
}


/*
    Model: VerifyMobileOTPSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VerifyMobileOTPSuccess{
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("verify_mobile_link")
    private Boolean verifyMobileLink;
    
    
    
}


/*
    Model: VerifyEmailOTPSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VerifyEmailOTPSuccess{
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
}


/*
    Model: SendMobileVerifyLinkSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SendMobileVerifyLinkSuccess{
    
    
    
    
    
    @JsonProperty("verify_mobile_link")
    private Boolean verifyMobileLink;
    
    
    
}


/*
    Model: SendEmailVerifyLinkSuccess
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SendEmailVerifyLinkSuccess{
    
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
}


/*
    Model: UserSearchResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UserSearchResponseSchema{
    
    
    
    
    
    @JsonProperty("users")
    private List<UserSchema> users;
    
    
    
}


/*
    Model: CustomerListResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CustomerListResponseSchema{
    
    
    
    
    
    @JsonProperty("items")
    private List<UserSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private PaginationSchema page;
    
    
    
}


/*
    Model: UnauthorizedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UnauthorizedSchema{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: UnauthenticatedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UnauthenticatedSchema{
    
    
    
    
    
    @JsonProperty("authenticated")
    private Boolean authenticated;
    
    
    
}


/*
    Model: NotFoundSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NotFoundSchema{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: AuthenticationInternalServerErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AuthenticationInternalServerErrorSchema{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: AuthenticationApiErrorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AuthenticationApiErrorSchema{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ProfileEditSuccessSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProfileEditSuccessSchema{
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("verify_email_otp")
    private Boolean verifyEmailOtp;
    
    
    
    
    
    @JsonProperty("verify_email_link")
    private Boolean verifyEmailLink;
    
    
    
    
    
    @JsonProperty("verify_mobile_otp")
    private Boolean verifyMobileOtp;
    
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    
    @JsonProperty("register_token")
    private String registerToken;
    
    
    
    
    
    @JsonProperty("user_exists")
    private Boolean userExists;
    
    
    
}


/*
    Model: FormRegisterRequestSchemaPhone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FormRegisterRequestSchemaPhone{
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
}


/*
    Model: OAuthRequestSchemaOauth2
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OAuthRequestSchemaOauth2{
    
    
    
    
    
    @JsonProperty("access_token")
    private String accessToken;
    
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    
    @JsonProperty("refresh_token")
    private String refreshToken;
    
    
    
}


/*
    Model: OAuthRequestSchemaProfile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OAuthRequestSchemaProfile{
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("full_name")
    private String fullName;
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
}


/*
    Model: AuthSuccessUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AuthSuccessUser{
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("debug")
    private AuthSuccessUserDebug debug;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("emails")
    private AuthSuccessUserEmails emails;
    
    
    
}


/*
    Model: AuthSuccessUserDebug
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AuthSuccessUserDebug{
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
}


/*
    Model: AuthSuccessUserEmails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AuthSuccessUserEmails{
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
}


/*
    Model: CreateUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateUserRequestSchema{
    
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: CreateUserResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateUserResponseSchema{
    
    
    
    
    
    @JsonProperty("user")
    private UserSchema user;
    
    
    
}


/*
    Model: CreateUserSessionRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateUserSessionRequestSchema{
    
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    
    @JsonProperty("max_age")
    private Double maxAge;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
}


/*
    Model: CreateUserSessionResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateUserSessionResponseSchema{
    
    
    
    
    
    @JsonProperty("domain")
    private String domain;
    
    
    
    
    
    @JsonProperty("max_age")
    private Double maxAge;
    
    
    
    
    
    @JsonProperty("secure")
    private Boolean secure;
    
    
    
    
    
    @JsonProperty("http_only")
    private Boolean httpOnly;
    
    
    
    
    
    @JsonProperty("cookie")
    private Object cookie;
    
    
    
}


/*
    Model: PlatformSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PlatformSchema{
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("look_and_feel")
    private LookAndFeel lookAndFeel;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("forgot_password")
    private Boolean forgotPassword;
    
    
    
    
    
    @JsonProperty("login")
    private Login login;
    
    
    
    
    
    @JsonProperty("skip_captcha")
    private Boolean skipCaptcha;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private MetaSchema meta;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("social")
    private Social social;
    
    
    
    
    
    @JsonProperty("required_fields")
    private RequiredFields requiredFields;
    
    
    
    
    
    @JsonProperty("register_required_fields")
    private RegisterRequiredFields registerRequiredFields;
    
    
    
    
    
    @JsonProperty("skip_login")
    private Boolean skipLogin;
    
    
    
    
    
    @JsonProperty("flash_card")
    private FlashCard flashCard;
    
    
    
    
    
    @JsonProperty("subtext")
    private String subtext;
    
    
    
    
    
    @JsonProperty("social_tokens")
    private SocialTokens socialTokens;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("register")
    private Boolean register;
    
    
    
    
    
    @JsonProperty("mobile_image")
    private String mobileImage;
    
    
    
    
    
    @JsonProperty("desktop_image")
    private String desktopImage;
    
    
    
}


/*
    Model: LookAndFeel
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LookAndFeel{
    
    
    
    
    
    @JsonProperty("card_position")
    private String cardPosition;
    
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
}


/*
    Model: Login
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Login{
    
    
    
    
    
    @JsonProperty("password")
    private Boolean password;
    
    
    
    
    
    @JsonProperty("otp")
    private Boolean otp;
    
    
    
}


/*
    Model: MetaSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class MetaSchema{
    
    
    
    
    
    @JsonProperty("fynd_default")
    private Boolean fyndDefault;
    
    
    
}


/*
    Model: Social
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Social{
    
    
    
    
    
    @JsonProperty("account_kit")
    private Boolean accountKit;
    
    
    
    
    
    @JsonProperty("facebook")
    private Boolean facebook;
    
    
    
    
    
    @JsonProperty("google")
    private Boolean google;
    
    
    
}


/*
    Model: RequiredFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RequiredFields{
    
    
    
    
    
    @JsonProperty("email")
    private PlatformEmail email;
    
    
    
    
    
    @JsonProperty("mobile")
    private PlatformMobile mobile;
    
    
    
}


/*
    Model: PlatformEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PlatformEmail{
    
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
}


/*
    Model: PlatformMobile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PlatformMobile{
    
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
}


/*
    Model: RegisterRequiredFields
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RegisterRequiredFields{
    
    
    
    
    
    @JsonProperty("email")
    private RegisterRequiredFieldsEmail email;
    
    
    
    
    
    @JsonProperty("mobile")
    private RegisterRequiredFieldsMobile mobile;
    
    
    
}


/*
    Model: RegisterRequiredFieldsEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RegisterRequiredFieldsEmail{
    
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
}


/*
    Model: RegisterRequiredFieldsMobile
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RegisterRequiredFieldsMobile{
    
    
    
    
    
    @JsonProperty("is_required")
    private Boolean isRequired;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
}


/*
    Model: FlashCard
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FlashCard{
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("text_color")
    private String textColor;
    
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
}


/*
    Model: SocialTokens
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SocialTokens{
    
    
    
    
    
    @JsonProperty("facebook")
    private Facebook facebook;
    
    
    
    
    
    @JsonProperty("account_kit")
    private Accountkit accountKit;
    
    
    
    
    
    @JsonProperty("google")
    private Google google;
    
    
    
}


/*
    Model: Facebook
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Facebook{
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
}


/*
    Model: Accountkit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Accountkit{
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
}


/*
    Model: Google
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Google{
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
}


/*
    Model: UpdateUserRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateUserRequestSchema{
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: UserSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UserSchema{
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("phone_numbers")
    private List<PhoneNumber> phoneNumbers;
    
    
    
    
    
    @JsonProperty("emails")
    private List<Email> emails;
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("dob")
    private String dob;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("profile_pic_url")
    private String profilePicUrl;
    
    
    
    
    
    @JsonProperty("username")
    private String username;
    
    
    
    
    
    @JsonProperty("account_type")
    private String accountType;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("debug")
    private Debug debug;
    
    
    
    
    
    @JsonProperty("has_old_password_hash")
    private Boolean hasOldPasswordHash;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
}




/*
    Model: ApplicationLegal
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationLegal{
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("tnc")
    private String tnc;
    
    
    
    
    
    @JsonProperty("policy")
    private String policy;
    
    
    
    
    
    @JsonProperty("shipping")
    private String shipping;
    
    
    
    
    
    @JsonProperty("faq")
    private List<ApplicationLegalFAQ> faq;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
}


/*
    Model: ApplicationLegalFAQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationLegalFAQ{
    
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
}


/*
    Model: SeoComponent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SeoComponent{
    
    
    
    
    
    @JsonProperty("seo")
    private SeoSchema seo;
    
    
    
}


/*
    Model: SeoSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SeoSchema{
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("robots_txt")
    private String robotsTxt;
    
    
    
    
    
    @JsonProperty("sitemap_enabled")
    private Boolean sitemapEnabled;
    
    
    
    
    
    @JsonProperty("custom_meta_tags")
    private List<Object> customMetaTags;
    
    
    
    
    
    @JsonProperty("details")
    private Detail details;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
}


/*
    Model: CustomMetaTag
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CustomMetaTag{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: Detail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Detail{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: AnnouncementPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AnnouncementPageSchema{
    
    
    
    
    
    @JsonProperty("page_slug")
    private String pageSlug;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: EditorMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EditorMeta{
    
    
    
    
    
    @JsonProperty("foreground_color")
    private String foregroundColor;
    
    
    
    
    
    @JsonProperty("background_color")
    private String backgroundColor;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
}


/*
    Model: AnnouncementAuthorSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AnnouncementAuthorSchema{
    
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    
    @JsonProperty("modified_by")
    private String modifiedBy;
    
    
    
}


/*
    Model: AdminAnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AdminAnnouncementSchema{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("platforms")
    private List<String> platforms;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("announcement")
    private String announcement;
    
    
    
    
    
    @JsonProperty("pages")
    private List<AnnouncementPageSchema> pages;
    
    
    
    
    
    @JsonProperty("editor_meta")
    private EditorMeta editorMeta;
    
    
    
    
    
    @JsonProperty("author")
    private AnnouncementAuthorSchema author;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("modified_at")
    private String modifiedAt;
    
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
}


/*
    Model: ScheduleSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ScheduleSchema{
    
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
    
    
    @JsonProperty("next_schedule")
    private List<Object> nextSchedule;
    
    
    
}


/*
    Model: NextSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NextSchedule{
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: AnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AnnouncementSchema{
    
    
    
    
    
    @JsonProperty("announcement")
    private String announcement;
    
    
    
    
    
    @JsonProperty("schedule")
    private ScheduleStartSchema schedule;
    
    
    
}


/*
    Model: ScheduleStartSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ScheduleStartSchema{
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
}


/*
    Model: BlogGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BlogGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<BlogSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: ResourceContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ResourceContent{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: Asset
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Asset{
    
    
    
    
    
    @JsonProperty("aspect_ratio")
    private String aspectRatio;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: Author
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Author{
    
    
    
    
    
    @JsonProperty("designation")
    private String designation;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: BlogSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BlogSchema{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    
    @JsonProperty("content")
    private List<ResourceContent> content;
    
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    
    @JsonProperty("_schedule")
    private CronSchedule schedule;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
}


/*
    Model: SEO
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SEO{
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("image")
    private SEOImage image;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: SEOImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SEOImage{
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: DateMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DateMeta{
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
}


/*
    Model: BlogRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BlogRequest{
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    
    @JsonProperty("content")
    private List<ResourceContent> content;
    
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    
    @JsonProperty("_schedule")
    private CronSchedule schedule;
    
    
    
}


/*
    Model: GetAnnouncementListSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetAnnouncementListSchema{
    
    
    
    
    
    @JsonProperty("items")
    private List<AdminAnnouncementSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CreateAnnouncementSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateAnnouncementSchema{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("data")
    private AdminAnnouncementSchema data;
    
    
    
}


/*
    Model: Navigation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Navigation{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("navigation")
    private NavigationReference navigation;
    
    
    
}


/*
    Model: LocaleLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LocaleLanguage{
    
    
    
    
    
    @JsonProperty("hi")
    private Language hi;
    
    
    
    
    
    @JsonProperty("ar")
    private Language ar;
    
    
    
    
    
    @JsonProperty("en_us")
    private Language enUs;
    
    
    
}


/*
    Model: Language
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Language{
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
}


/*
    Model: Action
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Action{
    
    
    
    
    
    @JsonProperty("page")
    private ActionPage page;
    
    
    
    
    
    @JsonProperty("popup")
    private ActionPage popup;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ActionPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ActionPage{
    
    
    
    
    
    @JsonProperty("params")
    private HashMap<String,List<String>> params;
    
    
    
    
    
    @JsonProperty("query")
    private HashMap<String,List<String>> query;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: NavigationReference
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NavigationReference{
    
    
    
    
    
    @JsonProperty("acl")
    private List<String> acl;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("_locale_language")
    private LocaleLanguage localeLanguage;
    
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("sort_order")
    private Integer sortOrder;
    
    
    
    
    
    @JsonProperty("sub_navigation")
    private List<NavigationReference> subNavigation;
    
    
    
}


/*
    Model: LandingPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LandingPage{
    
    
    
    
    
    @JsonProperty("data")
    private LandingPageSchema data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: ConfigurationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ConfigurationSchema{
    
    
    
    
    
    @JsonProperty("sleep_time")
    private Integer sleepTime;
    
    
    
    
    
    @JsonProperty("start_on_launch")
    private Boolean startOnLaunch;
    
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    
    @JsonProperty("slide_direction")
    private String slideDirection;
    
    
    
}


/*
    Model: SlideshowMedia
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SlideshowMedia{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("bg_color")
    private String bgColor;
    
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    
    @JsonProperty("auto_decide_duration")
    private Boolean autoDecideDuration;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
}


/*
    Model: Slideshow
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Slideshow{
    
    
    
    
    
    @JsonProperty("data")
    private SlideshowSchema data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: AnnouncementsResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AnnouncementsResponseSchema{
    
    
    
    
    
    @JsonProperty("announcements")
    private HashMap<String,List<AnnouncementSchema>> announcements;
    
    
    
    
    
    @JsonProperty("refresh_rate")
    private Integer refreshRate;
    
    
    
    
    
    @JsonProperty("refresh_pages")
    private List<String> refreshPages;
    
    
    
}


/*
    Model: FaqResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FaqResponseSchema{
    
    
    
    
    
    @JsonProperty("faqs")
    private List<FaqSchema> faqs;
    
    
    
}


/*
    Model: UpdateHandpickedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateHandpickedSchema{
    
    
    
    
    
    @JsonProperty("tag")
    private HandpickedTagSchema tag;
    
    
    
}


/*
    Model: HandpickedTagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class HandpickedTagSchema{
    
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
}


/*
    Model: RemoveHandpickedSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RemoveHandpickedSchema{
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: CreateTagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateTagSchema{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
}


/*
    Model: CreateTagRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateTagRequestSchema{
    
    
    
    
    
    @JsonProperty("tags")
    private List<CreateTagSchema> tags;
    
    
    
}


/*
    Model: TagDeleteSuccessResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TagDeleteSuccessResponse{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: APIError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class APIError{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("status")
    private Double status;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
}


/*
    Model: CategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CategorySchema{
    
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("children")
    private List<String> children;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("icon_url")
    private String iconUrl;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
}


/*
    Model: ChildrenSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ChildrenSchema{
    
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: CategoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CategoryRequestSchema{
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: FAQCategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FAQCategorySchema{
    
    
    
    
    
    @JsonProperty("index")
    private Integer index;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("children")
    private List<ChildrenSchema> children;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("icon_url")
    private String iconUrl;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
}


/*
    Model: FaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FaqSchema{
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
}


/*
    Model: FAQ
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FAQ{
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("question")
    private String question;
    
    
    
    
    
    @JsonProperty("answer")
    private String answer;
    
    
    
}


/*
    Model: CreateFaqResponseSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateFaqResponseSchema{
    
    
    
    
    
    @JsonProperty("faq")
    private FaqSchema faq;
    
    
    
}


/*
    Model: CreateFaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateFaqSchema{
    
    
    
    
    
    @JsonProperty("faq")
    private FAQ faq;
    
    
    
}


/*
    Model: GetFaqSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetFaqSchema{
    
    
    
    
    
    @JsonProperty("faqs")
    private List<Object> faqs;
    
    
    
}


/*
    Model: UpdateFaqCategoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateFaqCategoryRequestSchema{
    
    
    
    
    
    @JsonProperty("category")
    private CategorySchema category;
    
    
    
}


/*
    Model: CreateFaqCategoryRequestSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateFaqCategoryRequestSchema{
    
    
    
    
    
    @JsonProperty("category")
    private CategoryRequestSchema category;
    
    
    
}


/*
    Model: CreateFaqCategorySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateFaqCategorySchema{
    
    
    
    
    
    @JsonProperty("category")
    private CategorySchema category;
    
    
    
}


/*
    Model: GetFaqCategoriesSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetFaqCategoriesSchema{
    
    
    
    
    
    @JsonProperty("categories")
    private List<CategorySchema> categories;
    
    
    
}


/*
    Model: GetFaqCategoryBySlugSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetFaqCategoryBySlugSchema{
    
    
    
    
    
    @JsonProperty("category")
    private FAQCategorySchema category;
    
    
    
}


/*
    Model: LandingPageGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LandingPageGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<LandingPageSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: LandingPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LandingPageSchema{
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("action")
    private Action action;
    
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
}


/*
    Model: DefaultNavigationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DefaultNavigationResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<NavigationSchema> items;
    
    
    
}


/*
    Model: NavigationGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NavigationGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<NavigationSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: Orientation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Orientation{
    
    
    
    
    
    @JsonProperty("portrait")
    private List<String> portrait;
    
    
    
    
    
    @JsonProperty("landscape")
    private List<String> landscape;
    
    
    
}


/*
    Model: NavigationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NavigationSchema{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("orientation")
    private Orientation orientation;
    
    
    
    
    
    @JsonProperty("version")
    private Double version;
    
    
    
    
    
    @JsonProperty("navigation")
    private List<NavigationReference> navigation;
    
    
    
}


/*
    Model: NavigationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NavigationRequest{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("platform")
    private List<String> platform;
    
    
    
    
    
    @JsonProperty("orientation")
    private Orientation orientation;
    
    
    
    
    
    @JsonProperty("navigation")
    private List<NavigationReference> navigation;
    
    
    
}


/*
    Model: CustomPageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CustomPageSchema{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
}


/*
    Model: ContentSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ContentSchema{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
}


/*
    Model: CustomPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CustomPage{
    
    
    
    
    
    @JsonProperty("data")
    private CustomPageSchema data;
    
    
    
}


/*
    Model: FeatureImage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FeatureImage{
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: PageGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<PageSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: PageSpec
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageSpec{
    
    
    
    
    
    @JsonProperty("specifications")
    private List<Object> specifications;
    
    
    
}


/*
    Model: PageSpecParam
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageSpecParam{
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("required")
    private Boolean required;
    
    
    
}


/*
    Model: PageSpecItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageSpecItem{
    
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("params")
    private List<PageSpecParam> params;
    
    
    
    
    
    @JsonProperty("query")
    private List<PageSpecParam> query;
    
    
    
}


/*
    Model: PageSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageSchema{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("component_ids")
    private List<String> componentIds;
    
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBySchema createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    
    @JsonProperty("page_meta")
    private List<Object> pageMeta;
    
    
    
    
    
    @JsonProperty("_schedule")
    private ScheduleSchema schedule;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    
    @JsonProperty("visibility")
    private Object visibility;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
}


/*
    Model: CreatedBySchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreatedBySchema{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: PageContent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageContent{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
}


/*
    Model: PageMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageMeta{
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private Object value;
    
    
    
}


/*
    Model: PageRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageRequest{
    
    
    
    
    
    @JsonProperty("_schedule")
    private CronSchedule schedule;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("author")
    private Author author;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
    
    
    @JsonProperty("orientation")
    private String orientation;
    
    
    
    
    
    @JsonProperty("content")
    private List<Object> content;
    
    
    
    
    
    @JsonProperty("feature_image")
    private Asset featureImage;
    
    
    
    
    
    @JsonProperty("published")
    private Boolean published;
    
    
    
    
    
    @JsonProperty("reading_time")
    private String readingTime;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("seo")
    private SEO seo;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: CronSchedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CronSchedule{
    
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    
    @JsonProperty("duration")
    private Double duration;
    
    
    
}


/*
    Model: PagePublishRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PagePublishRequest{
    
    
    
    
    
    @JsonProperty("publish")
    private Boolean publish;
    
    
    
}


/*
    Model: PageMetaSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageMetaSchema{
    
    
    
    
    
    @JsonProperty("system_pages")
    private List<NavigationSchema> systemPages;
    
    
    
    
    
    @JsonProperty("custom_pages")
    private List<PageSchema> customPages;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
}


/*
    Model: SlideshowGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SlideshowGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<SlideshowSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: SlideshowSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SlideshowSchema{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("configuration")
    private ConfigurationSchema configuration;
    
    
    
    
    
    @JsonProperty("media")
    private List<SlideshowMedia> media;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("archived")
    private Boolean archived;
    
    
    
    
    
    @JsonProperty("_custom_json")
    private Object customJson;
    
    
    
}


/*
    Model: SlideshowRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SlideshowRequest{
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("configuration")
    private ConfigurationSchema configuration;
    
    
    
    
    
    @JsonProperty("media")
    private SlideshowMedia media;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
}


/*
    Model: Support
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Support{
    
    
    
    
    
    @JsonProperty("created")
    private Boolean created;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("contact")
    private ContactSchema contact;
    
    
    
}


/*
    Model: PhoneProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PhoneProperties{
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
}


/*
    Model: PhoneSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PhoneSchema{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("phone")
    private List<PhoneProperties> phone;
    
    
    
}


/*
    Model: EmailProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EmailProperties{
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: EmailSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EmailSchema{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("email")
    private List<EmailProperties> email;
    
    
    
}


/*
    Model: ContactSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ContactSchema{
    
    
    
    
    
    @JsonProperty("phone")
    private PhoneSchema phone;
    
    
    
    
    
    @JsonProperty("email")
    private EmailSchema email;
    
    
    
}


/*
    Model: TagsSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TagsSchema{
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagSchema> tags;
    
    
    
}


/*
    Model: TagSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TagSchema{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("position")
    private String position;
    
    
    
    
    
    @JsonProperty("attributes")
    private Object attributes;
    
    
    
    
    
    @JsonProperty("content")
    private String content;
    
    
    
}




/*
    Model: CommunicationConsentReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommunicationConsentReq{
    
    
    
    
    
    @JsonProperty("response")
    private String response;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("channel")
    private String channel;
    
    
    
}


/*
    Model: CommunicationConsentRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommunicationConsentRes{
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("channels")
    private CommunicationConsentChannels channels;
    
    
    
}


/*
    Model: CommunicationConsentChannelsEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommunicationConsentChannelsEmail{
    
    
    
    
    
    @JsonProperty("response")
    private String response;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
}


/*
    Model: CommunicationConsentChannelsSms
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommunicationConsentChannelsSms{
    
    
    
    
    
    @JsonProperty("response")
    private String response;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
}


/*
    Model: CommunicationConsentChannelsWhatsapp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommunicationConsentChannelsWhatsapp{
    
    
    
    
    
    @JsonProperty("response")
    private String response;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
}


/*
    Model: CommunicationConsentChannels
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommunicationConsentChannels{
    
    
    
    
    
    @JsonProperty("email")
    private CommunicationConsentChannelsEmail email;
    
    
    
    
    
    @JsonProperty("sms")
    private CommunicationConsentChannelsSms sms;
    
    
    
    
    
    @JsonProperty("whatsapp")
    private CommunicationConsentChannelsWhatsapp whatsapp;
    
    
    
}


/*
    Model: CommunicationConsent
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommunicationConsent{
    
    
    
    
    
    @JsonProperty("app_id")
    private String appId;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("channels")
    private CommunicationConsentChannels channels;
    
    
    
}


/*
    Model: PushtokenReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PushtokenReq{
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("bundle_identifier")
    private String bundleIdentifier;
    
    
    
    
    
    @JsonProperty("push_token")
    private String pushToken;
    
    
    
    
    
    @JsonProperty("unique_device_id")
    private String uniqueDeviceId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: PushtokenRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PushtokenRes{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("bundle_identifier")
    private String bundleIdentifier;
    
    
    
    
    
    @JsonProperty("push_token")
    private String pushToken;
    
    
    
    
    
    @JsonProperty("unique_device_id")
    private String uniqueDeviceId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("expired_at")
    private String expiredAt;
    
    
    
}




/*
    Model: QRCodeResp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class QRCodeResp{
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    
    @JsonProperty("svg")
    private String svg;
    
    
    
}


/*
    Model: RedirectDevice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RedirectDevice{
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: WebRedirect
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class WebRedirect{
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: Redirects
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Redirects{
    
    
    
    
    
    @JsonProperty("ios")
    private RedirectDevice ios;
    
    
    
    
    
    @JsonProperty("android")
    private RedirectDevice android;
    
    
    
    
    
    @JsonProperty("web")
    private WebRedirect web;
    
    
    
    
    
    @JsonProperty("force_web")
    private Boolean forceWeb;
    
    
    
}


/*
    Model: CampaignShortLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CampaignShortLink{
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    
    @JsonProperty("medium")
    private String medium;
    
    
    
}


/*
    Model: Attribution
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Attribution{
    
    
    
    
    
    @JsonProperty("campaign_cookie_expiry")
    private String campaignCookieExpiry;
    
    
    
}


/*
    Model: SocialMediaTags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SocialMediaTags{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("image")
    private String image;
    
    
    
}


/*
    Model: ShortLinkReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShortLinkReq{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("hash")
    private String hash;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    
    @JsonProperty("personalized")
    private Boolean personalized;
    
    
    
    
    
    @JsonProperty("campaign")
    private CampaignShortLink campaign;
    
    
    
    
    
    @JsonProperty("redirects")
    private Redirects redirects;
    
    
    
    
    
    @JsonProperty("attribution")
    private Attribution attribution;
    
    
    
    
    
    @JsonProperty("social_media_tags")
    private SocialMediaTags socialMediaTags;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: UrlInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UrlInfo{
    
    
    
    
    
    @JsonProperty("original")
    private String original;
    
    
    
    
    
    @JsonProperty("short")
    private String shortName;
    
    
    
    
    
    @JsonProperty("hash")
    private String hash;
    
    
    
}


/*
    Model: ShortLinkRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShortLinkRes{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("url")
    private UrlInfo url;
    
    
    
    
    
    @JsonProperty("created_by")
    private String createdBy;
    
    
    
    
    
    @JsonProperty("app_redirect")
    private Boolean appRedirect;
    
    
    
    
    
    @JsonProperty("fallback")
    private String fallback;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("enable_tracking")
    private Boolean enableTracking;
    
    
    
    
    
    @JsonProperty("expire_at")
    private String expireAt;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("personalized")
    private Boolean personalized;
    
    
    
    
    
    @JsonProperty("campaign")
    private CampaignShortLink campaign;
    
    
    
    
    
    @JsonProperty("redirects")
    private Redirects redirects;
    
    
    
    
    
    @JsonProperty("attribution")
    private Attribution attribution;
    
    
    
    
    
    @JsonProperty("social_media_tags")
    private SocialMediaTags socialMediaTags;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
}


/*
    Model: ShortLinkList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShortLinkList{
    
    
    
    
    
    @JsonProperty("items")
    private List<ShortLinkRes> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: ErrorRes
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ErrorRes{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}




/*
    Model: FailedResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FailedResponse{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CDN
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CDN{
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: Upload
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Upload{
    
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: StartResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StartResponse{
    
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: StartRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StartRequest{
    
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
}


/*
    Model: CompleteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CompleteResponse{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
}


/*
    Model: Opts
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Opts{
    
    
    
    
    
    @JsonProperty("attempts")
    private Integer attempts;
    
    
    
    
    
    @JsonProperty("timestamp")
    private Integer timestamp;
    
    
    
    
    
    @JsonProperty("delay")
    private Integer delay;
    
    
    
}


/*
    Model: CopyFileTask
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CopyFileTask{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("data")
    private BulkRequest data;
    
    
    
    
    
    @JsonProperty("opts")
    private Opts opts;
    
    
    
    
    
    @JsonProperty("progress")
    private Integer progress;
    
    
    
    
    
    @JsonProperty("delay")
    private Integer delay;
    
    
    
    
    
    @JsonProperty("timestamp")
    private Integer timestamp;
    
    
    
    
    
    @JsonProperty("attempts_made")
    private Integer attemptsMade;
    
    
    
    
    
    @JsonProperty("stacktrace")
    private List<String> stacktrace;
    
    
    
    
    
    @JsonProperty("finished_on")
    private Integer finishedOn;
    
    
    
    
    
    @JsonProperty("processed_on")
    private Integer processedOn;
    
    
    
}


/*
    Model: BulkResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BulkResponse{
    
    
    
    
    
    @JsonProperty("tracking_url")
    private String trackingUrl;
    
    
    
    
    
    @JsonProperty("task")
    private CopyFileTask task;
    
    
    
}


/*
    Model: ReqConfiguration
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReqConfiguration{
    
    
    
    
    
    @JsonProperty("concurrency")
    private Integer concurrency;
    
    
    
}


/*
    Model: Destination
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Destination{
    
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    
    @JsonProperty("rewrite")
    private String rewrite;
    
    
    
    
    
    @JsonProperty("basepath")
    private String basepath;
    
    
    
}


/*
    Model: BulkRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BulkRequest{
    
    
    
    
    
    @JsonProperty("urls")
    private List<String> urls;
    
    
    
    
    
    @JsonProperty("destination")
    private Destination destination;
    
    
    
    
    
    @JsonProperty("configuration")
    private ReqConfiguration configuration;
    
    
    
}


/*
    Model: Urls
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Urls{
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
    
    
    @JsonProperty("signed_url")
    private String signedUrl;
    
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
}


/*
    Model: SignUrlResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SignUrlResponse{
    
    
    
    
    
    @JsonProperty("urls")
    private List<Urls> urls;
    
    
    
}


/*
    Model: SignUrlRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SignUrlRequest{
    
    
    
    
    
    @JsonProperty("expiry")
    private Integer expiry;
    
    
    
    
    
    @JsonProperty("urls")
    private List<String> urls;
    
    
    
}


/*
    Model: DbRecord
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DbRecord{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("file_name")
    private String fileName;
    
    
    
    
    
    @JsonProperty("operation")
    private String operation;
    
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    
    @JsonProperty("content_type")
    private String contentType;
    
    
    
    
    
    @JsonProperty("file_path")
    private String filePath;
    
    
    
    
    
    @JsonProperty("upload")
    private Upload upload;
    
    
    
    
    
    @JsonProperty("cdn")
    private CDN cdn;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
}


/*
    Model: BrowseResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BrowseResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<DbRecord> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}




/*
    Model: ApplicationAboutResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationAboutResponse{
    
    
    
    
    
    @JsonProperty("application_info")
    private ApplicationInfo applicationInfo;
    
    
    
    
    
    @JsonProperty("company_info")
    private CompanyInfo companyInfo;
    
    
    
    
    
    @JsonProperty("owner_info")
    private OwnerInfo ownerInfo;
    
    
    
}


/*
    Model: ApplicationInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationInfo{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("domain")
    private Domain domain;
    
    
    
    
    
    @JsonProperty("website")
    private ApplicationWebsite website;
    
    
    
    
    
    @JsonProperty("cors")
    private ApplicationCors cors;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("meta")
    private ApplicationMeta meta;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("banner")
    private SecureUrl banner;
    
    
    
    
    
    @JsonProperty("logo")
    private SecureUrl logo;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
}


/*
    Model: CompanyInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CompanyInfo{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("addresses")
    private List<CompanyAboutAddress> addresses;
    
    
    
    
    
    @JsonProperty("notification_emails")
    private List<String> notificationEmails;
    
    
    
}


/*
    Model: OwnerInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OwnerInfo{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("emails")
    private List<UserEmail> emails;
    
    
    
    
    
    @JsonProperty("phone_numbers")
    private List<UserPhoneNumber> phoneNumbers;
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("profile_pic")
    private String profilePic;
    
    
    
}


/*
    Model: AppVersionRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AppVersionRequest{
    
    
    
    
    
    @JsonProperty("application")
    private ApplicationVersionRequest application;
    
    
    
    
    
    @JsonProperty("device")
    private Device device;
    
    
    
    
    
    @JsonProperty("locale")
    private String locale;
    
    
    
    
    
    @JsonProperty("timezone")
    private String timezone;
    
    
    
}


/*
    Model: ApplicationVersionRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationVersionRequest{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("namespace")
    private String namespace;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
}


/*
    Model: Device
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Device{
    
    
    
    
    
    @JsonProperty("build")
    private Integer build;
    
    
    
    
    
    @JsonProperty("model")
    private String model;
    
    
    
    
    
    @JsonProperty("os")
    private OS os;
    
    
    
}


/*
    Model: OS
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OS{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
}


/*
    Model: SupportedLanguage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SupportedLanguage{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: LanguageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LanguageResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<SupportedLanguage> items;
    
    
    
}


/*
    Model: AppStaffResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AppStaffResponse{
    
    
    
    
    
    @JsonProperty("staff_users")
    private List<AppStaff> staffUsers;
    
    
    
}


/*
    Model: UpdateDialog
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateDialog{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("interval")
    private Integer interval;
    
    
    
}


/*
    Model: OrderingStoreSelectRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderingStoreSelectRequest{
    
    
    
    
    
    @JsonProperty("ordering_store")
    private OrderingStoreSelect orderingStore;
    
    
    
}


/*
    Model: OrderingStoreSelect
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderingStoreSelect{
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
}


/*
    Model: AppStaff
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AppStaff{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("order_incent")
    private Boolean orderIncent;
    
    
    
    
    
    @JsonProperty("stores")
    private List<Integer> stores;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("user")
    private String user;
    
    
    
    
    
    @JsonProperty("employee_code")
    private String employeeCode;
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
    
    
    @JsonProperty("profile_pic_url")
    private String profilePicUrl;
    
    
    
}


/*
    Model: AppTokenResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AppTokenResponse{
    
    
    
    
    
    @JsonProperty("tokens")
    private Tokens tokens;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: Tokens
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Tokens{
    
    
    
    
    
    @JsonProperty("firebase")
    private Firebase firebase;
    
    
    
    
    
    @JsonProperty("moengage")
    private Moengage moengage;
    
    
    
    
    
    @JsonProperty("segment")
    private Segment segment;
    
    
    
    
    
    @JsonProperty("gtm")
    private Gtm gtm;
    
    
    
    
    
    @JsonProperty("freshchat")
    private Freshchat freshchat;
    
    
    
    
    
    @JsonProperty("safetynet")
    private Safetynet safetynet;
    
    
    
    
    
    @JsonProperty("fynd_rewards")
    private FyndRewards fyndRewards;
    
    
    
    
    
    @JsonProperty("google_map")
    private GoogleMap googleMap;
    
    
    
}


/*
    Model: Firebase
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Firebase{
    
    
    
    
    
    @JsonProperty("credentials")
    private Credentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: Credentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Credentials{
    
    
    
    
    
    @JsonProperty("ios")
    private Ios ios;
    
    
    
    
    
    @JsonProperty("android")
    private Android android;
    
    
    
    
    
    @JsonProperty("project_id")
    @Getter(AccessLevel.NONE)
    private String projectId_b64;

    public String getProject_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.projectId_b64));
    }
    
    
    
    
    
    @JsonProperty("gcm_sender_id")
    @Getter(AccessLevel.NONE)
    private String gcmSenderId_b64;

    public String getGcm_sender_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.gcmSenderId_b64));
    }
    
    
    
    
    
    @JsonProperty("application_id")
    @Getter(AccessLevel.NONE)
    private String applicationId_b64;

    public String getApplication_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.applicationId_b64));
    }
    
    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: Ios
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Ios{
    
    
    
    
    
    @JsonProperty("application_id")
    @Getter(AccessLevel.NONE)
    private String applicationId_b64;

    public String getApplication_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.applicationId_b64));
    }
    
    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: Android
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Android{
    
    
    
    
    
    @JsonProperty("application_id")
    @Getter(AccessLevel.NONE)
    private String applicationId_b64;

    public String getApplication_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.applicationId_b64));
    }
    
    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: Moengage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Moengage{
    
    
    
    
    
    @JsonProperty("credentials")
    private MoengageCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: MoengageCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class MoengageCredentials{
    
    
    
    
    
    @JsonProperty("app_id")
    @Getter(AccessLevel.NONE)
    private String appId_b64;

    public String getApp_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.appId_b64));
    }
    
    
    
}


/*
    Model: Segment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Segment{
    
    
    
    
    
    @JsonProperty("credentials")
    private SegmentCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: SegmentCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SegmentCredentials{
    
    
    
    
    
    @JsonProperty("write_key")
    @Getter(AccessLevel.NONE)
    private String writeKey_b64;

    public String getWrite_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.writeKey_b64));
    }
    
    
    
}


/*
    Model: Gtm
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Gtm{
    
    
    
    
    
    @JsonProperty("credentials")
    private GtmCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: GtmCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GtmCredentials{
    
    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: Freshchat
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Freshchat{
    
    
    
    
    
    @JsonProperty("credentials")
    private FreshchatCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: FreshchatCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FreshchatCredentials{
    
    
    
    
    
    @JsonProperty("app_id")
    @Getter(AccessLevel.NONE)
    private String appId_b64;

    public String getApp_id_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.appId_b64));
    }
    
    
    
    
    
    @JsonProperty("app_key")
    @Getter(AccessLevel.NONE)
    private String appKey_b64;

    public String getApp_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.appKey_b64));
    }
    
    
    
    
    
    @JsonProperty("web_token")
    @Getter(AccessLevel.NONE)
    private String webToken_b64;

    public String getWeb_token_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.webToken_b64));
    }
    
    
    
}


/*
    Model: Safetynet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Safetynet{
    
    
    
    
    
    @JsonProperty("credentials")
    private SafetynetCredentials credentials;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: SafetynetCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SafetynetCredentials{
    
    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: FyndRewards
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FyndRewards{
    
    
    
    
    
    @JsonProperty("credentials")
    private FyndRewardsCredentials credentials;
    
    
    
}


/*
    Model: FyndRewardsCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FyndRewardsCredentials{
    
    
    
    
    
    @JsonProperty("public_key")
    @Getter(AccessLevel.NONE)
    private String publicKey_b64;

    public String getPublic_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.publicKey_b64));
    }
    
    
    
}


/*
    Model: GoogleMap
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GoogleMap{
    
    
    
    
    
    @JsonProperty("credentials")
    private GoogleMapCredentials credentials;
    
    
    
}


/*
    Model: GoogleMapCredentials
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GoogleMapCredentials{
    
    
    
    
    
    @JsonProperty("api_key")
    @Getter(AccessLevel.NONE)
    private String apiKey_b64;

    public String getApi_key_b64() {
        return new String(Base64.getDecoder()
                         .decode(this.apiKey_b64));
    }
    
    
    
}


/*
    Model: RewardPointsConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RewardPointsConfig{
    
    
    
    
    
    @JsonProperty("credit")
    private Credit credit;
    
    
    
    
    
    @JsonProperty("debit")
    private Debit debit;
    
    
    
}


/*
    Model: Credit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Credit{
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: Debit
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Debit{
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("auto_apply")
    private Boolean autoApply;
    
    
    
    
    
    @JsonProperty("strategy_channel")
    private String strategyChannel;
    
    
    
}


/*
    Model: ProductDetailFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductDetailFeature{
    
    
    
    
    
    @JsonProperty("similar")
    private List<String> similar;
    
    
    
    
    
    @JsonProperty("seller_selection")
    private Boolean sellerSelection;
    
    
    
    
    
    @JsonProperty("update_product_meta")
    private Boolean updateProductMeta;
    
    
    
    
    
    @JsonProperty("request_product")
    private Boolean requestProduct;
    
    
    
}


/*
    Model: LaunchPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LaunchPage{
    
    
    
    
    
    @JsonProperty("page_type")
    private String pageType;
    
    
    
    
    
    @JsonProperty("params")
    private Object params;
    
    
    
    
    
    @JsonProperty("query")
    private Object query;
    
    
    
}


/*
    Model: LandingPageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LandingPageFeature{
    
    
    
    
    
    @JsonProperty("launch_page")
    private LaunchPage launchPage;
    
    
    
    
    
    @JsonProperty("continue_as_guest")
    private Boolean continueAsGuest;
    
    
    
    
    
    @JsonProperty("login_btn_text")
    private String loginBtnText;
    
    
    
    
    
    @JsonProperty("show_domain_textbox")
    private Boolean showDomainTextbox;
    
    
    
    
    
    @JsonProperty("show_register_btn")
    private Boolean showRegisterBtn;
    
    
    
}


/*
    Model: RegistrationPageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RegistrationPageFeature{
    
    
    
    
    
    @JsonProperty("ask_store_address")
    private Boolean askStoreAddress;
    
    
    
}


/*
    Model: AppFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AppFeature{
    
    
    
    
    
    @JsonProperty("product_detail")
    private ProductDetailFeature productDetail;
    
    
    
    
    
    @JsonProperty("landing_page")
    private LandingPageFeature landingPage;
    
    
    
    
    
    @JsonProperty("registration_page")
    private RegistrationPageFeature registrationPage;
    
    
    
    
    
    @JsonProperty("home_page")
    private HomePageFeature homePage;
    
    
    
    
    
    @JsonProperty("common")
    private CommonFeature common;
    
    
    
    
    
    @JsonProperty("cart")
    private CartFeature cart;
    
    
    
    
    
    @JsonProperty("qr")
    private QrFeature qr;
    
    
    
    
    
    @JsonProperty("pcr")
    private PcrFeature pcr;
    
    
    
    
    
    @JsonProperty("order")
    private OrderFeature order;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: HomePageFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class HomePageFeature{
    
    
    
    
    
    @JsonProperty("order_processing")
    private Boolean orderProcessing;
    
    
    
}


/*
    Model: CommonFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommonFeature{
    
    
    
    
    
    @JsonProperty("communication_optin_dialog")
    private CommunicationOptinDialogFeature communicationOptinDialog;
    
    
    
    
    
    @JsonProperty("deployment_store_selection")
    private DeploymentStoreSelectionFeature deploymentStoreSelection;
    
    
    
    
    
    @JsonProperty("listing_price")
    private ListingPriceFeature listingPrice;
    
    
    
    
    
    @JsonProperty("currency")
    private CurrencyFeature currency;
    
    
    
    
    
    @JsonProperty("revenue_engine")
    private RevenueEngineFeature revenueEngine;
    
    
    
    
    
    @JsonProperty("feedback")
    private FeedbackFeature feedback;
    
    
    
    
    
    @JsonProperty("compare_products")
    private CompareProductsFeature compareProducts;
    
    
    
    
    
    @JsonProperty("reward_points")
    private RewardPointsConfig rewardPoints;
    
    
    
}


/*
    Model: CommunicationOptinDialogFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommunicationOptinDialogFeature{
    
    
    
    
    
    @JsonProperty("visibility")
    private Boolean visibility;
    
    
    
}


/*
    Model: DeploymentStoreSelectionFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DeploymentStoreSelectionFeature{
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ListingPriceFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ListingPriceFeature{
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: CurrencyFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CurrencyFeature{
    
    
    
    
    
    @JsonProperty("value")
    private List<String> value;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("default_currency")
    private String defaultCurrency;
    
    
    
}


/*
    Model: RevenueEngineFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RevenueEngineFeature{
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: FeedbackFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FeedbackFeature{
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: CompareProductsFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CompareProductsFeature{
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: CartFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartFeature{
    
    
    
    
    
    @JsonProperty("gst_input")
    private Boolean gstInput;
    
    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
    
    
    @JsonProperty("placing_for_customer")
    private Boolean placingForCustomer;
    
    
    
    
    
    @JsonProperty("google_map")
    private Boolean googleMap;
    
    
    
    
    
    @JsonProperty("revenue_engine_coupon")
    private Boolean revenueEngineCoupon;
    
    
    
}


/*
    Model: QrFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class QrFeature{
    
    
    
    
    
    @JsonProperty("application")
    private Boolean application;
    
    
    
    
    
    @JsonProperty("products")
    private Boolean products;
    
    
    
    
    
    @JsonProperty("collections")
    private Boolean collections;
    
    
    
}


/*
    Model: PcrFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PcrFeature{
    
    
    
    
    
    @JsonProperty("staff_selection")
    private Boolean staffSelection;
    
    
    
}


/*
    Model: OrderFeature
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderFeature{
    
    
    
    
    
    @JsonProperty("buy_again")
    private Boolean buyAgain;
    
    
    
}


/*
    Model: AppFeatureRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AppFeatureRequest{
    
    
    
    
    
    @JsonProperty("feature")
    private AppFeature feature;
    
    
    
}


/*
    Model: AppFeatureResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AppFeatureResponse{
    
    
    
    
    
    @JsonProperty("feature")
    private AppFeature feature;
    
    
    
}


/*
    Model: Currency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Currency{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("decimal_digits")
    private Integer decimalDigits;
    
    
    
    
    
    @JsonProperty("symbol")
    private String symbol;
    
    
    
}


/*
    Model: Domain
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Domain{
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("is_primary")
    private Boolean isPrimary;
    
    
    
    
    
    @JsonProperty("is_shortlink")
    private Boolean isShortlink;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: ApplicationWebsite
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationWebsite{
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("basepath")
    private String basepath;
    
    
    
}


/*
    Model: ApplicationCors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationCors{
    
    
    
    
    
    @JsonProperty("domains")
    private List<String> domains;
    
    
    
}


/*
    Model: ApplicationAuth
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationAuth{
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
}


/*
    Model: ApplicationRedirections
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationRedirections{
    
    
    
    
    
    @JsonProperty("from")
    private String from;
    
    
    
    
    
    @JsonProperty("redirect_to")
    private String redirectTo;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ApplicationMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationMeta{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
}


/*
    Model: SecureUrl
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SecureUrl{
    
    
    
    
    
    @JsonProperty("secure_url")
    private String secureUrl;
    
    
    
}


/*
    Model: Application
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Application{
    
    
    
    
    
    @JsonProperty("website")
    private ApplicationWebsite website;
    
    
    
    
    
    @JsonProperty("cors")
    private ApplicationCors cors;
    
    
    
    
    
    @JsonProperty("auth")
    private ApplicationAuth auth;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("channel_type")
    private String channelType;
    
    
    
    
    
    @JsonProperty("cache_ttl")
    private Integer cacheTtl;
    
    
    
    
    
    @JsonProperty("is_internal")
    private Boolean isInternal;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("owner")
    private String owner;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
    
    
    @JsonProperty("token")
    private String token;
    
    
    
    
    
    @JsonProperty("redirections")
    private List<ApplicationRedirections> redirections;
    
    
    
    
    
    @JsonProperty("meta")
    private List<ApplicationMeta> meta;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
    
    
    @JsonProperty("banner")
    private SecureUrl banner;
    
    
    
    
    
    @JsonProperty("logo")
    private SecureUrl logo;
    
    
    
    
    
    @JsonProperty("favicon")
    private SecureUrl favicon;
    
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
    
    @JsonProperty("app_type")
    private String appType;
    
    
    
    
    
    @JsonProperty("mobile_logo")
    private SecureUrl mobileLogo;
    
    
    
    
    
    @JsonProperty("domain")
    private Domain domain;
    
    
    
}


/*
    Model: NotFound
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NotFound{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: UnhandledError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UnhandledError{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: InvalidPayloadRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InvalidPayloadRequest{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: SuccessMessageResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SuccessMessageResponse{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: InventoryBrandRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InventoryBrandRule{
    
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
}


/*
    Model: StoreCriteriaRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreCriteriaRule{
    
    
    
    
    
    @JsonProperty("companies")
    private List<Integer> companies;
    
    
    
    
    
    @JsonProperty("brands")
    private List<Integer> brands;
    
    
    
}


/*
    Model: InventoryStoreRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InventoryStoreRule{
    
    
    
    
    
    @JsonProperty("criteria")
    private String criteria;
    
    
    
    
    
    @JsonProperty("rules")
    private List<StoreCriteriaRule> rules;
    
    
    
    
    
    @JsonProperty("stores")
    private List<Integer> stores;
    
    
    
}


/*
    Model: InventoryPaymentConfig
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InventoryPaymentConfig{
    
    
    
    
    
    @JsonProperty("mode_of_payment")
    private String modeOfPayment;
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
}


/*
    Model: StorePriorityRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StorePriorityRule{
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("storetype_order")
    private List<String> storetypeOrder;
    
    
    
}


/*
    Model: ArticleAssignmentRule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ArticleAssignmentRule{
    
    
    
    
    
    @JsonProperty("store_priority")
    private StorePriorityRule storePriority;
    
    
    
}


/*
    Model: InventoryArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InventoryArticleAssignment{
    
    
    
    
    
    @JsonProperty("post_order_reassignment")
    private Boolean postOrderReassignment;
    
    
    
    
    
    @JsonProperty("rules")
    private ArticleAssignmentRule rules;
    
    
    
}


/*
    Model: CompanyAboutAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CompanyAboutAddress{
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
}


/*
    Model: UserEmail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UserEmail{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: UserPhoneNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UserPhoneNumber{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("primary")
    private Boolean primary;
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("country_code")
    private Integer countryCode;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
}


/*
    Model: ApplicationInformation
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationInformation{
    
    
    
    
    
    @JsonProperty("address")
    private InformationAddress address;
    
    
    
    
    
    @JsonProperty("support")
    private InformationSupport support;
    
    
    
    
    
    @JsonProperty("social_links")
    private SocialLinks socialLinks;
    
    
    
    
    
    @JsonProperty("links")
    private Links links;
    
    
    
    
    
    @JsonProperty("copyright_text")
    private String copyrightText;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("business_highlights")
    private BusinessHighlights businessHighlights;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}


/*
    Model: InformationAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InformationAddress{
    
    
    
    
    
    @JsonProperty("loc")
    private String loc;
    
    
    
    
    
    @JsonProperty("address_line")
    private List<String> addressLine;
    
    
    
    
    
    @JsonProperty("phone")
    private InformationPhone phone;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
}


/*
    Model: InformationPhone
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InformationPhone{
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("number")
    private String number;
    
    
    
}


/*
    Model: InformationSupport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InformationSupport{
    
    
    
    
    
    @JsonProperty("phone")
    private List<String> phone;
    
    
    
    
    
    @JsonProperty("email")
    private List<String> email;
    
    
    
    
    
    @JsonProperty("timing")
    private String timing;
    
    
    
}


/*
    Model: SocialLinks
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SocialLinks{
    
    
    
    
    
    @JsonProperty("facebook")
    private FacebookLink facebook;
    
    
    
    
    
    @JsonProperty("instagram")
    private InstagramLink instagram;
    
    
    
    
    
    @JsonProperty("twitter")
    private TwitterLink twitter;
    
    
    
    
    
    @JsonProperty("pinterest")
    private PinterestLink pinterest;
    
    
    
    
    
    @JsonProperty("google_plus")
    private GooglePlusLink googlePlus;
    
    
    
    
    
    @JsonProperty("youtube")
    private YoutubeLink youtube;
    
    
    
    
    
    @JsonProperty("linked_in")
    private LinkedInLink linkedIn;
    
    
    
    
    
    @JsonProperty("vimeo")
    private VimeoLink vimeo;
    
    
    
    
    
    @JsonProperty("blog_link")
    private BlogLink blogLink;
    
    
    
}


/*
    Model: FacebookLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FacebookLink{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: InstagramLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InstagramLink{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: TwitterLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TwitterLink{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: PinterestLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PinterestLink{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: GooglePlusLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GooglePlusLink{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: YoutubeLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class YoutubeLink{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: LinkedInLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LinkedInLink{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: VimeoLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VimeoLink{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: BlogLink
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BlogLink{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: Links
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Links{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("link")
    private String link;
    
    
    
}


/*
    Model: BusinessHighlights
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BusinessHighlights{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("icon")
    private String icon;
    
    
    
    
    
    @JsonProperty("sub_title")
    private String subTitle;
    
    
    
}


/*
    Model: ApplicationDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationDetail{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("logo")
    private SecureUrl logo;
    
    
    
    
    
    @JsonProperty("mobile_logo")
    private SecureUrl mobileLogo;
    
    
    
    
    
    @JsonProperty("favicon")
    private SecureUrl favicon;
    
    
    
    
    
    @JsonProperty("banner")
    private SecureUrl banner;
    
    
    
    
    
    @JsonProperty("domain")
    private Domain domain;
    
    
    
    
    
    @JsonProperty("domains")
    private List<Domain> domains;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
}


/*
    Model: CurrenciesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CurrenciesResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<Currency> items;
    
    
    
}


/*
    Model: DefaultCurrency
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DefaultCurrency{
    
    
    
    
    
    @JsonProperty("ref")
    private String ref;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: AppCurrencyResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AppCurrencyResponse{
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("default_currency")
    private DefaultCurrency defaultCurrency;
    
    
    
    
    
    @JsonProperty("supported_currency")
    private List<Currency> supportedCurrency;
    
    
    
}


/*
    Model: StoreLatLong
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreLatLong{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("coordinates")
    private List<Double> coordinates;
    
    
    
}


/*
    Model: OptedStoreAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OptedStoreAddress{
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    
    @JsonProperty("lat_long")
    private StoreLatLong latLong;
    
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
}


/*
    Model: OrderingStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderingStore{
    
    
    
    
    
    @JsonProperty("address")
    private OptedStoreAddress address;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("store_type")
    private String storeType;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: OrderingStores
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderingStores{
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("items")
    private List<OrderingStore> items;
    
    
    
    
    
    @JsonProperty("deployed_stores")
    private List<Integer> deployedStores;
    
    
    
    
    
    @JsonProperty("all_stores")
    private Boolean allStores;
    
    
    
    
    
    @JsonProperty("enabled")
    private Boolean enabled;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("app")
    private String app;
    
    
    
    
    
    @JsonProperty("__v")
    private Integer v;
    
    
    
}




/*
    Model: AggregatorConfigDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AggregatorConfigDetail{
    
    
    
    
    
    @JsonProperty("secret")
    private String secret;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
    
    
    @JsonProperty("config_type")
    private String configType;
    
    
    
    
    
    @JsonProperty("merchant_id")
    private String merchantId;
    
    
    
    
    
    @JsonProperty("api")
    private String api;
    
    
    
    
    
    @JsonProperty("verify_api")
    private String verifyApi;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
    
    
    @JsonProperty("sdk")
    private Boolean sdk;
    
    
    
    
    
    @JsonProperty("pin")
    private String pin;
    
    
    
    
    
    @JsonProperty("merchant_key")
    private String merchantKey;
    
    
    
}


/*
    Model: AggregatorsConfigDetailResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AggregatorsConfigDetailResponse{
    
    
    
    
    
    @JsonProperty("stripe")
    private AggregatorConfigDetail stripe;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("rupifi")
    private AggregatorConfigDetail rupifi;
    
    
    
    
    
    @JsonProperty("env")
    private String env;
    
    
    
    
    
    @JsonProperty("juspay")
    private AggregatorConfigDetail juspay;
    
    
    
    
    
    @JsonProperty("payumoney")
    private AggregatorConfigDetail payumoney;
    
    
    
    
    
    @JsonProperty("mswipe")
    private AggregatorConfigDetail mswipe;
    
    
    
    
    
    @JsonProperty("razorpay")
    private AggregatorConfigDetail razorpay;
    
    
    
    
    
    @JsonProperty("simpl")
    private AggregatorConfigDetail simpl;
    
    
    
    
    
    @JsonProperty("ccavenue")
    private AggregatorConfigDetail ccavenue;
    
    
    
}


/*
    Model: ErrorCodeAndDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ErrorCodeAndDescription{
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: HttpErrorCodeAndResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class HttpErrorCodeAndResponse{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("error")
    private ErrorCodeAndDescription error;
    
    
    
}


/*
    Model: AttachCardRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AttachCardRequest{
    
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    
    @JsonProperty("name_on_card")
    private String nameOnCard;
    
    
    
    
    
    @JsonProperty("refresh")
    private Boolean refresh;
    
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
}


/*
    Model: AttachCardsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AttachCardsResponse{
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: CardPaymentGateway
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CardPaymentGateway{
    
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("api")
    private String api;
    
    
    
}


/*
    Model: ActiveCardPaymentGatewayResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ActiveCardPaymentGatewayResponse{
    
    
    
    
    
    @JsonProperty("cards")
    private CardPaymentGateway cards;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: Card
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Card{
    
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
}


/*
    Model: ListCardsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ListCardsResponse{
    
    
    
    
    
    @JsonProperty("data")
    private List<Card> data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: DeletehCardRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DeletehCardRequest{
    
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
}


/*
    Model: DeleteCardsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DeleteCardsResponse{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ValidateCustomerRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ValidateCustomerRequest{
    
    
    
    
    
    @JsonProperty("merchant_params")
    private Object merchantParams;
    
    
    
    
    
    @JsonProperty("payload")
    private String payload;
    
    
    
    
    
    @JsonProperty("transaction_amount_in_paise")
    private Integer transactionAmountInPaise;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("phone_number")
    private String phoneNumber;
    
    
    
}


/*
    Model: ValidateCustomerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ValidateCustomerResponse{
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: ChargeCustomerRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ChargeCustomerRequest{
    
    
    
    
    
    @JsonProperty("verified")
    private Boolean verified;
    
    
    
    
    
    @JsonProperty("transaction_token")
    private String transactionToken;
    
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
}


/*
    Model: ChargeCustomerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ChargeCustomerResponse{
    
    
    
    
    
    @JsonProperty("cart_id")
    private String cartId;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("delivery_address_id")
    private String deliveryAddressId;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
}


/*
    Model: PaymentInitializationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentInitializationRequest{
    
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("virtual_id")
    private String virtualId;
    
    
    
    
    
    @JsonProperty("polling_url")
    private String pollingUrl;
    
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
}


/*
    Model: PaymentInitializationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentInitializationResponse{
    
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("bqr_image")
    private String bqrImage;
    
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    
    @JsonProperty("razorpay_payment_id")
    private String razorpayPaymentId;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    
    @JsonProperty("virtual_id")
    private String virtualId;
    
    
    
    
    
    @JsonProperty("polling_url")
    private String pollingUrl;
    
    
    
    
    
    @JsonProperty("aggregator_order_id")
    private String aggregatorOrderId;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: PaymentStatusUpdateRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentStatusUpdateRequest{
    
    
    
    
    
    @JsonProperty("customer_id")
    private String customerId;
    
    
    
    
    
    @JsonProperty("merchant_order_id")
    private String merchantOrderId;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
    
    
    @JsonProperty("method")
    private String method;
    
    
    
    
    
    @JsonProperty("amount")
    private Integer amount;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("contact")
    private String contact;
    
    
    
}


/*
    Model: PaymentStatusUpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentStatusUpdateResponse{
    
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("retry")
    private Boolean retry;
    
    
    
}


/*
    Model: AggregatorRoute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AggregatorRoute{
    
    
    
    
    
    @JsonProperty("api_link")
    private String apiLink;
    
    
    
    
    
    @JsonProperty("payment_flow")
    private String paymentFlow;
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
}


/*
    Model: PaymentFlow
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentFlow{
    
    
    
    
    
    @JsonProperty("stripe")
    private AggregatorRoute stripe;
    
    
    
    
    
    @JsonProperty("fynd")
    private AggregatorRoute fynd;
    
    
    
    
    
    @JsonProperty("rupifi")
    private AggregatorRoute rupifi;
    
    
    
    
    
    @JsonProperty("upi_razorpay")
    private AggregatorRoute upiRazorpay;
    
    
    
    
    
    @JsonProperty("msipe")
    private AggregatorRoute msipe;
    
    
    
    
    
    @JsonProperty("juspay")
    private AggregatorRoute juspay;
    
    
    
    
    
    @JsonProperty("bqr_razorpay")
    private AggregatorRoute bqrRazorpay;
    
    
    
    
    
    @JsonProperty("payubiz")
    private AggregatorRoute payubiz;
    
    
    
    
    
    @JsonProperty("razorpay")
    private AggregatorRoute razorpay;
    
    
    
    
    
    @JsonProperty("simpl")
    private AggregatorRoute simpl;
    
    
    
    
    
    @JsonProperty("ccavenue")
    private AggregatorRoute ccavenue;
    
    
    
}


/*
    Model: PaymentModeLogo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentModeLogo{
    
    
    
    
    
    @JsonProperty("large")
    private String large;
    
    
    
    
    
    @JsonProperty("small")
    private String small;
    
    
    
}


/*
    Model: PaymentModeList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentModeList{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("fynd_vpa")
    private String fyndVpa;
    
    
    
    
    
    @JsonProperty("card_name")
    private String cardName;
    
    
    
    
    
    @JsonProperty("card_id")
    private String cardId;
    
    
    
    
    
    @JsonProperty("card_fingerprint")
    private String cardFingerprint;
    
    
    
    
    
    @JsonProperty("intent_app_error_list")
    private List<String> intentAppErrorList;
    
    
    
    
    
    @JsonProperty("card_reference")
    private String cardReference;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("intent_flow")
    private String intentFlow;
    
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    
    @JsonProperty("exp_year")
    private Integer expYear;
    
    
    
    
    
    @JsonProperty("expired")
    private Boolean expired;
    
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    
    @JsonProperty("exp_month")
    private Integer expMonth;
    
    
    
    
    
    @JsonProperty("timeout")
    private Integer timeout;
    
    
    
    
    
    @JsonProperty("card_brand_image")
    private String cardBrandImage;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("card_type")
    private String cardType;
    
    
    
    
    
    @JsonProperty("nickname")
    private String nickname;
    
    
    
    
    
    @JsonProperty("card_brand")
    private String cardBrand;
    
    
    
    
    
    @JsonProperty("retry_count")
    private Integer retryCount;
    
    
    
    
    
    @JsonProperty("card_issuer")
    private String cardIssuer;
    
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    
    @JsonProperty("card_isin")
    private String cardIsin;
    
    
    
    
    
    @JsonProperty("card_token")
    private String cardToken;
    
    
    
    
    
    @JsonProperty("card_number")
    private String cardNumber;
    
    
    
    
    
    @JsonProperty("logo_url")
    private PaymentModeLogo logoUrl;
    
    
    
}


/*
    Model: RootPaymentMode
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RootPaymentMode{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("anonymous_enable")
    private Boolean anonymousEnable;
    
    
    
    
    
    @JsonProperty("display_priority")
    private Integer displayPriority;
    
    
    
    
    
    @JsonProperty("add_card_enabled")
    private Boolean addCardEnabled;
    
    
    
    
    
    @JsonProperty("aggregator_name")
    private String aggregatorName;
    
    
    
    
    
    @JsonProperty("list")
    private List<PaymentModeList> list;
    
    
    
}


/*
    Model: PaymentOptionAndFlow
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentOptionAndFlow{
    
    
    
    
    
    @JsonProperty("payment_flows")
    private PaymentFlow paymentFlows;
    
    
    
    
    
    @JsonProperty("payment_option")
    private List<RootPaymentMode> paymentOption;
    
    
    
}


/*
    Model: PaymentModeRouteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PaymentModeRouteResponse{
    
    
    
    
    
    @JsonProperty("payment_options")
    private PaymentOptionAndFlow paymentOptions;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: RupifiBannerData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RupifiBannerData{
    
    
    
    
    
    @JsonProperty("kyc_url")
    private String kycUrl;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: RupifiBannerResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RupifiBannerResponse{
    
    
    
    
    
    @JsonProperty("data")
    private RupifiBannerData data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: TransferItemsDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TransferItemsDetails{
    
    
    
    
    
    @JsonProperty("logo_large")
    private String logoLarge;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo_small")
    private String logoSmall;
    
    
    
    
    
    @JsonProperty("display_name")
    private Boolean displayName;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: TransferModeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TransferModeDetails{
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("items")
    private List<TransferItemsDetails> items;
    
    
    
}


/*
    Model: TransferModeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TransferModeResponse{
    
    
    
    
    
    @JsonProperty("data")
    private List<TransferModeDetails> data;
    
    
    
}


/*
    Model: UpdateRefundTransferModeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateRefundTransferModeRequest{
    
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    
    @JsonProperty("enable")
    private Boolean enable;
    
    
    
}


/*
    Model: UpdateRefundTransferModeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateRefundTransferModeResponse{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: OrderBeneficiaryDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderBeneficiaryDetails{
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("delights_user_name")
    private String delightsUserName;
    
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
    
    
    @JsonProperty("branch_name")
    private Boolean branchName;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    
    @JsonProperty("comment")
    private Boolean comment;
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    
    @JsonProperty("is_active")
    private Boolean isActive;
    
    
    
    
    
    @JsonProperty("mobile")
    private Boolean mobile;
    
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("subtitle")
    private String subtitle;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: OrderBeneficiaryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderBeneficiaryResponse{
    
    
    
    
    
    @JsonProperty("show_beneficiary_details")
    private Boolean showBeneficiaryDetails;
    
    
    
    
    
    @JsonProperty("beneficiaries")
    private List<OrderBeneficiaryDetails> beneficiaries;
    
    
    
}


/*
    Model: NotFoundResourceError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NotFoundResourceError{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: IfscCodeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class IfscCodeResponse{
    
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
}


/*
    Model: ErrorCodeDescription
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ErrorCodeDescription{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
}


/*
    Model: AddBeneficiaryViaOtpVerificationRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddBeneficiaryViaOtpVerificationRequest{
    
    
    
    
    
    @JsonProperty("hash_key")
    private String hashKey;
    
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
}


/*
    Model: AddBeneficiaryViaOtpVerificationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddBeneficiaryViaOtpVerificationResponse{
    
    
    
    
    
    @JsonProperty("hash_key")
    private String hashKey;
    
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
}


/*
    Model: WrongOtpError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class WrongOtpError{
    
    
    
    
    
    @JsonProperty("success")
    private String success;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
}


/*
    Model: BeneficiaryModeDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BeneficiaryModeDetails{
    
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    
    @JsonProperty("wallet")
    private String wallet;
    
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    
    @JsonProperty("vpa")
    private String vpa;
    
    
    
}


/*
    Model: AddBeneficiaryDetailsRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddBeneficiaryDetailsRequest{
    
    
    
    
    
    @JsonProperty("details")
    private BeneficiaryModeDetails details;
    
    
    
    
    
    @JsonProperty("transfer_mode")
    private String transferMode;
    
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    
    @JsonProperty("delights")
    private Boolean delights;
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("otp")
    private String otp;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
}


/*
    Model: RefundAccountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RefundAccountResponse{
    
    
    
    
    
    @JsonProperty("data")
    private Object data;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: BankDetailsForOTP
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BankDetailsForOTP{
    
    
    
    
    
    @JsonProperty("branch_name")
    private String branchName;
    
    
    
    
    
    @JsonProperty("account_holder")
    private String accountHolder;
    
    
    
    
    
    @JsonProperty("ifsc_code")
    private String ifscCode;
    
    
    
    
    
    @JsonProperty("bank_name")
    private String bankName;
    
    
    
    
    
    @JsonProperty("account_no")
    private String accountNo;
    
    
    
}


/*
    Model: AddBeneficiaryDetailsOTPRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddBeneficiaryDetailsOTPRequest{
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("details")
    private BankDetailsForOTP details;
    
    
    
}


/*
    Model: WalletOtpRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class WalletOtpRequest{
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
}


/*
    Model: WalletOtpResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class WalletOtpResponse{
    
    
    
    
    
    @JsonProperty("is_verified_flag")
    private String isVerifiedFlag;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
}


/*
    Model: SetDefaultBeneficiaryRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SetDefaultBeneficiaryRequest{
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("beneficiary_id")
    private String beneficiaryId;
    
    
    
}


/*
    Model: SetDefaultBeneficiaryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SetDefaultBeneficiaryResponse{
    
    
    
    
    
    @JsonProperty("is_beneficiary_set")
    private Boolean isBeneficiarySet;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}




/*
    Model: OrderById
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderById{
    
    
    
    
    
    @JsonProperty("order")
    private OrderSchema order;
    
    
    
}


/*
    Model: OrderList
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderList{
    
    
    
    
    
    @JsonProperty("items")
    private List<OrderSchema> items;
    
    
    
    
    
    @JsonProperty("page")
    private OrderPage page;
    
    
    
    
    
    @JsonProperty("filters")
    private OrderFilters filters;
    
    
    
}


/*
    Model: OrderPage
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderPage{
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
}


/*
    Model: OrderFilters
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderFilters{
    
    
    
    
    
    @JsonProperty("statuses")
    private List<OrderStatuses> statuses;
    
    
    
}


/*
    Model: OrderStatuses
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderStatuses{
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("value")
    private Integer value;
    
    
    
    
    
    @JsonProperty("is_selected")
    private Boolean isSelected;
    
    
    
}


/*
    Model: ReqBodyVerifyOTPShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReqBodyVerifyOTPShipment{
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("otp_code")
    private String otpCode;
    
    
    
}


/*
    Model: ResponseVerifyOTPShipment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ResponseVerifyOTPShipment{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
}


/*
    Model: sendOTPApplicationResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class sendOTPApplicationResponse{
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("resend_timer")
    private Integer resendTimer;
    
    
    
}


/*
    Model: ShipmentById
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentById{
    
    
    
    
    
    @JsonProperty("shipment")
    private Shipments shipment;
    
    
    
}


/*
    Model: CustomerDetailsByShipmentId
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CustomerDetailsByShipmentId{
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
}


/*
    Model: ShipmentReasons
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentReasons{
    
    
    
    
    
    @JsonProperty("reasons")
    private List<Reasons> reasons;
    
    
    
}


/*
    Model: ShipmentStatusUpdateBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentStatusUpdateBody{
    
    
    
    
    
    @JsonProperty("statuses")
    private List<StatusesBody> statuses;
    
    
    
    
    
    @JsonProperty("force_transition")
    private Boolean forceTransition;
    
    
    
}


/*
    Model: StatusesBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StatusesBody{
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("shipments")
    private Object shipments;
    
    
    
}


/*
    Model: ShipmentStatusUpdate
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentStatusUpdate{
    
    
    
    
    
    @JsonProperty("message")
    private List<Object> message;
    
    
    
    
    
    @JsonProperty("status")
    private Boolean status;
    
    
    
}


/*
    Model: ShipmentTrack
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentTrack{
    
    
    
    
    
    @JsonProperty("results")
    private List<Track> results;
    
    
    
}


/*
    Model: OrderSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderSchema{
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("breakup_values")
    private List<BreakupValues> breakupValues;
    
    
    
    
    
    @JsonProperty("order_created_time")
    private String orderCreatedTime;
    
    
    
    
    
    @JsonProperty("shipments")
    private List<Shipments> shipments;
    
    
    
    
    
    @JsonProperty("total_shipments_in_order")
    private Integer totalShipmentsInOrder;
    
    
    
    
    
    @JsonProperty("user_info")
    private UserInfo userInfo;
    
    
    
    
    
    @JsonProperty("bags_for_reorder")
    private List<BagsForReorder> bagsForReorder;
    
    
    
}


/*
    Model: BagsForReorder
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BagsForReorder{
    
    
    
    
    
    @JsonProperty("item_id")
    private Integer itemId;
    
    
    
    
    
    @JsonProperty("item_size")
    private String itemSize;
    
    
    
    
    
    @JsonProperty("store_id")
    private Integer storeId;
    
    
    
    
    
    @JsonProperty("seller_id")
    private Integer sellerId;
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("article_assignment")
    private BagsForReorderArticleAssignment articleAssignment;
    
    
    
}


/*
    Model: BagsForReorderArticleAssignment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BagsForReorderArticleAssignment{
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
    
    
    @JsonProperty("strategy")
    private String strategy;
    
    
    
}


/*
    Model: PosOrderById
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PosOrderById{
    
    
    
    
    
    @JsonProperty("order")
    private OrderSchema order;
    
    
    
}


/*
    Model: Bags
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Bags{
    
    
    
    
    
    @JsonProperty("item")
    private Item item;
    
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    
    @JsonProperty("current_status")
    private CurrentStatus currentStatus;
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("financial_breakup")
    private List<FinancialBreakup> financialBreakup;
    
    
    
}


/*
    Model: Item
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Item{
    
    
    
    
    
    @JsonProperty("brand")
    private ItemBrand brand;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("slug_key")
    private String slugKey;
    
    
    
    
    
    @JsonProperty("image")
    private List<String> image;
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("id")
    private Double id;
    
    
    
}


/*
    Model: Prices
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Prices{
    
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Double amountPaidRoundoff;
    
    
    
    
    
    @JsonProperty("fynd_credits")
    private Double fyndCredits;
    
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    
    @JsonProperty("cashback")
    private Double cashback;
    
    
    
    
    
    @JsonProperty("added_to_fynd_cash")
    private Boolean addedToFyndCash;
    
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    
    @JsonProperty("transfer_price")
    private Double transferPrice;
    
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    
    @JsonProperty("refund_credit")
    private Double refundCredit;
    
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    
    @JsonProperty("refund_amount")
    private Double refundAmount;
    
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Double gstTaxPercentage;
    
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
}


/*
    Model: CurrentStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CurrentStatus{
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("journey_type")
    private String journeyType;
    
    
    
}


/*
    Model: FinancialBreakup
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FinancialBreakup{
    
    
    
    
    
    @JsonProperty("brand_calculated_amount")
    private Double brandCalculatedAmount;
    
    
    
    
    
    @JsonProperty("coupon_value")
    private Double couponValue;
    
    
    
    
    
    @JsonProperty("amount_paid_roundoff")
    private Double amountPaidRoundoff;
    
    
    
    
    
    @JsonProperty("gst_fee")
    private String gstFee;
    
    
    
    
    
    @JsonProperty("refund_credit")
    private Double refundCredit;
    
    
    
    
    
    @JsonProperty("cashback")
    private Double cashback;
    
    
    
    
    
    @JsonProperty("refund_amount")
    private Double refundAmount;
    
    
    
    
    
    @JsonProperty("value_of_good")
    private Double valueOfGood;
    
    
    
    
    
    @JsonProperty("promotion_effective_discount")
    private Double promotionEffectiveDiscount;
    
    
    
    
    
    @JsonProperty("size")
    private String size;
    
    
    
    
    
    @JsonProperty("total_units")
    private Integer totalUnits;
    
    
    
    
    
    @JsonProperty("discount")
    private Double discount;
    
    
    
    
    
    @JsonProperty("amount_paid")
    private Double amountPaid;
    
    
    
    
    
    @JsonProperty("fynd_credits")
    private Double fyndCredits;
    
    
    
    
    
    @JsonProperty("added_to_fynd_cash")
    private Boolean addedToFyndCash;
    
    
    
    
    
    @JsonProperty("delivery_charge")
    private Double deliveryCharge;
    
    
    
    
    
    @JsonProperty("hsn_code")
    private String hsnCode;
    
    
    
    
    
    @JsonProperty("coupon_effective_discount")
    private Double couponEffectiveDiscount;
    
    
    
    
    
    @JsonProperty("transfer_price")
    private Double transferPrice;
    
    
    
    
    
    @JsonProperty("identifiers")
    private Identifiers identifiers;
    
    
    
    
    
    @JsonProperty("gst_tag")
    private String gstTag;
    
    
    
    
    
    @JsonProperty("price_marked")
    private Double priceMarked;
    
    
    
    
    
    @JsonProperty("price_effective")
    private Double priceEffective;
    
    
    
    
    
    @JsonProperty("cod_charges")
    private Double codCharges;
    
    
    
    
    
    @JsonProperty("item_name")
    private String itemName;
    
    
    
    
    
    @JsonProperty("cashback_applied")
    private Double cashbackApplied;
    
    
    
    
    
    @JsonProperty("gst_tax_percentage")
    private Double gstTaxPercentage;
    
    
    
}


/*
    Model: Identifiers
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Identifiers{
    
    
    
    
    
    @JsonProperty("ean")
    private String ean;
    
    
    
    
    
    @JsonProperty("sku_code")
    private String skuCode;
    
    
    
}


/*
    Model: ItemBrand
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ItemBrand{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
}


/*
    Model: BreakupValues
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class BreakupValues{
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
}


/*
    Model: DeliveryAddress
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DeliveryAddress{
    
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    
    @JsonProperty("contact_person")
    private String contactPerson;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
    
    
    @JsonProperty("version")
    private String version;
    
    
    
    
    
    @JsonProperty("address1")
    private String address1;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    
    @JsonProperty("address_category")
    private String addressCategory;
    
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("latitude")
    private Double latitude;
    
    
    
    
    
    @JsonProperty("longitude")
    private Double longitude;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("address2")
    private String address2;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
}


/*
    Model: FulfillingStore
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FulfillingStore{
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("company_id")
    private Integer companyId;
    
    
    
}


/*
    Model: Invoice
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Invoice{
    
    
    
    
    
    @JsonProperty("updated_date")
    private String updatedDate;
    
    
    
    
    
    @JsonProperty("invoice_url")
    private String invoiceUrl;
    
    
    
    
    
    @JsonProperty("label_url")
    private String labelUrl;
    
    
    
}


/*
    Model: Promise
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Promise{
    
    
    
    
    
    @JsonProperty("timestamp")
    private Timestamp timestamp;
    
    
    
}


/*
    Model: Timestamp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Timestamp{
    
    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
}


/*
    Model: Reasons
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Reasons{
    
    
    
    
    
    @JsonProperty("reason_text")
    private String reasonText;
    
    
    
    
    
    @JsonProperty("show_text_area")
    private Boolean showTextArea;
    
    
    
    
    
    @JsonProperty("feedback_type")
    private String feedbackType;
    
    
    
    
    
    @JsonProperty("flow")
    private String flow;
    
    
    
    
    
    @JsonProperty("reason_id")
    private Integer reasonId;
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
}


/*
    Model: ShipmentStatus
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentStatus{
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("hex_code")
    private String hexCode;
    
    
    
}


/*
    Model: ShipmentUserInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentUserInfo{
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("first_name")
    private String firstName;
    
    
    
    
    
    @JsonProperty("last_name")
    private String lastName;
    
    
    
}


/*
    Model: Shipments
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Shipments{
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("breakup_values")
    private List<BreakupValues> breakupValues;
    
    
    
    
    
    @JsonProperty("track_url")
    private String trackUrl;
    
    
    
    
    
    @JsonProperty("traking_no")
    private String trakingNo;
    
    
    
    
    
    @JsonProperty("tracking_details")
    private List<TrackingDetails> trackingDetails;
    
    
    
    
    
    @JsonProperty("beneficiary_details")
    private Boolean beneficiaryDetails;
    
    
    
    
    
    @JsonProperty("can_return")
    private Boolean canReturn;
    
    
    
    
    
    @JsonProperty("prices")
    private Prices prices;
    
    
    
    
    
    @JsonProperty("need_help_url")
    private String needHelpUrl;
    
    
    
    
    
    @JsonProperty("shipment_id")
    private String shipmentId;
    
    
    
    
    
    @JsonProperty("total_bags")
    private Integer totalBags;
    
    
    
    
    
    @JsonProperty("delivery_address")
    private DeliveryAddress deliveryAddress;
    
    
    
    
    
    @JsonProperty("invoice")
    private Invoice invoice;
    
    
    
    
    
    @JsonProperty("comment")
    private String comment;
    
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    
    @JsonProperty("promise")
    private Promise promise;
    
    
    
    
    
    @JsonProperty("fulfilling_store")
    private FulfillingStore fulfillingStore;
    
    
    
    
    
    @JsonProperty("bags")
    private List<Bags> bags;
    
    
    
    
    
    @JsonProperty("can_cancel")
    private Boolean canCancel;
    
    
    
    
    
    @JsonProperty("payment")
    private ShipmentPayment payment;
    
    
    
    
    
    @JsonProperty("shipment_created_at")
    private String shipmentCreatedAt;
    
    
    
    
    
    @JsonProperty("shipment_status")
    private ShipmentStatus shipmentStatus;
    
    
    
    
    
    @JsonProperty("user_info")
    private ShipmentUserInfo userInfo;
    
    
    
    
    
    @JsonProperty("size_info")
    private Object sizeInfo;
    
    
    
    
    
    @JsonProperty("total_details")
    private ShipmentTotalDetails totalDetails;
    
    
    
}


/*
    Model: ShipmentTotalDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentTotalDetails{
    
    
    
    
    
    @JsonProperty("total_price")
    private Double totalPrice;
    
    
    
    
    
    @JsonProperty("sizes")
    private Integer sizes;
    
    
    
    
    
    @JsonProperty("pieces")
    private Integer pieces;
    
    
    
}


/*
    Model: ShipmentPayment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShipmentPayment{
    
    
    
    
    
    @JsonProperty("logo")
    private String logo;
    
    
    
    
    
    @JsonProperty("mode")
    private String mode;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
}


/*
    Model: Track
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Track{
    
    
    
    
    
    @JsonProperty("awb")
    private String awb;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("last_location_recieved_at")
    private String lastLocationRecievedAt;
    
    
    
    
    
    @JsonProperty("reason")
    private String reason;
    
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("updated_time")
    private String updatedTime;
    
    
    
    
    
    @JsonProperty("account_name")
    private String accountName;
    
    
    
}


/*
    Model: TrackingDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TrackingDetails{
    
    
    
    
    
    @JsonProperty("is_current")
    private Boolean isCurrent;
    
    
    
    
    
    @JsonProperty("status")
    private String status;
    
    
    
    
    
    @JsonProperty("time")
    private String time;
    
    
    
    
    
    @JsonProperty("is_passed")
    private Boolean isPassed;
    
    
    
}


/*
    Model: UserInfo
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UserInfo{
    
    
    
    
    
    @JsonProperty("gender")
    private String gender;
    
    
    
    
    
    @JsonProperty("mobile")
    private String mobile;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
}


/*
    Model: ApefaceApiError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApefaceApiError{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}




/*
    Model: ActionPageParams
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ActionPageParams{
    
    
    
    
    
    @JsonProperty("slug")
    private List<String> slug;
    
    
    
}


/*
    Model: CatalogueOrderRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CatalogueOrderRequest{
    
    
    
    
    
    @JsonProperty("articles")
    private List<RewardsArticle> articles;
    
    
    
}


/*
    Model: CatalogueOrderResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CatalogueOrderResponse{
    
    
    
    
    
    @JsonProperty("articles")
    private List<RewardsArticle> articles;
    
    
    
}


/*
    Model: DiscountProperties
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DiscountProperties{
    
    
    
    
    
    @JsonProperty("absolute")
    private Double absolute;
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("display_absolute")
    private String displayAbsolute;
    
    
    
    
    
    @JsonProperty("display_percent")
    private String displayPercent;
    
    
    
    
    
    @JsonProperty("percent")
    private Double percent;
    
    
    
}


/*
    Model: Error
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Error{
    
    
    
    
    
    @JsonProperty("code")
    private Integer code;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: Offer
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Offer{
    
    
    
    
    
    @JsonProperty("_schedule")
    private Schedule schedule;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("banner_image")
    private Asset bannerImage;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("rule")
    private Object rule;
    
    
    
    
    
    @JsonProperty("share")
    private ShareMessages share;
    
    
    
    
    
    @JsonProperty("sub_text")
    private String subText;
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("updated_by")
    private String updatedBy;
    
    
    
    
    
    @JsonProperty("url")
    private String url;
    
    
    
}


/*
    Model: OrderDiscountRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderDiscountRequest{
    
    
    
    
    
    @JsonProperty("currency")
    private String currency;
    
    
    
    
    
    @JsonProperty("order_amount")
    private Double orderAmount;
    
    
    
}


/*
    Model: OrderDiscountResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderDiscountResponse{
    
    
    
    
    
    @JsonProperty("applied_rule_bucket")
    private OrderDiscountRuleBucket appliedRuleBucket;
    
    
    
    
    
    @JsonProperty("base_discount")
    private DiscountProperties baseDiscount;
    
    
    
    
    
    @JsonProperty("discount")
    private DiscountProperties discount;
    
    
    
    
    
    @JsonProperty("order_amount")
    private Double orderAmount;
    
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
}


/*
    Model: OrderDiscountRuleBucket
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class OrderDiscountRuleBucket{
    
    
    
    
    
    @JsonProperty("high")
    private Double high;
    
    
    
    
    
    @JsonProperty("low")
    private Double low;
    
    
    
    
    
    @JsonProperty("max")
    private Double max;
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
    
    
    @JsonProperty("value_type")
    private String valueType;
    
    
    
}


/*
    Model: PointsHistory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PointsHistory{
    
    
    
    
    
    @JsonProperty("_id")
    private String id;
    
    
    
    
    
    @JsonProperty("application_id")
    private String applicationId;
    
    
    
    
    
    @JsonProperty("claimed")
    private Boolean claimed;
    
    
    
    
    
    @JsonProperty("created_at")
    private String createdAt;
    
    
    
    
    
    @JsonProperty("expires_on")
    private String expiresOn;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    
    @JsonProperty("remaining_points")
    private Double remainingPoints;
    
    
    
    
    
    @JsonProperty("text_1")
    private String text1;
    
    
    
    
    
    @JsonProperty("text_2")
    private String text2;
    
    
    
    
    
    @JsonProperty("text_3")
    private String text3;
    
    
    
    
    
    @JsonProperty("txn_name")
    private String txnName;
    
    
    
    
    
    @JsonProperty("updated_at")
    private String updatedAt;
    
    
    
    
    
    @JsonProperty("user_id")
    private String userId;
    
    
    
}


/*
    Model: PointsHistoryResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PointsHistoryResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<PointsHistory> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: PointsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PointsResponse{
    
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
}


/*
    Model: RedeemReferralCodeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RedeemReferralCodeRequest{
    
    
    
    
    
    @JsonProperty("device_id")
    private String deviceId;
    
    
    
    
    
    @JsonProperty("referral_code")
    private String referralCode;
    
    
    
}


/*
    Model: RedeemReferralCodeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RedeemReferralCodeResponse{
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    
    @JsonProperty("redeemed")
    private Boolean redeemed;
    
    
    
    
    
    @JsonProperty("referrer_id")
    private String referrerId;
    
    
    
    
    
    @JsonProperty("referrer_info")
    private String referrerInfo;
    
    
    
}


/*
    Model: ReferralDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReferralDetailsResponse{
    
    
    
    
    
    @JsonProperty("referral")
    private Offer referral;
    
    
    
    
    
    @JsonProperty("referrer_info")
    private String referrerInfo;
    
    
    
    
    
    @JsonProperty("share")
    private ShareMessages share;
    
    
    
    
    
    @JsonProperty("user")
    private ReferralDetailsUser user;
    
    
    
}


/*
    Model: ReferralDetailsUser
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReferralDetailsUser{
    
    
    
    
    
    @JsonProperty("blocked")
    private Boolean blocked;
    
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    
    @JsonProperty("redeemed")
    private Boolean redeemed;
    
    
    
    
    
    @JsonProperty("referral_code")
    private String referralCode;
    
    
    
}


/*
    Model: RewardsArticle
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RewardsArticle{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("points")
    private Double points;
    
    
    
    
    
    @JsonProperty("price")
    private Double price;
    
    
    
}


/*
    Model: Schedule
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Schedule{
    
    
    
    
    
    @JsonProperty("cron")
    private String cron;
    
    
    
    
    
    @JsonProperty("duration")
    private Integer duration;
    
    
    
    
    
    @JsonProperty("end")
    private String end;
    
    
    
    
    
    @JsonProperty("start")
    private String start;
    
    
    
}


/*
    Model: ShareMessages
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ShareMessages{
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("facebook")
    private String facebook;
    
    
    
    
    
    @JsonProperty("fallback")
    private String fallback;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("messenger")
    private String messenger;
    
    
    
    
    
    @JsonProperty("sms")
    private String sms;
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("twitter")
    private String twitter;
    
    
    
    
    
    @JsonProperty("whatsapp")
    private String whatsapp;
    
    
    
}




/*
    Model: AbuseReport
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AbuseReport{
    
    
    
    
    
    @JsonProperty("abused")
    private Boolean abused;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("entity")
    private Entity entity;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("state")
    private FeedbackState state;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
}


/*
    Model: Access
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Access{
    
    
    
    
    
    @JsonProperty("answer")
    private Boolean answer;
    
    
    
    
    
    @JsonProperty("ask_question")
    private Boolean askQuestion;
    
    
    
    
    
    @JsonProperty("comment")
    private Boolean comment;
    
    
    
    
    
    @JsonProperty("rnr")
    private Boolean rnr;
    
    
    
}


/*
    Model: AddMediaListRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddMediaListRequest{
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("media_list")
    private List<AddMediaRequest> mediaList;
    
    
    
    
    
    @JsonProperty("ref_id")
    private String refId;
    
    
    
    
    
    @JsonProperty("ref_type")
    private String refType;
    
    
    
}


/*
    Model: AddMediaRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AddMediaRequest{
    
    
    
    
    
    @JsonProperty("cloud_id")
    private String cloudId;
    
    
    
    
    
    @JsonProperty("cloud_name")
    private String cloudName;
    
    
    
    
    
    @JsonProperty("cloud_provider")
    private String cloudProvider;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("media_url")
    private String mediaUrl;
    
    
    
    
    
    @JsonProperty("ref_id")
    private String refId;
    
    
    
    
    
    @JsonProperty("ref_type")
    private String refType;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ApplicationSchema
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ApplicationSchema{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: Attribute
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Attribute{
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
}


/*
    Model: AttributeObject
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AttributeObject{
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
}


/*
    Model: AttributeResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AttributeResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<Attribute> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: AutoDetectors
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class AutoDetectors{
    
    
    
    
    
    @JsonProperty("text_detector")
    private List<TextDetector> textDetector;
    
    
    
}


/*
    Model: CheckEligibilityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CheckEligibilityResponse{
    
    
    
    
    
    @JsonProperty("access")
    private Access access;
    
    
    
}


/*
    Model: Cloud
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Cloud{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("provider")
    private String provider;
    
    
    
}


/*
    Model: Comment
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Comment{
    
    
    
    
    
    @JsonProperty("comment")
    private List<String> comment;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("entity")
    private Entity entity;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("state")
    private FeedbackState state;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
    
    
    @JsonProperty("vote_count")
    private VoteCount voteCount;
    
    
    
}


/*
    Model: CommentGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommentGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<Comment> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CommentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CommentRequest{
    
    
    
    
    
    @JsonProperty("comment")
    private List<String> comment;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
}


/*
    Model: CreateQNARequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreateQNARequest{
    
    
    
    
    
    @JsonProperty("choices")
    private List<String> choices;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("max_len")
    private Integer maxLen;
    
    
    
    
    
    @JsonProperty("sort_priority")
    private Integer sortPriority;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: CreatedBy
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CreatedBy{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
}


/*
    Model: CursorGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CursorGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: CustomerReview
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CustomerReview{
    
    
    
    
    
    @JsonProperty("auto_detectors")
    private AutoDetectors autoDetectors;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("device_meta")
    private DeviceMeta deviceMeta;
    
    
    
    
    
    @JsonProperty("entity")
    private ProductEntity entity;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("location_meta")
    private LocationMeta locationMeta;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("rating")
    private ReviewRating rating;
    
    
    
    
    
    @JsonProperty("review")
    private Review review;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("state")
    private State state;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
    
    
    @JsonProperty("template")
    private Template template;
    
    
    
    
    
    @JsonProperty("vote_count")
    private VoteCount voteCount;
    
    
    
}


/*
    Model: DeviceMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class DeviceMeta{
    
    
    
    
    
    @JsonProperty("app_version")
    private String appVersion;
    
    
    
    
    
    @JsonProperty("platform")
    private String platform;
    
    
    
}


/*
    Model: Entity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Entity{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: EntityMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class EntityMeta{
    
    
    
    
    
    @JsonProperty("order_id")
    private String orderId;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: FeedbackError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FeedbackError{
    
    
    
    
    
    @JsonProperty("code")
    private String code;
    
    
    
    
    
    @JsonProperty("exception")
    private String exception;
    
    
    
    
    
    @JsonProperty("info")
    private String info;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("request_id")
    private String requestId;
    
    
    
    
    
    @JsonProperty("stack_trace")
    private String stackTrace;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
}


/*
    Model: FeedbackMedia
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FeedbackMedia{
    
    
    
    
    
    @JsonProperty("application")
    private ApplicationSchema application;
    
    
    
    
    
    @JsonProperty("cloud")
    private Cloud cloud;
    
    
    
    
    
    @JsonProperty("created_by")
    private CreatedBy createdBy;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("entity")
    private Entity entity;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("reference")
    private Entity reference;
    
    
    
    
    
    @JsonProperty("state")
    private MediaState state;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private Url url;
    
    
    
}


/*
    Model: FeedbackState
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class FeedbackState{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    
    @JsonProperty("media")
    private String media;
    
    
    
    
    
    @JsonProperty("qna")
    private Boolean qna;
    
    
    
    
    
    @JsonProperty("rating")
    private Boolean rating;
    
    
    
    
    
    @JsonProperty("review")
    private Boolean review;
    
    
    
}


/*
    Model: GeoLoc
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GeoLoc{
    
    
    
    
    
    @JsonProperty("latitude")
    private String latitude;
    
    
    
    
    
    @JsonProperty("longitude")
    private String longitude;
    
    
    
}


/*
    Model: InsertResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class InsertResponse{
    
    
    
    
    
    @JsonProperty("ids")
    private String ids;
    
    
    
}


/*
    Model: Location
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Location{
    
    
    
    
    
    @JsonProperty("country_code")
    private String countryCode;
    
    
    
    
    
    @JsonProperty("flag_url")
    private String flagUrl;
    
    
    
    
    
    @JsonProperty("geo_loc")
    private GeoLoc geoLoc;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("pincode")
    private String pincode;
    
    
    
}


/*
    Model: LocationMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LocationMeta{
    
    
    
    
    
    @JsonProperty("demand")
    private Location demand;
    
    
    
    
    
    @JsonProperty("supply")
    private Location supply;
    
    
    
}


/*
    Model: MediaGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class MediaGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<FeedbackMedia> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: MediaMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class MediaMeta{
    
    
    
    
    
    @JsonProperty("cloud")
    private Cloud cloud;
    
    
    
    
    
    @JsonProperty("comment")
    private List<String> comment;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("url")
    private Url url;
    
    
    
}


/*
    Model: MediaState
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class MediaState{
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
}


/*
    Model: NumberGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class NumberGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<Object> items;
    
    
    
    
    
    @JsonProperty("page")
    private PageNumber page;
    
    
    
}


/*
    Model: PageNumber
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PageNumber{
    
    
    
    
    
    @JsonProperty("current")
    private Integer current;
    
    
    
    
    
    @JsonProperty("has_next")
    private Boolean hasNext;
    
    
    
    
    
    @JsonProperty("item_total")
    private Integer itemTotal;
    
    
    
    
    
    @JsonProperty("size")
    private Integer size;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ProductEntity
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ProductEntity{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("meta")
    private EntityMeta meta;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: QNA
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class QNA{
    
    
    
    
    
    @JsonProperty("comments")
    private List<Comment> comments;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("entity")
    private Entity entity;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("question")
    private Question question;
    
    
    
    
    
    @JsonProperty("state")
    private QNAState state;
    
    
    
    
    
    @JsonProperty("tag")
    private List<String> tag;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
}


/*
    Model: QNAGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class QNAGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<QNA> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: QNAState
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class QNAState{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("modify")
    private Boolean modify;
    
    
    
    
    
    @JsonProperty("priority")
    private Integer priority;
    
    
    
    
    
    @JsonProperty("reply")
    private Boolean reply;
    
    
    
    
    
    @JsonProperty("vote")
    private Boolean vote;
    
    
    
}


/*
    Model: Question
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Question{
    
    
    
    
    
    @JsonProperty("choices")
    private List<String> choices;
    
    
    
    
    
    @JsonProperty("max_len")
    private Integer maxLen;
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: Rating
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Rating{
    
    
    
    
    
    @JsonProperty("attributes")
    private List<Attribute> attributes;
    
    
    
    
    
    @JsonProperty("attributes_slugs")
    private List<String> attributesSlugs;
    
    
    
    
    
    @JsonProperty("ui")
    private UI ui;
    
    
    
}


/*
    Model: RatingGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RatingGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<Rating> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: RatingMetric
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class RatingMetric{
    
    
    
    
    
    @JsonProperty("avg")
    private Double avg;
    
    
    
    
    
    @JsonProperty("count")
    private Integer count;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ReportAbuseGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReportAbuseGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<AbuseReport> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: ReportAbuseRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReportAbuseRequest{
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
}


/*
    Model: Review
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Review{
    
    
    
    
    
    @JsonProperty("answer_ids")
    private List<String> answerIds;
    
    
    
    
    
    @JsonProperty("comments")
    private List<String> comments;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("media_meta")
    private List<MediaMeta> mediaMeta;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: ReviewFacet
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReviewFacet{
    
    
    
    
    
    @JsonProperty("display")
    private String display;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("selected")
    private Boolean selected;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ReviewGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReviewGetResponse{
    
    
    
    
    
    @JsonProperty("facets")
    private List<ReviewFacet> facets;
    
    
    
    
    
    @JsonProperty("items")
    private List<CustomerReview> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
    
    
    @JsonProperty("sort")
    private List<SortMethod> sort;
    
    
    
}


/*
    Model: ReviewMediaMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReviewMediaMeta{
    
    
    
    
    
    @JsonProperty("max_count")
    private Double maxCount;
    
    
    
    
    
    @JsonProperty("size")
    private Double size;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: ReviewMetric
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReviewMetric{
    
    
    
    
    
    @JsonProperty("attribute_metric")
    private List<RatingMetric> attributeMetric;
    
    
    
    
    
    @JsonProperty("created_on")
    private String createdOn;
    
    
    
    
    
    @JsonProperty("entity")
    private Entity entity;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("modified_on")
    private String modifiedOn;
    
    
    
    
    
    @JsonProperty("rating_avg")
    private Double ratingAvg;
    
    
    
    
    
    @JsonProperty("rating_count")
    private Integer ratingCount;
    
    
    
    
    
    @JsonProperty("rating_metric")
    private List<RatingMetric> ratingMetric;
    
    
    
    
    
    @JsonProperty("review_count")
    private Integer reviewCount;
    
    
    
}


/*
    Model: ReviewMetricGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReviewMetricGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<ReviewMetric> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: ReviewRating
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class ReviewRating{
    
    
    
    
    
    @JsonProperty("attributes")
    private List<AttributeObject> attributes;
    
    
    
    
    
    @JsonProperty("value")
    private Double value;
    
    
    
}


/*
    Model: SaveAttributeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SaveAttributeRequest{
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: SortMethod
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class SortMethod{
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("selected")
    private Boolean selected;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: State
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class State{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("auto_decided")
    private Boolean autoDecided;
    
    
    
    
    
    @JsonProperty("status")
    private Integer status;
    
    
    
}


/*
    Model: TagMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TagMeta{
    
    
    
    
    
    @JsonProperty("media")
    private List<MediaMeta> media;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: Template
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Template{
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("entity")
    private Entity entity;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("rating")
    private Rating rating;
    
    
    
    
    
    @JsonProperty("review")
    private TemplateReview review;
    
    
    
    
    
    @JsonProperty("state")
    private FeedbackState state;
    
    
    
}


/*
    Model: TemplateGetResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TemplateGetResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<Template> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}


/*
    Model: TemplateReview
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TemplateReview{
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("header")
    private String header;
    
    
    
    
    
    @JsonProperty("image_meta")
    private ReviewMediaMeta imageMeta;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
    
    
    @JsonProperty("video_meta")
    private ReviewMediaMeta videoMeta;
    
    
    
    
    
    @JsonProperty("vote_allowed")
    private Boolean voteAllowed;
    
    
    
}


/*
    Model: TextDetector
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TextDetector{
    
    
    
    
    
    @JsonProperty("confidence")
    private Double confidence;
    
    
    
    
    
    @JsonProperty("text")
    private String text;
    
    
    
    
    
    @JsonProperty("text_class")
    private String textClass;
    
    
    
    
    
    @JsonProperty("text_type")
    private String textType;
    
    
    
}


/*
    Model: UI
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UI{
    
    
    
    
    
    @JsonProperty("feedback_question")
    private List<String> feedbackQuestion;
    
    
    
    
    
    @JsonProperty("icon")
    private UIIcon icon;
    
    
    
    
    
    @JsonProperty("text")
    private List<String> text;
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
}


/*
    Model: UIIcon
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UIIcon{
    
    
    
    
    
    @JsonProperty("active")
    private String active;
    
    
    
    
    
    @JsonProperty("inactive")
    private String inactive;
    
    
    
    
    
    @JsonProperty("selected")
    private List<String> selected;
    
    
    
}


/*
    Model: UpdateAbuseStatusRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateAbuseStatusRequest{
    
    
    
    
    
    @JsonProperty("abusive")
    private Boolean abusive;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: UpdateAttributeRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateAttributeRequest{
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("slug")
    private String slug;
    
    
    
}


/*
    Model: UpdateCommentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateCommentRequest{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("comment")
    private List<String> comment;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: UpdateMediaListRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateMediaListRequest{
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("ids")
    private List<String> ids;
    
    
    
}


/*
    Model: UpdateQNARequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateQNARequest{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("choices")
    private List<String> choices;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("tags")
    private List<String> tags;
    
    
    
}


/*
    Model: UpdateResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateResponse{
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
}


/*
    Model: UpdateReviewRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateReviewRequest{
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("application")
    private String application;
    
    
    
    
    
    @JsonProperty("approve")
    private Boolean approve;
    
    
    
    
    
    @JsonProperty("archive")
    private Boolean archive;
    
    
    
    
    
    @JsonProperty("attributes_rating")
    private List<AttributeObject> attributesRating;
    
    
    
    
    
    @JsonProperty("description")
    private String description;
    
    
    
    
    
    @JsonProperty("device_meta")
    private DeviceMeta deviceMeta;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("media_resource")
    private List<MediaMeta> mediaResource;
    
    
    
    
    
    @JsonProperty("rating")
    private Double rating;
    
    
    
    
    
    @JsonProperty("review_id")
    private String reviewId;
    
    
    
    
    
    @JsonProperty("template_id")
    private String templateId;
    
    
    
    
    
    @JsonProperty("title")
    private String title;
    
    
    
}


/*
    Model: UpdateVoteRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateVoteRequest{
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("active")
    private Boolean active;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("ref_id")
    private String refId;
    
    
    
    
    
    @JsonProperty("ref_type")
    private String refType;
    
    
    
}


/*
    Model: Url
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Url{
    
    
    
    
    
    @JsonProperty("main")
    private String main;
    
    
    
    
    
    @JsonProperty("thumbnail")
    private String thumbnail;
    
    
    
}


/*
    Model: Vote
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Vote{
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("date_meta")
    private DateMeta dateMeta;
    
    
    
    
    
    @JsonProperty("entity")
    private Entity entity;
    
    
    
    
    
    @JsonProperty("id")
    private String id;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("reference")
    private Entity reference;
    
    
    
    
    
    @JsonProperty("state")
    private FeedbackState state;
    
    
    
    
    
    @JsonProperty("tags")
    private List<TagMeta> tags;
    
    
    
}


/*
    Model: VoteCount
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VoteCount{
    
    
    
    
    
    @JsonProperty("downvote")
    private Integer downvote;
    
    
    
    
    
    @JsonProperty("upvote")
    private Integer upvote;
    
    
    
}


/*
    Model: VoteRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VoteRequest{
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("entity_id")
    private String entityId;
    
    
    
    
    
    @JsonProperty("entity_type")
    private String entityType;
    
    
    
    
    
    @JsonProperty("ref_id")
    private String refId;
    
    
    
    
    
    @JsonProperty("ref_type")
    private String refType;
    
    
    
}


/*
    Model: VoteResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class VoteResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<Vote> items;
    
    
    
    
    
    @JsonProperty("page")
    private Page page;
    
    
    
}




/*
    Model: UpdateCartShipmentItem
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateCartShipmentItem{
    
    
    
    
    
    @JsonProperty("quantity")
    private Integer quantity;
    
    
    
    
    
    @JsonProperty("shipment_type")
    private String shipmentType;
    
    
    
    
    
    @JsonProperty("article_uid")
    private String articleUid;
    
    
    
}


/*
    Model: UpdateCartShipmentRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class UpdateCartShipmentRequest{
    
    
    
    
    
    @JsonProperty("shipments")
    private List<UpdateCartShipmentItem> shipments;
    
    
    
}


/*
    Model: Files
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Files{
    
    
    
    
    
    @JsonProperty("values")
    private List<String> values;
    
    
    
    
    
    @JsonProperty("key")
    private String key;
    
    
    
}


/*
    Model: CartPosCheckoutDetailRequest
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartPosCheckoutDetailRequest{
    
    
    
    
    
    @JsonProperty("meta")
    private Object meta;
    
    
    
    
    
    @JsonProperty("address_id")
    private String addressId;
    
    
    
    
    
    @JsonProperty("billing_address")
    private Object billingAddress;
    
    
    
    
    
    @JsonProperty("pos")
    private Boolean pos;
    
    
    
    
    
    @JsonProperty("staff")
    private StaffCheckout staff;
    
    
    
    
    
    @JsonProperty("delivery_address")
    private Object deliveryAddress;
    
    
    
    
    
    @JsonProperty("files")
    private List<Files> files;
    
    
    
    
    
    @JsonProperty("fyndstore_emp_id")
    private String fyndstoreEmpId;
    
    
    
    
    
    @JsonProperty("aggregator")
    private String aggregator;
    
    
    
    
    
    @JsonProperty("order_type")
    private String orderType;
    
    
    
    
    
    @JsonProperty("billing_address_id")
    private String billingAddressId;
    
    
    
    
    
    @JsonProperty("callback_url")
    private String callbackUrl;
    
    
    
    
    
    @JsonProperty("payment_mode")
    private String paymentMode;
    
    
    
    
    
    @JsonProperty("extra_meta")
    private Object extraMeta;
    
    
    
    
    
    @JsonProperty("payment_identifier")
    private String paymentIdentifier;
    
    
    
    
    
    @JsonProperty("payment_auto_confirm")
    private Boolean paymentAutoConfirm;
    
    
    
    
    
    @JsonProperty("merchant_code")
    private String merchantCode;
    
    
    
    
    
    @JsonProperty("ordering_store")
    private Integer orderingStore;
    
    
    
    
    
    @JsonProperty("pick_at_store_uid")
    private Integer pickAtStoreUid;
    
    
    
    
    
    @JsonProperty("payment_params")
    private Object paymentParams;
    
    
    
}


/*
    Model: CartDeliveryModesResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class CartDeliveryModesResponse{
    
    
    
    
    
    @JsonProperty("pickup_stores")
    private List<Integer> pickupStores;
    
    
    
    
    
    @JsonProperty("available_modes")
    private List<String> availableModes;
    
    
    
}


/*
    Model: PickupStoreDetail
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class PickupStoreDetail{
    
    
    
    
    
    @JsonProperty("city")
    private String city;
    
    
    
    
    
    @JsonProperty("phone")
    private String phone;
    
    
    
    
    
    @JsonProperty("email")
    private String email;
    
    
    
    
    
    @JsonProperty("store_code")
    private String storeCode;
    
    
    
    
    
    @JsonProperty("uid")
    private Integer uid;
    
    
    
    
    
    @JsonProperty("pincode")
    private Integer pincode;
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("landmark")
    private String landmark;
    
    
    
    
    
    @JsonProperty("address_type")
    private String addressType;
    
    
    
    
    
    @JsonProperty("area_code")
    private String areaCode;
    
    
    
    
    
    @JsonProperty("address")
    private String address;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("area_code_slug")
    private String areaCodeSlug;
    
    
    
    
    
    @JsonProperty("area")
    private String area;
    
    
    
    
    
    @JsonProperty("country")
    private String country;
    
    
    
    
    
    @JsonProperty("state")
    private String state;
    
    
    
}


/*
    Model: StoreDetailsResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class StoreDetailsResponse{
    
    
    
    
    
    @JsonProperty("items")
    private List<PickupStoreDetail> items;
    
    
    
}




/*
    Model: GetPincodeCityResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetPincodeCityResponse{
    
    
    
    
    
    @JsonProperty("request_uuid")
    private String requestUuid;
    
    
    
    
    
    @JsonProperty("stormbreaker_uuid")
    private String stormbreakerUuid;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("data")
    private List<LogisticPincodeData> data;
    
    
    
}


/*
    Model: LogisticPincodeData
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LogisticPincodeData{
    
    
    
    
    
    @JsonProperty("meta")
    private LogisticMeta meta;
    
    
    
    
    
    @JsonProperty("parents")
    private List<LogisticParents> parents;
    
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("error")
    private LogisticError error;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
}


/*
    Model: LogisticMeta
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LogisticMeta{
    
    
    
    
    
    @JsonProperty("zone")
    private String zone;
    
    
    
    
    
    @JsonProperty("deliverables")
    private List<Object> deliverables;
    
    
    
}


/*
    Model: LogisticParents
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LogisticParents{
    
    
    
    
    
    @JsonProperty("sub_type")
    private String subType;
    
    
    
    
    
    @JsonProperty("name")
    private String name;
    
    
    
    
    
    @JsonProperty("display_name")
    private String displayName;
    
    
    
    
    
    @JsonProperty("uid")
    private String uid;
    
    
    
}


/*
    Model: LogisticError
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LogisticError{
    
    
    
    
    
    @JsonProperty("type")
    private String type;
    
    
    
    
    
    @JsonProperty("value")
    private String value;
    
    
    
    
    
    @JsonProperty("message")
    private String message;
    
    
    
}


/*
    Model: GetTatProductReqBody
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetTatProductReqBody{
    
    
    
    
    
    @JsonProperty("location_details")
    private List<LocationDetailsReq> locationDetails;
    
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
}


/*
    Model: LocationDetailsReq
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LocationDetailsReq{
    
    
    
    
    
    @JsonProperty("from_pincode")
    private String fromPincode;
    
    
    
    
    
    @JsonProperty("articles")
    private List<TatReqProductArticles> articles;
    
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
}


/*
    Model: TatReqProductArticles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TatReqProductArticles{
    
    
    
    
    
    @JsonProperty("category")
    private LogisticRequestCategory category;
    
    
    
}


/*
    Model: LogisticRequestCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LogisticRequestCategory{
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
}


/*
    Model: GetTatProductResponse
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class GetTatProductResponse{
    
    
    
    
    
    @JsonProperty("location_details")
    private List<LocationDetails> locationDetails;
    
    
    
    
    
    @JsonProperty("request_uuid")
    private String requestUuid;
    
    
    
    
    
    @JsonProperty("error")
    private Object error;
    
    
    
    
    
    @JsonProperty("to_city")
    private String toCity;
    
    
    
    
    
    @JsonProperty("source")
    private String source;
    
    
    
    
    
    @JsonProperty("to_pincode")
    private String toPincode;
    
    
    
    
    
    @JsonProperty("action")
    private String action;
    
    
    
    
    
    @JsonProperty("stormbreaker_uuid")
    private String stormbreakerUuid;
    
    
    
    
    
    @JsonProperty("success")
    private Boolean success;
    
    
    
    
    
    @JsonProperty("identifier")
    private String identifier;
    
    
    
    
    
    @JsonProperty("journey")
    private String journey;
    
    
    
}


/*
    Model: LocationDetails
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LocationDetails{
    
    
    
    
    
    @JsonProperty("from_pincode")
    private String fromPincode;
    
    
    
    
    
    @JsonProperty("articles")
    private List<TatProductArticles> articles;
    
    
    
    
    
    @JsonProperty("fulfillment_id")
    private Integer fulfillmentId;
    
    
    
}


/*
    Model: TatProductArticles
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class TatProductArticles{
    
    
    
    
    
    @JsonProperty("error")
    private Object error;
    
    
    
    
    
    @JsonProperty("category")
    private LogisticResponseCategory category;
    
    
    
    
    
    @JsonProperty("promise")
    private LogisticPromise promise;
    
    
    
}


/*
    Model: LogisticResponseCategory
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LogisticResponseCategory{
    
    
    
    
    
    @JsonProperty("id")
    private Integer id;
    
    
    
    
    
    @JsonProperty("level")
    private String level;
    
    
    
}


/*
    Model: LogisticPromise
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LogisticPromise{
    
    
    
    
    
    @JsonProperty("timestamp")
    private LogisticTimestamp timestamp;
    
    
    
    
    
    @JsonProperty("formatted")
    private Formatted formatted;
    
    
    
}


/*
    Model: LogisticTimestamp
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class LogisticTimestamp{
    
    
    
    
    
    @JsonProperty("min")
    private Integer min;
    
    
    
    
    
    @JsonProperty("max")
    private Integer max;
    
    
    
}


/*
    Model: Formatted
*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public static class Formatted{
    
    
    
    
    
    @JsonProperty("min")
    private String min;
    
    
    
    
    
    @JsonProperty("max")
    private String max;
    
    
    
}



}