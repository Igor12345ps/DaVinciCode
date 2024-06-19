/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.models.renderer;

import com.raven.db.models.AcademicUnitModel;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ipere
 */
public class AcademicUnitModelRenderer implements ListCellRenderer<AcademicUnitModel> {
    private final ListCellRenderer<? super AcademicUnitModel> defaultRenderer;

    public AcademicUnitModelRenderer(ListCellRenderer<? super AcademicUnitModel> defaultRenderer) {
        this.defaultRenderer = defaultRenderer;
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends AcademicUnitModel> list, AcademicUnitModel value, int index, boolean isSelected, boolean cellHasFocus) {
        Component c = defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (c instanceof JLabel && value != null) {
            ((JLabel) c).setText(value.getName());
        }
        return c;
    }
}