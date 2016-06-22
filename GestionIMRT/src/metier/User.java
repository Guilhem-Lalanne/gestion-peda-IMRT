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

    //proprietes de base
    public String login;
    public int groupe;
    public String motDePasse;
    public String userNom;
    
    //propietes supplemendaires
    public String groupeLibelle;

    public String getUserNom() {
        return userNom;
    }

    public void setUserNom(String userNom) {
        this.userNom = userNom;
    }

    public String getGroupeLibelle() {
        return groupeLibelle;
    }

    public void setGroupeLibelle(String groupeLibelle) {
        this.groupeLibelle = groupeLibelle;
    }
    
    public User() {
        //init constructor
    }

    public User(String userLogin, String userFullname, int userGroupe, String userGroupeLib) {
        this.login = userLogin;
        this.userNom = userFullname;
        this.groupe = userGroupe;
        this.groupeLibelle = userGroupeLib;
    }
    
    public String getLogin() {
        return login;
    }

    public int getGroupe() {
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

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setFullname(String fullname) {
        this.userNom = fullname;
    }
    
    public String toString() {
        return this.login+" "+this.userNom+" "+this.groupeLibelle;
    }
    
    public int[] getOngletsGroupes() {
        
        /**
         * Groupes
         *  1	Admin
            2	Secrétaire
            3	User
            4	Dev
         */
        
        /* Onglets
        0 - accueil
        1 - Agenda
        2 - Gestion des étudiants
        3 - Gestion des enseignants
        4 - Gestion des examens
        5 - Gestion des users
        */
        int[] ret = new int[6];
        
        ret[0] = 0;
        ret[1] = 0;
        ret[2] = 0;
        ret[3] = 0;
        ret[4] = 0;
        ret[5] = 0;
        
        //TODO: mettre ça comme il faut dans produit final
        
        switch (this.groupe) {
            case 1:
                //ADMIN
                for (int i=0;i<=5;i++) ret[i] = 1;
                break;
            case 2:
                //Secrétaire
                for (int i=0;i<=4;i++) ret[i] = 1;
                break;
            case 3:
                //User
                for (int i=0;i<=2;i++) ret[i] = 1;
                break;
            case 4:
                //dev
                for (int i=0;i<=5;i++) ret[i] = 1;
                break;
            default:
                break;
        }
        
        return ret;
        
    }
     
    
    
}
