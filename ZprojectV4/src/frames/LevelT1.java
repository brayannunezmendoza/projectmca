/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import models.Player;

/**
 *
 * @author braya
 */
public class LevelT1 extends JPanel {

    private int timertick = 30;
    private int moving = 5;
    private boolean up, down, left, right, tiro;
    private int x = 600, y = 530;
    InputMap input = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    ActionMap action = getActionMap();
    private Player player = new Player(x, y, "src/res/Arlot.png");
    BufferedImage imageBackgound;
    private ArrayList<Rectangle> colision = new ArrayList<>();

    //inputs do teclado
    public void movingMaping() {
        input.put(KeyStroke.getKeyStroke("pressed W"), "wPressed");
        action.put("wPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {up = true;}});
        input.put(KeyStroke.getKeyStroke("released W"), "wReleased");
        action.put("wReleased", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {up = false;}});

        input.put(KeyStroke.getKeyStroke("pressed S"), "sPressed");
        action.put("sPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {down = true;}});

        input.put(KeyStroke.getKeyStroke("released S"), "sReleased");
        action.put("sReleased", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {down = false;}});
        input.put(KeyStroke.getKeyStroke("pressed A"), "aPressed");
        action.put("aPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {left = true;}});
        input.put(KeyStroke.getKeyStroke("released A"), "aReleased");
        action.put("aReleased", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {left = false;}});
        input.put(KeyStroke.getKeyStroke("pressed D"), "dPressed");
        action.put("dPressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {right = true;}});
        input.put(KeyStroke.getKeyStroke("released D"), "dReleased");
        action.put("dReleased", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {right = false;}});
        input.put(KeyStroke.getKeyStroke("pressed SPACE"), "spacePressed");
        action.put("spacePressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {tiro = true;}});
        input.put(KeyStroke.getKeyStroke("released SPACE"), "spaceReleased");
        action.put("spaceReleased", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {tiro = false;}});
        new Timer(timertick, e -> updateMoving()).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //desenho da imagem de fundo
        try {
            imageBackgound = ImageIO.read(new File("src/res/scre1.png"));
        } catch (IOException ex) {
            System.getLogger(LevelT1.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        g.drawImage(imageBackgound, 0, 0, 1200, 720, null);
        //desenho do player 
        player.drawPlayer(g);

        //cor dos blocos de colisão
        g.setColor(Color.red);
        //repetição de toda a lista para desenhar na tela as caixa de colisão
        for (Rectangle colision : colision) {
            g.drawRect(colision.x, colision.y, colision.width, colision.height);
        }
        g.setColor(Color.blue);
        g.drawOval(100, 100, 500, 500);
        //colisão com o cenario
    }

    public void updateMoving() {
        if (up) {y -= moving;}
        if (down) {y += moving;}
        if (left) {x -= moving;}
        if (right) {x += moving;}
        player.move(x, y);
        repaint();
    }
    int vj = 4;

    public LevelT1() {
        ///lista de retangulos para servirem como colisão 
        colision.add(new Rectangle(0, 0, 300, 720));
        colision.add(new Rectangle(300, 90, 110, 110));
        colision.add(new Rectangle(300, 420, 110, 90));
        colision.add(new Rectangle(550, 150, 150, 150));
        colision.add(new Rectangle(650, 230, 170, 130));
        colision.add(new Rectangle(600, 300, 70, 150));
        colision.add(new Rectangle(880, 510, 400, 250));
        colision.add(new Rectangle(980, 160, 300, 500));

        Timer tick = new Timer(24, (e) -> {
            if (tiro) {

            }
        });
        tick.start();
        movingMaping();
        setBackground(Color.black);
        setLayout(null);

        setVisible(true);

    }

}
        //labelteste.setLocation(labelteste.getX(), labelteste.getY() + moving);
