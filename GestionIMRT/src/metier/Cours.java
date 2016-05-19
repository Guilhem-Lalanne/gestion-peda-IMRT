/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author paul
 */
public class Cours {
     private int idCours;
      private int idEnseignant;
      private int idIe;

    public Cours(int idEnseignant, int idIe) {
        this.idEnseignant = idEnseignant;
        this.idIe = idIe;
    }

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public int getIdIe() {
        return idIe;
    }

    public void setIdIe(int idIe) {
        this.idIe = idIe;
    }
      
}
