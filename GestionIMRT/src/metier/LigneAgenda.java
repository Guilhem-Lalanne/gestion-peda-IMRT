/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

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
        
        //Je crée les jours
        lundi = new CelluleAgenda(c.get(Calendar.MONDAY),i);
        mardi = new CelluleAgenda(c.get(Calendar.TUESDAY),i);
        mercredi = new CelluleAgenda(c.get(Calendar.WEDNESDAY),i);
        jeudi = new CelluleAgenda(c.get(Calendar.THURSDAY),i);
        vendredi = new CelluleAgenda(c.get(Calendar.FRIDAY),i);
        
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

    public String getHeure() {
        return this.Heure;
    }
    
    public String convertHeure(String a) {
        return String.format("%2s", a).replace(' ', '0') + ":00";
    }

    
}
