/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.enums;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 823117978
 */
public enum RoleEnum {
    USUARIO("user"),
    ADMIN("admin"),
    PROFESSOR("professor"),
    ESTUDANTE("student");
    
    private String value;

    RoleEnum(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
    
    public static RoleEnum[] getAll() {
        List<RoleEnum> rolesList = new ArrayList<>();
        for (RoleEnum role : RoleEnum.values()) {
            rolesList.add(role);
        }
        return rolesList.toArray(new RoleEnum[0]);
    }
    
    public static String[] getAllStrings() {
        List<String> rolesList = new ArrayList<>();
        for (RoleEnum role : RoleEnum.values()) {
            rolesList.add(role.toString());
        }
        return rolesList.toArray(new String[0]);
    }
    
    public static RoleEnum fromString(String value) {
        for (RoleEnum role : RoleEnum.values()) {
            if (role.value.equalsIgnoreCase(value)) {
                return role;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
    
    public static RoleEnum enumfromString(String value) {
        for (RoleEnum role : RoleEnum.values()) {
            if (role.name().equalsIgnoreCase(value)) {
                return role;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + value);
    }
    
}
