package com.raven.db.models;

public class SubjectModel {
    
    private Integer id;
    private String name;
    private String description;
    private AcademicUnitModel academicUnit;

    public SubjectModel(Integer id, String name, String description, AcademicUnitModel academic_unit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.academicUnit = academic_unit;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AcademicUnitModel getAcademic_unit() {
        return academicUnit;
    }

    public void setAcademic_unit(AcademicUnitModel academic_unit) {
        this.academicUnit = academic_unit;
    }
    
}
