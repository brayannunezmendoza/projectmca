/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Rectangle;
import javax.swing.JFrame;

/**
 *
 * @author 12525153326
 */
public class View extends JFrame {

    //dimensões do frame
    private int x, y, w = 1200, h = 720;
    private Rectangle bounds = new Rectangle(w, h);
    private boolean visible = true;

    public View() {
        initFrame();
    }

    public void initFrame() {
        setBounds(bounds);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(visible);

    }

}
