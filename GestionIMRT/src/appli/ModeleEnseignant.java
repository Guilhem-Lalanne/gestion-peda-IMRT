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
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Enseignant ens = leConteneurEnseignant.get(rowIndex);
     
        switch (columnIndex) {
            case 0:
                return ens.getIdEnseignant();
            case 1:
                return ens.getNomEnseignant();
            case 2:
                return  ens.getPrenomEnseignant();
            case 3:
                return ens.getIdDiscipline();
            case 4:
                return ens.getDateNaissanceEnseignant();
            case 5:
                return ens.getAdresseEnseignant();
            case 6:
                return ens.getNumeroTelFixeEnseignant();
            case 7:
                return ens.getNumeroTelMobilEnseignant();
            case 8:
                return ens.getMailEnseignant();
            case 9:
                return ens.getIdEmployeur();
            case 10:
                return ens.getDocAdmPhotoCarteNat();
            case 11:
                return ens.getDocAdmPhotoCarteSecu();
            case 12:
                return ens.getDocAdmRecepArreteNomin();
        }
        
        return null;
    }
     public void supprimerLigne(int numeroLigne) {
          leConteneurEnseignant.remove(numeroLigne);
        this.fireTableDataChanged();
    }

    public void insererLigne(Enseignant ens) {
       leConteneurEnseignant.add(ens);
        this.fireTableDataChanged();
    }
}
