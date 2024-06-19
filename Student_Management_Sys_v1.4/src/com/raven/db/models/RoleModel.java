package com.raven.db.models;

import com.raven.db.enums.RoleEnum;

public class RoleModel {
    private String slug;
    private String description;
    private RoleEnum roleEnum;

    public RoleModel(RoleEnum roleEnum, String slug, String description) {
        this.slug = slug;
        this.description = description;
        this.roleEnum = roleEnum;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoleEnum getRole_enum() {
        return roleEnum;
    }

    public void setRole_enum(RoleEnum role_enum) {
        this.roleEnum = role_enum;
    }
    
}
