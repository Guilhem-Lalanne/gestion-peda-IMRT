/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoUe;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.AbstractTableModel;
import metier.Ue;

/**
 *
 * @author paul
 */
public class ModeleUe extends AbstractTableModel {
       //private List<Etudiant> leConteneurEtu;
    private List<Ue> leConteneurUe;
    private String[] nomColonnes = {"id", "Nom ",};
    private DaoUe leDaoUe;

    public ModeleUe(DaoUe leDaoUe) {
        this.leDaoUe = leDaoUe;
        leConteneurUe = new ArrayList<>();
        
        try {
            charger();
        } catch (SQLException ex) {
            Logger.getLogger(ModeleUe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ModeleUe() {
    }

    public Ue get(int index) {
        return leConteneurUe.get(index);
    }

    @Override
    public int getRowCount() {
        return leConteneurUe.size();
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
        Ue ue = leConteneurUe.get(rowIndex);

        switch (columnIndex) {

            case 0:
                return ue.getIdUe();
            case 1:
                return ue.getNomUe();
            case 2:
                return ue.getNoUe();

        }

        return null;
    }

    public void supprimerLigne(int numeroLigne) {
        leConteneurUe.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Ue ue) {
        leConteneurUe.add(ue);
        this.fireTableDataChanged();
    }

     private void charger() throws SQLException {
        leDaoUe.getLisetUe(leConteneurUe);
    }
}
