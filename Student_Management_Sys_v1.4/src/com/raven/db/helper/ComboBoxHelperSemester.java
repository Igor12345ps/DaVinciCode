/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.helper;

import com.raven.db.models.SemesterModel;
import com.raven.db.service.SemesterService;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author T-GAMER
 */
public class ComboBoxHelperSemester implements IComboBoxHelper<SemesterModel> {

    SemesterService service = new SemesterService();

    public ComboBoxHelperSemester() {
    }

    @Override
    public ComboBoxModel<SemesterModel> createComboBoxModel() {
        DefaultComboBoxModel<SemesterModel> model = new DefaultComboBoxModel<>();

        List<SemesterModel> models = service.getAll();

        // Adicionando os valores do enum ao ComboBoxModel
        for (SemesterModel tipo : models) {
            model.addElement(tipo);
        }

        return model;
    }

    @Override
    public SemesterModel getSelectModel(ComboBoxModel<SemesterModel> comboBoxModel, String name) {
        SemesterModel itemToSelect = null;
        for (int i = 0; i < comboBoxModel.getSize(); i++) {
            SemesterModel model = comboBoxModel.getElementAt(i);
            if (model.getName().equals(name)) {
                itemToSelect = model;
                break; // Se encontrou o item com o nome desejado, interrompe o loop
            }
        }
        return itemToSelect;
    }

}
