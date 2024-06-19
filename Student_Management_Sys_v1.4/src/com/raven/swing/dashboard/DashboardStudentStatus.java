package com.raven.swing.dashboard;

import com.raven.db.enums.RoleEnum;
import com.raven.model.Model_DashboardStatus;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class DashboardStudentStatus extends JLabel{
    
    
    public RoleEnum setStatus() {
        return type;
    }
        
        
    public DashboardStudentStatus(){
        setForeground(Color.WHITE);
    }
    
    private RoleEnum type;
    
    public void setStatus(RoleEnum type ){
        this.type = type;
        setText(type.toString());
        repaint();
    }
    
        @Override
    protected void paintComponent(Graphics grphcs) {
        if (type != null) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint g;
            if (type == RoleEnum.ADMIN) {
               g  = new GradientPaint(0, 0, new Color(55, 159, 60), 0, getHeight(), new Color(22, 84, 20));
            } else if (type == RoleEnum.ESTUDANTE) {
                g = new GradientPaint(0, 0, new Color(14, 70, 167), 0, getHeight(), new Color(81, 31, 244));
            } else if (type == RoleEnum.PROFESSOR) {
                g = new GradientPaint(0, 0, new Color(255, 165, 0), 0, getHeight(), new Color(205, 114, 50));
            } else {
                g = new GradientPaint(0, 0, new Color(14, 70, 167), 0, getHeight(), new Color(81, 31, 244));
            }
            g2.setPaint(g);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
        }
        super.paintComponent(grphcs);
    }
    
    
}