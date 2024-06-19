/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raven.db.helper;

import com.raven.db.enums.GenderEnum;
import com.raven.db.models.SemesterModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author 823122036
 */
public interface IComboBoxHelper<I> {
    ComboBoxModel<I> createComboBoxModel();
    I getSelectModel(ComboBoxModel<I> comboBoxModel, String name);
}
