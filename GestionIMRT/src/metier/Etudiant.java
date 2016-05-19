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
    private int idEtudient;
    private int idGroupe;
    private int idClasse;

    public Etudiant(int idGroupe, int idClasse, String nom, String prenom, String dateNaissance, String adresse, String numeroTelFixe, String numeroTelMobile, String mail) {
        super(nom, prenom, dateNaissance, adresse, numeroTelFixe, numeroTelMobile, mail);
        this.idGroupe = idGroupe;
        this.idClasse = idClasse;
    }

    public int getIdEtudient() {
        return idEtudient;
    }

    public void setIdEtudient(int idEtudient) {
        this.idEtudient = idEtudient;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }


    @Override
    public String toString() {
        return "Etudiant{" + "idEtudient=" + idEtudient + super.toString()+
                ", idGroupe=" +
                idGroupe + ", idClasse=" + idClasse + '}';
    }
    
}
