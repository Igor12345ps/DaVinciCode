package com.raven.forms;

import com.raven.db.models.AcademicUnitModel;
import com.raven.db.models.UserModel;
import com.raven.db.service.AcademicUnitService;
import com.raven.swing.dashboard.DashboardScrollBar;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RegisterAcademicUnit extends javax.swing.JPanel {

    AcademicUnitService academicUnitService = new AcademicUnitService();

    public RegisterAcademicUnit() {
        initComponents();
        RefreshTable();

        AcademicUnitScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        AcademicUnitScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        AcademicUnitScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        AcademicUnitScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        AcademicUnitScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        AcademicUnitScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        RegisterAcademicUnitScrPane.setVerticalScrollBar(new DashboardScrollBar());

        RegisterAcademicUnitScrPane.getVerticalScrollBar().setBackground(Color.WHITE);
        RegisterAcademicUnitScrPane.setHorizontalScrollBar(new DashboardScrollBar());
        RegisterAcademicUnitScrPane.getHorizontalScrollBar().setBackground(Color.WHITE);
        RegisterAcademicUnitScrPane.getViewport().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p.setBackground(Color.WHITE);
        RegisterAcademicUnitScrPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        AcademicUnitTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificando se a seleção é válida e se foi feita apenas uma seleção
                if (!e.getValueIsAdjusting() && AcademicUnitTable.getSelectedRow() != -1) {
                    // Obtendo os dados da linha selecionada
                    int selectedRow = AcademicUnitTable.getSelectedRow();

                    Integer id = (Integer) AcademicUnitTable.getValueAt(selectedRow, 0);
                    String name = (String) AcademicUnitTable.getValueAt(selectedRow, 1);

                    AcademicUnitModel selectedAcademic = new AcademicUnitModel(id, name);

                    inNameUnit.setText(selectedAcademic.getName());
                }

            }
        });
    }
    
    public void RefreshTable() {
        // AQUI VAI O SELECT DO BD PARA A TABELA DE ALUNOS, ENTAO DEVE SER VISTO COMO VAI TROCAR OS DADOS (SEGUE O MOLDE)        
        List<AcademicUnitModel> academicUnit = new ArrayList<>();
        academicUnit = academicUnitService.getAll();
        AcademicUnitTable.deleteAllRows();

        for (int i = 0; i < academicUnit.size(); i++) {
            AcademicUnitTable.addRow(new Object[]{academicUnit.get(i).getId(), academicUnit.get(i).getName()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AcademicUnit = new com.raven.swing.dashboard.DashboardBorder();
        AcademicUnitScrPanel = new javax.swing.JScrollPane();
        AcademicUnitTable = new com.raven.swing.dashboard.dashboardTables.UsersTable();
        RegisterAcademicUnitScrPane = new javax.swing.JScrollPane();
        AcademicUnitPanel = new javax.swing.JPanel();
        NomeLB = new javax.swing.JLabel();
        inNameUnit = new com.raven.swing.MyTextField();
        TituloLB = new javax.swing.JLabel();
        CadastrarBTN = new com.raven.swing.dashboard.DashboardButton();
        AtualizarBTN = new com.raven.swing.dashboard.DashboardButton();
        DeletarBTN = new com.raven.swing.dashboard.DashboardButton();

        AcademicUnit.setBackground(new java.awt.Color(255, 255, 255));
        AcademicUnit.setForeground(new java.awt.Color(255, 255, 255));

        AcademicUnitScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        AcademicUnitScrPanel.setBorder(null);

        AcademicUnitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Unidade Curricular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AcademicUnitScrPanel.setViewportView(AcademicUnitTable);

        javax.swing.GroupLayout AcademicUnitLayout = new javax.swing.GroupLayout(AcademicUnit);
        AcademicUnit.setLayout(AcademicUnitLayout);
        AcademicUnitLayout.setHorizontalGroup(
            AcademicUnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcademicUnitLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(AcademicUnitScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        AcademicUnitLayout.setVerticalGroup(
            AcademicUnitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcademicUnitLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(AcademicUnitScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        RegisterAcademicUnitScrPane.setBackground(new java.awt.Color(255, 255, 255));
        RegisterAcademicUnitScrPane.setBorder(null);
        RegisterAcademicUnitScrPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        AcademicUnitPanel.setBackground(new java.awt.Color(255, 255, 255));

        NomeLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeLB.setText("Nome da unidade curricular");

        inNameUnit.setForeground(new java.awt.Color(0, 0, 0));

        TituloLB.setBackground(new java.awt.Color(127, 127, 127));
        TituloLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLB.setForeground(new java.awt.Color(172, 172, 172));
        TituloLB.setText("Cadastro de unidade curricular");

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

        javax.swing.GroupLayout AcademicUnitPanelLayout = new javax.swing.GroupLayout(AcademicUnitPanel);
        AcademicUnitPanel.setLayout(AcademicUnitPanelLayout);
        AcademicUnitPanelLayout.setHorizontalGroup(
            AcademicUnitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcademicUnitPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(AcademicUnitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeLB)
                    .addComponent(TituloLB)
                    .addComponent(inNameUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(668, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AcademicUnitPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        AcademicUnitPanelLayout.setVerticalGroup(
            AcademicUnitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcademicUnitPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TituloLB)
                .addGap(20, 20, 20)
                .addComponent(NomeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(inNameUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(AcademicUnitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        RegisterAcademicUnitScrPane.setViewportView(AcademicUnitPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(AcademicUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RegisterAcademicUnitScrPane, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AcademicUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(RegisterAcademicUnitScrPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBTNActionPerformed
        // TODO add your handling code here:
        AcademicUnitModel newUser = new AcademicUnitModel(
                (Integer) AcademicUnitTable.getValueAt(AcademicUnitTable.getSelectedRow(), 0),
                inNameUnit.getText()
        );
        boolean response = academicUnitService.update(newUser);
        JOptionPane.showMessageDialog(null, "Unidade acadêmica atualizada com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_AtualizarBTNActionPerformed

    private void DeletarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBTNActionPerformed
        // TODO add your handling code here:
        boolean response = academicUnitService.delete((Integer) AcademicUnitTable.getValueAt(AcademicUnitTable.getSelectedRow(), 0));
        JOptionPane.showMessageDialog(null, "Unidade acadêmica deletada com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_DeletarBTNActionPerformed

    private void CadastrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarBTNActionPerformed
        // TODO add your handling code here:
        AcademicUnitModel newUser = new AcademicUnitModel(
                null,
                inNameUnit.getText()
        );
        boolean response = academicUnitService.create(newUser);
        JOptionPane.showMessageDialog(null, "Unidade acadêmica cadastrada com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_CadastrarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardBorder AcademicUnit;
    private javax.swing.JPanel AcademicUnitPanel;
    private javax.swing.JScrollPane AcademicUnitScrPanel;
    private com.raven.swing.dashboard.dashboardTables.UsersTable AcademicUnitTable;
    private com.raven.swing.dashboard.DashboardButton AtualizarBTN;
    private com.raven.swing.dashboard.DashboardButton CadastrarBTN;
    private com.raven.swing.dashboard.DashboardButton DeletarBTN;
    private javax.swing.JLabel NomeLB;
    private javax.swing.JScrollPane RegisterAcademicUnitScrPane;
    private javax.swing.JLabel TituloLB;
    private com.raven.swing.MyTextField inNameUnit;
    // End of variables declaration//GEN-END:variables
}
