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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListDataListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.AbstractTableModel;
import metier.Employeur;

/**
 *
 * @author paul
 */
public class ModeleNomEmployeur extends DefaultComboBoxModel {
      private List<Employeur> leConteneurEmployeur;
    private String[] nomColonnes = {"id", "nom","adresse"};
    private DaoEmployeur leDaoEmployeur;
/**
 * combobox prent en entre deao emploiyeur 
 * et permer d'avoir une combobox avc le nom de tout les
 * employeur
 * @param leDao 
 */
    public ModeleNomEmployeur(DaoEmployeur leDao) {
        
        this.leDaoEmployeur= leDao;
        leConteneurEmployeur = new ArrayList<>();
        
        try {
            
             charger();
            
            
       } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Employeur get(int index) {
        return leConteneurEmployeur.get(index);
    }

    private void charger() throws SQLException {
        leDaoEmployeur.getEmployeur(leConteneurEmployeur);
    }
    public Object getAdresseAt(int i){
            return leConteneurEmployeur.get(i).getAdresseEmployeur();
   
    }
    
    @Override
    public Object getElementAt(int i) {
        return leConteneurEmployeur.get(i).getNomEmployeur();
    }

    @Override
    public int getSize() {
        return leConteneurEmployeur.size();
    }

}
