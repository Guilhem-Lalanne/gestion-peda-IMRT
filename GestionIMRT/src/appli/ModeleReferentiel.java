/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoReferentiel;
import java.sql.SQLException;
import metier.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListDataListener;
import javax.swing.table.AbstractTableModel;
import metier.Referentiel;

/**
 *
 * @author Administrateur
 */
public class ModeleReferentiel extends DefaultComboBoxModel {

    private List<Referentiel> leConteneur;
    //private String[] nomColonnes = {"id", "libelle"};
    private DaoReferentiel leDao;

    public ModeleReferentiel(DaoReferentiel leDao, String type) {
        
        this.leDao = leDao;
        leConteneur = new ArrayList<>();
        
        try {
            
            if (type == "userGroupes") {
                chargerGroupes();
            } 
            //TODO: mettre function approprié
            //else if ( type == "")
            
            
       } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Referentiel get(int index) {
        return leConteneur.get(index);
    }

    private void chargerGroupes() throws SQLException {
        leDao.getUserGroupes(leConteneur);
    }
    
    @Override
    public Object getElementAt(int i) {
        return leConteneur.get(i).getLibelle();
    }

    @Override
    public int getSize() {
        return leConteneur.size();
    }

}
