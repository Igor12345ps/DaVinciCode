/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.enums;

public enum MaritalStatusEnum {
    Solteiro("s"),
    Casado("c");
    
    private String value;

    MaritalStatusEnum(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
    
    public static MaritalStatusEnum fromString(String value) {
        for (MaritalStatusEnum maritalStatusEnum : MaritalStatusEnum.values()) {
            if (maritalStatusEnum.value.equalsIgnoreCase(value)) {
                return maritalStatusEnum;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
    
    public static MaritalStatusEnum enumfromString(String value) {
        for (MaritalStatusEnum maritalStatus : MaritalStatusEnum.values()) {
            if (maritalStatus.name().equalsIgnoreCase(value)) {
                return maritalStatus;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
}
