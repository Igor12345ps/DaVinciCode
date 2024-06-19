package com.raven.swing.dashboard;

import com.raven.event.DashboardMenuEvent;
import com.raven.model.Model_DashboardMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

public class DashboardListItem<E extends Object> extends JList<E> {

    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;

    private DashboardMenuEvent event;

    public void addEventMenuSelected(DashboardMenuEvent event) {
        this.event = event;
    }

    public DashboardListItem() {
        model = new DefaultListModel();
        setModel(model);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_DashboardMenu) {
                        Model_DashboardMenu menu = (Model_DashboardMenu) o;
                        if (menu.getType() == Model_DashboardMenu.MenuType.MENU) {
                            selectedIndex = index;
                            if (event != null) {
                                event.selected(((Model_DashboardMenu) o).getId());
                            }
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                overIndex = -1;
                repaint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                int index = locationToIndex(me.getPoint());
                if (index != overIndex) {
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_DashboardMenu) {
                        Model_DashboardMenu menu = (Model_DashboardMenu) o;
                        if (menu.getType() == Model_DashboardMenu.MenuType.MENU) {
                            overIndex = index;
                        } else {
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
            }

        });
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_DashboardMenu data;
                if (o instanceof Model_DashboardMenu) {
                    data = (Model_DashboardMenu) o;
                } else {
                    data = new Model_DashboardMenu(1, "", o + "", Model_DashboardMenu.MenuType.EMPTY);
                }
                DashboardItem item = new DashboardItem(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);

                return item;
            }

        };
    }

    public void addItem(Model_DashboardMenu data) {
        model.addElement(data);
    }
}
