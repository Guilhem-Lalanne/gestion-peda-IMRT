/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoEmployeur;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import metier.Employeur;

/**
 *
 * @author paul
 */
public class ModeleEmployeur extends AbstractTableModel{ 
    
     private List <Employeur>  leConteneurEmployeur;
    private String[] nomColonnes = {"id", "Nom ", "adresse"};
    private DaoEmployeur leDaoEmployeur;

    public ModeleEmployeur(DaoEmployeur leDaoEmployeur) {
        this.leDaoEmployeur = leDaoEmployeur;
        leConteneurEmployeur = new ArrayList<>();
        try {
            charger();
        } catch (SQLException ex) {
            Logger.getLogger(ModeleEnseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ModeleEmployeur() {
    }
    
       
    public Employeur get(int index) {
        return leConteneurEmployeur.get(index);
    }

  
   
    @Override
    public int getRowCount() {
        return leConteneurEmployeur.size();
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
        Employeur emp = leConteneurEmployeur.get(rowIndex);
     
        switch (columnIndex) {
        
            
            case 0:
                return emp.getIdEmployeur();
            case 1:
                return emp.getNomEmployeur();
            case 2:
                return emp.getAdresseEmployeur();
           
        }
        
        return null;
    }
    
     public void supprimerLigne(int numeroLigne) {
          leConteneurEmployeur.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Employeur ens) {
       leConteneurEmployeur.add(ens);
        this.fireTableDataChanged();
    }
      private void charger() throws SQLException {
        leDaoEmployeur.getEmployeur(leConteneurEmployeur);
    }
}
