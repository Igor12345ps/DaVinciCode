package com.raven.swing.dashboard;

import com.raven.db.enums.RoleEnum;


public class DashboardCellStudentStatus extends javax.swing.JPanel {

    public DashboardCellStudentStatus(RoleEnum type) {
        initComponents();
        StudentStatus.setStatus(type);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentStatus = new com.raven.swing.dashboard.DashboardStudentStatus();

        setBackground(new java.awt.Color(255, 255, 255));

        StudentStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StudentStatus.setText("dashboardStudentStatus1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(StudentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(StudentStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardStudentStatus StudentStatus;
    // End of variables declaration//GEN-END:variables
}
