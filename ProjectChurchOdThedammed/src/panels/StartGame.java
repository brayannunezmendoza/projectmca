/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author brayan - - -
 */
public class StartGame extends JPanel{

    JPanel panel = new JPanel();
    BufferedImage imgBackground;

    public void loaderImages(){
        try {
            imgBackground =  ImageIO.read(new File("src/res/teste.jpg"));
        } catch (Exception e) {
            System.out.println("erro de load");
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imgBackground, 0, 0,1200,720, null);
    }
    public void initPanel() {
        setLayout(null);
        setBackground(Color.red);
        setSize(1200, 720);
        loaderImages();
        setVisible(true);
        

    }

    public StartGame() {
        initPanel();
    }
}
