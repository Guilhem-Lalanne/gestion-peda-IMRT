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
public class Ue {
    private int idUe;
    private String nomUe;
    private String noUe;
    private int idSemestre;
    private int nbHeureEtudiant;

    
    public Ue(int idUe, String nomUe, String noUe, int idSemestre, int nbHeureEtudiant) {
        this.idUe=idUe;
        this.nomUe = nomUe;
        this.noUe = noUe;
        this.idSemestre = idSemestre;
        this.nbHeureEtudiant = nbHeureEtudiant;
    }

    public int getIdUe() {
        return idUe;
    }

    public void setIdUe(int idUe) {
        this.idUe = idUe;
    }

    public String getNomUe() {
        return nomUe;
    }

    public void setNomUe(String nomUe) {
        this.nomUe = nomUe;
    }

    public String getNoUe() {
        return noUe;
    }

    public void setNoUe(String noUe) {
        this.noUe = noUe;
    }

    public int getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
    }

    public int getNbHeureEtudiant() {
        return nbHeureEtudiant;
    }

    public void setNbHeureEtudiant(int nbHeureEtudiant) {
        this.nbHeureEtudiant = nbHeureEtudiant;
    }
    
    
}
