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
public class Enseignant {

    private int idEnseignant;
    private String prenomEnseignant;
    private String nomEnseignant;
    private int idDiscipline;
    private String dateNaissanceEnseignant;
    private String adresseEnseignant;
    private String numeroTelFixeEnseignant;
    private String numeroTelMobilEnseignant;
    private int mailEnseignant;
    private String profession;
    private int idEmployeur;
    private Boolean docAdmPhotoCarteNat;
    private Boolean docAdmPhotoCarteSecu;
    private Boolean docAdmJustTrav;
    private Boolean docAdmRecepArreteNomin;

    public Enseignant(String prenomEnseignant, String nomEnseignant, String dateNaissanceEnseignant, String adresseEnseignant, String numeroTelFixeEnseignant, String numeroTelMobilEnseignant, int mailEnseignant, String profession, int idEmployeur, Boolean docAdmPhotoCarteNat, Boolean docAdmPhotoCarteSecu, Boolean docAdmJustTrav, Boolean docAdmRecepArreteNomin) {
        this.prenomEnseignant = prenomEnseignant;
        this.nomEnseignant = nomEnseignant;
        this.dateNaissanceEnseignant = dateNaissanceEnseignant;
        this.adresseEnseignant = adresseEnseignant;
        this.numeroTelFixeEnseignant = numeroTelFixeEnseignant;
        this.numeroTelMobilEnseignant = numeroTelMobilEnseignant;
        this.mailEnseignant = mailEnseignant;
        this.profession = profession;
        this.idEmployeur = idEmployeur;
        this.docAdmPhotoCarteNat = docAdmPhotoCarteNat;
        this.docAdmPhotoCarteSecu = docAdmPhotoCarteSecu;
        this.docAdmJustTrav = docAdmJustTrav;
        this.docAdmRecepArreteNomin = docAdmRecepArreteNomin;
    }

    public Enseignant(int idEnseignant, String prenomEnseignant, String nomEnseignant, int idDiscipline, String dateNaissanceEnseignant, String adresseEnseignant, String numeroTelFixeEnseignant, String numeroTelMobilEnseignant, int mailEnseignant, String profession, int idEmployeur, Boolean docAdmPhotoCarteNat, Boolean docAdmPhotoCarteSecu, Boolean docAdmJustTrav, Boolean docAdmRecepArreteNomin) {
        this.idEnseignant = idEnseignant;
        this.prenomEnseignant = prenomEnseignant;
        this.nomEnseignant = nomEnseignant;
        this.idDiscipline = idDiscipline;
        this.dateNaissanceEnseignant = dateNaissanceEnseignant;
        this.adresseEnseignant = adresseEnseignant;
        this.numeroTelFixeEnseignant = numeroTelFixeEnseignant;
        this.numeroTelMobilEnseignant = numeroTelMobilEnseignant;
        this.mailEnseignant = mailEnseignant;
        this.profession = profession;
        this.idEmployeur = idEmployeur;
        this.docAdmPhotoCarteNat = docAdmPhotoCarteNat;
        this.docAdmPhotoCarteSecu = docAdmPhotoCarteSecu;
        this.docAdmJustTrav = docAdmJustTrav;
        this.docAdmRecepArreteNomin = docAdmRecepArreteNomin;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public String getPrenomEnseignant() {
        return prenomEnseignant;
    }

    public void setPrenomEnseignant(String prenomEnseignant) {
        this.prenomEnseignant = prenomEnseignant;
    }

    public String getNomEnseignant() {
        return nomEnseignant;
    }

    public void setNomEnseignant(String nomEnseignant) {
        this.nomEnseignant = nomEnseignant;
    }

    public int getIdDiscipline() {
        return idDiscipline;
    }

    public void setIdDiscipline(int idDiscipline) {
        this.idDiscipline = idDiscipline;
    }

    public String getDateNaissanceEnseignant() {
        return dateNaissanceEnseignant;
    }

    public void setDateNaissanceEnseignant(String dateNaissanceEnseignant) {
        this.dateNaissanceEnseignant = dateNaissanceEnseignant;
    }

    public String getAdresseEnseignant() {
        return adresseEnseignant;
    }

    public void setAdresseEnseignant(String adresseEnseignant) {
        this.adresseEnseignant = adresseEnseignant;
    }

    public String getNumeroTelFixeEnseignant() {
        return numeroTelFixeEnseignant;
    }

    public void setNumeroTelFixeEnseignant(String numeroTelFixeEnseignant) {
        this.numeroTelFixeEnseignant = numeroTelFixeEnseignant;
    }

    public String getNumeroTelMobilEnseignant() {
        return numeroTelMobilEnseignant;
    }

    public void setNumeroTelMobilEnseignant(String numeroTelMobilEnseignant) {
        this.numeroTelMobilEnseignant = numeroTelMobilEnseignant;
    }

    public int getMailEnseignant() {
        return mailEnseignant;
    }

    public void setMailEnseignant(int mailEnseignant) {
        this.mailEnseignant = mailEnseignant;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getIdEmployeur() {
        return idEmployeur;
    }

    public void setIdEmployeur(int idEmployeur) {
        this.idEmployeur = idEmployeur;
    }

    public Boolean getDocAdmPhotoCarteNat() {
        return docAdmPhotoCarteNat;
    }

    public void setDocAdmPhotoCarteNat(Boolean docAdmPhotoCarteNat) {
        this.docAdmPhotoCarteNat = docAdmPhotoCarteNat;
    }

    public Boolean getDocAdmPhotoCarteSecu() {
        return docAdmPhotoCarteSecu;
    }

    public void setDocAdmPhotoCarteSecu(Boolean docAdmPhotoCarteSecu) {
        this.docAdmPhotoCarteSecu = docAdmPhotoCarteSecu;
    }

    public Boolean getDocAdmJustTrav() {
        return docAdmJustTrav;
    }

    public void setDocAdmJustTrav(Boolean docAdmJustTrav) {
        this.docAdmJustTrav = docAdmJustTrav;
    }

    public Boolean getDocAdmRecepArreteNomin() {
        return docAdmRecepArreteNomin;
    }

    public void setDocAdmRecepArreteNomin(Boolean docAdmRecepArreteNomin) {
        this.docAdmRecepArreteNomin = docAdmRecepArreteNomin;
    }

}
