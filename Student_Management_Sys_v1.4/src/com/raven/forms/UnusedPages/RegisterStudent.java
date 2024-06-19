package com.raven.forms.UnusedPages;

import com.raven.swing.dashboard.DashboardScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class RegisterStudent extends javax.swing.JPanel {

    public RegisterStudent() {
        initComponents();
        
        StudentScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        StudentScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        StudentScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        StudentScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        StudentScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        StudentScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        RegisterStudentScrPane.setVerticalScrollBar(new DashboardScrollBar());
                
        RegisterStudentScrPane.getVerticalScrollBar().setBackground(Color.WHITE);
        RegisterStudentScrPane.setHorizontalScrollBar(new DashboardScrollBar());
        RegisterStudentScrPane.getHorizontalScrollBar().setBackground(Color.WHITE);
        RegisterStudentScrPane.getViewport().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p.setBackground(Color.WHITE);
        RegisterStudentScrPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
    // AQUI VAI O SELECT DO BD PARA A TABELA DE ALUNOS, ENTAO DEVE SER VISTO COMO VAI TROCAR OS DADOS (SEGUE O MOLDE)        
        
        StudentTable.addRow(new Object[]{"1","João Silva", "01/01/1990", "Masculino", "Solteiro", "Carlos Silva", "Maria Silva", "joao.silva@example.com", "(11) 99999-0001"});
        StudentTable.addRow(new Object[]{"2","Maria Oliveira", "15/05/1985", "Feminino", "Casada", "José Oliveira", "Ana Oliveira", "maria.oliveira@example.com", "(21) 99999-0002"});
        StudentTable.addRow(new Object[]{"3","Pedro Santos", "20/07/1992", "Masculino", "Solteiro", "Roberto Santos", "Clara Santos", "pedro.santos@example.com", "(31) 99999-0003"});
        StudentTable.addRow(new Object[]{"4","Ana Costa", "30/03/1988", "Feminino", "Casada", "Lucas Costa", "Sofia Costa", "ana.costa@example.com", "(41) 99999-0004"});
        StudentTable.addRow(new Object[]{"5","Carlos Souza", "25/12/1991", "Masculino", "Solteiro", "Fernando Souza", "Mariana Souza", "carlos.souza@example.com", "(51) 99999-0005"});
        StudentTable.addRow(new Object[]{"6","Beatriz Lima", "10/10/1990", "Feminino", "Divorciada", "Paulo Lima", "Isabel Lima", "beatriz.lima@example.com", "(61) 99999-0006"});
        StudentTable.addRow(new Object[]{"7","Lucas Pereira", "05/09/1987", "Masculino", "Casado", "Antônio Pereira", "Joana Pereira", "lucas.pereira@example.com", "(71) 99999-0007"});
        StudentTable.addRow(new Object[]{"8","Fernanda Rodrigues", "22/11/1989", "Feminino", "Solteira", "Miguel Rodrigues", "Rosa Rodrigues", "fernanda.rodrigues@example.com", "(81) 99999-0007"});


        
    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardBorder2 = new com.raven.swing.dashboard.DashboardBorder();
        StudentScrPanel = new javax.swing.JScrollPane();
        StudentTable = new com.raven.swing.dashboard.dashboardTables.StudentTable();
        RegisterStudentScrPane = new javax.swing.JScrollPane();
        EstudanteCadastroPanel = new javax.swing.JPanel();
        TelefoneLB = new javax.swing.JLabel();
        EmailLB = new javax.swing.JLabel();
        NomeLB = new javax.swing.JLabel();
        SexoLB = new javax.swing.JLabel();
        EstadoCivilLB = new javax.swing.JLabel();
        EstadoCivil_Input = new com.raven.swing.ComboBoxInput();
        Sexo_Input = new com.raven.swing.ComboBoxInput();
        NascimentoLB = new javax.swing.JLabel();
        PaiLB = new javax.swing.JLabel();
        Pai_Input = new com.raven.swing.MyTextField();
        Telefone_Input = new com.raven.swing.MyFormatedField();
        Nascimento_Input = new com.raven.swing.MyFormatedField();
        Email_Input = new com.raven.swing.MyTextField();
        Nome_Input = new com.raven.swing.MyTextField();
        MaeLB = new javax.swing.JLabel();
        Mae_Input = new com.raven.swing.MyTextField();
        IdEstudanteLB = new javax.swing.JLabel();
        Id_Input = new com.raven.swing.MyTextField();
        TituloLB = new javax.swing.JLabel();
        CadastrarBTN = new com.raven.swing.dashboard.DashboardButton();
        AtualizarBTN = new com.raven.swing.dashboard.DashboardButton();
        DeletarBTN = new com.raven.swing.dashboard.DashboardButton();

        setBackground(new java.awt.Color(242, 242, 242));

        dashboardBorder2.setBackground(new java.awt.Color(255, 255, 255));
        dashboardBorder2.setForeground(new java.awt.Color(255, 255, 255));

        StudentScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        StudentScrPanel.setBorder(null);
        StudentScrPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        StudentTable.setBackground(new java.awt.Color(255, 255, 255));
        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Nascimento", "Sexo", "Estado Civil", "Nome mãe", "Nome pai", "Email", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentScrPanel.setViewportView(StudentTable);

        javax.swing.GroupLayout dashboardBorder2Layout = new javax.swing.GroupLayout(dashboardBorder2);
        dashboardBorder2.setLayout(dashboardBorder2Layout);
        dashboardBorder2Layout.setHorizontalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(StudentScrPanel)
                .addGap(20, 20, 20))
        );
        dashboardBorder2Layout.setVerticalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(StudentScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        RegisterStudentScrPane.setBackground(new java.awt.Color(255, 255, 255));
        RegisterStudentScrPane.setBorder(null);
        RegisterStudentScrPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        EstudanteCadastroPanel.setBackground(new java.awt.Color(255, 255, 255));

        TelefoneLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TelefoneLB.setForeground(new java.awt.Color(0, 0, 0));
        TelefoneLB.setText("Telefone");

        EmailLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmailLB.setForeground(new java.awt.Color(0, 0, 0));
        EmailLB.setText("Email");

        NomeLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeLB.setForeground(new java.awt.Color(0, 0, 0));
        NomeLB.setText("Nome Completo");

        SexoLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SexoLB.setForeground(new java.awt.Color(0, 0, 0));
        SexoLB.setText("Sexo");

        EstadoCivilLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EstadoCivilLB.setForeground(new java.awt.Color(0, 0, 0));
        EstadoCivilLB.setText("Estado Civil");

        EstadoCivil_Input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolher Estado Civil", "Solteiro(a)", "Casado(a)", "Viúvo(a)", "União Estável" }));

        Sexo_Input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolher Sexo", "Masculino", "Feminino", "Prefiro não informar" }));

        NascimentoLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NascimentoLB.setForeground(new java.awt.Color(0, 0, 0));
        NascimentoLB.setText("Data de Nascimento");

        PaiLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PaiLB.setForeground(new java.awt.Color(0, 0, 0));
        PaiLB.setText("Nome do pai");

        Pai_Input.setForeground(new java.awt.Color(0, 0, 0));

        Telefone_Input.setForeground(new java.awt.Color(0, 0, 0));
        Telefone_Input.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Telefone_Input.setToolTipText("");
        try {
            Telefone_Input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Nascimento_Input.setForeground(new java.awt.Color(0, 0, 0));
        Nascimento_Input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nascimento_Input.setToolTipText("");
        try {
            Nascimento_Input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Email_Input.setForeground(new java.awt.Color(0, 0, 0));

        Nome_Input.setForeground(new java.awt.Color(0, 0, 0));

        MaeLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MaeLB.setForeground(new java.awt.Color(0, 0, 0));
        MaeLB.setText("Nome da mãe");

        Mae_Input.setForeground(new java.awt.Color(0, 0, 0));

        IdEstudanteLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdEstudanteLB.setForeground(new java.awt.Color(0, 0, 0));
        IdEstudanteLB.setText("ID do estudante");

        Id_Input.setForeground(new java.awt.Color(0, 0, 0));

        TituloLB.setBackground(new java.awt.Color(127, 127, 127));
        TituloLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLB.setForeground(new java.awt.Color(172, 172, 172));
        TituloLB.setText("Cadastro de estudantes - Dados Pessoais");

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

        javax.swing.GroupLayout EstudanteCadastroPanelLayout = new javax.swing.GroupLayout(EstudanteCadastroPanel);
        EstudanteCadastroPanel.setLayout(EstudanteCadastroPanelLayout);
        EstudanteCadastroPanelLayout.setHorizontalGroup(
            EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloLB)
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PaiLB)
                            .addComponent(Pai_Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SexoLB)
                            .addComponent(Sexo_Input, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(IdEstudanteLB)
                            .addComponent(Id_Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Email_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailLB)
                                    .addComponent(EstadoCivilLB)
                                    .addComponent(EstadoCivil_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaeLB)
                                    .addComponent(Mae_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelefoneLB)
                                    .addComponent(Telefone_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                        .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                        .addComponent(NomeLB)
                                        .addGap(179, 179, 179))
                                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                        .addComponent(Nome_Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(40, 40, 40)))
                                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nascimento_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NascimentoLB))))))
                .addGap(77, 77, 77))
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
                            .addComponent(Nascimento_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addComponent(IdEstudanteLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Id_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                .addComponent(EstadoCivilLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(EstadoCivil_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                                .addComponent(SexoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Sexo_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addComponent(MaeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Mae_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefoneLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Email_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefone_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EstudanteCadastroPanelLayout.createSequentialGroup()
                        .addComponent(PaiLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Pai_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(EstudanteCadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        RegisterStudentScrPane.setViewportView(EstudanteCadastroPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterStudentScrPane, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(RegisterStudentScrPane)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtualizarBTNActionPerformed

    private void DeletarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletarBTNActionPerformed

    private void CadastrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarBTNActionPerformed
       
    }//GEN-LAST:event_CadastrarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardButton AtualizarBTN;
    private com.raven.swing.dashboard.DashboardButton CadastrarBTN;
    private com.raven.swing.dashboard.DashboardButton DeletarBTN;
    private javax.swing.JLabel EmailLB;
    private com.raven.swing.MyTextField Email_Input;
    private javax.swing.JLabel EstadoCivilLB;
    private com.raven.swing.ComboBoxInput EstadoCivil_Input;
    private javax.swing.JPanel EstudanteCadastroPanel;
    private javax.swing.JLabel IdEstudanteLB;
    private com.raven.swing.MyTextField Id_Input;
    private javax.swing.JLabel MaeLB;
    private com.raven.swing.MyTextField Mae_Input;
    private javax.swing.JLabel NascimentoLB;
    private com.raven.swing.MyFormatedField Nascimento_Input;
    private javax.swing.JLabel NomeLB;
    private com.raven.swing.MyTextField Nome_Input;
    private javax.swing.JLabel PaiLB;
    private com.raven.swing.MyTextField Pai_Input;
    private javax.swing.JScrollPane RegisterStudentScrPane;
    private javax.swing.JLabel SexoLB;
    private com.raven.swing.ComboBoxInput Sexo_Input;
    private javax.swing.JScrollPane StudentScrPanel;
    private com.raven.swing.dashboard.dashboardTables.StudentTable StudentTable;
    private javax.swing.JLabel TelefoneLB;
    private com.raven.swing.MyFormatedField Telefone_Input;
    private javax.swing.JLabel TituloLB;
    private com.raven.swing.dashboard.DashboardBorder dashboardBorder2;
    // End of variables declaration//GEN-END:variables
}
