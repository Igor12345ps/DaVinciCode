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
public class ComboBoxHelperMaritalStatus implements IComboBoxHelper<MaritalStatusEnum>{

    public ComboBoxHelperMaritalStatus() {
    }
    
    @Override
    public ComboBoxModel<MaritalStatusEnum> createComboBoxModel() {
        DefaultComboBoxModel<MaritalStatusEnum> model = new DefaultComboBoxModel<>();
        
        // Adicionando os valores do enum ao ComboBoxModel
        for (MaritalStatusEnum tipo : MaritalStatusEnum.values()) {
            model.addElement(tipo);
        }
        
        return model;
    }

    @Override
    public MaritalStatusEnum getSelectModel(ComboBoxModel<MaritalStatusEnum> comboBoxModel, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
