/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import appli.tools;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.User;

/**
 *
 * @author Mateusz
 */
public class DaoUser {
    
    private Connection cnx;
    
    public DaoUser(Connection cnx) {
        this.cnx = cnx;
    }

    public void getUsers(List<User> users) throws SQLException {
        
        String requete = "select * from v_liste_users";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        
        while (rset.next()) {       // traitement du résulat
            
            String userLogin = rset.getString(1);
            String userNom = rset.getString(2);
            int userGroupe = rset.getInt(3);
            String userGroupeLib = rset.getString(4);
            
            users.add(new User(userLogin, userNom, userGroupe, userGroupeLib));
            
        }
        
        rset.close();
        pstmt.close();
        
    }
    /**
     * TODO: description
     * 
     * @param login
     * @return
     * @throws SQLException 
     */
    public User getUser(String login) throws SQLException {
        
        String req = "select u.user_groupe,u.user_nom,r.libelle "
                + " from gi_users u inner join ref_user_groupe r on u.user_groupe = r.id "
                + "where u.login = ?";
        PreparedStatement pstmt = cnx.prepareStatement(req);
        
        tools.debug(req);
        
        User currentUser = new User();
        
        pstmt.setString(1, login);
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            
            currentUser.setLogin(login);
            currentUser.setGroupe(rset.getInt(1));
            currentUser.setFullname(rset.getString(2));
            currentUser.setGroupeLibelle(rset.getString(3));
            
                    
        }
        
        rset.close();
        pstmt.close();
        
        return currentUser;
        
    }
    
}
