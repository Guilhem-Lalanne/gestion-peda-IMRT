/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoGroupe;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import metier.Groupe;

/**
 *
 * @author p0606160
 */
public class ModeleListeGroupe extends AbstractTableModel {

    private List<Groupe> leCont;
    private String[] nomColonnes = {"Promotion", "Nom de la classe", "Nom du groupe"};
    private DaoGroupe leDao;
    
    public String promotion;
    public int classe;

    public ModeleListeGroupe (DaoGroupe leDao, String promo, int classe) {

        this.leDao = leDao;
        leCont = new ArrayList<>();
        
        this.promotion = promo;
        this.classe = classe;

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
        
        Groupe c = leCont.get(rowIndex);
        
        switch (columnIndex) {
            
            case 0:
                 return c.getClassFullname();
            case 1:
                return c.getNomClasse();
            case 2:
                return c.getNom();
            
        }
        
        return null;
    }

    public void supprimerLigne(int numeroLigne) {
        leCont.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Groupe c) {
        leCont.add(c);
        this.fireTableDataChanged();
    }

    public void charger() throws SQLException {
        leCont.removeAll(leCont);
        leDao.getGroupes(leCont,this.promotion,this.classe);
    }

    public Groupe get(int selectedRow) {
        return leCont.get(selectedRow);
    }

}
