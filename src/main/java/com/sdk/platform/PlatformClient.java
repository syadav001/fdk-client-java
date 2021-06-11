package com.sdk.platform;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatformClient{

    private PlatformConfig config;

    
    public PlatformService.LeadService lead;
    
    public PlatformService.FeedbackService feedback;
    
    public PlatformService.ThemeService theme;
    
    public PlatformService.UserService user;
    
    public PlatformService.ContentService content;
    
    public PlatformService.AssignmentService assignment;
    
    public PlatformService.BillingService billing;
    
    public PlatformService.CommunicationService communication;
    
    public PlatformService.PaymentService payment;
    
    public PlatformService.OrderService order;
    
    public PlatformService.CatalogService catalog;
    
    public PlatformService.CompanyProfileService companyProfile;
    
    public PlatformService.FileStorageService fileStorage;
    
    public PlatformService.ShareService share;
    
    public PlatformService.InventoryService inventory;
    
    public PlatformService.ConfigurationService configuration;
    
    public PlatformService.CartService cart;
    
    public PlatformService.RewardsService rewards;
    
    public PlatformService.AnalyticsService analytics;
    
    public PlatformService.DiscountService discount;
    
    public PlatformService.PartnerService partner;
    
    public PlatformService.WebhookService webhook;
    

    public PlatformClient(PlatformConfig config)   
    {
        this.config = config;
        
        this.lead = new PlatformService.LeadService(config);
        
        this.feedback = new PlatformService.FeedbackService(config);
        
        this.theme = new PlatformService.ThemeService(config);
        
        this.user = new PlatformService.UserService(config);
        
        this.content = new PlatformService.ContentService(config);
        
        this.assignment = new PlatformService.AssignmentService(config);
        
        this.billing = new PlatformService.BillingService(config);
        
        this.communication = new PlatformService.CommunicationService(config);
        
        this.payment = new PlatformService.PaymentService(config);
        
        this.order = new PlatformService.OrderService(config);
        
        this.catalog = new PlatformService.CatalogService(config);
        
        this.companyProfile = new PlatformService.CompanyProfileService(config);
        
        this.fileStorage = new PlatformService.FileStorageService(config);
        
        this.share = new PlatformService.ShareService(config);
        
        this.inventory = new PlatformService.InventoryService(config);
        
        this.configuration = new PlatformService.ConfigurationService(config);
        
        this.cart = new PlatformService.CartService(config);
        
        this.rewards = new PlatformService.RewardsService(config);
        
        this.analytics = new PlatformService.AnalyticsService(config);
        
        this.discount = new PlatformService.DiscountService(config);
        
        this.partner = new PlatformService.PartnerService(config);
        
        this.webhook = new PlatformService.WebhookService(config);
        
    }

    public ApplicationClient application(String applicationId) {
        return new ApplicationClient(config, applicationId);
    }

    @Getter
    public class ApplicationClient{

        
        public PlatformService.LeadService.ApplicationClient lead;
        
        public PlatformService.FeedbackService.ApplicationClient feedback;
        
        public PlatformService.ThemeService.ApplicationClient theme;
        
        public PlatformService.UserService.ApplicationClient user;
        
        public PlatformService.ContentService.ApplicationClient content;
        
        public PlatformService.AssignmentService.ApplicationClient assignment;
        
        public PlatformService.BillingService.ApplicationClient billing;
        
        public PlatformService.CommunicationService.ApplicationClient communication;
        
        public PlatformService.PaymentService.ApplicationClient payment;
        
        public PlatformService.OrderService.ApplicationClient order;
        
        public PlatformService.CatalogService.ApplicationClient catalog;
        
        public PlatformService.CompanyProfileService.ApplicationClient companyProfile;
        
        public PlatformService.FileStorageService.ApplicationClient fileStorage;
        
        public PlatformService.ShareService.ApplicationClient share;
        
        public PlatformService.InventoryService.ApplicationClient inventory;
        
        public PlatformService.ConfigurationService.ApplicationClient configuration;
        
        public PlatformService.CartService.ApplicationClient cart;
        
        public PlatformService.RewardsService.ApplicationClient rewards;
        
        public PlatformService.AnalyticsService.ApplicationClient analytics;
        
        public PlatformService.DiscountService.ApplicationClient discount;
        
        public PlatformService.PartnerService.ApplicationClient partner;
        
        public PlatformService.WebhookService.ApplicationClient webhook;
        

        public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
            
            this.lead = new PlatformService.LeadService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.feedback = new PlatformService.FeedbackService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.theme = new PlatformService.ThemeService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.user = new PlatformService.UserService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.content = new PlatformService.ContentService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.assignment = new PlatformService.AssignmentService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.billing = new PlatformService.BillingService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.communication = new PlatformService.CommunicationService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.payment = new PlatformService.PaymentService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.order = new PlatformService.OrderService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.catalog = new PlatformService.CatalogService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.companyProfile = new PlatformService.CompanyProfileService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.fileStorage = new PlatformService.FileStorageService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.share = new PlatformService.ShareService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.inventory = new PlatformService.InventoryService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.configuration = new PlatformService.ConfigurationService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.cart = new PlatformService.CartService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.rewards = new PlatformService.RewardsService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.analytics = new PlatformService.AnalyticsService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.discount = new PlatformService.DiscountService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.partner = new PlatformService.PartnerService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.webhook = new PlatformService.WebhookService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
        }

    }
}