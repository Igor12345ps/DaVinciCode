/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.helper;

import com.raven.db.models.AcademicUnitModel;
import com.raven.db.models.SemesterModel;
import com.raven.db.service.AcademicUnitService;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author T-GAMER
 */
public class ComboBoxHelperAcademicUnit implements IComboBoxHelper<AcademicUnitModel> {

    AcademicUnitService academicUnitService = new AcademicUnitService();

    public ComboBoxHelperAcademicUnit() {
    }

    @Override
    public ComboBoxModel<AcademicUnitModel> createComboBoxModel() {
        DefaultComboBoxModel<AcademicUnitModel> model = new DefaultComboBoxModel<>();

        List<AcademicUnitModel> academicUnitModels = academicUnitService.getAll();

        // Adicionando os valores do enum ao ComboBoxModel
        for (AcademicUnitModel tipo : academicUnitModels) {
            model.addElement(tipo);
        }

        return model;
    }

    @Override
    public AcademicUnitModel getSelectModel(ComboBoxModel<AcademicUnitModel> comboBoxModel, String name) {
        AcademicUnitModel itemToSelect = null;
        for (int i = 0; i < comboBoxModel.getSize(); i++) {
            AcademicUnitModel model = comboBoxModel.getElementAt(i);
            if (model.getName().equals(name)) {
                itemToSelect = model;
                break; // Se encontrou o item com o nome desejado, interrompe o loop
            }
        }
        return itemToSelect;
    }
}
