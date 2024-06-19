/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.helper;

import com.raven.db.enums.GenderEnum;
import com.raven.db.enums.MaritalStatusEnum;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author 823122036
 */
public class ComboBoxHelperGender implements IComboBoxHelper<GenderEnum>{

    public ComboBoxHelperGender() {
    }
    
    @Override
    public ComboBoxModel<GenderEnum> createComboBoxModel() {
        DefaultComboBoxModel<GenderEnum> model = new DefaultComboBoxModel<>();
        
        // Adicionando os valores do enum ao ComboBoxModel
        for (GenderEnum tipo : GenderEnum.values()) {
            model.addElement(tipo);
        }
        
        return model;
    }

    @Override
    public GenderEnum getSelectModel(ComboBoxModel<GenderEnum> comboBoxModel, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
