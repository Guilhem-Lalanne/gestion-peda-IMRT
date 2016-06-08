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
    private String numeroTelFixeEtudiant;
    private String numeroTelMobilEtudiant;
    private String mailEtudiant;
    private int idClasse;
    
    /**
     * 
     * @param nomEtudiant
     * @param prenomEtudiant
     * @param dateNaissanceEtudiant
     * @param adresseEtudiant
     * @param numeroTelFixeEtudiant
     * @param numeroTelMobilEtudiant
     * @param mailEtudiant 
     */
  
    public Etudiant(int idEtudiant,String nomEtudiant, 
            String prenomEtudiant, 
            String dateNaissanceEtudiant, 
            String adresseEtudiant, 
            String numeroTelFixeEtudiant, 
            String numeroTelMobilEtudiant, 
            String mailEtudiant) {
        this.idEtudiant =  idEtudiant;
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

    public Etudiant(int idEtudiant, int idGroupe, String nomEtudiant, String prenomEtudiant, String dateNaissanceEtudiant, String adresseEtudiant, String numeroTelFixeEtudiant, String numeroTelMobilEtudiant, String mailEtudiant, int idClasse) {
        this.idEtudiant = idEtudiant;
        this.idGroupe = idGroupe;
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
        this.adresseEtudiant = adresseEtudiant;
        this.numeroTelFixeEtudiant = numeroTelFixeEtudiant;
        this.numeroTelMobilEtudiant = numeroTelMobilEtudiant;
        this.mailEtudiant = mailEtudiant;
        this.idClasse = idClasse;
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

    public String getMailEtudiant() {
        return mailEtudiant;
    }

    public void setMailEtudiant(String mailEtudiant) {
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
        return "Etudiant{" + "idEtudiant=" + idEtudiant + ", idGroupe=" + idGroupe + ", idClasse=" + idClasse + ", nomEtudiant=" + nomEtudiant + ", prenomEtudiant=" + prenomEtudiant + ", dateNaissanceEtudiant=" + dateNaissanceEtudiant + ", adresseEtudiant=" + adresseEtudiant + ", numeroTelFixeEtudiant=" + numeroTelFixeEtudiant + ", numeroTelMobilEtudiant=" + numeroTelMobilEtudiant + ", mailEtudiant=" + mailEtudiant + '}';
    }


}
