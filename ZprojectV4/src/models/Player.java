/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

/**
 *
 * @author braya
 */
public class Player extends JLabel {

    private BufferedImage img;
    private int x, y, h = 100, w = 100;

    public Player(int x, int y, String url) {
        this.x = x;
        this.y = y;
        try {
            img = ImageIO.read(new File(url));
            System.out.println("IMAGEM PLAYER CARREGADA");
        } catch (Exception e) {
            System.out.println("imagem não foi carregada");
        }

    }

    public void drawPlayer(Graphics g) {
        if (img != null) {
            g.drawImage(img, x, y, w, h, null);
        }
    }

    public void move(int dx, int dy) {
        x = dx;
        y = dy;
    }

}
