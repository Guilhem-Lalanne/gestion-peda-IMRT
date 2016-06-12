/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoAgenda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import metier.LigneAgenda;
import metier.Seance;

/**
 *
 * @author Mateusz
 */
public class ModeleAgenda extends AbstractTableModel { 
    
    private DaoAgenda leDao;            //porte pour la base
    private List<LigneAgenda> leCont;   // liste de lignes avec données
    
    private String date_debut;
    private String date_fin;
    
    //private List <Employeur>  leConteneurEmployeur;
    private String[] nomColonnes = {"Heure","Lundi", "Mardi", "Mercredi","Jeudi","Vendredi"};
    //private DaoEmployeur leDaoEmployeur;

    public ModeleAgenda(DaoAgenda leDao, String dd, String df) throws SQLException {
        
        this.leDao = leDao;
        leCont = new ArrayList<>();
        
        this.date_debut = dd;
        this.date_fin = df;
        
        charger();
    }

    public ModeleAgenda() {
    }
    
    @Override
    public int getRowCount() {
        return leCont.size();
    }

    @Override
    public int getColumnCount() {
        return nomColonnes.length;
    }

    @Override
    public String getColumnName(int col) {
        return nomColonnes[col];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        LigneAgenda a = leCont.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return a.getHeure();
            case 1: return a.getLundi();
            case 2: return a.getMardi();
            //case 3: return a.getMercredi();
            //case 4: return a.getJeudi();
            //case 5: return a.getVendredi();
        }
        
        return null;
    }
    
     public void supprimerLigne(int numeroLigne) {
          leCont.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(LigneAgenda a) {
       leCont.add(a);
        this.fireTableDataChanged();
    }
     
    private void charger() throws SQLException {
        
       //je cherche toutes les sceances
        ArrayList<Seance> listSeances = new ArrayList<>();
        leCont.removeAll(leCont);
        
        leDao.getSeances(listSeances, date_debut, date_fin);
        
        for (Seance s : listSeances) {
            tools.debug(s.toString());
        }
        
        for (int i = 7; i <= 18; i++) {
            leCont.add(new LigneAgenda(i,date_debut, listSeances));
        }
        
    }
}
