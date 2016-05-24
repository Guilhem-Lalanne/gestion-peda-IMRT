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
public class Etudiant {

    private int idEtudiant;
    private int idGroupe;
    private String nomEtudiant;
    private String prenomEtudiant;
    private String dateNaissanceEtudiant;
    private String adresseEtudiant;
    private String numeroTelFixe;
    private String numeroTelMobil;
    private int mailEtudiant;
    private int idClasse;

    public Etudiant(String nomEtudiant, String prenomEtudiant, String dateNaissanceEtudiant, String adresseEtudiant, String numeroTelFixe, String numeroTelMobil, int mailEtudiant) {
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
        this.adresseEtudiant = adresseEtudiant;
        this.numeroTelFixe = numeroTelFixe;
        this.numeroTelMobil = numeroTelMobil;
        this.mailEtudiant = mailEtudiant;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public String getDateNaissanceEtudiant() {
        return dateNaissanceEtudiant;
    }

    public void setDateNaissanceEtudiant(String dateNaissanceEtudiant) {
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
    }

    public String getAdresseEtudiant() {
        return adresseEtudiant;
    }

    public void setAdresseEtudiant(String adresseEtudiant) {
        this.adresseEtudiant = adresseEtudiant;
    }

    public String getNumeroTelFixe() {
        return numeroTelFixe;
    }

    public void setNumeroTelFixe(String numeroTelFixe) {
        this.numeroTelFixe = numeroTelFixe;
    }

    public String getNumeroTelMobil() {
        return numeroTelMobil;
    }

    public void setNumeroTelMobil(String numeroTelMobil) {
        this.numeroTelMobil = numeroTelMobil;
    }

    public int getMailEtudiant() {
        return mailEtudiant;
    }

    public void setMailEtudiant(int mailEtudiant) {
        this.mailEtudiant = mailEtudiant;
    }

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }
    
}
