package com.raven.swing.dashboard;

import com.raven.model.Model_DashboardMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class DashboardItem extends javax.swing.JPanel {

    private boolean selected;
    private boolean over;

    public DashboardItem(Model_DashboardMenu data) {
        initComponents();
            
        setOpaque(false);
        if (data.getType() == Model_DashboardMenu.MenuType.MENU) {
            DashboardIcon.setIcon(data.toIcon());
            DashboardName.setText(data.getName());
        } else if (data.getType() == Model_DashboardMenu.MenuType.TITLE) {
            DashboardIcon.setText(data.getName());
            DashboardIcon.setFont(new Font("sansserif", 1, 12));
            DashboardName.setVisible(false);
        } else {
            DashboardName.setText(" ");
        }
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    
    public void setOver(boolean over) {
        this.over = over;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashboardIcon = new javax.swing.JLabel();
        DashboardName = new javax.swing.JLabel();

        DashboardIcon.setForeground(new java.awt.Color(255, 255, 255));

        DashboardName.setForeground(new java.awt.Color(255, 255, 255));
        DashboardName.setText("Menu Name");
        DashboardName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(DashboardIcon)
                .addGap(18, 18, 18)
                .addComponent(DashboardName))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DashboardName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (selected || over) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (selected) {
                g2.setColor(new Color(255, 255, 255, 80));
            } else {
                g2.setColor(new Color(255, 255, 255, 20));
            }
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DashboardIcon;
    private javax.swing.JLabel DashboardName;
    // End of variables declaration//GEN-END:variables
}
