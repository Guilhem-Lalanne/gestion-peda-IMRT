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
public class Enseignant extends Personne{
    private String idEnseignat;
    private String idDiscipline;
    private String profession;
    private String idEmployeur;
    private Boolean docAdmPhotoCarteNat;
    private Boolean docAdmPhotoCarteSecu;
    private Boolean docAdmJustTrav;
    private Boolean docAdmRecepArreteNomin;

    public Enseignant(String idDiscipline, String profession, String idEmployeur, Boolean docAdmPhotoCarteNat, Boolean docAdmPhotoCarteSecu, Boolean docAdmJustTrav, Boolean docAdmRecepArreteNomin, String nom, String prenom, String dateNaissance, String adresse, String numeroTelFixe, String numeroTelMobile, String mail) {
        super(nom, prenom, dateNaissance, adresse, numeroTelFixe, numeroTelMobile, mail);
        this.idDiscipline = idDiscipline;
        this.profession = profession;
        this.idEmployeur = idEmployeur;
        this.docAdmPhotoCarteNat = docAdmPhotoCarteNat;
        this.docAdmPhotoCarteSecu = docAdmPhotoCarteSecu;
        this.docAdmJustTrav = docAdmJustTrav;
        this.docAdmRecepArreteNomin = docAdmRecepArreteNomin;
    }

    public String getIdEnseignat() {
        return idEnseignat;
    }

    public void setIdEnseignat(String idEnseignat) {
        this.idEnseignat = idEnseignat;
    }

    public String getIdDiscipline() {
        return idDiscipline;
    }

    public void setIdDiscipline(String idDiscipline) {
        this.idDiscipline = idDiscipline;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getIdEmployeur() {
        return idEmployeur;
    }

    public void setIdEmployeur(String idEmployeur) {
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
