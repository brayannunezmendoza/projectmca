/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.CardLayout;
import javax.swing.JPanel;
import frame.Access;
import frame.SelectLevel;

/**
 *
 * @author brayan
 */
public class CntllrsPanel {

    private CardLayout cardlayout = new CardLayout();
    private JPanel panelControll = new JPanel(cardlayout);
    SelectLevel selectlevel = new SelectLevel();
    Access access = new Access();

    public JPanel getPanel() {
        return panelControll;
    }

    public void addPanel(JPanel panel, String name) {
        panelControll.add(name, panel);

    }

    public void showPanel(String name) {
        cardlayout.show(panelControll, name);
    }

    public CntllrsPanel() {
        loadingPanels();

    }

    public void loadingPanels() {
        System.out.println("loading..............");
        addPanel(access.getPanel(), "access");
        addPanel(selectlevel.getPanel(), "selectLevel");

    }

}
