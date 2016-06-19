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
public class Groupe {
    
    private int idGroupe;
    private int idClasse;
    private String nom;
    private String nomClasse;
    
    private String classFullname;

    public String getClassFullname() {
        return classFullname;
    }

    public void setClassFullname(String classFullname) {
        this.classFullname = classFullname;
    }

    public Groupe() {
        
    }
    
    public Groupe(int idGroupe, int idClasse, String nom, String nomClasse, String classFullname ) {
        this.idClasse = idClasse;
        this.nom = nom;
        this.idGroupe = idGroupe;
        this.nomClasse = nomClasse;
        this.classFullname = classFullname;
    }

    public int getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(int idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public int getIsGroupe() {
        return idGroupe;
    }

    public void setIsGroupe(int isGroupe) {
        this.idGroupe = isGroupe;
    }

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Groupe{" + "idGroupe=" + idGroupe + ", idClasse=" + idClasse + ", nom=" + nom + ", nomClasse=" + nomClasse + ", classFullname=" + classFullname + '}';
    }

        
}
