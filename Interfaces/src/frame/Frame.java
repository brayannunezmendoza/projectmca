/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
////
import frame.Access;
import frame.SelectLevel;

/////

/**
 *
 * @author brayan
 */
public class Frame extends JFrame {

    private CardLayout cardlayout = new CardLayout();
    private JPanel panel = new JPanel(cardlayout);
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    /////////////
    
    Access access = new Access();
    SelectLevel selectlevel = new SelectLevel();

    ////////////////
    public Frame() {
        constructFrame();
    }

    public void constructFrame() {
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        construcPanels();
        ///
        //showPanel("access");
        showPanel("selectLevel");
        ///
        add(panel);
        setVisible(true);
    }

    //////////////////////
    public void construcPanels() {
        addPanel(access.getPanel(), "access");
        addPanel(selectlevel.getPanel(), "selectLevel");

    }

    public void addPanel(JPanel subPanel, String name) {
        panel.add(name, subPanel);
    }

    public void showPanel(String name) {
        cardlayout.show(panel, name);
    }


////////////////
}
