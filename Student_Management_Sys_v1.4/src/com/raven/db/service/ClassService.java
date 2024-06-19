/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.service;

import com.raven.db.models.ClassModel;
import com.raven.db.repository.ClassRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 823122036
 */
public class ClassService implements IService<ClassModel>{
    
    ClassRepository classeRepository = new ClassRepository();

    @Override
    public boolean create(ClassModel object) {
        return classeRepository.create(object);
    }

    @Override
    public boolean update(ClassModel object) {
        return classeRepository.update(object);
    }

    @Override
    public ClassModel get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ClassModel> getAll() {
        List<ClassModel> userAcademicUnitList = new ArrayList<ClassModel>();
        userAcademicUnitList = classeRepository.getAll();
        return userAcademicUnitList;
    }
    
    public List<ClassModel> getAllByProfessorId(Integer id) {
        List<ClassModel> userAcademicUnitList = new ArrayList<ClassModel>();
        userAcademicUnitList = classeRepository.getAllByProfessorId(id);
        return userAcademicUnitList;
    }
    
    public List<ClassModel> getAllByStudentId(Integer id) {
        List<ClassModel> userAcademicUnitList = new ArrayList<ClassModel>();
        userAcademicUnitList = classeRepository.getAllByStudentId(id);
        return userAcademicUnitList;
    }
    
    @Override
    public boolean delete(Integer id) {
        return classeRepository.delete(id);
    }
}
