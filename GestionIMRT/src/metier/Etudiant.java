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
    private String nomGroupeEtudiant;
    private String nomEtudiant;
    private String prenomEtudiant;
    private String dateNaissanceEtudiant;
    private String adresseEtudiant;
    private String numeroTelFixeEtudiant;
    private String numeroTelMobilEtudiant;
    private int mailEtudiant;
    private int idClasse;
    private String nomClasseEtudiant;

    public Etudiant(String nomEtudiant, String prenomEtudiant, String dateNaissanceEtudiant, String adresseEtudiant, String numeroTelFixeEtudiant, String numeroTelMobilEtudiant, int mailEtudiant) {
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
        this.adresseEtudiant = adresseEtudiant;
        this.numeroTelFixeEtudiant = numeroTelFixeEtudiant;
        this.numeroTelMobilEtudiant = numeroTelMobilEtudiant;
        this.mailEtudiant = mailEtudiant;
    }
    
    /**
     * Constructeur par défaut (sans paramètres)
     */
    public Etudiant() {
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
  public String getNomGroupeEtudiant() {
        return nomGroupeEtudiant;
    }

    public void setNomGroupeEtudiant(String nomGroupeEtudiant) {
        this.nomGroupeEtudiant = nomGroupeEtudiant;
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

    public String getNumeroTelFixeEtudiant() {
        return numeroTelFixeEtudiant;
    }

    public void setNumeroTelFixeEtudiant(String numeroTelFixeEtudiant) {
        this.numeroTelFixeEtudiant = numeroTelFixeEtudiant;
    }

    public String getNumeroTelMobilEtudiant() {
        return numeroTelMobilEtudiant;
    }

    public void setNumeroTelMobilEtudiant(String numeroTelMobilEtudiant) {
        this.numeroTelMobilEtudiant = numeroTelMobilEtudiant;
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

    @Override
    public String toString() {
        return "etudiant("+"nomGroupeEtudiant"+nomGroupeEtudiant+"+nomEtudiant"+nomEtudiant+
               "prenomEtudiant"+prenomEtudiant+"dateNaissanceEtudiant"+
                dateNaissanceEtudiant+"adresseEtudiant"+adresseEtudiant+
                "numeroTelFixeEtudiant"+numeroTelFixeEtudiant+"numeroTel"
                + "MobilEtudiant"+numeroTelMobilEtudiant+"mailEtudiant"+
                "nomClasseEtudiant"+nomClasseEtudiant+")";
    }

   
}
