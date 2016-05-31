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
import metier.Groupe;
import metier.User;

/**
 *
 * @author Mateusz
 */
public class DaoGroupe {
    
    private Connection cnx;
    
    public DaoGroupe(Connection cnx) {
        this.cnx = cnx;
    }
    

    public void getGroupes(List<Groupe> groupes) throws SQLException {
        
        /*
        
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
        pstmt.close();*/
        
    }
    
    
}
