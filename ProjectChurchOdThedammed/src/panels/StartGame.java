/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import models.Player;

/**
 *
 * @author brayan - - -
 */
public class StartGame extends JPanel implements KeyListener{

    private Player player = new Player(0, 0, "src/res/Arlot.png");
    private int px=0,py=0;
    private int dpx,dpy;
    private int speed=8;
    private int tick =14;
    BufferedImage imgBackground;

    public void loaderImages(){
        try {
            imgBackground =  ImageIO.read(new File("src/res/scre1.png"));
        } catch (Exception e) {
            System.out.println("erro de load");
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imgBackground, 0, 0,1200,720, null);
        player.desenhar(g);
    }
    public void initPanel() {
        setFocusable(isVisible());
        requestFocusInWindow();
        addKeyListener(this);
      
        setBackground(Color.red);
        loaderImages();
        

    }

    public StartGame() {
        
        
        Timer timer = new Timer(tick, (e) -> {  actionPerformed();
        px=dpx;
        py=dpy; 
        player.mov(px, py);
        repaint();
          
        });
        timer.start();
        
        initPanel();
    }

    private boolean movUp;
    private boolean movDown;
    private boolean movLeft;
    private boolean movRight;
    private boolean run;

     public void actionPerformed(){
       
         if (movUp) {dpy=-speed;}
         if (movDown) {dpy=speed;}
         if (movLeft) {dpx=-speed;}
         if (movRight) {dpx=speed;}
         if (run) {speed=30;}
         if (!run) {speed=8;}
        
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        var code = e.getKeyCode();
        if (code == KeyEvent.VK_SHIFT) {run=true;}
        if (code == KeyEvent.VK_D) {movRight=true;}
        if (code == KeyEvent.VK_A) {movLeft=true;}
        if (code == KeyEvent.VK_S) {movDown=true;}
        if (code == KeyEvent.VK_W) {movUp=true;}

    }

    @Override
    public void keyReleased(KeyEvent e) {
        movRight=false;
        movLeft=false;
        movDown=false;
        movUp=false;
        run=false;
        dpx=0;
        dpy=0;
         
    }
}
