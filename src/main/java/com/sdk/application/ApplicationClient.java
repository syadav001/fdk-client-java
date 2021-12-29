package com.sdk.application;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicationClient extends ApplicationEnums {

    
    public ApplicationService.CatalogService catalog;
    
    public ApplicationService.CartService cart;
    
    public ApplicationService.CommonService common;
    
    public ApplicationService.LeadService lead;
    
    public ApplicationService.ThemeService theme;
    
    public ApplicationService.UserService user;
    
    public ApplicationService.ContentService content;
    
    public ApplicationService.CommunicationService communication;
    
    public ApplicationService.ShareService share;
    
    public ApplicationService.FileStorageService fileStorage;
    
    public ApplicationService.ConfigurationService configuration;
    
    public ApplicationService.PaymentService payment;
    
    public ApplicationService.OrderService order;
    
    public ApplicationService.FeedbackService feedback;
    
    public ApplicationService.PosCartService posCart;
    
    public ApplicationService.LogisticService logistic;
    

    public ApplicationClient(ApplicationConfig applicationConfig) {
        
        this.catalog = new ApplicationService().new CatalogService(applicationConfig);
        
        this.cart = new ApplicationService().new CartService(applicationConfig);
        
        this.common = new ApplicationService().new CommonService(applicationConfig);
        
        this.lead = new ApplicationService().new LeadService(applicationConfig);
        
        this.theme = new ApplicationService().new ThemeService(applicationConfig);
        
        this.user = new ApplicationService().new UserService(applicationConfig);
        
        this.content = new ApplicationService().new ContentService(applicationConfig);
        
        this.communication = new ApplicationService().new CommunicationService(applicationConfig);
        
        this.share = new ApplicationService().new ShareService(applicationConfig);
        
        this.fileStorage = new ApplicationService().new FileStorageService(applicationConfig);
        
        this.configuration = new ApplicationService().new ConfigurationService(applicationConfig);
        
        this.payment = new ApplicationService().new PaymentService(applicationConfig);
        
        this.order = new ApplicationService().new OrderService(applicationConfig);
        
        this.feedback = new ApplicationService().new FeedbackService(applicationConfig);
        
        this.posCart = new ApplicationService().new PosCartService(applicationConfig);
        
        this.logistic = new ApplicationService().new LogisticService(applicationConfig);
        
    }
}