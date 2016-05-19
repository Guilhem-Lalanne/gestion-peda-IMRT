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
    private int isGroupe;
    private int idClasse;
    private String nom;

    public Groupe(int idClasse, String nom) {
        this.idClasse = idClasse;
        this.nom = nom;
    }

    public int getIsGroupe() {
        return isGroupe;
    }

    public void setIsGroupe(int isGroupe) {
        this.isGroupe = isGroupe;
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

   
    
        
}
