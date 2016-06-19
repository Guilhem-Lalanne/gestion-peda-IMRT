/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoGroupe;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import metier.Groupe;

/**
 *
 * @author p1313137
 */
public class ModeleGroupe extends DefaultComboBoxModel {

    private List<Groupe> leConteneur;
    private DaoGroupe leDao;

    public ModeleGroupe(DaoGroupe leDao) {
        
        this.leDao = leDao;
        leConteneur = new ArrayList<>();
        
        try {
            
            chargerClasses();
            
       } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Groupe get(int index) {
        return leConteneur.get(index);
    }

    private void chargerClasses() throws SQLException {
        leDao.getGroupesAll(leConteneur);
    }
    
    @Override
    public Object getElementAt(int i) {
        return leConteneur.get(i).getClassFullname();
    }
    
    public Object getElementAtIdClasse(int i) {
        return leConteneur.get(i).getIdClasse();
    }

    @Override
    public int getSize() {
        return leConteneur.size();
    }

}
