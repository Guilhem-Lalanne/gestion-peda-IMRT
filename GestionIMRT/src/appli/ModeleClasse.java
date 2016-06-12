/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoClasse;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import metier.Classe;

/**
 *
 * @author p1313137
 */
public class ModeleClasse extends DefaultComboBoxModel {

    private List<Classe> leConteneur;
    private DaoClasse leDao;

    public ModeleClasse(DaoClasse leDao) {
        
        this.leDao = leDao;
        leConteneur = new ArrayList<>();
        
        try {
            
            chargerClasses();
            
       } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Classe get(int index) {
        return leConteneur.get(index);
    }

    private void chargerClasses() throws SQLException {
        leDao.getClasse(leConteneur);
    }
    
    @Override
    public Object getElementAt(int i) {
        return leConteneur.get(i).getNom();
    }

    @Override
    public int getSize() {
        return leConteneur.size();
    }

}