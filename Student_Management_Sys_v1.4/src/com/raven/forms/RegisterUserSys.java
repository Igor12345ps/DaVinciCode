package com.raven.forms;

import com.raven.db.enums.GenderEnum;
import com.raven.db.enums.MaritalStatusEnum;
import com.raven.db.enums.RoleEnum;
import com.raven.db.helper.ComboBoxHelperGender;
import com.raven.db.helper.ComboBoxHelperMaritalStatus;
import com.raven.db.helper.ComboBoxHelperRole;
import com.raven.db.models.RoleModel;
import com.raven.db.models.UserModel;
import com.raven.db.service.UserService;
import com.raven.swing.dashboard.DashboardScrollBar;
import com.raven.util.ConvertStringToDate;
import com.raven.util.CryptoPassword;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RegisterUserSys extends javax.swing.JPanel {

    UserService userService = new UserService();
    ComboBoxHelperGender comboBoxHelperGender = new ComboBoxHelperGender();
    ComboBoxHelperMaritalStatus comboBoxHelperMaritalStatus = new ComboBoxHelperMaritalStatus();
    ComboBoxHelperRole comboBoxHelperRole = new ComboBoxHelperRole();

    public RegisterUserSys() {
        initComponents();

        UserScrPanel.setVerticalScrollBar(new DashboardScrollBar());
        UserScrPanel.getVerticalScrollBar().setBackground(Color.WHITE);
        UserScrPanel.setHorizontalScrollBar(new DashboardScrollBar());
        UserScrPanel.getHorizontalScrollBar().setBackground(Color.WHITE);
        UserScrPanel.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        UserScrPanel.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        RegisterUserScrPane.setVerticalScrollBar(new DashboardScrollBar());

        RegisterUserScrPane.getVerticalScrollBar().setBackground(Color.WHITE);
        RegisterUserScrPane.setHorizontalScrollBar(new DashboardScrollBar());
        RegisterUserScrPane.getHorizontalScrollBar().setBackground(Color.WHITE);
        RegisterUserScrPane.getViewport().setBackground(Color.WHITE);
        JPanel p1 = new JPanel();
        p.setBackground(Color.WHITE);
        RegisterUserScrPane.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        RefreshTable();

        UserTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificando se a seleção é válida e se foi feita apenas uma seleção
                if (!e.getValueIsAdjusting() && UserTable.getSelectedRow() != -1) {
                    // Obtendo os dados da linha selecionada
                    int selectedRow = UserTable.getSelectedRow();

                    Integer userId = (Integer) UserTable.getValueAt(selectedRow, 0);
                    String userName = (String) UserTable.getValueAt(selectedRow, 1);
                    Date userBirthDate = (Date) UserTable.getValueAt(selectedRow, 2);
                    String userCPF = (String) UserTable.getValueAt(selectedRow, 3);
                    GenderEnum userGender = (GenderEnum) UserTable.getValueAt(selectedRow, 4);
                    MaritalStatusEnum userMaritalStatus = (MaritalStatusEnum) UserTable.getValueAt(selectedRow, 5);
                    String userFatherName = (String) UserTable.getValueAt(selectedRow, 6);
                    String userMotherName = (String) UserTable.getValueAt(selectedRow, 7);
                    String userEmail = (String) UserTable.getValueAt(selectedRow, 8);
                    String userTel = (String) UserTable.getValueAt(selectedRow, 9);

                    RoleEnum roleEnum = RoleEnum.enumfromString(UserTable.getValueAt(selectedRow, 10).toString());
                    RoleModel userType = new RoleModel(roleEnum, roleEnum.getValue(), "");
                    UserModel selectedUser = new UserModel(
                            userId,
                            userName,
                            userCPF,
                            userEmail,
                            null,
                            userTel,
                            userBirthDate,
                            userGender,
                            userMaritalStatus,
                            userMotherName,
                            userFatherName,
                            userType
                    );

                    inName.setText(selectedUser.getName());
                    inBirthDate.setText(selectedUser.getBirth_date().toString());
                    inCPF.setText(selectedUser.getCpf());
                    GenderEnum gender = GenderEnum.enumfromString(UserTable.getValueAt(selectedRow, 4).toString());
                    inGender.setSelectedItem(gender);

                    MaritalStatusEnum maritalStatus = MaritalStatusEnum.enumfromString(UserTable.getValueAt(selectedRow, 5).toString());
                    inMaritalStatus.setSelectedItem(maritalStatus);

                    inMotherName.setText(selectedUser.getFather_name());
                    inFatherName.setText(selectedUser.getMother_name());
                    inEmail.setText(selectedUser.getEmail());
                    inTel.setText(selectedUser.getTel());

                    RoleEnum role = RoleEnum.enumfromString(UserTable.getValueAt(selectedRow, 10).toString());
                    inRole.setSelectedItem(role);

                    String[] birthDate = UserTable.getValueAt(selectedRow, 2).toString().split("-");
                    inBirthDate.setText(birthDate[2] + birthDate[1] + birthDate[0]);
                }
            }
        });

    }

    public void RefreshTable() {
        // AQUI VAI O SELECT DO BD PARA A TABELA DE ALUNOS, ENTAO DEVE SER VISTO COMO VAI TROCAR OS DADOS (SEGUE O MOLDE)        
        List<UserModel> users = new ArrayList<>();
        users = userService.getAll();
        UserTable.deleteAllRows();

        for (int i = 0; i < users.size(); i++) {
            UserTable.addRow(new Object[]{users.get(i).getId(), users.get(i).getName(),
                users.get(i).getBirth_date(), users.get(i).getCpf(), users.get(i).getGender(),
                users.get(i).getMarital_status(), users.get(i).getFather_name(),
                users.get(i).getMother_name(), users.get(i).getEmail(),
                users.get(i).getTel(), users.get(i).getRole().getRole_enum().name()});

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        User = new com.raven.swing.dashboard.DashboardBorder();
        UserScrPanel = new javax.swing.JScrollPane();
        UserTable = new com.raven.swing.dashboard.dashboardTables.StudentTable();
        RegisterUserScrPane = new javax.swing.JScrollPane();
        RegisterUserPanel = new javax.swing.JPanel();
        TelefoneLB = new javax.swing.JLabel();
        EmailLB = new javax.swing.JLabel();
        NomeLB = new javax.swing.JLabel();
        SexoLB = new javax.swing.JLabel();
        EstadoCivilLB = new javax.swing.JLabel();
        inMaritalStatus = new com.raven.swing.ComboBoxInput();
        inGender = new com.raven.swing.ComboBoxInput();
        NascimentoLB = new javax.swing.JLabel();
        PaiLB = new javax.swing.JLabel();
        inFatherName = new com.raven.swing.MyTextField();
        inTel = new com.raven.swing.MyFormatedField();
        inBirthDate = new com.raven.swing.MyFormatedField();
        inEmail = new com.raven.swing.MyTextField();
        inName = new com.raven.swing.MyTextField();
        MaeLB = new javax.swing.JLabel();
        inMotherName = new com.raven.swing.MyTextField();
        TituloLB = new javax.swing.JLabel();
        CadastrarBTN = new com.raven.swing.dashboard.DashboardButton();
        AtualizarBTN = new com.raven.swing.dashboard.DashboardButton();
        DeletarBTN = new com.raven.swing.dashboard.DashboardButton();
        TelefoneLB1 = new javax.swing.JLabel();
        inCPF = new com.raven.swing.MyFormatedField();
        NomeLB1 = new javax.swing.JLabel();
        inPassword = new com.raven.swing.MyTextField();
        RoleLB = new javax.swing.JLabel();
        inRole = new com.raven.swing.ComboBoxInput();

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setForeground(new java.awt.Color(255, 255, 255));

        UserScrPanel.setBackground(new java.awt.Color(255, 255, 255));
        UserScrPanel.setBorder(null);
        UserScrPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Nascimento", "CPF", "Sexo", "Estado Civil", "Nome pai", "Nome mãe", "Email", "Telefone", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UserScrPanel.setViewportView(UserTable);

        javax.swing.GroupLayout UserLayout = new javax.swing.GroupLayout(User);
        User.setLayout(UserLayout);
        UserLayout.setHorizontalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(UserScrPanel)
                .addGap(20, 20, 20))
        );
        UserLayout.setVerticalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(UserScrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        RegisterUserScrPane.setBackground(new java.awt.Color(255, 255, 255));
        RegisterUserScrPane.setBorder(null);
        RegisterUserScrPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        RegisterUserPanel.setBackground(new java.awt.Color(255, 255, 255));

        TelefoneLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TelefoneLB.setText("Telefone");

        EmailLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmailLB.setText("Email");

        NomeLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeLB.setText("Nome Completo");

        SexoLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SexoLB.setText("Sexo");

        EstadoCivilLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EstadoCivilLB.setText("Estado Civil");

        inMaritalStatus.setModel(comboBoxHelperMaritalStatus.createComboBoxModel());
        inMaritalStatus.setToolTipText("");

        inGender.setModel(comboBoxHelperGender.createComboBoxModel());

        NascimentoLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NascimentoLB.setText("Data de Nascimento");

        PaiLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PaiLB.setText("Nome do pai");

        inFatherName.setForeground(new java.awt.Color(0, 0, 0));

        inTel.setForeground(new java.awt.Color(0, 0, 0));
        inTel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        inTel.setToolTipText("");
        try {
            inTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        inBirthDate.setForeground(new java.awt.Color(0, 0, 0));
        inBirthDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inBirthDate.setToolTipText("");
        try {
            inBirthDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        inEmail.setForeground(new java.awt.Color(0, 0, 0));

        inName.setForeground(new java.awt.Color(0, 0, 0));

        MaeLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MaeLB.setText("Nome da mãe");

        inMotherName.setForeground(new java.awt.Color(0, 0, 0));

        TituloLB.setBackground(new java.awt.Color(127, 127, 127));
        TituloLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLB.setForeground(new java.awt.Color(172, 172, 172));
        TituloLB.setText("Cadastro de usuarios - Dados Pessoais");

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

        TelefoneLB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TelefoneLB1.setText("CPF");

        inCPF.setForeground(new java.awt.Color(0, 0, 0));
        inCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inCPF.setToolTipText("");
        try {
            inCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        NomeLB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NomeLB1.setText("Senha");

        inPassword.setForeground(new java.awt.Color(0, 0, 0));

        RoleLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RoleLB.setText("Tipo de usuário");

        inRole.setModel(comboBoxHelperRole.createComboBoxModel());

        javax.swing.GroupLayout RegisterUserPanelLayout = new javax.swing.GroupLayout(RegisterUserPanel);
        RegisterUserPanel.setLayout(RegisterUserPanelLayout);
        RegisterUserPanelLayout.setHorizontalGroup(
            RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloLB)
                    .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                        .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NomeLB)
                                    .addComponent(inName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NascimentoLB)))
                            .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PaiLB)
                                        .addComponent(inFatherName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SexoLB)
                                        .addComponent(inGender, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                    .addComponent(NomeLB1)
                                    .addComponent(inPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RoleLB)
                                    .addComponent(inRole, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailLB)
                                    .addComponent(EstadoCivilLB)
                                    .addComponent(inMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                                .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TelefoneLB1)
                                    .addComponent(inCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MaeLB)
                                    .addComponent(inMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelefoneLB)
                                    .addComponent(inTel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(77, 77, 77))
        );
        RegisterUserPanelLayout.setVerticalGroup(
            RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TituloLB)
                .addGap(22, 22, 22)
                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                        .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NascimentoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                        .addComponent(TelefoneLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(inCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                        .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                                .addComponent(EstadoCivilLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(inMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                                .addComponent(SexoLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(inGender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))
                    .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                        .addComponent(MaeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(inMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                        .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefoneLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inTel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                        .addComponent(PaiLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(inFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                        .addComponent(NomeLB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegisterUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AtualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DeletarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegisterUserPanelLayout.createSequentialGroup()
                        .addComponent(RoleLB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(inRole, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        RegisterUserScrPane.setViewportView(RegisterUserPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(User, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterUserScrPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterUserScrPane, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AtualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarBTNActionPerformed
        try {
            String[] splitedBirthDate = inBirthDate.getText().trim().replace(" ", "").split("/");
            Date newBirthDate = ConvertStringToDate.convertToDate(splitedBirthDate);

            UserModel newUser = null;
            
            if (inPassword.getText().isEmpty()) {
                UserModel userModel = new UserModel();
                userModel = userService.get((Integer) UserTable.getValueAt(UserTable.getSelectedRow(), 0));
                newUser = new UserModel(
                        (Integer) UserTable.getValueAt(UserTable.getSelectedRow(), 0),
                        inName.getText(),
                        inCPF.getText(),
                        inEmail.getText(),
                        userModel.getPassword(),
                        inTel.getText(),
                        newBirthDate,
                        (GenderEnum) inGender.getSelectedItem(),
                        (MaritalStatusEnum) inMaritalStatus.getSelectedItem(),
                        inFatherName.getText(),
                        inMotherName.getText(),
                        new RoleModel((RoleEnum) inRole.getSelectedItem(), null, null)
                );
            } else {
                String newPassword = CryptoPassword.getInstance().encrypt(inPassword.getText());
                newUser = new UserModel(
                        (Integer) UserTable.getValueAt(UserTable.getSelectedRow(), 0),
                        inName.getText(),
                        inCPF.getText(),
                        inEmail.getText(),
                        newPassword,
                        inTel.getText(),
                        newBirthDate,
                        (GenderEnum) inGender.getSelectedItem(),
                        (MaritalStatusEnum) inMaritalStatus.getSelectedItem(),
                        inFatherName.getText(),
                        inMotherName.getText(),
                        new RoleModel((RoleEnum) inRole.getSelectedItem(), null, null)
                );
            }

            boolean response = userService.updateUserAndRole(newUser, RoleEnum.enumfromString(UserTable.getValueAt(UserTable.getSelectedRow(), 10).toString()));
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
            if (response == true) {
                RefreshTable();
            }
        } catch (Exception ex) {
            Logger.getLogger(RegisterUserSys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AtualizarBTNActionPerformed

    private void DeletarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBTNActionPerformed
        boolean response = userService.delete((Integer) UserTable.getValueAt(UserTable.getSelectedRow(), 0));
        JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
        if (response == true) {
            RefreshTable();
        }
    }//GEN-LAST:event_DeletarBTNActionPerformed

    private void CadastrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarBTNActionPerformed

        try {
            String[] splitedBirthDate = inBirthDate.getText().trim().replace(" ", "").split("/");
            Date newBirthDate = ConvertStringToDate.convertToDate(splitedBirthDate);

            String newPassword = CryptoPassword.getInstance().encrypt(inPassword.getText());

            UserModel newUser = new UserModel(
                    null,
                    inName.getText(),
                    inCPF.getText(),
                    inEmail.getText(),
                    newPassword,
                    inTel.getText(),
                    newBirthDate,
                    (GenderEnum) inGender.getSelectedItem(),
                    (MaritalStatusEnum) inMaritalStatus.getSelectedItem(),
                    inFatherName.getText(),
                    inMotherName.getText(),
                    new RoleModel((RoleEnum) inRole.getSelectedItem(), null, null)
            );
            boolean response = userService.create(newUser);
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            if (response == true) {
                RefreshTable();
            }
        } catch (Exception ex) {
            Logger.getLogger(RegisterUserSys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CadastrarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardButton AtualizarBTN;
    private com.raven.swing.dashboard.DashboardButton CadastrarBTN;
    private com.raven.swing.dashboard.DashboardButton DeletarBTN;
    private javax.swing.JLabel EmailLB;
    private javax.swing.JLabel EstadoCivilLB;
    private javax.swing.JLabel MaeLB;
    private javax.swing.JLabel NascimentoLB;
    private javax.swing.JLabel NomeLB;
    private javax.swing.JLabel NomeLB1;
    private javax.swing.JLabel PaiLB;
    private javax.swing.JPanel RegisterUserPanel;
    private javax.swing.JScrollPane RegisterUserScrPane;
    private javax.swing.JLabel RoleLB;
    private javax.swing.JLabel SexoLB;
    private javax.swing.JLabel TelefoneLB;
    private javax.swing.JLabel TelefoneLB1;
    private javax.swing.JLabel TituloLB;
    private com.raven.swing.dashboard.DashboardBorder User;
    private javax.swing.JScrollPane UserScrPanel;
    private com.raven.swing.dashboard.dashboardTables.StudentTable UserTable;
    private com.raven.swing.MyFormatedField inBirthDate;
    private com.raven.swing.MyFormatedField inCPF;
    private com.raven.swing.MyTextField inEmail;
    private com.raven.swing.MyTextField inFatherName;
    com.raven.swing.ComboBoxInput inGender;
    private com.raven.swing.ComboBoxInput inMaritalStatus;
    private com.raven.swing.MyTextField inMotherName;
    private com.raven.swing.MyTextField inName;
    private com.raven.swing.MyTextField inPassword;
    private com.raven.swing.ComboBoxInput inRole;
    private com.raven.swing.MyFormatedField inTel;
    // End of variables declaration//GEN-END:variables
}
