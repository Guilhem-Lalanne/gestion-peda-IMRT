/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoAgenda;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import metier.LigneAgenda;

/**
 *
 * @author Mateusz
 */
public class ModeleAgenda extends AbstractTableModel { 
    
    private DaoAgenda leDao;
    private List<LigneAgenda> leCont;
    
    //private List <Employeur>  leConteneurEmployeur;
    private String[] nomColonnes = {"Heure","Lundi", "Mardi", "Mercredi","Jeudi","Vendredi"};
    //private DaoEmployeur leDaoEmployeur;

    public ModeleAgenda(DaoAgenda leDao) {
        
        this.leDao = leDao;
        leCont = new ArrayList<>();
        
        for (int i = 7; i <= 18; i++) {
            leCont.add(new LigneAgenda(i));
        }
        
        try {
            charger();
        } catch (SQLException ex) {
            Logger.getLogger(ModeleEnseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            //case 2: return a.getMardi();
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
        leDao.getAgenda(leDao);
    }
}
