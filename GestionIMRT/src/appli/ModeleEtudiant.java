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

    private List<Etudiant> leConteneurEtu;
    private String[] nomColonnes = {"Nom", "Prenom", "Date de Naissance", "Adresse"};
    private DaoEtudiant leDaoEtu;

    public ModeleEtudiant (DaoEtudiant leDaoEtu) {

        this.leDaoEtu = leDaoEtu;
        leConteneurEtu = new ArrayList<>();

        try {
            charger();
        } catch (SQLException ex) {
            Logger.getLogger(ModeleEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Etudiant getEtu(int index) {
        return leConteneurEtu.get(index);
    }
    

    @Override
    public int getRowCount() {
        return leConteneurEtu.size();
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
        Etudiant etu = leConteneurEtu.get(rowIndex);
        // TODO : Application à la classe Etudiant
        switch (columnIndex) {
            case 0:
                return etu.getNomEtudiant();
            case 1:
                return etu.getPrenomEtudiant();
            case 2:
                return etu.getDateNaissanceEtudiant();
            case 3:
                return etu.getAdresseEtudiant();
        }
        
        return null;
    }

    public void supprimerLigne(int numeroLigne) {
        leConteneurEtu.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Etudiant etu) {
        leConteneurEtu.add(etu);
        this.fireTableDataChanged();
    }

    
    private void charger() throws SQLException {
        leDaoEtu.getListEtudiants(leConteneurEtu);
    }

}
