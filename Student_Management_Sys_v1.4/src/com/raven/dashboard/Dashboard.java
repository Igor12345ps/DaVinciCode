package com.raven.dashboard;

import com.raven.event.DashboardMenuEvent;
import java.awt.Color;

import com.raven.forms.DashboardHome;
import com.raven.forms.RegisterAcademicUnit;
import com.raven.forms.RegisterClass;
import com.raven.forms.RegisterUserSys;
import com.raven.forms.RegisterSubjects;
import com.raven.forms.RegisterGrades;
import com.raven.main.Main;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {

    private DashboardHome DashboardHome;

    private RegisterUserSys RegisterUserSys;
    private RegisterAcademicUnit RegisterAcademicUnit;
    private RegisterGrades RegisterAcademicUnit1;
    private RegisterSubjects RegisterSubjects;
    private RegisterClass RegisterStudentClass;
    private RegisterGrades RegisterGrades;

    public Dashboard() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        

//        DashboardHome = new DashboardHome();
//        RegisterUserSys = new RegisterUserSys();
//        RegisterAcademicUnit = new RegisterAcademicUnit();
//        RegisterSubjects = new RegisterSubjects();
//        RegisterStudentClass = new RegisterClass();
//        RegisterGrades = new RegisterGrades();
        
        dashboardMenu.initMoving(Dashboard.this);
        dashboardMenu.addEventMenuSelected(new DashboardMenuEvent() {

            @Override
            public void selected(int index) {
                switch (index) {
                    case 0:
                        setForm(new DashboardHome());
                        break;
                    case 1:
                        setForm(new RegisterUserSys());
                        break;
                    case 2:
                        setForm(new RegisterAcademicUnit());
                        break;
                    case 3:
                        setForm(new RegisterSubjects());
                        break;
                    case 4:
                        setForm(new RegisterClass());
                        break;
                    case 5:
                        setForm(new RegisterGrades());
                        break;
                    case 6:
                        // Mensagem a ser exibida
                        String message = "Deseja fechar o sistema?";
                        // Título da caixa de diálogo
                        String title = "Confirmação";

                        // Opções personalizadas
                        Object[] options = {"Sim", "deslogar", "Cancelar"};

                        // Exibe a caixa de diálogo com as opções personalizadas
                        int option = JOptionPane.showOptionDialog(
                                null, // Componente pai
                                message, // Mensagem
                                title, // Título
                                JOptionPane.YES_NO_CANCEL_OPTION, // Tipo de opção
                                JOptionPane.QUESTION_MESSAGE, // Tipo de mensagem
                                null, // Ícone
                                options, // Opções personalizadas
                                options[2] // Opção padrão
                        );

                        // Tratar a seleção do usuário
                        switch (option) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                Main main = new Main();
                                dispose();
                                main.setVisible(true);
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
            }
        });
        setForm(new DashboardHome());
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardBorder2 = new com.raven.swing.dashboard.DashboardBorder();
        dashboardMenu = new com.raven.component.dashboard.DashboardMenu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        dashboardBorder2.setPreferredSize(new java.awt.Dimension(1350, 800));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout dashboardBorder2Layout = new javax.swing.GroupLayout(dashboardBorder2);
        dashboardBorder2.setLayout(dashboardBorder2Layout);
        dashboardBorder2Layout.setHorizontalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addComponent(dashboardMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashboardBorder2Layout.setVerticalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardBorder2Layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardBorder dashboardBorder2;
    private com.raven.component.dashboard.DashboardMenu dashboardMenu;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
