/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frames;

import javax.swing.JFrame;

/**
 *
 * @author braya
 */
public class Frame extends JFrame{
    private int frame_w = 1200, frame_h = 760;

    public Frame() {
        setSize(frame_w, frame_h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new PanelLayouts());
        setVisible(true);
    }
   
    

}
