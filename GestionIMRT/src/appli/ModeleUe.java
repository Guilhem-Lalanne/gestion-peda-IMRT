/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoUe;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.AbstractTableModel;
import metier.Ue;

/**
 *
 * @author paul
 */
public class ModeleUe extends DefaultComboBoxModel {
      private List<Ue> leConteneur;
    private DaoUe leDao;

    public ModeleUe(DaoUe leDao) {
        
        this.leDao = leDao;
        leConteneur = new ArrayList<>();
        
        try {
            
            chargerClasses();
            
       } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Ue get(int index) {
        return leConteneur.get(index);
    }

    private void chargerClasses() throws SQLException {
        leDao.getLisetUe(leConteneur);
    }
    
    @Override
    public Object getElementAt(int i) {
        return leConteneur.get(i).getNomUe();
    }

    @Override
    public int getSize() {
        return leConteneur.size();
    }
}
