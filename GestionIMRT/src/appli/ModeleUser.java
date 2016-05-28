/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoUser;
import java.sql.SQLException;
import metier.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrateur
 */
public class ModeleUser extends AbstractTableModel {

    private List<User> leConteneur;
    private String[] nomColonnes = {"login", "fullname","groupe"};
    private DaoUser leDao;

    public ModeleUser(DaoUser leDao) {
        
        this.leDao = leDao;
        leConteneur = new ArrayList<>();
        
        try {
            charger();
        } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getRowCount() {
        return leConteneur.size();
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
        User u = leConteneur.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return u.getLogin();
            case 1:
                return u.getFullname();
            case 2:
                return u.getGroupe();
        }
        return null;
    }
    
    public void supprimerLigne(int numeroLigne){
        leConteneur.remove(numeroLigne);
        this.fireTableDataChanged();
    }
    
    public void insererLigne(User u){
        leConteneur.add(u);
        this.fireTableDataChanged();
    }
    

    private void charger() throws SQLException {
        leDao.getUsers(leConteneur);
    }

}
