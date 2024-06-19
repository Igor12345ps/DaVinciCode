/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.service;

import com.raven.db.models.ClassModel;
import com.raven.db.repository.ClassRepository;
import com.raven.db.repository.GradeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 823122036
 */
public class GradeService extends ClassService{
    
    GradeRepository gradeRepository = new GradeRepository();
    
    @Override
    public boolean update(ClassModel object) {
        return gradeRepository.update(object);
    }
}
