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
import java.util.ArrayList;
import java.util.List;
import metier.User;

/**
 *
 * @author Mateusz
 */
public class daoUser {
    
    private Connection cnx;
    
    public daoUser(Connection cnx) {
        this.cnx = cnx;
    }

    public void getUsers(List<User> users) throws SQLException {
        
        String requete = "select * from v_liste_users";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        
        while (rset.next()) {       // traitement du résulat
            
            String userLogin = rset.getString(1);
            String userNom = rset.getString(2);
            String userGroupe = rset.getString(3);
            users.add(new User(userLogin, userNom, userGroupe));
            
        }
        
        rset.close();
        pstmt.close();
        
    }
    
}
