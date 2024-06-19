/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.helper;

import com.raven.db.enums.GenderEnum;
import com.raven.db.enums.MaritalStatusEnum;
import com.raven.db.enums.RoleEnum;
import com.raven.db.models.SemesterModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author 823122036
 */
public class ComboBoxHelperRole implements IComboBoxHelper<RoleEnum>{

    public ComboBoxHelperRole() {
    }
    
    @Override
    public ComboBoxModel<RoleEnum> createComboBoxModel() {
        DefaultComboBoxModel<RoleEnum> model = new DefaultComboBoxModel<>();
        
        // Adicionando os valores do enum ao ComboBoxModel
        for (RoleEnum tipo : RoleEnum.values()) {
            model.addElement(tipo);
        }
        
        return model;
    }

    @Override
    public RoleEnum getSelectModel(ComboBoxModel<RoleEnum> comboBoxModel, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
