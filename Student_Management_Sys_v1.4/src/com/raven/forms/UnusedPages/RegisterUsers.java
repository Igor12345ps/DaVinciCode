package com.raven.forms.UnusedPages;

import com.raven.swing.dashboard.DashboardScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class RegisterUsers extends javax.swing.JPanel {

    public RegisterUsers() {
        initComponents();
        
        UserScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        UserScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        UserScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        UserScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        UserScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        UserScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        RegisterStudentScrPane.setVerticalScrollBar(new DashboardScrollBar());
                
        RegisterStudentScrPane.getVerticalScrollBar().setBackground(Color.WHITE);
        RegisterStudentScrPane.setHorizontalScrollBar(new DashboardScrollBar());
        RegisterStudentScrPane.getHorizontalScrollBar().setBackground(Color.WHITE);
        RegisterStudentScrPane.getViewport().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p.setBackground(Color.WHITE);
        RegisterStudentScrPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        // AQUI VAI O SELECT DO BD PARA A TABELA DE USUARIOS, ENTAO DEVE SER VISTO COMO VAI TROCAR OS DADOS (SEGUE O MOLDE)
        
        UsersTable.addRow(new Object[]{"1", "João Silva", "joaosilva@gmail.com",  "Leitor"});
        UsersTable.addRow(new Object[]{"2", "Pedro Santana","pedrosantana@gmail.com", "Leitor"});
        UsersTable.addRow(new Object[]{"3", "Jasmine Junqueira","jasminejunqueira@gmail.com", "Admin"});
        UsersTable.addRow(new Object[]{"4", "Izabel Fernandes","izabelfernandes@gmail.com", "Leitor"});
        UsersTable.addRow(new Object[]{"5", "Mauricio Souza", "mauriciosouza@gmail.com", "Admin"});

    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardBorder2 = new com.raven.swing.dashboard.DashboardBorder();
        UserScrPanel = new javax.swing.JScrollPane();
        UsersTable = new com.raven.swing.dashboard.dashboardTables.UsersTable();
        RegisterStudentScrPane = new javax.swing.JScrollPane();
        EstudanteCadastroPanel = new javax.swing.JPanel();
        NomeLB = new javax.swing.JLabel();
        NascimentoLB = new javax.swing.JLabel();
        Nome_Input = new com.raven.swing.MyTextField();
        IdUsuarioLB = new javax.swing.JLabel();
        IdUsuario_Input = new com.raven.swing.MyTextField();
        TituloLB = new javax.swing.JLabel();
        CadastrarBTN = new com.raven.swing.dashboard.DashboardButton();
        AtualizarBTN = new com.raven.swing.dashboard.DashboardButton();
        DeletarBTN = new com.raven.swing.dashboard.DashboardButton();
        TipoUsuario_Input = new com.raven.swing.ComboBoxInput();
        SenhaLB = new javax.swing.JLabel();
        Senha_Input = new com.raven.swing.MyPasswordField();
        EmailLB = new javax.swing.JLabel();
        Email_Input = new com.raven.swing.MyTextField();

        setBackground(new java.awt.Color(242, 242, 242));

        dashboardBorder2.setBackground(new java.awt.Color(255, 255, 255));
        dashboardBorder2.setForeground(new java.awt.Color(255, 255, 255));

        UserScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        UserScrPanel.setBorder(null);

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome do usuário", "Email", "Tipo de usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UserScrPanel.setViewportView(UsersTable);

        javax.swing.GroupLayout dashboardBorder2Layout = new javax.swing.GroupLayout(dashboardBorder2);
        dashboardBorder2.setLayout(dashboardBorder2Layout);
        dashboardBorder2Layout.setHorizontalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(UserScrPanel)
                .addGap(20, 20, 20))
        );
        dashboardBorder2Layout.setVerticalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(UserScrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        RegisterStudentScrPane.setBackground(new java.awt.Color(255, 255, 255));
        RegisterStudentScrPane.setBorder(null);
        RegisterStudentScrPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        EstudanteCadastroPanel.setBackground(new java.awt.Color(255, 255, 255));

        NomeLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeLB.setForeground(new java.awt.Color(0, 0, 0));
        NomeLB.setText("Nome do usuário");

        NascimentoLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NascimentoLB.setForeground(new java.awt.Color(0, 0, 0));
        NascimentoLB.setText("Tipo de usuário");

        Nome_Input.setForeground(new java.awt.Color(0, 0, 0));

        IdUsuarioLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdUsuarioLB.setForeground(new java.awt.Color(0, 0, 0));
        IdUsuarioLB.setText("ID do usuário");

        IdUsuario_Input.setForeground(new java.awt.Color(0, 0, 0));

        TituloLB.setBackground(new java.awt.Color(127, 127, 127));
        TituloLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLB.setForeground(new java.awt.Color(172, 172, 172));
        TituloLB.setText("Cadastro de usuários");

        CadastrarBTN.setBackground(new java.awt.Color(30, 180, 114));
        CadastrarBTN.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarBTN.setText("Cadastrar");
        CadastrarBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CadastrarBTN.setShadowColor(new java.awt.Color(30, 180, 114));

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

        TipoUsuario_Input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha o tipo do usuário", "Admin", "Leitor" }));

        SenhaLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SenhaLB.setForeground(new java.awt.Color(0, 0, 0));
        SenhaLB.setText("Senha");

        Senha_Input.setText("myPasswordField1");

        EmailLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmailLB.setForeground(new java.awt.Color(0, 0, 0));
        EmailLB.setText("Email");

        Email_Input.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout EstudanteCadastroPanelLayout = new javax.swing.GroupLayout(EstudanteCadastroPanel);
        EstudanteCadastroPanel.setLayout(EstudanteCadastroPanelLayout);
        EstudanteCadastroPanelLayout.setHorizontalGroup(
            EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloLB)
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(IdUsuarioLB, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IdUsuario_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EmailLB)
                            .addComponent(Email_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                        .addComponent(NomeLB)
                                        .addGap(179, 179, 179))
                                    .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                            .addComponent(SenhaLB)
                                            .addGap(248, 248, 248))
                                        .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                            .addComponent(Nome_Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(40, 40, 40))))
                                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                        .addComponent(NascimentoLB)
                                        .addGap(146, 146, 146))
                                    .addComponent(TipoUsuario_Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                        .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Senha_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        EstudanteCadastroPanelLayout.setVerticalGroup(
            EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TituloLB)
                .addGap(20, 20, 20)
                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NascimentoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nome_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoUsuario_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addComponent(IdUsuarioLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(IdUsuario_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(EmailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EstudanteCadastroPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SenhaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Senha_Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );

        RegisterStudentScrPane.setViewportView(EstudanteCadastroPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegisterStudentScrPane, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
                    .addComponent(dashboardBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(RegisterStudentScrPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtualizarBTNActionPerformed

    private void DeletarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardButton AtualizarBTN;
    private com.raven.swing.dashboard.DashboardButton CadastrarBTN;
    private com.raven.swing.dashboard.DashboardButton DeletarBTN;
    private javax.swing.JLabel EmailLB;
    private com.raven.swing.MyTextField Email_Input;
    private javax.swing.JPanel EstudanteCadastroPanel;
    private javax.swing.JLabel IdUsuarioLB;
    private com.raven.swing.MyTextField IdUsuario_Input;
    private javax.swing.JLabel NascimentoLB;
    private javax.swing.JLabel NomeLB;
    private com.raven.swing.MyTextField Nome_Input;
    private javax.swing.JScrollPane RegisterStudentScrPane;
    private javax.swing.JLabel SenhaLB;
    private com.raven.swing.MyPasswordField Senha_Input;
    private com.raven.swing.ComboBoxInput TipoUsuario_Input;
    private javax.swing.JLabel TituloLB;
    private javax.swing.JScrollPane UserScrPanel;
    private com.raven.swing.dashboard.dashboardTables.UsersTable UsersTable;
    private com.raven.swing.dashboard.DashboardBorder dashboardBorder2;
    // End of variables declaration//GEN-END:variables
}
