package com.raven.component.dashboard;

import com.raven.db.enums.RoleEnum;
import com.raven.db.models.UserSessionModel;
import com.raven.model.Model_DashboardMenu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import com.raven.event.DashboardMenuEvent;
import com.raven.main.Main;
import javax.swing.JOptionPane;

public class DashboardMenu extends javax.swing.JPanel {

    private DashboardMenuEvent event;
    private UserSessionModel userSessionModel;
    private RoleEnum userSessionRole;

    public void addEventMenuSelected(DashboardMenuEvent event) {
        this.event = event;
        dashboardListItem1.addEventMenuSelected(event);
    }

    public DashboardMenu() {
        userSessionModel = Main.getUserSessionModel();
        userSessionRole = userSessionModel.getRoleModel().getRole_enum();
        initComponents();
        setOpaque(false);
        dashboardListItem1.setOpaque(false);
        init();
    }

    private void init() {
        if(userSessionRole == RoleEnum.ADMIN){
            dashboardListItem1.addItem(new Model_DashboardMenu(0, "1", "Dashboard", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(1, "2", "Usuários", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(2, "3", "Unidade Acadêmica", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(3, "4", "Matérias", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(4, "5", "Turmas", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(5, "6", "Notas", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(6, "7", "Sair", Model_DashboardMenu.MenuType.MENU));
        } else if(userSessionRole == RoleEnum.PROFESSOR){
            dashboardListItem1.addItem(new Model_DashboardMenu(0, "1", "Dashboard", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(4, "5", "Turmas", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(5, "6", "Notas", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(6, "7", "Sair", Model_DashboardMenu.MenuType.MENU));
        } else if(userSessionRole == RoleEnum.ESTUDANTE){
            dashboardListItem1.addItem(new Model_DashboardMenu(0, "1", "Dashboard", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(5, "6", "Notas", Model_DashboardMenu.MenuType.MENU));
            dashboardListItem1.addItem(new Model_DashboardMenu(6, "7", "Sair", Model_DashboardMenu.MenuType.MENU));
        }
        
        
    }

    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, new Color(49, 62, 71), 0, getHeight(), new Color(0, 0, 0));;
        g2.setPaint(gra);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMovingSys = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashboardListItem1 = new com.raven.swing.dashboard.DashboardListItem<>();

        setPreferredSize(new java.awt.Dimension(215, 454));

        PanelMovingSys.setOpaque(false);
        PanelMovingSys.setPreferredSize(new java.awt.Dimension(215, 86));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logo.png"))); // NOI18N
        jLabel1.setText("Application");

        javax.swing.GroupLayout PanelMovingSysLayout = new javax.swing.GroupLayout(PanelMovingSys);
        PanelMovingSys.setLayout(PanelMovingSysLayout);
        PanelMovingSysLayout.setHorizontalGroup(
            PanelMovingSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovingSysLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMovingSysLayout.setVerticalGroup(
            PanelMovingSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMovingSysLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMovingSys, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dashboardListItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMovingSys, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(dashboardListItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private int x;
    private int y;

    public void initMoving(JFrame fram) {

        PanelMovingSys.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        PanelMovingSys.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMovingSys;
    private com.raven.swing.dashboard.DashboardListItem<String> dashboardListItem1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
