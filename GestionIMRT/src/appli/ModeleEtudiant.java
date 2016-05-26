/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoEtudiant;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import metier.Etudiant;

/**
 *
 * @author p0606160
 */
public class ModeleEtudiant extends AbstractTableModel {

    private List<Etudiant> leConteneur;
    private String[] nomColonnes = {"login", "fullname", "groupe"};
    private DaoEtudiant leDao;

    public ModeleEtudiant (DaoEtudiant leDao) {

        this.leDao = leDao;
        leConteneur = new ArrayList<>();

        /*
        TODO
        
        try {
            charger();
        } catch (SQLException ex) {
            Logger.getLogger(ModeleUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
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
        Etudiant etu = leConteneur.get(rowIndex);
        /* TODO : Application à la classe Etudiant
        switch (columnIndex) {
            case 0:
                return etu.getLogin();
            case 1:
                return etu.getFullname();
            case 2:
                return etu.getGroupe();
        }
        */
        return null;
    }

    public void supprimerLigne(int numeroLigne) {
        leConteneur.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Etudiant etu) {
        //leConteneur.add(etu);
        this.fireTableDataChanged();
    }

    /*
    private void charger() throws SQLException {
        leDao.getUsers(leConteneur);
    }
    */

}
