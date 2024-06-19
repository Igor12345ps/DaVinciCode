package com.raven.forms;

import com.raven.db.enums.RoleEnum;
import com.raven.db.helper.ComboBoxHelperAcademicUnit;
import com.raven.db.helper.ComboBoxHelperSemester;
import com.raven.db.models.AcademicUnitModel;
import com.raven.db.models.SemesterModel;
import com.raven.db.models.ClassModel;
import com.raven.db.models.UserModel;
import com.raven.db.models.renderer.AcademicUnitModelRenderer;
import com.raven.db.models.renderer.SemesterModelRenderer;
import com.raven.db.service.ClassService;
import com.raven.db.service.SemesterService;
import com.raven.db.service.UserService;
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

public class RegisterClass extends javax.swing.JPanel {

    ClassService classeService = new ClassService();
    UserService userService = new UserService();

    ComboBoxHelperAcademicUnit comboBoxHelperAcademicUnit = new ComboBoxHelperAcademicUnit();
    ComboBoxHelperSemester comboBoxHelperSemester = new ComboBoxHelperSemester();
    
    boolean isProfessor = Main.getUserSessionModel().getRoleModel().getRole_enum() == RoleEnum.PROFESSOR;
    
    public RegisterClass() {
        initComponents();
        RefreshTable();
        
        if(isProfessor){
            CadastrarBTN.setVisible(false);
            AtualizarBTN.setVisible(false);
            DeletarBTN.setVisible(false);
            inProfessorName.setEnabled(false);
            inStudentName.setEnabled(false);
            selectAcademicUnit.setEnabled(false);
            selectSemester.setEnabled(false);
        }

        StudentScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        StudentScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        StudentScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        StudentScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        StudentScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        StudentScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        RegisterStudentClassScrPane.setVerticalScrollBar(new DashboardScrollBar());
        RegisterStudentClassScrPane.getVerticalScrollBar().setBackground(Color.WHITE);
        RegisterStudentClassScrPane.setHorizontalScrollBar(new DashboardScrollBar());
        RegisterStudentClassScrPane.getHorizontalScrollBar().setBackground(Color.WHITE);
        RegisterStudentClassScrPane.getViewport().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        RegisterStudentClassScrPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        TeacherScrPanel.setVerticalScrollBar(new DashboardScrollBar());;;;
        TeacherScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        TeacherScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        TeacherScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        TeacherScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.WHITE);
        TeacherScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        StudentClassScrPanel.setVerticalScrollBar(new DashboardScrollBar());;;;
        StudentClassScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        StudentClassScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        StudentClassScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        StudentClassScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p3 = new JPanel();
        p2.setBackground(Color.WHITE);
        StudentClassScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        StudentTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificando se a seleção é válida e se foi feita apenas uma seleção
                if (!e.getValueIsAdjusting() && StudentTable.getSelectedRow() != -1) {
                    // Obtendo os dados da linha selecionada
                    int selectedRow = StudentTable.getSelectedRow();

                    Integer userId = (Integer) StudentTable.getValueAt(selectedRow, 0);
                    String userName = (String) StudentTable.getValueAt(selectedRow, 1);
                    String userEmail = (String) StudentTable.getValueAt(selectedRow, 2);
                    UserModel selectedUser = new UserModel(
                            userId,
                            userName,
                            null,
                            userEmail,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null
                    );

                    inStudentName.setText(userName);
                }

            }
        });

        TeacherTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificando se a seleção é válida e se foi feita apenas uma seleção
                if (!e.getValueIsAdjusting() && TeacherTable.getSelectedRow() != -1) {
                    // Obtendo os dados da linha selecionada
                    int selectedRow = TeacherTable.getSelectedRow();

                    Integer userId = (Integer) TeacherTable.getValueAt(selectedRow, 0);
                    String userName = (String) TeacherTable.getValueAt(selectedRow, 1);
                    String userEmail = (String) TeacherTable.getValueAt(selectedRow, 2);
                    UserModel selectedUser = new UserModel(
                            userId,
                            userName,
                            null,
                            userEmail,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null
                    );

                    inProfessorName.setText(userName);
                }
            }
        });

        StudentClassTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificando se a seleção é válida e se foi feita apenas uma seleção
                if (!e.getValueIsAdjusting() && StudentClassTable.getSelectedRow() != -1) {
                    // Obtendo os dados da linha selecionada
                    int selectedRow = StudentClassTable.getSelectedRow();

                    AcademicUnitModel academicUnit = comboBoxHelperAcademicUnit.getSelectModel(selectAcademicUnit.getModel(), StudentClassTable.getValueAt(selectedRow, 2).toString());
                    selectAcademicUnit.setSelectedItem(academicUnit);   
                    
                    UserModel student = new UserModel();
                    student.setName(StudentClassTable.getValueAt(selectedRow, 1).toString());
                    UserModel professor = new UserModel();
                    professor.setName(StudentClassTable.getValueAt(selectedRow, 3).toString());
                   
                    SemesterModel semester = comboBoxHelperSemester.getSelectModel(selectSemester.getModel(), StudentClassTable.getValueAt(selectedRow, 4).toString());
                    selectSemester.setSelectedItem(semester);                    
                    
                    ClassModel userClass = new ClassModel(Integer.parseInt(StudentClassTable.getValueAt(selectedRow, 0).toString()), student, professor, academicUnit, semester, null);

                    inStudentName.setText(userClass.getStudent().getName());
                    inProfessorName.setText(userClass.getProfessor().getName());
                    
                    int StudentNameColumn = 1;
                    for (int i = 0; i < StudentTable.getRowCount(); i++) {
                        if (inStudentName.getText().equals(StudentTable.getValueAt(i, StudentNameColumn))) {
                            // Seleciona a linha
                            StudentTable.setRowSelectionInterval(i, i);
                            // Dá foco à linha selecionada
                            StudentTable.scrollRectToVisible(StudentTable.getCellRect(i, StudentNameColumn, true));
                            break; // Remove esta linha se quiser selecionar todas as ocorrências de "oi"
                        }
                    }
                    
                    int ProfessorNameColumn = 1;
                    for (int i = 0; i < TeacherTable.getRowCount(); i++) {
                        if (inProfessorName.getText().equals(TeacherTable.getValueAt(i, ProfessorNameColumn))) {
                            // Seleciona a linha
                            TeacherTable.setRowSelectionInterval(i, i);
                            // Dá foco à linha selecionada
                            TeacherTable.scrollRectToVisible(TeacherTable.getCellRect(i, ProfessorNameColumn, true));
                            break; // Remove esta linha se quiser selecionar todas as ocorrências de "oi"
                        }
                    }
                }
            }
        });
    }

    public void RefreshTable() {
        StudentTable.deleteAllRows();
        TeacherTable.deleteAllRows();
        StudentClassTable.deleteAllRows();

        List<UserModel> userStudent = new ArrayList<>();
        if(Main.getUserSessionModel().getRoleModel().getRole_enum() == RoleEnum.PROFESSOR){
            userStudent = userService.getAllByProfessorId(Main.getUserSessionModel().getId());
        } else {
            userStudent = userService.getAllByRole(RoleEnum.ESTUDANTE.getValue());
        }
        for (int i = 0; i < userStudent.size(); i++) {
            StudentTable.addRow(new Object[]{userStudent.get(i).getId(), userStudent.get(i).getName(), userStudent.get(i).getEmail()});
        }

        
        List<UserModel> userProf = new ArrayList<>();
        if(Main.getUserSessionModel().getRoleModel().getRole_enum() == RoleEnum.PROFESSOR){
            userProf.add(userService.get(Main.getUserSessionModel().getId()));
        } else {
            userProf = userService.getAllByRole(RoleEnum.PROFESSOR.getValue());
        }
        for (int i = 0; i < userProf.size(); i++) {
            TeacherTable.addRow(new Object[]{userProf.get(i).getId(), userProf.get(i).getName(), userProf.get(i).getEmail()});
        }
        
        
        List<ClassModel> userAcademicUnitList = new ArrayList<>();
        if(Main.getUserSessionModel().getRoleModel().getRole_enum() == RoleEnum.PROFESSOR){
            userAcademicUnitList = classeService.getAllByProfessorId(Main.getUserSessionModel().getId());
        } else {
            userAcademicUnitList = classeService.getAll();
        }
        for (int i = 0; i < userAcademicUnitList.size(); i++) {
            StudentClassTable.addRow(new Object[]{userAcademicUnitList.get(i).getId(), userAcademicUnitList.get(i).getStudent().getName(), userAcademicUnitList.get(i).getAcademicUnit().getName(), userAcademicUnitList.get(i).getProfessor().getName(), userAcademicUnitList.get(i).getSemester().getName()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Teacher1 = new com.raven.swing.dashboard.DashboardBorder();
        TeacherScrPanel1 = new javax.swing.JScrollPane();
        TeacherTable1 = new com.raven.swing.dashboard.dashboardTables.StudentTable();
        Student = new com.raven.swing.dashboard.DashboardBorder();
        StudentScrPanel = new javax.swing.JScrollPane();
        StudentTable = new com.raven.swing.dashboard.dashboardTables.StudentTable();
        RegisterStudentClassScrPane = new javax.swing.JScrollPane();
        inStudentNameSpace = new javax.swing.JPanel();
        selectAcademicUnit = new com.raven.swing.ComboBoxInput();
        IdEstudanteLB = new javax.swing.JLabel();
        TituloLB = new javax.swing.JLabel();
        CadastrarBTN = new com.raven.swing.dashboard.DashboardButton();
        AtualizarBTN = new com.raven.swing.dashboard.DashboardButton();
        DeletarBTN = new com.raven.swing.dashboard.DashboardButton();
        IdEstudanteLB1 = new javax.swing.JLabel();
        IdEstudanteLB2 = new javax.swing.JLabel();
        selectSemester = new com.raven.swing.ComboBoxInput();
        inStudentName = new com.raven.swing.MyTextField();
        IdEstudanteLB3 = new javax.swing.JLabel();
        inProfessorName = new com.raven.swing.MyTextField();
        Teacher = new com.raven.swing.dashboard.DashboardBorder();
        TeacherScrPanel = new javax.swing.JScrollPane();
        TeacherTable = new com.raven.swing.dashboard.dashboardTables.StudentTable();
        StudentClass = new com.raven.swing.dashboard.DashboardBorder();
        StudentClassScrPanel = new javax.swing.JScrollPane();
        StudentClassTable = new com.raven.swing.dashboard.dashboardTables.StudentTable();

        Teacher1.setBackground(new java.awt.Color(255, 255, 255));
        Teacher1.setForeground(new java.awt.Color(255, 255, 255));

        TeacherScrPanel1.setBackground(new java.awt.Color(255, 255, 255));
        TeacherScrPanel1.setBorder(null);
        TeacherScrPanel1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        TeacherScrPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TeacherTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Professor", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TeacherScrPanel1.setViewportView(TeacherTable1);

        javax.swing.GroupLayout Teacher1Layout = new javax.swing.GroupLayout(Teacher1);
        Teacher1.setLayout(Teacher1Layout);
        Teacher1Layout.setHorizontalGroup(
            Teacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Teacher1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TeacherScrPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        Teacher1Layout.setVerticalGroup(
            Teacher1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Teacher1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TeacherScrPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        Student.setBackground(new java.awt.Color(255, 255, 255));
        Student.setForeground(new java.awt.Color(255, 255, 255));

        StudentScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        StudentScrPanel.setBorder(null);
        StudentScrPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Aluno", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentScrPanel.setViewportView(StudentTable);

        javax.swing.GroupLayout StudentLayout = new javax.swing.GroupLayout(Student);
        Student.setLayout(StudentLayout);
        StudentLayout.setHorizontalGroup(
            StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(StudentScrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        StudentLayout.setVerticalGroup(
            StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(StudentScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        RegisterStudentClassScrPane.setBackground(new java.awt.Color(255, 255, 255));
        RegisterStudentClassScrPane.setBorder(null);
        RegisterStudentClassScrPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        inStudentNameSpace.setBackground(new java.awt.Color(255, 255, 255));

        selectAcademicUnit.setModel(comboBoxHelperAcademicUnit.createComboBoxModel());
        selectAcademicUnit.setRenderer(new AcademicUnitModelRenderer(selectAcademicUnit.getRenderer()));

        IdEstudanteLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdEstudanteLB.setText("Nome do Aluno");

        TituloLB.setBackground(new java.awt.Color(127, 127, 127));
        TituloLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLB.setForeground(new java.awt.Color(172, 172, 172));
        TituloLB.setText("Cadastro de turmas");

        CadastrarBTN.setBackground(new java.awt.Color(30, 180, 114));
        CadastrarBTN.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarBTN.setText("Cadastrar");
        CadastrarBTN.setEnabled(!isProfessor);
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
        AtualizarBTN.setEnabled(!isProfessor);
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
        DeletarBTN.setEnabled(!isProfessor);
        DeletarBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeletarBTN.setSelected(true);
        DeletarBTN.setShadowColor(new java.awt.Color(253, 83, 83));
        DeletarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarBTNActionPerformed(evt);
            }
        });

        IdEstudanteLB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdEstudanteLB1.setText("Nome do Professor");

        IdEstudanteLB2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdEstudanteLB2.setText("Unidade Curricular");

        selectSemester.setModel(comboBoxHelperSemester.createComboBoxModel());
        selectSemester.setRenderer(new SemesterModelRenderer(selectSemester.getRenderer()));

        inStudentName.setForeground(new java.awt.Color(0, 0, 0));
        inStudentName.setEnabled(false);

        IdEstudanteLB3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IdEstudanteLB3.setText("Semestre");

        inProfessorName.setForeground(new java.awt.Color(0, 0, 0));
        inProfessorName.setEnabled(false);

        javax.swing.GroupLayout inStudentNameSpaceLayout = new javax.swing.GroupLayout(inStudentNameSpace);
        inStudentNameSpace.setLayout(inStudentNameSpaceLayout);
        inStudentNameSpaceLayout.setHorizontalGroup(
            inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloLB)
                    .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                        .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                                .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                                            .addComponent(IdEstudanteLB)
                                            .addGap(164, 164, 164))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inStudentNameSpaceLayout.createSequentialGroup()
                                            .addComponent(inStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)))
                                    .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                                        .addComponent(IdEstudanteLB3)
                                        .addGap(191, 191, 191)))
                                .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IdEstudanteLB1)
                                    .addComponent(inProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                                .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectAcademicUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IdEstudanteLB2))
                                .addGap(0, 37, Short.MAX_VALUE)))))
                .addGap(47, 47, 47))
        );
        inStudentNameSpaceLayout.setVerticalGroup(
            inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TituloLB)
                .addGap(20, 20, 20)
                .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                        .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdEstudanteLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdEstudanteLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectAcademicUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                        .addComponent(IdEstudanteLB2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(inStudentNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inStudentNameSpaceLayout.createSequentialGroup()
                        .addComponent(IdEstudanteLB3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        RegisterStudentClassScrPane.setViewportView(inStudentNameSpace);

        Teacher.setBackground(new java.awt.Color(255, 255, 255));
        Teacher.setForeground(new java.awt.Color(255, 255, 255));

        TeacherScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        TeacherScrPanel.setBorder(null);
        TeacherScrPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        TeacherScrPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TeacherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Professor", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TeacherScrPanel.setViewportView(TeacherTable);

        javax.swing.GroupLayout TeacherLayout = new javax.swing.GroupLayout(Teacher);
        Teacher.setLayout(TeacherLayout);
        TeacherLayout.setHorizontalGroup(
            TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeacherLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TeacherScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        TeacherLayout.setVerticalGroup(
            TeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeacherLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TeacherScrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        StudentClass.setBackground(new java.awt.Color(255, 255, 255));
        StudentClass.setForeground(new java.awt.Color(255, 255, 255));

        StudentClassScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        StudentClassScrPanel.setBorder(null);
        StudentClassScrPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        StudentClassTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID de Turma", "Aluno", "Unidade Curricular", "Professor", "Semestre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentClassScrPanel.setViewportView(StudentClassTable);

        javax.swing.GroupLayout StudentClassLayout = new javax.swing.GroupLayout(StudentClass);
        StudentClass.setLayout(StudentClassLayout);
        StudentClassLayout.setHorizontalGroup(
            StudentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentClassLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(StudentClassScrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        StudentClassLayout.setVerticalGroup(
            StudentClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentClassLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(StudentClassScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegisterStudentClassScrPane)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Teacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(StudentClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(RegisterStudentClassScrPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBTNActionPerformed
        UserModel student = new UserModel();
        student.setId((Integer) StudentTable.getValueAt(StudentTable.getSelectedRow(), 0));

        UserModel professor = new UserModel();
        professor.setId((Integer) TeacherTable.getValueAt(TeacherTable.getSelectedRow(), 0));

        ClassModel newClass = new ClassModel(
                (Integer) StudentClassTable.getValueAt(StudentClassTable.getSelectedRow(), 0),
                student,
                professor,
                (AcademicUnitModel) selectAcademicUnit.getSelectedItem(),
                (SemesterModel) selectSemester.getSelectedItem(),
                null);

        boolean response = classeService.update(newClass);
        JOptionPane.showMessageDialog(null, "Registro de classe atualizado com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_AtualizarBTNActionPerformed

    private void DeletarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBTNActionPerformed
        boolean response = classeService.delete((Integer) StudentClassTable.getValueAt(StudentClassTable.getSelectedRow(), 0));
        JOptionPane.showMessageDialog(null, "Registro de classe deletado com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_DeletarBTNActionPerformed

    private void CadastrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarBTNActionPerformed
        UserModel student = new UserModel();
        student.setId((Integer) StudentTable.getValueAt(StudentTable.getSelectedRow(), 0));

        UserModel professor = new UserModel();
        professor.setId((Integer) TeacherTable.getValueAt(TeacherTable.getSelectedRow(), 0));

        ClassModel newClass = new ClassModel(
                null,
                student,
                professor,
                (AcademicUnitModel) selectAcademicUnit.getSelectedItem(),
                (SemesterModel) selectSemester.getSelectedItem(),
                null);

        boolean response = classeService.create(newClass);
        JOptionPane.showMessageDialog(null, "Registro de classe cadastrado com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_CadastrarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardButton AtualizarBTN;
    private com.raven.swing.dashboard.DashboardButton CadastrarBTN;
    private com.raven.swing.dashboard.DashboardButton DeletarBTN;
    private javax.swing.JLabel IdEstudanteLB;
    private javax.swing.JLabel IdEstudanteLB1;
    private javax.swing.JLabel IdEstudanteLB2;
    private javax.swing.JLabel IdEstudanteLB3;
    private javax.swing.JScrollPane RegisterStudentClassScrPane;
    private com.raven.swing.dashboard.DashboardBorder Student;
    private com.raven.swing.dashboard.DashboardBorder StudentClass;
    private javax.swing.JScrollPane StudentClassScrPanel;
    private com.raven.swing.dashboard.dashboardTables.StudentTable StudentClassTable;
    private javax.swing.JScrollPane StudentScrPanel;
    private com.raven.swing.dashboard.dashboardTables.StudentTable StudentTable;
    private com.raven.swing.dashboard.DashboardBorder Teacher;
    private com.raven.swing.dashboard.DashboardBorder Teacher1;
    private javax.swing.JScrollPane TeacherScrPanel;
    private javax.swing.JScrollPane TeacherScrPanel1;
    private com.raven.swing.dashboard.dashboardTables.StudentTable TeacherTable;
    private com.raven.swing.dashboard.dashboardTables.StudentTable TeacherTable1;
    private javax.swing.JLabel TituloLB;
    private com.raven.swing.MyTextField inProfessorName;
    private com.raven.swing.MyTextField inStudentName;
    private javax.swing.JPanel inStudentNameSpace;
    private com.raven.swing.ComboBoxInput selectAcademicUnit;
    private com.raven.swing.ComboBoxInput selectSemester;
    // End of variables declaration//GEN-END:variables
}
