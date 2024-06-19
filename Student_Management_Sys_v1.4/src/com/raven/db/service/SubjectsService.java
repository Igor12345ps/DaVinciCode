/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.service;

import com.raven.db.models.SubjectModel;
import com.raven.db.repository.SubjectsRepository;
import com.raven.db.models.UserModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 823122036
 */
public class SubjectsService implements IService<SubjectModel>{
    
    SubjectsRepository subjectsRepository = new SubjectsRepository();

    @Override
    public boolean create(SubjectModel object) {
        return subjectsRepository.create(object);
    }
    
    @Override
    public boolean update(SubjectModel object) {
        return subjectsRepository.update(object);
    }

    @Override
    public SubjectModel get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SubjectModel> getAll() {
        List<SubjectModel> subjectModel = new ArrayList<SubjectModel>();
        subjectModel = subjectsRepository.getAll();
        return subjectModel;
    }

    @Override
    public boolean delete(Integer id) {
        return subjectsRepository.delete(id);
    }
}
