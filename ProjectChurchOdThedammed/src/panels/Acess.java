package panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author braya
 */
public class Acess extends JPanel {

    private BufferedImage fundo;
    private BufferedImage textfundo;
    private JTextField txt_email = new JTextField("nick");
    private JTextField txt_password = new JTextField("password");
    private ImageIcon imgft, IMGFT;

    private JLabel lbl_Contaneer = new JLabel("Login");
    private JLabel lbl_Name = new JLabel("Nome: ");

    private JLabel lbl_Password = new JLabel("Password: ");

    //componentes label, txt, buttons
    public void elemnts() {
        lbl_Contaneer.setBounds(getWidth() / 2 - 350, 150, 700, 500);
        lbl_Contaneer.setBackground(Color.red);
        lbl_Contaneer.setOpaque(true);
        lbl_Contaneer.setVisible(true);

        lbl_Name.setBounds(10, 10, lbl_Contaneer.getWidth() - 20, 75);
        lbl_Name.setBackground(Color.blue);
        lbl_Name.setOpaque(true);
        lbl_Name.setVisible(true);

        lbl_Password.setBounds(10, 95, lbl_Contaneer.getWidth() - 20, 75);
        lbl_Password.setBackground(Color.black);
        lbl_Password.setOpaque(true);
        lbl_Password.setVisible(true);

        txt_email.setBounds(0, 0, lbl_Name.getWidth(), lbl_Name.getHeight());
        txt_email.setOpaque(false);
        txt_email.setVisible(true);

        txt_password.setBounds(0, 0, lbl_Password.getWidth(), lbl_Password.getHeight());
        txt_password.setOpaque(false);
        txt_password.setVisible(true);

        lbl_Name.add(txt_email);
        lbl_Password.add(txt_password);

        lbl_Contaneer.add(lbl_Name);
        lbl_Contaneer.add(lbl_Password);

        // lbl_Contaneer.add(txt_password);
        //lbl_Contaneer.add(txt_email);
        add(lbl_Contaneer);

    }

    public void loadImages() {
        //add imagem TESTE ao fundo do panel
        try {
            fundo = ImageIO.read(new File("src/res/teste.jpg"));
        } catch (Exception ex) {
            System.out.println("imagem n carregada");
        }
        try {
            textfundo = ImageIO.read(new File("fundotext.png"));
        } catch (Exception e) {
            System.out.println("imagem fundo text n carregada");
        }
        //redimencionalização da imagem 
        imgft = new ImageIcon("src/res/fundotext.png");
        Image tratedImgft = imgft.getImage().getScaledInstance(680  , 250, Image.SCALE_REPLICATE);
        IMGFT = new ImageIcon(tratedImgft);

        //add imagem ao label de login/nome
        lbl_Name.setIcon(IMGFT);

    }

    //desenha a imagem fundo no panel
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fundo, 0, 0, 1200, 720, null);

    }

    //inicialização
    public void init() {
        
        loadImages();
        setSize(1200, 1200);
        setLayout(null);
        elemnts();
        setVisible(true);
    }

    public Acess() {
        init();
    }

}
