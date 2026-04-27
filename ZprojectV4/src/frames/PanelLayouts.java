/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frames;

import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author braya
 */
public class PanelLayouts extends JPanel{

    private CardLayout cardLayout = new CardLayout();
    
    public void loadPanel() {
       add("acess",  new PanelAcess());
       add("levels",  new SelectLevel());
        add("levelt1", new LevelT1());
    }

    public PanelLayouts() {
        setLayout(cardLayout);
        loadPanel();
        cardLayout.show(this, "levelt1");
        
        setVisible(true);
        

    }

}
