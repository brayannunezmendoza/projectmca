/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Rectangle;
import javax.swing.JFrame;
import panels.StartGame;

/**
 *
 * @author brayan - - - 
 */
public class View extends JFrame {

    //dimensões do frame
    private int x, y, w = 1210, h = 750;
    private Rectangle bounds = new Rectangle(w, h);
    private boolean visible = true;

    public View() {
        initFrame();
    }

    public void initFrame() {
        setBounds(bounds);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        ///teste, será adicionado direto no cardlayout mais tarde
        ////PanelCard panelCard = new PanelCard();/*{add(StartGame,"panelGame"))
        ///cardlatout.show("panelGame") --metodo}*/
        panels.StartGame p = new StartGame() ;
        add(p);
        ////
        setVisible(visible);

    }

}
