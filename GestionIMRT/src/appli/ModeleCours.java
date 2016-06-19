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
import javax.swing.DefaultComboBoxModel;
import metier.Cours;

/**
 *
 * @author p1313137
 */
public class ModeleCours extends DefaultComboBoxModel {

    private List<Cours> leConteneur;
    private DaoCours leDao;
    
    public int groupe;

    public ModeleCours(DaoCours leDao) {
        
        this.leDao = leDao;
        leConteneur = new ArrayList<>();
        
        try {
            
            chargerClasses();
            
       } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Cours get(int index) {
        return leConteneur.get(index);
    }

    public void chargerClasses() throws SQLException {
        
        leConteneur.removeAll(leConteneur);
        
        if (this.groupe == 0) {
            leDao.getCours(leConteneur);
            tools.debug("charging all ");
        } else {
            leDao.getCoursParGroupe(leConteneur, groupe);
            tools.debug("charging with groupe : " + groupe);
        }
    }
    
    @Override
    public Object getElementAt(int i) {
        return leConteneur.get(i).getCoursName();
    }
    
    @Override
    public int getSize() {
        return leConteneur.size();
    }

}
