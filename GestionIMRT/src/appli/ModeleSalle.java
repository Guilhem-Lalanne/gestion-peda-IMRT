/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoSalle;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import metier.Salle;

/**
 *
 * @author paul
 */
public class ModeleSalle extends DefaultComboBoxModel {
    private List<Salle> leConteneur;
    private DaoSalle leDao;

    public ModeleSalle(DaoSalle leDao) {
        
        this.leDao = leDao;
        leConteneur = new ArrayList<>();
        
        try {
            
            chargerClasses();
            
       } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Salle get(int index) {
        return leConteneur.get(index);
    }

    private void chargerClasses() throws SQLException {
        leDao.getSalles(leConteneur);
    }
    
    @Override
    public Object getElementAt(int i) {
        return leConteneur.get(i).getNomSalle();
    }

    @Override
    public int getSize() {
        return leConteneur.size();
    }
}
