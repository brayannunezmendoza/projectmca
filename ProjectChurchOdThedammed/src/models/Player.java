package models;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

/**
 *
 * @author - - - - -
 */
public class Player extends JLabel {

    private int x, y;
    BufferedImage img;

    public Player(int x, int y, String url) {
        this.x = x;
        this.y = y;
        try {
            img = ImageIO.read(new File(url));
        } catch (Exception e) {
            System.out.println("Imagem não carregada do player");
        }
    }

}
