package com.raven.swing.dashboard;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class DashboardScrollBar extends JScrollBar {
    
    public DashboardScrollBar () {
        setUI(new DashboardModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(242, 242, 242));
        setUnitIncrement(20);
    }
}