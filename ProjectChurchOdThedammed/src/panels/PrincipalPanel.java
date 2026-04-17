package panels;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import models.Player;

/**
 *
 * @author 12525153326
 */
public class PrincipalPanel extends JPanel  {

    private CardLayout cl = new CardLayout();
    StartGame sg = new StartGame();

    public PrincipalPanel() {
       
        setLayout(cl);
        loadPanels();
        showPanel("sg");

    }

    public void addPanel(JPanel panel, String name) {
        add(name, sg);
    }

    public void showPanel(String name) {
        cl.show(this, name);
    }

    public void loadPanels() {
        addPanel(sg, "sg");

    }
  
}
