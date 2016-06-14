/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoClasse;
import dao.DaoEtudiant;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import metier.Classe;
import metier.Etudiant;

/**
 *
 * @author p0606160
 */
public class ModeleListeClasse extends AbstractTableModel {

    private List<Classe> leCont;
    private String[] nomColonnes = {"Promotion", "Code de la classe", "Nom de la classe"};
    private DaoClasse leDao;

    public ModeleListeClasse (DaoClasse leDao) {

        this.leDao = leDao;
        leCont = new ArrayList<>();

        try {
            charger();
        } catch (SQLException ex) {
            Logger.getLogger(ModeleEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int getRowCount() {
        return leCont.size();
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
        
        Classe c = leCont.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                 return c.getPromotion();
            case 1:
                return c.getCode();
            case 2:
                return c.getNom();
        }
        
        return null;
    }

    public void supprimerLigne(int numeroLigne) {
        leCont.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Classe c) {
        leCont.add(c);
        this.fireTableDataChanged();
    }

    private void charger() throws SQLException {
        leDao.getClasses(leCont);
    }

    public Classe get(int selectedRow) {
        return leCont.get(selectedRow);
    }

}
