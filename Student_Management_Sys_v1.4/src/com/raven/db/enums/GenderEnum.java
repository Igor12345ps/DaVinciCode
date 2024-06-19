/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.enums;

/**
 *
 * @author 823117978
 */
public enum GenderEnum {
    Feminino("f"),
    Masculino("m");
    
    private String value;
    
    GenderEnum(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
    
    public static GenderEnum fromString(String value) {
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.value.equalsIgnoreCase(value)) {
                return gender;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
    
    public static GenderEnum enumfromString(String value) {
        for (GenderEnum gender : GenderEnum.values()) {
            if (gender.name().equalsIgnoreCase(value)) {
                return gender;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
    
}
