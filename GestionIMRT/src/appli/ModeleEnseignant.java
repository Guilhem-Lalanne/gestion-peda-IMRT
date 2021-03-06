/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoEnseignant;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import metier.Enseignant;

/**
 *
 * @author paul
 */
public class ModeleEnseignant extends DefaultComboBoxModel {
      private List<Enseignant> leConteneur;
    private DaoEnseignant leDao;

    public ModeleEnseignant(DaoEnseignant leDao) {
        
        this.leDao = leDao;
        leConteneur = new ArrayList<>();
        
        try {
            
            chargerClasses();
            
       } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Enseignant get(int index) {
        return leConteneur.get(index);
    }

    private void chargerClasses() throws SQLException {
        leDao.getEnseignant(leConteneur);
    }
    
    @Override
    public Object getElementAt(int i) {
        return (leConteneur.get(i).getNomEnseignant() + " " + leConteneur.get(i).getPrenomEnseignant());
    }

    @Override
    public int getSize() {
        return leConteneur.size();
    }
}
