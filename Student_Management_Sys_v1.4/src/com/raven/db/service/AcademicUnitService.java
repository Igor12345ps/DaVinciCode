/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.service;

import com.raven.db.models.AcademicUnitModel;
import com.raven.db.repository.AcademicUnitRepository;
import com.raven.db.models.UserModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 823122036
 */
public class AcademicUnitService implements IService<AcademicUnitModel>{
    
    AcademicUnitRepository academicUnitRepository = new AcademicUnitRepository();

    @Override
    public boolean create(AcademicUnitModel object) {
        return academicUnitRepository.create(object);
    }

    @Override
    public boolean update(AcademicUnitModel object) {
        return academicUnitRepository.update(object);
    }

    @Override
    public AcademicUnitModel get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<AcademicUnitModel> getAll() {
        List<AcademicUnitModel> academicUnit = new ArrayList<AcademicUnitModel>();
        academicUnit = academicUnitRepository.getAll();
        return academicUnit;
    }

    @Override
    public boolean delete(Integer id) {
        return academicUnitRepository.delete(id);
    }
}
