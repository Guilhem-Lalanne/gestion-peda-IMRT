/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoPromotion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import metier.Promotion;

/**
 *
 * @author p1313137
 */
public class ModelePromotion extends DefaultComboBoxModel {

    private List<Promotion> leConteneur;
    private DaoPromotion leDao;

    public ModelePromotion(DaoPromotion leDao) {
        
        this.leDao = leDao;
        leConteneur = new ArrayList<>();
        
        try {
            charger();
       } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Promotion get(int index) {
        return leConteneur.get(index);
    }

    private void charger() throws SQLException {
        leDao.getPromotions(leConteneur);
    }
    
    @Override
    public Object getElementAt(int i) {
        return leConteneur.get(i).getNomPromotion();
    }

    @Override
    public int getSize() {
        return leConteneur.size();
    }

}