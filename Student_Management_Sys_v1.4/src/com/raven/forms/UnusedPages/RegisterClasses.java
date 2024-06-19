package com.raven.forms.UnusedPages;

import com.raven.swing.dashboard.DashboardScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class RegisterClasses extends javax.swing.JPanel {

    public RegisterClasses() {
        initComponents();
        
        ClassesScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        ClassesScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        ClassesScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        ClassesScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        ClassesScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        ClassesScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        RegisterClassesScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        RegisterClassesScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        RegisterClassesScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        RegisterClassesScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        RegisterClassesScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p.setBackground(Color.WHITE);
        RegisterClassesScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        
        // AQUI VAI O SELECT DO BD PARA A TABELA DE MATERIAS, ENTAO DEVE SER VISTO COMO VAI TROCAR OS DADOS (SEGUE O MOLDE)
        
       
        ClassesTable.addRow(new Object[]{"1", "1001", "Ana Silva", "1", "Algoritmos e Estruturas de Dados", "Programação Orientada a Objetos", "Desenvolvimento Web", "Bancos de Dados"});
        ClassesTable.addRow(new Object[]{"2", "1002", "Bruno Souza", "2", "Programação Funcional", "Engenharia de Software", "Redes de Computadores", "Inteligência Artificial"});
        ClassesTable.addRow(new Object[]{"3", "1003", "Carla Pereira", "1", "Algoritmos e Estruturas de Dados", "Programação Orientada a Objetos", "Desenvolvimento Web", "Bancos de Dados"});
        ClassesTable.addRow(new Object[]{"4", "1004", "Daniel Oliveira", "2", "Programação Funcional", "Engenharia de Software", "Redes de Computadores", "Inteligência Artificial"});
        ClassesTable.addRow(new Object[]{"5", "1005", "Eduarda Lima", "1", "Algoritmos e Estruturas de Dados", "Programação Orientada a Objetos", "Desenvolvimento Web", "Bancos de Dados"});
        ClassesTable.addRow(new Object[]{"6", "1006", "Fernando Almeida", "2", "Programação Funcional", "Engenharia de Software", "Redes de Computadores", "Inteligência Artificial"});
        ClassesTable.addRow(new Object[]{"7", "1007", "Gabriela Fernandes", "1", "Algoritmos e Estruturas de Dados", "Programação Orientada a Objetos", "Desenvolvimento Web", "Bancos de Dados"});
        ClassesTable.addRow(new Object[]{"8", "1008", "Hugo Martins", "2", "Programação Funcional", "Engenharia de Software", "Redes de Computadores", "Inteligência Artificial"});

    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardBorder2 = new com.raven.swing.dashboard.DashboardBorder();
        ClassesScrPanel = new javax.swing.JScrollPane();
        ClassesTable = new com.raven.swing.dashboard.dashboardTables.StudentTable();
        RegisterClassesScrPanel = new javax.swing.JScrollPane();
        dashboardBorder1 = new com.raven.swing.dashboard.DashboardBorder();
        IdUnidadeCurricularLB = new javax.swing.JLabel();
        IdUnidadeCurricular_Input = new com.raven.swing.MyTextField();
        SemestreLB = new javax.swing.JLabel();
        Semestre_Input = new com.raven.swing.ComboBoxInput();
        Materia3LB = new javax.swing.JLabel();
        Materia3_Input = new com.raven.swing.ComboBoxInput();
        Materia4_Input = new com.raven.swing.ComboBoxInput();
        Materia4LB = new javax.swing.JLabel();
        Materia1_Input = new com.raven.swing.ComboBoxInput();
        Materia1LB = new javax.swing.JLabel();
        NomeAlunoLB = new javax.swing.JLabel();
        Nome_Input = new com.raven.swing.MyTextField();
        Materia2LB = new javax.swing.JLabel();
        Materia2_Input = new com.raven.swing.ComboBoxInput();
        IdEstudante_Input = new com.raven.swing.MyTextField();
        IdEstudanteLB = new javax.swing.JLabel();
        TituloLB = new javax.swing.JLabel();
        PesquisarBTN = new com.raven.swing.dashboard.DashboardButton();
        CadastrarBTN = new com.raven.swing.dashboard.DashboardButton();
        AtualizarBTN = new com.raven.swing.dashboard.DashboardButton();
        DeletarBTN = new com.raven.swing.dashboard.DashboardButton();

        setBackground(new java.awt.Color(242, 242, 242));

        dashboardBorder2.setBackground(new java.awt.Color(255, 255, 255));
        dashboardBorder2.setForeground(new java.awt.Color(255, 255, 255));

        ClassesScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        ClassesScrPanel.setBorder(null);
        ClassesScrPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ClassesTable.setBackground(new java.awt.Color(255, 255, 255));
        ClassesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID UC", "ID Estudante", "Nome", "Semestre", "Máteria 1", "Máteria 2", "Máteria 3", "Máteria 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClassesScrPanel.setViewportView(ClassesTable);

        javax.swing.GroupLayout dashboardBorder2Layout = new javax.swing.GroupLayout(dashboardBorder2);
        dashboardBorder2.setLayout(dashboardBorder2Layout);
        dashboardBorder2Layout.setHorizontalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ClassesScrPanel)
                .addGap(20, 20, 20))
        );
        dashboardBorder2Layout.setVerticalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ClassesScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        RegisterClassesScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        RegisterClassesScrPanel.setBorder(null);
        RegisterClassesScrPanel.setForeground(new java.awt.Color(255, 255, 255));
        RegisterClassesScrPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        dashboardBorder1.setBackground(new java.awt.Color(255, 255, 255));

        IdUnidadeCurricularLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdUnidadeCurricularLB.setForeground(new java.awt.Color(0, 0, 0));
        IdUnidadeCurricularLB.setText("ID da Unidade Curricular");

        IdUnidadeCurricular_Input.setForeground(new java.awt.Color(0, 0, 0));

        SemestreLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SemestreLB.setForeground(new java.awt.Color(0, 0, 0));
        SemestreLB.setText("Semestre");

        Semestre_Input.setMaximumRowCount(11);
        Semestre_Input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolher semestre", "1° semestre", "2° semestre", "3° semestre", "4° semestre", "5° semestre", "6° semestre", "7° semestre", "8° semestre", "9° semestre", "10° semestre" }));
        Semestre_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Semestre_InputActionPerformed(evt);
            }
        });

        Materia3LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Materia3LB.setForeground(new java.awt.Color(0, 0, 0));
        Materia3LB.setText("Materia 3");

        Materia3_Input.setMaximumRowCount(11);
        Materia3_Input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolher máteria", "Algoritmos e Estruturas de Dados", "Programação Orientada a Objetos", "Desenvolvimento Web", "Programação Funcional", "Bancos de Dados", "Engenharia de Software", "Desenvolvimento de Aplicações Móveis", "Redes de Computadores", "Sistemas Operacionais", "Inteligência Artificial" }));
        Materia3_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Materia3_InputActionPerformed(evt);
            }
        });

        Materia4_Input.setMaximumRowCount(11);
        Materia4_Input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolher máteria", "Algoritmos e Estruturas de Dados", "Programação Orientada a Objetos", "Desenvolvimento Web", "Programação Funcional", "Bancos de Dados", "Engenharia de Software", "Desenvolvimento de Aplicações Móveis", "Redes de Computadores", "Sistemas Operacionais", "Inteligência Artificial" }));

        Materia4LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Materia4LB.setForeground(new java.awt.Color(0, 0, 0));
        Materia4LB.setText("Materia 4");

        Materia1_Input.setMaximumRowCount(11);
        Materia1_Input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolher máteria", "Algoritmos e Estruturas de Dados", "Programação Orientada a Objetos", "Desenvolvimento Web", "Programação Funcional", "Bancos de Dados", "Engenharia de Software", "Desenvolvimento de Aplicações Móveis", "Redes de Computadores", "Sistemas Operacionais", "Inteligência Artificial" }));

        Materia1LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Materia1LB.setForeground(new java.awt.Color(0, 0, 0));
        Materia1LB.setText("Materia 1");

        NomeAlunoLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeAlunoLB.setForeground(new java.awt.Color(0, 0, 0));
        NomeAlunoLB.setText("Nome do aluno");

        Nome_Input.setForeground(new java.awt.Color(0, 0, 0));

        Materia2LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Materia2LB.setForeground(new java.awt.Color(0, 0, 0));
        Materia2LB.setText("Materia 2");

        Materia2_Input.setMaximumRowCount(11);
        Materia2_Input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolher máteria", "Algoritmos e Estruturas de Dados", "Programação Orientada a Objetos", "Desenvolvimento Web", "Programação Funcional", "Bancos de Dados", "Engenharia de Software", "Desenvolvimento de Aplicações Móveis", "Redes de Computadores", "Sistemas Operacionais", "Inteligência Artificial" }));

        IdEstudante_Input.setForeground(new java.awt.Color(0, 0, 0));

        IdEstudanteLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdEstudanteLB.setForeground(new java.awt.Color(0, 0, 0));
        IdEstudanteLB.setText("ID do estudante");

        TituloLB.setBackground(new java.awt.Color(127, 127, 127));
        TituloLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLB.setForeground(new java.awt.Color(172, 172, 172));
        TituloLB.setText("Cadastro de matérias");

        PesquisarBTN.setBackground(new java.awt.Color(29, 162, 253));
        PesquisarBTN.setForeground(new java.awt.Color(255, 255, 255));
        PesquisarBTN.setText("Pesquisar");
        PesquisarBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PesquisarBTN.setShadowColor(new java.awt.Color(29, 162, 253));
        PesquisarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarBTNActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout dashboardBorder1Layout = new javax.swing.GroupLayout(dashboardBorder1);
        dashboardBorder1.setLayout(dashboardBorder1Layout);
        dashboardBorder1Layout.setHorizontalGroup(
            dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloLB)
                    .addComponent(IdEstudanteLB)
                    .addGroup(dashboardBorder1Layout.createSequentialGroup()
                        .addComponent(IdEstudante_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PesquisarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardBorder1Layout.createSequentialGroup()
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IdUnidadeCurricularLB)
                                    .addComponent(IdUnidadeCurricular_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Materia1LB)
                                    .addComponent(Materia1_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NomeAlunoLB)
                                    .addComponent(Nome_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Materia2LB)
                                    .addComponent(Materia2_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Materia4_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Materia4LB))
                        .addGap(40, 40, 40)
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Materia3LB)
                                .addComponent(Materia3_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SemestreLB)
                                .addComponent(Semestre_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
        );
        dashboardBorder1Layout.setVerticalGroup(
            dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TituloLB)
                .addGap(20, 20, 20)
                .addComponent(IdEstudanteLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dashboardBorder1Layout.createSequentialGroup()
                        .addComponent(Materia2LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Materia2_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardBorder1Layout.createSequentialGroup()
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(Semestre_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(SemestreLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IdEstudante_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PesquisarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                        .addComponent(NomeAlunoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(Nome_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                        .addComponent(IdUnidadeCurricularLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(IdUnidadeCurricular_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20)
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addComponent(Materia1LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Materia1_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder1Layout.createSequentialGroup()
                                .addComponent(Materia3LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Materia3_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20)
                .addComponent(Materia4LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Materia4_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        RegisterClassesScrPanel.setViewportView(dashboardBorder1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegisterClassesScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .addComponent(dashboardBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(RegisterClassesScrPanel)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Semestre_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Semestre_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Semestre_InputActionPerformed

    private void Materia3_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Materia3_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Materia3_InputActionPerformed

    private void AtualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AtualizarBTNActionPerformed

    private void DeletarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletarBTNActionPerformed

    private void PesquisarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardButton AtualizarBTN;
    private com.raven.swing.dashboard.DashboardButton CadastrarBTN;
    private javax.swing.JScrollPane ClassesScrPanel;
    private com.raven.swing.dashboard.dashboardTables.StudentTable ClassesTable;
    private com.raven.swing.dashboard.DashboardButton DeletarBTN;
    private javax.swing.JLabel IdEstudanteLB;
    private com.raven.swing.MyTextField IdEstudante_Input;
    private javax.swing.JLabel IdUnidadeCurricularLB;
    private com.raven.swing.MyTextField IdUnidadeCurricular_Input;
    private javax.swing.JLabel Materia1LB;
    private com.raven.swing.ComboBoxInput Materia1_Input;
    private javax.swing.JLabel Materia2LB;
    private com.raven.swing.ComboBoxInput Materia2_Input;
    private javax.swing.JLabel Materia3LB;
    private com.raven.swing.ComboBoxInput Materia3_Input;
    private javax.swing.JLabel Materia4LB;
    private com.raven.swing.ComboBoxInput Materia4_Input;
    private javax.swing.JLabel NomeAlunoLB;
    private com.raven.swing.MyTextField Nome_Input;
    private com.raven.swing.dashboard.DashboardButton PesquisarBTN;
    private javax.swing.JScrollPane RegisterClassesScrPanel;
    private javax.swing.JLabel SemestreLB;
    private com.raven.swing.ComboBoxInput Semestre_Input;
    private javax.swing.JLabel TituloLB;
    private com.raven.swing.dashboard.DashboardBorder dashboardBorder1;
    private com.raven.swing.dashboard.DashboardBorder dashboardBorder2;
    // End of variables declaration//GEN-END:variables
}
