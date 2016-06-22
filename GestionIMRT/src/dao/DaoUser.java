/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        
        String requete = "select * from v_liste_users order by login";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        
        while (rset.next()) {       // traitement du résulat
            
            String userLogin = rset.getString(1);
            String userNom = rset.getString(2);
            int userGroupe = rset.getInt(3);
            String userGroupeString = rset.getString(4);
            users.add(new User(userLogin, userNom, userGroupe, userGroupeString));
            
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
        
        String req = "select user_groupe,user_nom from gi_users where login = ?";
        PreparedStatement pstmt = cnx.prepareStatement(req);
        
        User currentUser = new User();
        
        pstmt.setString(1, login);
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            
            int userGroupe = rset.getInt(1);
            String userNom = rset.getString(2);
            
            currentUser.setLogin(login);
            currentUser.setGroupe(userGroupe);
            currentUser.setFullname(userNom);
                    
        }
        
        rset.close();
        pstmt.close();
        
        return currentUser;
        
    }
    
}
