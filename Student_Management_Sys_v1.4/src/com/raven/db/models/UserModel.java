package com.raven.db.models;

import com.raven.db.enums.GenderEnum;
import com.raven.db.enums.MaritalStatusEnum;
import java.util.Date;

public class UserModel {
    
    private Integer id;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private String tel;
    private Date birth_date;
    private GenderEnum gender;
    private MaritalStatusEnum marital_status;
    private String mother_name;
    private String father_name;
    private RoleModel role;

    public UserModel() {
        
    }
    
    public UserModel(Integer id, String name, String cpf, String email, String password, String tel, Date birth_date, GenderEnum gender, MaritalStatusEnum marital_status, String mother_name, String father_name, RoleModel role) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.tel = tel;
        this.birth_date = birth_date;
        this.gender = gender;
        this.marital_status = marital_status;
        this.mother_name = mother_name;
        this.father_name = father_name;
        this.role = role;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public MaritalStatusEnum getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(MaritalStatusEnum marital_status) {
        this.marital_status = marital_status;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public RoleModel getRole() {
        return role;
    }

    public void setRole(RoleModel role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", name=" + name + ", cpf=" + cpf + ", email=" + email + ", password=" + password + ", tel=" + tel + ", birth_date=" + birth_date + ", gender=" + gender + ", marital_status=" + marital_status + ", mother_name=" + mother_name + ", father_name=" + father_name + ", role=" + role + '}';
    }
    
    
}
