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
public class Personne {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String adresse;
    private String numeroTelFixe;
    private String numeroTelMobile;
    private String mail;

    public Personne(String nom, String prenom, String dateNaissance, String adresse, String numeroTelFixe, String numeroTelMobile, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.numeroTelFixe = numeroTelFixe;
        this.numeroTelMobile = numeroTelMobile;
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroTelFixe() {
        return numeroTelFixe;
    }

    public void setNumeroTelFixe(String numeroTelFixe) {
        this.numeroTelFixe = numeroTelFixe;
    }

    public String getNumeroTelMobile() {
        return numeroTelMobile;
    }

    public void setNumeroTelMobile(String numeroTelMobile) {
        this.numeroTelMobile = numeroTelMobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
}
