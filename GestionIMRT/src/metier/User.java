/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Mateusz
 */
public class User {

    public String login;
    public String groupe;   //Mettre objet Groupe.java
    public String motDePasse;
    public String userNom;

    public User(String userLogin, String userFullname, String userGroupe) {
        this.login = userLogin;
        this.userNom = userFullname;
        this.groupe = userGroupe;
    }
    
    public String getLogin() {
        return login;
    }

    public String getGroupe() {
        return groupe;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getFullname() {
        return userNom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setFullname(String fullname) {
        this.userNom = fullname;
    }
    
    
    
}
