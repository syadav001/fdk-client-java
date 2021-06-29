package com.sdk.application;

import lombok.Getter;

class ApplicationEnums {






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