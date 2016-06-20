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
     private int idGroupe;
     
     private String nomClasse;
     private String nomGroupe;
     private String nomUE;
     private String nomEns;
     

    public Cours(int idEnseignant, int idIe) {
        this.idEnseignant = idEnseignant;
        this.idIe = idIe;
    }

    public Cours(int idCours, int idEnseignant, int idGroupe, int idIe,  String nomClasse, String nomUE, String nomEns) {
        this.idCours = idCours;
        this.idEnseignant = idEnseignant;
        this.idIe = idIe;
        this.idGroupe = idGroupe;
        this.nomClasse = nomClasse;
        this.nomGroupe = "";
        this.nomUE = nomUE;
        this.nomEns = nomEns;
    }

    public Cours() {
    }
    
    public String getCoursName() {
        return "Ens: "+this.nomEns+" UE: " + this.nomUE+ " Groupe: "+ this.nomClasse;
    }
    
    public String getCoursName(Ue ue) {
        return "Ens: "+this.nomEns+" UE: " + ue.getNoUe();
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public String getNomUE() {
        return nomUE;
    }

    public void setNomUE(String nomUE) {
        this.nomUE = nomUE;
    }

    public String getNomEns() {
        return nomEns;
    }

    public void setNomEns(String nomEns) {
        this.nomEns = nomEns;
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

    @Override
    public String toString() {
        return "Cours{" + "idCours=" + idCours + ", idEnseignant=" + idEnseignant + ", idIe=" + idIe + ", idGroupe=" + idGroupe + ", nomClasse=" + nomClasse + ", nomGroupe=" + nomGroupe + ", nomUE=" + nomUE + ", nomEns=" + nomEns + '}';
    }
    
    
      
}
