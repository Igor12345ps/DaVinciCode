package com.raven.forms;

import com.raven.db.enums.RoleEnum;
import com.raven.db.models.ClassModel;
import com.raven.db.models.UserModel;
import com.raven.db.service.GradeService;
import com.raven.main.Main;
import com.raven.swing.dashboard.DashboardScrollBar;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RegisterGrades extends javax.swing.JPanel {

    GradeService gradeService = new GradeService();
    
    boolean isStudent = Main.getUserSessionModel().getRoleModel().getRole_enum() == RoleEnum.ESTUDANTE;

    public RegisterGrades() {
        initComponents();
        
        if(isStudent){
            
            AtualizarBTN.setVisible(false);
            inGrade.setEnabled(false);
        }

        GradesScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        GradesScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        GradesScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        GradesScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        GradesScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        GradesScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        RegisterGradesScrPanel.setVerticalScrollBar(new DashboardScrollBar());

        RegisterGradesScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        RegisterGradesScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        RegisterGradesScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        RegisterGradesScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p.setBackground(Color.WHITE);
        RegisterGradesScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        RefreshTable();

        GradesTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificando se a seleção é válida e se foi feita apenas uma seleção
                if (!e.getValueIsAdjusting() && GradesTable.getSelectedRow() != -1) {
                    // Obtendo os dados da linha selecionada
                    int selectedRow = GradesTable.getSelectedRow();

                    inStudentName.setText((String) GradesTable.getValueAt(selectedRow, 1));
                    inAcademicUnit.setText((String) GradesTable.getValueAt(selectedRow, 2));
                    inGrade.setText(String.valueOf(GradesTable.getValueAt(selectedRow, 3)).replace(",", "").replace(".", ""));
                }
            }
        });
    }

    public void RefreshTable() {
        GradesTable.deleteAllRows();

        List<ClassModel> grades = new ArrayList<>();
        if (Main.getUserSessionModel().getRoleModel().getRole_enum() == RoleEnum.PROFESSOR) {
            grades = gradeService.getAllByProfessorId(Main.getUserSessionModel().getId());
        } else if (Main.getUserSessionModel().getRoleModel().getRole_enum() == RoleEnum.ESTUDANTE) {
            grades = gradeService.getAllByStudentId(Main.getUserSessionModel().getId());
        } else {
            grades = gradeService.getAll();
        }
        for (int i = 0; i < grades.size(); i++) {
            GradesTable.addRow(new Object[]{grades.get(i).getId(), grades.get(i).getStudent().getName(), grades.get(i).getAcademicUnit().getName(), String.format("%05.2f", grades.get(i).getGrade()).replace(".", ",")});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GradesPanel = new com.raven.swing.dashboard.DashboardBorder();
        GradesScrPanel = new javax.swing.JScrollPane();
        GradesTable = new com.raven.swing.dashboard.dashboardTables.UsersTable();
        RegisterGradesScrPanel = new javax.swing.JScrollPane();
        RegisterGradesPanel = new javax.swing.JPanel();
        NomeLB = new javax.swing.JLabel();
        inStudentName = new com.raven.swing.MyTextField();
        TituloLB = new javax.swing.JLabel();
        AtualizarBTN = new com.raven.swing.dashboard.DashboardButton();
        inGrade = new com.raven.swing.MyFormatedField();
        NomeLB1 = new javax.swing.JLabel();
        NomeLB2 = new javax.swing.JLabel();
        inAcademicUnit = new com.raven.swing.MyTextField();

        GradesPanel.setBackground(new java.awt.Color(255, 255, 255));
        GradesPanel.setForeground(new java.awt.Color(255, 255, 255));

        GradesScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        GradesScrPanel.setBorder(null);

        GradesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome do aluno", "Unidade Curricular", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GradesScrPanel.setViewportView(GradesTable);

        javax.swing.GroupLayout GradesPanelLayout = new javax.swing.GroupLayout(GradesPanel);
        GradesPanel.setLayout(GradesPanelLayout);
        GradesPanelLayout.setHorizontalGroup(
            GradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GradesPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(GradesScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        GradesPanelLayout.setVerticalGroup(
            GradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GradesPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(GradesScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        RegisterGradesScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        RegisterGradesScrPanel.setBorder(null);
        RegisterGradesScrPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        RegisterGradesPanel.setBackground(new java.awt.Color(255, 255, 255));

        NomeLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeLB.setText("Nome do Aluno");

        inStudentName.setForeground(new java.awt.Color(0, 0, 0));
        inStudentName.setEnabled(false);

        TituloLB.setBackground(new java.awt.Color(127, 127, 127));
        TituloLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLB.setForeground(new java.awt.Color(172, 172, 172));
        TituloLB.setText("Cadastro de notas");

        AtualizarBTN.setBackground(new java.awt.Color(246, 159, 50));
        AtualizarBTN.setForeground(new java.awt.Color(255, 255, 255));
        AtualizarBTN.setText("Atualizar");
        AtualizarBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AtualizarBTN.setShadowColor(new java.awt.Color(246, 159, 50));
        AtualizarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarBTNActionPerformed(evt);
            }
        });

        inGrade.setForeground(new java.awt.Color(0, 0, 0));
        inGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inGrade.setToolTipText("");
        try {
            inGrade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        NomeLB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeLB1.setText("Nota");

        NomeLB2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeLB2.setText("Unidade Curricular");

        inAcademicUnit.setForeground(new java.awt.Color(0, 0, 0));
        inAcademicUnit.setEnabled(false);

        javax.swing.GroupLayout RegisterGradesPanelLayout = new javax.swing.GroupLayout(RegisterGradesPanel);
        RegisterGradesPanel.setLayout(RegisterGradesPanelLayout);
        RegisterGradesPanelLayout.setHorizontalGroup(
            RegisterGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterGradesPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RegisterGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloLB)
                    .addGroup(RegisterGradesPanelLayout.createSequentialGroup()
                        .addGroup(RegisterGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeLB))
                        .addGap(40, 40, 40)
                        .addGroup(RegisterGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeLB2)
                            .addComponent(inAcademicUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(RegisterGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeLB1)
                            .addComponent(inGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterGradesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        RegisterGradesPanelLayout.setVerticalGroup(
            RegisterGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterGradesPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TituloLB)
                .addGap(20, 20, 20)
                .addGroup(RegisterGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeLB2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(RegisterGradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inAcademicUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        RegisterGradesScrPanel.setViewportView(RegisterGradesPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(GradesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RegisterGradesScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GradesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(RegisterGradesScrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBTNActionPerformed
        ClassModel newClass = new ClassModel(
                (Integer) GradesTable.getValueAt(GradesTable.getSelectedRow(), 0),
                null,
                null,
                null,
                null,
                Double.valueOf(inGrade.getText().replace(",", ".")));

        boolean response = gradeService.update(newClass);
        JOptionPane.showMessageDialog(null, "Nota atualizada com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_AtualizarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardButton AtualizarBTN;
    private com.raven.swing.dashboard.DashboardBorder GradesPanel;
    private javax.swing.JScrollPane GradesScrPanel;
    private com.raven.swing.dashboard.dashboardTables.UsersTable GradesTable;
    private javax.swing.JLabel NomeLB;
    private javax.swing.JLabel NomeLB1;
    private javax.swing.JLabel NomeLB2;
    private javax.swing.JPanel RegisterGradesPanel;
    private javax.swing.JScrollPane RegisterGradesScrPanel;
    private javax.swing.JLabel TituloLB;
    private com.raven.swing.MyTextField inAcademicUnit;
    private com.raven.swing.MyFormatedField inGrade;
    private com.raven.swing.MyTextField inStudentName;
    // End of variables declaration//GEN-END:variables
}
