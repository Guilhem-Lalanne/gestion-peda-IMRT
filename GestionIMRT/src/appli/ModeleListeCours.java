/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoCours;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import metier.Cours;

/**
 *
 * @author paul
 */
public class ModeleListeCours extends AbstractTableModel{ 
    
     private List <Cours>  leCont;
    private String[] nomColonnes = {"Class et Groupe", "UE", "Enseignant"};
    private DaoCours dao;

    public ModeleListeCours(DaoCours ledao) {
        this.dao = ledao;
        
        leCont = new ArrayList<>();
        
        try {
            charger();
        } catch (SQLException ex) {
            Logger.getLogger(ModeleListeEnseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ModeleListeCours() {
    }
       
    public Cours get(int index) {
        return leCont.get(index);
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
        Cours c = leCont.get(rowIndex);
     
        switch (columnIndex) {
        
            case 0:
                return c.getNomClasse();
            case 1:
                return c.getNomUE();
            case 2:
                return c.getNomEns();
           
        }
        
        return null;
    }
    
     public void supprimerLigne(int numeroLigne) {
          leCont.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Cours c) {
       leCont.add(c);
        this.fireTableDataChanged();
    }
      private void charger() throws SQLException {
        dao.getCours(leCont);
    }
}
