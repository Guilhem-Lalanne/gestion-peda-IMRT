/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateusz
 */
public class LigneAgenda {
    
    public int line;
    public CelluleAgenda lundi;
    public CelluleAgenda mardi;
    public CelluleAgenda mercredi;
    public CelluleAgenda jeudi;

    public String getLundi() {
        return lundi.getValue();
    }

    public void setLundi(CelluleAgenda lundi) {
        this.lundi = lundi;
    }

    public JButton getMardi(String[] nomColonnes, int columnIndex, int rowIndex) {
        JButton button = new JButton(nomColonnes[columnIndex]);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(button), 
                        "Button clicked for row "+rowIndex);
            }
        });
        return button;
    }

    public void setMardi(CelluleAgenda mardi) {
        this.mardi = mardi;
    }

    public CelluleAgenda getMercredi() {
        return mercredi;
    }

    public void setMercredi(CelluleAgenda mercredi) {
        this.mercredi = mercredi;
    }

    public CelluleAgenda getJeudi() {
        return jeudi;
    }

    public void setJeudi(CelluleAgenda jeudi) {
        this.jeudi = jeudi;
    }

    public CelluleAgenda getVendredi() {
        return vendredi;
    }

    public void setVendredi(CelluleAgenda vendredi) {
        this.vendredi = vendredi;
    }
    public CelluleAgenda vendredi;
    
    public String Heure;
    

    public LigneAgenda(int i) {
        
        line = i;
        
        //Je crée les jours
        lundi = new CelluleAgenda();
        mardi = new CelluleAgenda();
        mercredi = new CelluleAgenda();
        jeudi = new CelluleAgenda();
        vendredi = new CelluleAgenda();
        
        Heure = convertHeure(Integer.toString(i));
        
    }

    public String getHeure() {
        return this.Heure;
    }
    
    public String convertHeure(String a) {
        return String.format("%2s", a).replace(' ', '0') + ":00";
    }

    
}
