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
import javax.swing.table.AbstractTableModel;
import metier.Salle;

/**
 *
 * @author p0606160
 */
public class ModeleListeSalle extends AbstractTableModel {

    private List<Salle> leCont;
    private String[] nomColonnes = {"Nom Salle"};
    private DaoSalle leDao;

    public ModeleListeSalle (DaoSalle leDao) {

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
        
        Salle c = leCont.get(rowIndex);
        
        switch (columnIndex) {
            case 0:
                 return c.getNomSalle();
        }
        
        return null;
    }

    public void supprimerLigne(int numeroLigne) {
        leCont.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Salle c) {
        leCont.add(c);
        this.fireTableDataChanged();
    }

    private void charger() throws SQLException {
        leDao.getSalles(leCont);
    }

    public Salle get(int selectedRow) {
        return leCont.get(selectedRow);
    }

}
