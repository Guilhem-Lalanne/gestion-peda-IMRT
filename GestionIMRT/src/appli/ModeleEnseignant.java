/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;
import dao.DaoEnseignant;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import metier.Enseignant;
/**
 *
 * @author paul
 */
public class ModeleEnseignant extends AbstractTableModel{
     private List<Enseignant> leConteneurEnseignant;
    private String[] nomColonnes = {"", "", ""};
    private DaoEnseignant leDaoEnseignant;

    public ModeleEnseignant(DaoEnseignant leDaoEnseignant) {
        this.leDaoEnseignant = leDaoEnseignant;
       leConteneurEnseignant = new ArrayList<>();
    }
    
   
    @Override
    public int getRowCount() {
        return leConteneurEnseignant.size();
    }

    @Override
    public int getColumnCount() {
        return nomColonnes.length;
    }

    @Override
    public String getColumnName(int col) {
        return nomColonnes[col];
    }
    
}
