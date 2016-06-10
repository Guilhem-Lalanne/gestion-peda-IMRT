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
    private String mailEnseignant;
    private String profession;
    private int idEmployeur;
    private int docAdmPhotoCarteNat;
    private int docAdmPhotoCarteSecu;
    private int docAdmJustTrav;
    private int docAdmRecepArreteNomin;


/**
 * constructeur vide
 */
    
    public Enseignant() {
    }
    
    /**
     * 
     * @param idEnseignant
     * @param prenomEnseignant
     * @param nomEnseignant
     * @param idDiscipline
     * @param dateNaissanceEnseignant
     * @param adresseEnseignant
     * @param numeroTelFixeEnseignant
     * @param numeroTelMobileEnseignant
     * @param mailEnseignant
     * @param profession
     * @param docAdmPhotoCarteNat
     * @param docAdmPhotoCarteSecu
     * @param docAdmJustTrav
     * @param docAdmRecepArreteNomin
     * @param idEmployer 
     */
    public Enseignant(
            int idEnseignant,
            String prenomEnseignant, 
            String nomEnseignant,
            int idDiscipline,
            String dateNaissanceEnseignant, 
            String adresseEnseignant, 
            String numeroTelFixeEnseignant, 
            String numeroTelMobileEnseignant, 
            String mailEnseignant, 
            String profession, 
            int idEmployer,
            int docAdmPhotoCarteNat, 
            int docAdmPhotoCarteSecu, 
            int docAdmJustTrav,
            int docAdmRecepArreteNomin
            ) {
        
        this.idEnseignant               = idEnseignant;
        this.prenomEnseignant           = prenomEnseignant;
        this.nomEnseignant              = nomEnseignant;
        this.idDiscipline               = idDiscipline;
        this.dateNaissanceEnseignant    = dateNaissanceEnseignant;
        this.adresseEnseignant          = adresseEnseignant;
        this.numeroTelFixeEnseignant    = numeroTelFixeEnseignant;
        this.numeroTelMobilEnseignant   = numeroTelMobileEnseignant;
        this.mailEnseignant             = mailEnseignant;
        this.profession                 = profession;
        this.idEmployeur                = idEmployer;
        this.docAdmPhotoCarteNat        = docAdmPhotoCarteNat;
        this.docAdmPhotoCarteSecu       = docAdmPhotoCarteSecu;
        this.docAdmJustTrav             = docAdmJustTrav;
        this.docAdmRecepArreteNomin     = docAdmRecepArreteNomin;
    }

    public Boolean getDocAdmPhotoCarteNat() {
        if (docAdmPhotoCarteNat == 0) {
            return false;
        }
        return true;
    }

    public void setDocAdmPhotoCarteNat(boolean docAdmPhotoCarteNat) {
        if(docAdmPhotoCarteNat==false){
        this.docAdmPhotoCarteNat = 0;
        }
        else{
        this.docAdmPhotoCarteNat = 1;
        }
    }

    public Boolean getDocAdmPhotoCarteSecu() {
        if (docAdmPhotoCarteSecu == 0) {
            return false;
        }
        return true;
    }

    public void setDocAdmPhotoCarteSecu(boolean docAdmPhotoCarteSecu) {
         if(docAdmPhotoCarteSecu==false){
        this.docAdmPhotoCarteSecu = 0;
        }
        else{
        this.docAdmPhotoCarteSecu = 1;
        }
    }

    public Boolean getDocAdmJustTrav() {
        if (docAdmJustTrav == 0) {
            return false;
        }
        return true;
    }

    public void setDocAdmJustTrav(boolean docAdmJustTrav) {
        if(docAdmJustTrav==false){
        this.docAdmJustTrav = 0;
        }
        else{
        this.docAdmJustTrav = 1;
        }
    }

    public Boolean getDocAdmRecepArreteNomin() {
        if (docAdmRecepArreteNomin == 0) {
            return false;
        }
        return true;
    }

    public void setDocAdmRecepArreteNomin(boolean docAdmRecepArreteNomin) {
        if(docAdmRecepArreteNomin==false){
        this.docAdmRecepArreteNomin = 0;
        }
        else{
        this.docAdmRecepArreteNomin = 1;
        }
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

    public String getMailEnseignant() {
        return mailEnseignant;
    }

    public void setMailEnseignant(String mailEnseignant) {
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

    @Override
    public String toString() {
        return "Enseignant{" + "idEnseignant=" + idEnseignant + ", prenomEnseignant=" + prenomEnseignant + ", nomEnseignant=" + nomEnseignant + ", idDiscipline=" + idDiscipline + ", dateNaissanceEnseignant=" + dateNaissanceEnseignant + ", adresseEnseignant=" + adresseEnseignant + ", numeroTelFixeEnseignant=" + numeroTelFixeEnseignant + ", numeroTelMobilEnseignant=" + numeroTelMobilEnseignant + ", mailEnseignant=" + mailEnseignant + ", profession=" + profession + ", idEmployeur=" + idEmployeur + ", docAdmPhotoCarteNat=" + docAdmPhotoCarteNat + ", docAdmPhotoCarteSecu=" + docAdmPhotoCarteSecu + ", docAdmJustTrav=" + docAdmJustTrav + ", docAdmRecepArreteNomin=" + docAdmRecepArreteNomin + '}';
    }

    
   

}
