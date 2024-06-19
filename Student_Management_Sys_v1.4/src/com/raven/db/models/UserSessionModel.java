/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.models;

/**
 *
 * @author ipere
 */
public class UserSessionModel {
    
    private Integer id;
    private String email;
    private String password;
    private RoleModel roleModel;

    public UserSessionModel() {
    }

    public UserSessionModel(Integer id, String email, String password, RoleModel roleModel) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.roleModel = roleModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleModel getRoleModel() {
        return roleModel;
    }

    public void setRoleModel(RoleModel roleModel) {
        this.roleModel = roleModel;
    }
    
    
    
}
