/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.service;

import com.raven.db.models.AcademicUnitModel;
import com.raven.db.models.SemesterModel;
import com.raven.db.repository.AcademicUnitRepository;
import com.raven.db.models.UserModel;
import com.raven.db.repository.SemesterRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 823122036
 */
public class SemesterService implements IService<SemesterModel>{
    
    SemesterRepository semesterRepository = new SemesterRepository();

    @Override
    public boolean create(SemesterModel object) {
        return semesterRepository.create(object);
    }

    @Override
    public boolean update(SemesterModel object) {
        return semesterRepository.update(object);
    }

    @Override
    public SemesterModel get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public SemesterModel getByName(String name) {
        return semesterRepository.getByName(name);
    }

    @Override
    public List<SemesterModel> getAll() {
        List<SemesterModel> object = new ArrayList<SemesterModel>();
        object = semesterRepository.getAll();
        return object;
    }

    @Override
    public boolean delete(Integer id) {
        return semesterRepository.delete(id);
    }
}
