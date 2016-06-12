/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import appli.tools;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
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
    public CelluleAgenda vendredi;
    
    public int heure;
    public String Heure;
    
    public LigneAgenda(int i, String date_debut, ArrayList<Seance> ls) {
        
        line = i;
        
        Calendar c = Calendar.getInstance();
        c.setTime(Date.valueOf(date_debut));
        
        //tools.debug("Ligne : " + i + "date de ligne: " + date_debut);
        
        //Je crée les jours
        lundi = new CelluleAgenda(c.get(Calendar.DAY_OF_MONTH),i);
        c.add(Calendar.DAY_OF_MONTH, 1);
        mardi = new CelluleAgenda(c.get(Calendar.DAY_OF_MONTH),i);
        c.add(Calendar.DAY_OF_MONTH, 1);
        mercredi = new CelluleAgenda(c.get(Calendar.DAY_OF_MONTH),i);
        c.add(Calendar.DAY_OF_MONTH, 1);
        jeudi = new CelluleAgenda(c.get(Calendar.DAY_OF_MONTH),i);
        c.add(Calendar.DAY_OF_MONTH, 1);
        vendredi = new CelluleAgenda(c.get(Calendar.DAY_OF_MONTH),i);
        
        Heure = convertHeure(Integer.toString(i));
        
    }

    public String getLundi() {
        return lundi.getValue();
    }

    public void setLundi(CelluleAgenda lundi) {
        this.lundi = lundi;
    }

    public String getMardi() {
        return mardi.getValue();
    }

    public void setMardi(CelluleAgenda mardi) {
        this.mardi = mardi;
    }

    public String getMercredi() {
        return mercredi.getValue();
    }

    public void setMercredi(CelluleAgenda mercredi) {
        this.mercredi = mercredi;
    }

    public String getJeudi() {
        return jeudi.getValue();
    }

    public void setJeudi(CelluleAgenda jeudi) {
        this.jeudi = jeudi;
    }

    public String getVendredi() {
        return vendredi.getValue();
    }

    public void setVendredi(CelluleAgenda vendredi) {
        this.vendredi = vendredi;
    }

    public String getHeure() {
        return this.Heure;
    }
    
    public String convertHeure(String a) {
        return String.format("%2s", a).replace(' ', '0') + ":00";
    }

    
}
