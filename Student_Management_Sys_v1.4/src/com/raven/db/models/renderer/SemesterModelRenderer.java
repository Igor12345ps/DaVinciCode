/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.db.models.renderer;

import com.raven.db.models.SemesterModel;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ipere
 */
public class SemesterModelRenderer implements ListCellRenderer<SemesterModel> {
    private final ListCellRenderer<? super SemesterModel> defaultRenderer;

    public SemesterModelRenderer(ListCellRenderer<? super SemesterModel> defaultRenderer) {
        this.defaultRenderer = defaultRenderer;
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends SemesterModel> list, SemesterModel value, int index, boolean isSelected, boolean cellHasFocus) {
        Component c = defaultRenderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (c instanceof JLabel && value != null) {
            ((JLabel) c).setText(value.getName());
        }
        return c;
    }
}