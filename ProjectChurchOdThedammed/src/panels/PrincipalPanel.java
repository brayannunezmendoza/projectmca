package panels;

import java.awt.CardLayout;

import javax.swing.JPanel;
import panels.Acess;
/**
 *
 * @author brayan -  -  - 
 */
//adicionar a troca de panels com certas ações 
public class PrincipalPanel extends JPanel  {

    //armazenamento de panels 
    private CardLayout cl = new CardLayout();
    Acess acess = new Acess();
    StartGame sg = new StartGame();
    public PrincipalPanel() {
        setLayout(cl);
        loadPanels();
        //panel a ser mostrado ao frame
        showPanel("sg");
        //showPanel("ac");
    }

    public void addPanel(JPanel panel, String name) {
        add(name, panel);
    }
    public void showPanel(String name) {
        cl.show(this, name);
    }
    public void loadPanels() {
        addPanel(acess,"ac");
        addPanel(sg, "sg");
    }
  
}
