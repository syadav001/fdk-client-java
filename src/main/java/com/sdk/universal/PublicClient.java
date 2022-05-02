package com.sdk.universal;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PublicClient {

    
    public PublicService.ConfigurationService configuration;
    
    public PublicService.WebhookService webhook;
    
    public PublicService.InventoryService inventory;
    

    public PublicClient(PublicConfig publicConfig) {
        
        this.configuration = new PublicService.ConfigurationService(publicConfig);
        
        this.webhook = new PublicService.WebhookService(publicConfig);
        
        this.inventory = new PublicService.InventoryService(publicConfig);
        
    }
}