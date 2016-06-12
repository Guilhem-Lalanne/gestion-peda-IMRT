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
        
        int jour = 0;
        
        Calendar c = Calendar.getInstance();
        c.setTime(Date.valueOf(date_debut));
        
        //Je crée les jours
        jour = c.get(Calendar.DAY_OF_MONTH);
        lundi = new CelluleAgenda(jour,i,c.getTime(),getSeancesParJour(ls, jour, line));
        lundi.id_seance = this.getIdDeSeance(ls, jour, line);
        
        c.add(Calendar.DAY_OF_MONTH, 1);
        jour = c.get(Calendar.DAY_OF_MONTH);
        mardi = new CelluleAgenda(jour,i,c.getTime(),getSeancesParJour(ls, jour, line));
        mardi.id_seance = this.getIdDeSeance(ls, jour, line);
        
        c.add(Calendar.DAY_OF_MONTH, 1);
        jour = c.get(Calendar.DAY_OF_MONTH);
        mercredi = new CelluleAgenda(jour,i,c.getTime(),getSeancesParJour(ls, jour, line));
        mercredi.id_seance = this.getIdDeSeance(ls, jour, line);
        
        c.add(Calendar.DAY_OF_MONTH, 1);
        jour = c.get(Calendar.DAY_OF_MONTH);
        jeudi = new CelluleAgenda(jour,i,c.getTime(),getSeancesParJour(ls, jour, line));
        jeudi.id_seance = this.getIdDeSeance(ls, jour, line);
        
        c.add(Calendar.DAY_OF_MONTH, 1);
        jour = c.get(Calendar.DAY_OF_MONTH);
        vendredi = new CelluleAgenda(jour,i,c.getTime(),getSeancesParJour(ls, jour, line));
        vendredi.id_seance = this.getIdDeSeance(ls, jour, line);
        
        Heure = convertHeure(Integer.toString(i));
        
    }
    
    private ArrayList<String> getSeancesParJour(ArrayList<Seance> ls, int day, int heure) {
        
        ArrayList<String> a = new ArrayList<>();
        
        Calendar cal_tmp = Calendar.getInstance();
        
        for (Seance s : ls) {
            
            cal_tmp.setTime(Date.valueOf(s.getDate().substring(0, 10)));
            
             if (cal_tmp.get(Calendar.DAY_OF_MONTH) == day &&
                     heure >= s.getHeureDebut() && heure < s.getHeureFin()) {
                 a.add(s.getAffichageTable());
             }
            
        }
        
        return a;
    }
    
    public int getIdDeSeance(ArrayList<Seance> ls, int day, int heure) {
        
        int a = 0;
        
        Calendar cal_tmp = Calendar.getInstance();
        
        for (Seance s : ls) {
            
            cal_tmp.setTime(Date.valueOf(s.getDate().substring(0, 10)));
            
             if (cal_tmp.get(Calendar.DAY_OF_MONTH) == day &&
                     heure >= s.getHeureDebut() && heure < s.getHeureFin()) {
                 a = s.getIdSeance();
             }
            
        }
        
        return a;
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

    public CelluleAgenda getCellLundi() {
        return lundi;
    }

    public CelluleAgenda getCellMardi() {
        return mardi;
    }

    public CelluleAgenda getCellMercredi() {
        return mercredi;
    }

    public CelluleAgenda getCellJeudi() {
        return jeudi;
    }

    public CelluleAgenda getCellVendredi() {
        return vendredi;
    }

    
}
