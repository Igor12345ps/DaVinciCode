package com.raven.db.models;

public class ClassModel {
    private Integer id;
    private UserModel student;
    private UserModel professor;
    private AcademicUnitModel academicUnit;
    private SemesterModel semester;
    private Double grade;

    public ClassModel() {
    }

    public ClassModel(Integer id, UserModel student, UserModel professor, AcademicUnitModel academicUnit, SemesterModel semester, Double grade) {
        this.id = id;
        this.student = student;
        this.professor = professor;
        this.academicUnit = academicUnit;
        this.semester = semester;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserModel getStudent() {
        return student;
    }

    public void setStudent(UserModel student) {
        this.student = student;
    }

    public UserModel getProfessor() {
        return professor;
    }

    public void setProfessor(UserModel professor) {
        this.professor = professor;
    }

    public AcademicUnitModel getAcademicUnit() {
        return academicUnit;
    }

    public void setAcademicUnit(AcademicUnitModel academicUnit) {
        this.academicUnit = academicUnit;
    }

    public SemesterModel getSemester() {
        return semester;
    }

    public void setSemester(SemesterModel semester) {
        this.semester = semester;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
    
    

    
}
