package panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author braya
 */
public class Acess extends JPanel {

    private BufferedImage fundo;
    private JTextField txt_email = new JTextField("nick");
    private JTextField txt_password = new JTextField("password");

    public void elemnts() {
        txt_email.setBounds((getWidth()/2)-125, 300, 250, 25);
        txt_password.setBounds(getWidth()/2-125, 350, 250, 25);
        
        add(txt_password);
        add(txt_email);
        
    }

    public void loadImage() {
        try {
            fundo = ImageIO.read(new File("src/res/teste.jpg"));
        } catch (Exception ex) {
            System.out.println("imagem n carregada");
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.blue);
        g.fillRect(0, 0, 1200, 720);
        g.drawImage(fundo, 0, 0, 1200, 720, null);

    }

    public void init() {
        loadImage();
        setSize(1200, 1200);
        setLayout(null);

        elemnts();

        setVisible(true);
    }

    public Acess() {
        init();
    }

}
