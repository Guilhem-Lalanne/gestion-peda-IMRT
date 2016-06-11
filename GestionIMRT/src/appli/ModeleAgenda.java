/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import dao.DaoAgenda;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Agenda;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mateusz
 */
public class ModeleAgenda extends AbstractTableModel { 
    
    private DaoAgenda leDao;
    private List<Agenda> leCont;
    
    //private List <Employeur>  leConteneurEmployeur;
    private String[] nomColonnes = {"Lundi", "Mardi", "Mercredi","Jeudi","Vendredi"};
    //private DaoEmployeur leDaoEmployeur;

    public ModeleAgenda(DaoAgenda leDao) {
        
        this.leDao = leDao;
        leCont = new ArrayList<>();
        
        try {
            charger();
        } catch (SQLException ex) {
            Logger.getLogger(ModeleEnseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ModeleAgenda() {
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
        
        Agenda a = leCont.get(rowIndex);
        /*
        switch (columnIndex) {
            case 0:
                return emp.getIdEmployeur();
            case 1:
                return emp.getNomEmployeur();
            case 2:
                return emp.getAdresseEmployeur();
           
        }*/
        
        return null;
    }
    
     public void supprimerLigne(int numeroLigne) {
          leCont.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Agenda emp) {
       leCont.add(emp);
        this.fireTableDataChanged();
    }
     
    private void charger() throws SQLException {
        leDao.getAgenda(leDao);
    }
}
