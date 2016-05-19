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
public class Presance {
  private int idPresance;
  private int idEtudiant;
  private int idSeance;
  private boolean absance;
  private String absanceMotif;

    public Presance(int idEtudiant, int idSeance, boolean absance, String absanceMotif) {
        this.idEtudiant = idEtudiant;
        this.idSeance = idSeance;
        this.absance = absance;
        this.absanceMotif = absanceMotif;
    }

    public int getIdPresance() {
        return idPresance;
    }

    public void setIdPresance(int idPresance) {
        this.idPresance = idPresance;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public boolean isAbsance() {
        return absance;
    }

    public void setAbsance(boolean absance) {
        this.absance = absance;
    }

    public String getAbsanceMotif() {
        return absanceMotif;
    }

    public void setAbsanceMotif(String absanceMotif) {
        this.absanceMotif = absanceMotif;
    }
  
  
}
