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
    private String nbHeureEtudiant;

    public Ue(String nomUe, String noUe, int idSemestre, String nbHeureEtudiant) {
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

    public String getNbHeureEtudiant() {
        return nbHeureEtudiant;
    }

    public void setNbHeureEtudiant(String nbHeureEtudiant) {
        this.nbHeureEtudiant = nbHeureEtudiant;
    }
    
    
}
