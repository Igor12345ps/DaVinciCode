package com.raven.forms.UnusedPages;

import com.raven.swing.dashboard.DashboardScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class RegisterGrades extends javax.swing.JPanel {

    public RegisterGrades() {
        initComponents();
        
        GradesScrPane.setVerticalScrollBar(new DashboardScrollBar());
        GradesScrPane.getVerticalScrollBar().setBackground(Color.WHITE);
        GradesScrPane.setHorizontalScrollBar(new DashboardScrollBar());
        GradesScrPane.getHorizontalScrollBar().setBackground(Color.WHITE);
        GradesScrPane.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        GradesScrPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        RegisterGradesScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        RegisterGradesScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        RegisterGradesScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        RegisterGradesScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        RegisterGradesScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p.setBackground(Color.WHITE);
        RegisterGradesScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        
        // AQUI VAI O SELECT DO BD PARA A TABELA DE NOTAS, ENTAO DEVE SER VISTO COMO VAI TROCAR OS DADOS (SEGUE O MOLDE)        
        
        GradesTable.addRow(new Object[]{"1", "1001", "Ana Silva", "1", "10", "10", "10", "10"});
        GradesTable.addRow(new Object[]{"2", "1002", "Bruno Souza", "2","10", "10", "10", "10" });
        GradesTable.addRow(new Object[]{"3", "1003", "Carla Pereira", "1","10", "10", "10", "10" });
        GradesTable.addRow(new Object[]{"4", "1004", "Daniel Oliveira", "2","10", "10", "10", "10" });
        GradesTable.addRow(new Object[]{"5", "1005", "Eduarda Lima", "1", "10", "10", "10", "10"});
        GradesTable.addRow(new Object[]{"6", "1006", "Fernando Almeida", "2","10", "10", "10", "10" });
        GradesTable.addRow(new Object[]{"7", "1007", "Gabriela Fernandes", "1","10", "10", "10", "10" });
        GradesTable.addRow(new Object[]{"8", "1008", "Hugo Martins", "2","10", "10", "10", "10" });


        
    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardBorder2 = new com.raven.swing.dashboard.DashboardBorder();
        GradesScrPane = new javax.swing.JScrollPane();
        GradesTable = new com.raven.swing.dashboard.dashboardTables.GradesTable();
        RegisterGradesScrPanel = new javax.swing.JScrollPane();
        dashboardBorder1 = new com.raven.swing.dashboard.DashboardBorder();
        SemestreLB = new javax.swing.JLabel();
        Materia3LB = new javax.swing.JLabel();
        Materia1LB = new javax.swing.JLabel();
        NomeAlunoLB = new javax.swing.JLabel();
        IdEstudante_Input = new com.raven.swing.MyTextField();
        IdEstudanteLB = new javax.swing.JLabel();
        Nome_Input = new com.raven.swing.MyTextField();
        Materia3_Input = new com.raven.swing.MyTextField();
        Nota3_Input = new com.raven.swing.MyTextField();
        Materia1_Input = new com.raven.swing.MyTextField();
        Nota1_Input = new com.raven.swing.MyTextField();
        Materia2LB = new javax.swing.JLabel();
        Materia2_Input = new com.raven.swing.MyTextField();
        Materia4LB = new javax.swing.JLabel();
        Materia4_Input = new com.raven.swing.MyTextField();
        Nota4_Input = new com.raven.swing.MyTextField();
        Nota2_Input = new com.raven.swing.MyTextField();
        Semestre_Input = new com.raven.swing.ComboBoxInput();
        TituloLB = new javax.swing.JLabel();
        PesquisarBTN = new com.raven.swing.dashboard.DashboardButton();
        CadastrarBTN = new com.raven.swing.dashboard.DashboardButton();
        AtualizarBTN = new com.raven.swing.dashboard.DashboardButton();
        DeletarBTN = new com.raven.swing.dashboard.DashboardButton();
        Nota1LB = new javax.swing.JLabel();
        Nota2LB = new javax.swing.JLabel();
        Nota3LB = new javax.swing.JLabel();
        Nota4LB = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        dashboardBorder2.setBackground(new java.awt.Color(255, 255, 255));
        dashboardBorder2.setForeground(new java.awt.Color(255, 255, 255));

        GradesScrPane.setBackground(new java.awt.Color(255, 255, 255));
        GradesScrPane.setBorder(null);

        GradesTable.setBackground(new java.awt.Color(255, 255, 255));
        GradesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id ", "Id aluno", "Nome ", "Semestre", "Nota matéria 1", "Nota matéria 2", "Nota matéria 3", "Nota matéria 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GradesScrPane.setViewportView(GradesTable);

        javax.swing.GroupLayout dashboardBorder2Layout = new javax.swing.GroupLayout(dashboardBorder2);
        dashboardBorder2.setLayout(dashboardBorder2Layout);
        dashboardBorder2Layout.setHorizontalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(GradesScrPane)
                .addGap(20, 20, 20))
        );
        dashboardBorder2Layout.setVerticalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(GradesScrPane, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        RegisterGradesScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        RegisterGradesScrPanel.setBorder(null);
        RegisterGradesScrPanel.setForeground(new java.awt.Color(255, 255, 255));
        RegisterGradesScrPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        dashboardBorder1.setBackground(new java.awt.Color(255, 255, 255));

        SemestreLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SemestreLB.setForeground(new java.awt.Color(0, 0, 0));
        SemestreLB.setText("Semestre");

        Materia3LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Materia3LB.setForeground(new java.awt.Color(0, 0, 0));
        Materia3LB.setText("Materia 3");

        Materia1LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Materia1LB.setForeground(new java.awt.Color(0, 0, 0));
        Materia1LB.setText("Materia 1");

        NomeAlunoLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeAlunoLB.setForeground(new java.awt.Color(0, 0, 0));
        NomeAlunoLB.setText("Nome do aluno");

        IdEstudante_Input.setForeground(new java.awt.Color(0, 0, 0));

        IdEstudanteLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdEstudanteLB.setForeground(new java.awt.Color(0, 0, 0));
        IdEstudanteLB.setText("ID do estudante");

        Nome_Input.setForeground(new java.awt.Color(0, 0, 0));

        Materia3_Input.setForeground(new java.awt.Color(0, 0, 0));

        Nota3_Input.setForeground(new java.awt.Color(0, 0, 0));
        Nota3_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nota3_InputActionPerformed(evt);
            }
        });

        Materia1_Input.setForeground(new java.awt.Color(0, 0, 0));

        Nota1_Input.setForeground(new java.awt.Color(0, 0, 0));
        Nota1_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nota1_InputActionPerformed(evt);
            }
        });

        Materia2LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Materia2LB.setForeground(new java.awt.Color(0, 0, 0));
        Materia2LB.setText("Materia 2");

        Materia2_Input.setForeground(new java.awt.Color(0, 0, 0));

        Materia4LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Materia4LB.setForeground(new java.awt.Color(0, 0, 0));
        Materia4LB.setText("Materia 4");

        Materia4_Input.setForeground(new java.awt.Color(0, 0, 0));

        Nota4_Input.setForeground(new java.awt.Color(0, 0, 0));
        Nota4_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nota4_InputActionPerformed(evt);
            }
        });

        Nota2_Input.setForeground(new java.awt.Color(0, 0, 0));
        Nota2_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nota2_InputActionPerformed(evt);
            }
        });

        Semestre_Input.setMaximumRowCount(11);
        Semestre_Input.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolher semestre", "1° semestre", "2° semestre", "3° semestre", "4° semestre", "5° semestre", "6° semestre", "7° semestre", "8° semestre", "9° semestre", "10° semestre" }));
        Semestre_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Semestre_InputActionPerformed(evt);
            }
        });

        TituloLB.setBackground(new java.awt.Color(127, 127, 127));
        TituloLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLB.setForeground(new java.awt.Color(172, 172, 172));
        TituloLB.setText("Cadastro de notas");

        PesquisarBTN.setBackground(new java.awt.Color(29, 162, 253));
        PesquisarBTN.setForeground(new java.awt.Color(255, 255, 255));
        PesquisarBTN.setText("Pesquisar");
        PesquisarBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PesquisarBTN.setPreferredSize(new java.awt.Dimension(80, 42));
        PesquisarBTN.setShadowColor(new java.awt.Color(29, 162, 253));
        PesquisarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarBTNActionPerformed(evt);
            }
        });

        CadastrarBTN.setBackground(new java.awt.Color(30, 180, 114));
        CadastrarBTN.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarBTN.setText("Cadastrar");
        CadastrarBTN.setShadowColor(new java.awt.Color(30, 180, 114));

        AtualizarBTN.setBackground(new java.awt.Color(246, 159, 50));
        AtualizarBTN.setForeground(new java.awt.Color(255, 255, 255));
        AtualizarBTN.setText("Atualizar");
        AtualizarBTN.setShadowColor(new java.awt.Color(246, 159, 50));
        AtualizarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarBTNActionPerformed(evt);
            }
        });

        DeletarBTN.setBackground(new java.awt.Color(253, 83, 83));
        DeletarBTN.setForeground(new java.awt.Color(255, 255, 255));
        DeletarBTN.setText("Deletar");
        DeletarBTN.setSelected(true);
        DeletarBTN.setShadowColor(new java.awt.Color(253, 83, 83));
        DeletarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarBTNActionPerformed(evt);
            }
        });

        Nota1LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nota1LB.setForeground(new java.awt.Color(0, 0, 0));
        Nota1LB.setText("Nota");

        Nota2LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nota2LB.setForeground(new java.awt.Color(0, 0, 0));
        Nota2LB.setText("Nota");

        Nota3LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nota3LB.setForeground(new java.awt.Color(0, 0, 0));
        Nota3LB.setText("Nota");

        Nota4LB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nota4LB.setForeground(new java.awt.Color(0, 0, 0));
        Nota4LB.setText("Nota");

        javax.swing.GroupLayout dashboardBorder1Layout = new javax.swing.GroupLayout(dashboardBorder1);
        dashboardBorder1.setLayout(dashboardBorder1Layout);
        dashboardBorder1Layout.setHorizontalGroup(
            dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardBorder1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TituloLB))
                    .addGroup(dashboardBorder1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NomeAlunoLB)
                            .addComponent(IdEstudanteLB)
                            .addComponent(IdEstudante_Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nome_Input, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Materia1_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Materia1LB))
                                .addGap(20, 20, 20)
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nota1LB)
                                    .addComponent(Nota1_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Materia3_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Materia3LB))
                                .addGap(18, 18, 18)
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nota3LB)
                                    .addComponent(Nota3_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SemestreLB)
                            .addComponent(Materia2LB)
                            .addComponent(Materia4LB)
                            .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Materia2_Input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Semestre_Input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                            .addComponent(Materia4_Input, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PesquisarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota2_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota4_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota2LB)
                            .addComponent(Nota4LB)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(40, 40, 40))
        );
        dashboardBorder1Layout.setVerticalGroup(
            dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TituloLB)
                .addGap(14, 14, 14)
                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdEstudanteLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SemestreLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdEstudante_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Semestre_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(NomeAlunoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Nome_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder1Layout.createSequentialGroup()
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addComponent(Materia1LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addComponent(Nota1LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Materia1_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota1_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Materia3LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nota3LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Materia3_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nota3_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder1Layout.createSequentialGroup()
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addComponent(Materia2LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                                .addComponent(Nota2LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder1Layout.createSequentialGroup()
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Materia2_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nota2_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(Materia4LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder1Layout.createSequentialGroup()
                                .addComponent(Nota4LB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Nota4_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Materia4_Input, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)))
                .addGap(30, 30, 30)
                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        RegisterGradesScrPanel.setViewportView(dashboardBorder1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegisterGradesScrPanel)
                    .addComponent(dashboardBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(RegisterGradesScrPanel)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Nota3_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nota3_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nota3_InputActionPerformed

    private void Nota1_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nota1_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nota1_InputActionPerformed

    private void Nota4_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nota4_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nota4_InputActionPerformed

    private void Nota2_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nota2_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nota2_InputActionPerformed

    private void Semestre_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Semestre_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Semestre_InputActionPerformed

    private void PesquisarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarBTNActionPerformed

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
    private javax.swing.JScrollPane GradesScrPane;
    private com.raven.swing.dashboard.dashboardTables.GradesTable GradesTable;
    private javax.swing.JLabel IdEstudanteLB;
    private com.raven.swing.MyTextField IdEstudante_Input;
    private javax.swing.JLabel Materia1LB;
    private com.raven.swing.MyTextField Materia1_Input;
    private javax.swing.JLabel Materia2LB;
    private com.raven.swing.MyTextField Materia2_Input;
    private javax.swing.JLabel Materia3LB;
    private com.raven.swing.MyTextField Materia3_Input;
    private javax.swing.JLabel Materia4LB;
    private com.raven.swing.MyTextField Materia4_Input;
    private javax.swing.JLabel NomeAlunoLB;
    private com.raven.swing.MyTextField Nome_Input;
    private javax.swing.JLabel Nota1LB;
    private com.raven.swing.MyTextField Nota1_Input;
    private javax.swing.JLabel Nota2LB;
    private com.raven.swing.MyTextField Nota2_Input;
    private javax.swing.JLabel Nota3LB;
    private com.raven.swing.MyTextField Nota3_Input;
    private javax.swing.JLabel Nota4LB;
    private com.raven.swing.MyTextField Nota4_Input;
    private com.raven.swing.dashboard.DashboardButton PesquisarBTN;
    private javax.swing.JScrollPane RegisterGradesScrPanel;
    private javax.swing.JLabel SemestreLB;
    private com.raven.swing.ComboBoxInput Semestre_Input;
    private javax.swing.JLabel TituloLB;
    private com.raven.swing.dashboard.DashboardBorder dashboardBorder1;
    private com.raven.swing.dashboard.DashboardBorder dashboardBorder2;
    // End of variables declaration//GEN-END:variables
}
