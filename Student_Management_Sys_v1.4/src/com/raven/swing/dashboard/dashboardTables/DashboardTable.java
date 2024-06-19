package com.raven.swing.dashboard.dashboardTables;

import com.raven.db.enums.RoleEnum;
import com.raven.model.Model_DashboardStatus;
import com.raven.swing.dashboard.DashboardCellStudentStatus;
import com.raven.swing.dashboard.DashboardTableHeader;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class DashboardTable extends JTable {
    
    public DashboardTable(){
        
        setShowHorizontalLines(true);
        setRowHeight(40);
        setGridColor(new Color(230, 230, 230));
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer( new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                DashboardTableHeader header = new DashboardTableHeader(value + "");
                if (column == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;

            }
        });

        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
           public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                if (i1 != 3) {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.WHITE);
                    setBorder(noFocusBorder);
                    if (selected) {
                        com.setForeground(new Color(15, 89, 140));
                    } else {
                        com.setForeground(new Color(102, 102, 102));
                    }
                   return com;
                }
                else {
                    RoleEnum type = (RoleEnum) o;
                    DashboardCellStudentStatus cell = new DashboardCellStudentStatus(type);
                    return cell;
                }

            };      
        });
    }
    
    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(row);
    }
    
    public void deleteAllRows() {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.setRowCount(0);
    }
        
}