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
    
    private ArrayList<User> users;
    private Connection cnx;
    
    public daoUser(Connection cnx) {
        this.cnx = cnx;
    }

    public void getUsers(List<User> leConteneur) throws SQLException {
        
        String requete = "select login,user_nom as fullname from gi_users";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        
        while (rset.next()) {       // traitement du résulat
            
            String userLogin = rset.getString("login");
            String userFullname = rset.getString("fullname");
            users.add(new User(userLogin, userFullname));
            
        }
        
        rset.close();
        pstmt.close();
        
    }
    
}
