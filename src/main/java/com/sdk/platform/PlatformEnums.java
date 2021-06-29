package com.sdk.platform;

import lombok.Getter;

class PlatformEnums {




    /*
        Enum: PriorityEnum
        Used By: Lead
    */
    @Getter
    public enum PriorityEnum {

        
        low("low"), 
        
        medium("medium"), 
        
        high("high");
        

        private String priority;
        PriorityEnum(String priority) {
            this.priority = priority;
        }
    }























}