/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *classe Etudiant herite de la classe personne
 * @author paul
 */
public class Etudiant extends Personne {
    private String idEtudient;
    private String idGroupe;
    private String idClasse;
/**
 * construceur de la classe Etudiant
 * @param idGroupe
 * @param idClasse
 * @param nom
 * @param prenom
 * @param dateNaissance
 * @param adresse
 * @param numeroTelFixe
 * @param numeroTelMobile
 * @param mail 
 */
    public Etudiant(String idGroupe, String idClasse, String nom, String prenom, String dateNaissance, String adresse, String numeroTelFixe, String numeroTelMobile, String mail) {
        super(nom, prenom, dateNaissance, adresse, numeroTelFixe, numeroTelMobile, mail);
        this.idGroupe = idGroupe;
        this.idClasse = idClasse;
    }

    public String getIdEtudient() {
        return idEtudient;
    }

    public void setIdEtudient(String idEtudient) {
        this.idEtudient = idEtudient;
    }

    public String getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(String idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(String idClasse) {
        this.idClasse = idClasse;
    }
    
}
