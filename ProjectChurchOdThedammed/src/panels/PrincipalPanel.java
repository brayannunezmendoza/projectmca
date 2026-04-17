package panels;

import java.awt.CardLayout;

import javax.swing.JPanel;
import panels.Acess;
/**
 *
 * @author 12525153326
 */
public class PrincipalPanel extends JPanel  {

    private CardLayout cl = new CardLayout();
    //StartGame sg = new StartGame();
    Acess acess = new Acess();
    public PrincipalPanel() {
        
        setLayout(cl);
        loadPanels();
        showPanel("ac");

    }

    public void addPanel(JPanel panel, String name) {
        add(name, panel);
    }

    public void showPanel(String name) {
        cl.show(this, name);
    }

    public void loadPanels() {
        addPanel(acess,"ac");
        //addPanel(sg, "sg");
        

    }
  
}
