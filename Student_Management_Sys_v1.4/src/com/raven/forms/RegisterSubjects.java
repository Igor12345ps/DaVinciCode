package com.raven.forms;

import com.raven.db.helper.ComboBoxHelperAcademicUnit;
import com.raven.db.models.AcademicUnitModel;
import com.raven.db.models.SubjectModel;
import com.raven.db.models.renderer.AcademicUnitModelRenderer;
import com.raven.db.service.SubjectsService;
import com.raven.swing.dashboard.DashboardScrollBar;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RegisterSubjects extends javax.swing.JPanel {

    SubjectsService subjectsService = new SubjectsService();

    ComboBoxHelperAcademicUnit comboBoxHelperAcademicUnit = new ComboBoxHelperAcademicUnit();

    public RegisterSubjects() {
        initComponents();

        SubjectScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        SubjectScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        SubjectScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        SubjectScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        SubjectScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        SubjectScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        RegisterSubjectScrPane.setVerticalScrollBar(new DashboardScrollBar());

        RegisterSubjectScrPane.getVerticalScrollBar().setBackground(Color.WHITE);
        RegisterSubjectScrPane.setHorizontalScrollBar(new DashboardScrollBar());
        RegisterSubjectScrPane.getHorizontalScrollBar().setBackground(Color.WHITE);
        RegisterSubjectScrPane.getViewport().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        RegisterSubjectScrPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        RefreshTable();

        SubjectTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificando se a seleção é válida e se foi feita apenas uma seleção
                if (!e.getValueIsAdjusting() && SubjectTable.getSelectedRow() != -1) {
                    // Obtendo os dados da linha selecionada
                    int selectedRow = SubjectTable.getSelectedRow();

                    Integer id = (Integer) SubjectTable.getValueAt(selectedRow, 0);
                    // AcademicUnitModel academicUnitModel = academicUnitModel.toString(SubjectTable.getValueAt(selectedRow, 1).toString());
                    String name = (String) SubjectTable.getValueAt(selectedRow, 2);
                    String description = (String) SubjectTable.getValueAt(selectedRow, 3);
                    
                    AcademicUnitModel academicUnit = comboBoxHelperAcademicUnit.getSelectModel(selectAcademicUnit.getModel(), SubjectTable.getValueAt(selectedRow, 1).toString());
                    selectAcademicUnit.setSelectedItem(academicUnit);   

                    SubjectModel selectedSubject = new SubjectModel(id, name, description, null);

                    inNameSub.setText(selectedSubject.getName());
                    inDescriptionSub.setText(selectedSubject.getDescription());
                }

            }
        });

    }

    public void RefreshTable() {
        // AQUI VAI O SELECT DO BD PARA A TABELA DE ALUNOS, ENTAO DEVE SER VISTO COMO VAI TROCAR OS DADOS (SEGUE O MOLDE)        
        List<SubjectModel> subject = new ArrayList<>();
        subject = subjectsService.getAll();
        SubjectTable.deleteAllRows();

        for (int i = 0; i < subject.size(); i++) {
            SubjectTable.addRow(new Object[]{subject.get(i).getId(), subject.get(i).getAcademic_unit().getName(), subject.get(i).getName(), subject.get(i).getDescription()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Subject = new com.raven.swing.dashboard.DashboardBorder();
        SubjectScrPanel = new javax.swing.JScrollPane();
        SubjectTable = new com.raven.swing.dashboard.dashboardTables.UsersTable();
        RegisterSubjectScrPane = new javax.swing.JScrollPane();
        RegisterSubjectPane = new javax.swing.JPanel();
        NomeLB = new javax.swing.JLabel();
        inNameSub = new com.raven.swing.MyTextField();
        TituloLB = new javax.swing.JLabel();
        CadastrarBTN = new com.raven.swing.dashboard.DashboardButton();
        AtualizarBTN = new com.raven.swing.dashboard.DashboardButton();
        DeletarBTN = new com.raven.swing.dashboard.DashboardButton();
        NomeAlunoLB = new javax.swing.JLabel();
        inDescriptionSub = new com.raven.swing.MyTextField();
        SemestreLB = new javax.swing.JLabel();
        selectAcademicUnit = new com.raven.swing.ComboBoxInput();

        Subject.setBackground(new java.awt.Color(255, 255, 255));
        Subject.setForeground(new java.awt.Color(255, 255, 255));

        SubjectScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        SubjectScrPanel.setBorder(null);

        SubjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Unidade Acadêmica", "Matéria", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SubjectScrPanel.setViewportView(SubjectTable);

        javax.swing.GroupLayout SubjectLayout = new javax.swing.GroupLayout(Subject);
        Subject.setLayout(SubjectLayout);
        SubjectLayout.setHorizontalGroup(
            SubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubjectLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SubjectScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        SubjectLayout.setVerticalGroup(
            SubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubjectLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SubjectScrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        RegisterSubjectScrPane.setBackground(new java.awt.Color(255, 255, 255));
        RegisterSubjectScrPane.setBorder(null);
        RegisterSubjectScrPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        RegisterSubjectPane.setBackground(new java.awt.Color(255, 255, 255));

        NomeLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeLB.setText("Nome da matéria");

        inNameSub.setForeground(new java.awt.Color(0, 0, 0));

        TituloLB.setBackground(new java.awt.Color(127, 127, 127));
        TituloLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLB.setForeground(new java.awt.Color(172, 172, 172));
        TituloLB.setText("Cadastro de matérias");

        CadastrarBTN.setBackground(new java.awt.Color(30, 180, 114));
        CadastrarBTN.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarBTN.setText("Cadastrar");
        CadastrarBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CadastrarBTN.setShadowColor(new java.awt.Color(30, 180, 114));
        CadastrarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarBTNActionPerformed(evt);
            }
        });

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

        DeletarBTN.setBackground(new java.awt.Color(253, 83, 83));
        DeletarBTN.setForeground(new java.awt.Color(255, 255, 255));
        DeletarBTN.setText("Deletar");
        DeletarBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeletarBTN.setSelected(true);
        DeletarBTN.setShadowColor(new java.awt.Color(253, 83, 83));
        DeletarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarBTNActionPerformed(evt);
            }
        });

        NomeAlunoLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeAlunoLB.setText("Descrição");

        inDescriptionSub.setForeground(new java.awt.Color(0, 0, 0));

        SemestreLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SemestreLB.setText("Unidade Acadêmica");

        selectAcademicUnit.setMaximumRowCount(11);
        selectAcademicUnit.setModel(comboBoxHelperAcademicUnit.createComboBoxModel());
        selectAcademicUnit.setRenderer(new AcademicUnitModelRenderer(selectAcademicUnit.getRenderer()));
        selectAcademicUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAcademicUnitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterSubjectPaneLayout = new javax.swing.GroupLayout(RegisterSubjectPane);
        RegisterSubjectPane.setLayout(RegisterSubjectPaneLayout);
        RegisterSubjectPaneLayout.setHorizontalGroup(
            RegisterSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterSubjectPaneLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RegisterSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterSubjectPaneLayout.createSequentialGroup()
                        .addGroup(RegisterSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeLB)
                            .addComponent(inNameSub, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(RegisterSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterSubjectPaneLayout.createSequentialGroup()
                                .addGroup(RegisterSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RegisterSubjectPaneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(RegisterSubjectPaneLayout.createSequentialGroup()
                                        .addComponent(NomeAlunoLB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SemestreLB)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(RegisterSubjectPaneLayout.createSequentialGroup()
                                .addComponent(inDescriptionSub, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(selectAcademicUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103))))
                    .addGroup(RegisterSubjectPaneLayout.createSequentialGroup()
                        .addComponent(TituloLB)
                        .addContainerGap())))
        );
        RegisterSubjectPaneLayout.setVerticalGroup(
            RegisterSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterSubjectPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TituloLB)
                .addGap(23, 23, 23)
                .addGroup(RegisterSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeAlunoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SemestreLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(RegisterSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inNameSub, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inDescriptionSub, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectAcademicUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(RegisterSubjectPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        RegisterSubjectScrPane.setViewportView(RegisterSubjectPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RegisterSubjectScrPane, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(RegisterSubjectScrPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBTNActionPerformed
        SubjectModel newSubject = new SubjectModel(
                (Integer)SubjectTable.getValueAt(SubjectTable.getSelectedRow(), 0),
                inNameSub.getText(),
                inDescriptionSub.getText(),
                (AcademicUnitModel) selectAcademicUnit.getSelectedItem()
        );
        boolean response = subjectsService.update(newSubject);
        JOptionPane.showMessageDialog(null, "Matéria atualizada com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_AtualizarBTNActionPerformed

    private void DeletarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBTNActionPerformed
        boolean response = subjectsService.delete((Integer)SubjectTable.getValueAt(SubjectTable.getSelectedRow(), 0));
        JOptionPane.showMessageDialog(null, "Matéria deletada com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_DeletarBTNActionPerformed

    private void selectAcademicUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAcademicUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectAcademicUnitActionPerformed

    private void CadastrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarBTNActionPerformed
        SubjectModel newSubject = new SubjectModel(
                null,
                inNameSub.getText(),
                inDescriptionSub.getText(),
                (AcademicUnitModel) selectAcademicUnit.getSelectedItem()
        );
        boolean response = subjectsService.create(newSubject);
        JOptionPane.showMessageDialog(null, "Matéria cadastrada com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_CadastrarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardButton AtualizarBTN;
    private com.raven.swing.dashboard.DashboardButton CadastrarBTN;
    private com.raven.swing.dashboard.DashboardButton DeletarBTN;
    private javax.swing.JLabel NomeAlunoLB;
    private javax.swing.JLabel NomeLB;
    private javax.swing.JPanel RegisterSubjectPane;
    private javax.swing.JScrollPane RegisterSubjectScrPane;
    private javax.swing.JLabel SemestreLB;
    private com.raven.swing.dashboard.DashboardBorder Subject;
    private javax.swing.JScrollPane SubjectScrPanel;
    private com.raven.swing.dashboard.dashboardTables.UsersTable SubjectTable;
    private javax.swing.JLabel TituloLB;
    private com.raven.swing.MyTextField inDescriptionSub;
    private com.raven.swing.MyTextField inNameSub;
    private com.raven.swing.ComboBoxInput selectAcademicUnit;
    // End of variables declaration//GEN-END:variables
}
