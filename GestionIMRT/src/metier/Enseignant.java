/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *classe Enseignant herite de la classe personne
 * 
 */
public class Enseignant extends Personne{
    private int idEnseignat;
    private int idDiscipline;
    private String profession;
    private int idEmployeur;
    private Boolean docAdmPhotoCarteNat;
    private Boolean docAdmPhotoCarteSecu;
    private Boolean docAdmJustTrav;
    private Boolean docAdmRecepArreteNomin;
 /**
  * constructeur de la classe Enseignant
  * 
  * @param idDiscipline
  * @param profession
  * @param idEmployeur
  * @param docAdmPhotoCarteNat
  * @param docAdmPhotoCarteSecu
  * @param docAdmJustTrav
  * @param docAdmRecepArreteNomin
  * @param nom
  * @param prenom
  * @param dateNaissance
  * @param adresse
  * @param numeroTelFixe
  * @param numeroTelMobile
  * @param mail 
  */
    public Enseignant(int idDiscipline, String profession, int idEmployeur, Boolean docAdmPhotoCarteNat, Boolean docAdmPhotoCarteSecu, Boolean docAdmJustTrav, Boolean docAdmRecepArreteNomin, String nom, String prenom, String dateNaissance, String adresse, String numeroTelFixe, String numeroTelMobile, String mail) {
        super(nom, prenom, dateNaissance, adresse, numeroTelFixe, numeroTelMobile, mail);
        this.idDiscipline = idDiscipline;
        this.profession = profession;
        this.idEmployeur = idEmployeur;
        this.docAdmPhotoCarteNat = docAdmPhotoCarteNat;
        this.docAdmPhotoCarteSecu = docAdmPhotoCarteSecu;
        this.docAdmJustTrav = docAdmJustTrav;
        this.docAdmRecepArreteNomin = docAdmRecepArreteNomin;
    }

    public int getIdEnseignat() {
        return idEnseignat;
    }

    public void setIdEnseignat(int idEnseignat) {
        this.idEnseignat = idEnseignat;
    }

    public int getIdDiscipline() {
        return idDiscipline;
    }

    public void setIdDiscipline(int idDiscipline) {
        this.idDiscipline = idDiscipline;
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

    @Override
    public String toString() {
        return "Enseignant{" + "idEnseignat=" + idEnseignat +
                super.toString()+", idDiscipline=" + idDiscipline + 
                ", profession=" + profession + ", idEmployeur=" + idEmployeur
                + ", docAdmPhotoCarteNat=" + docAdmPhotoCarteNat +
                ", docAdmPhotoCarteSecu=" + docAdmPhotoCarteSecu + 
                ", docAdmJustTrav=" + docAdmJustTrav + ", docAdmRecepArrete"
                + "Nomin=" + docAdmRecepArreteNomin + '}';
    }
    
}
