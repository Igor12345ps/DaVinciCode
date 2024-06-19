package com.raven.db.models;

public class AcademicUnitModel {
    private Integer id;
    private String name;
    
    private String value;

    public AcademicUnitModel(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getValue(){
        return value;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
