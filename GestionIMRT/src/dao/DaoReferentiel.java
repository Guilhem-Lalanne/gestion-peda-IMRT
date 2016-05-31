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
import metier.Referentiel;

/**
 *
 * @author Mateusz
 */
public class DaoReferentiel {
    
    private Connection cnx;
    
    public DaoReferentiel(Connection cnx) {
        this.cnx = cnx;
    }
    

    public void getUserGroupes(List<Referentiel> ref) throws SQLException {
        
        //string avec la requete
        String requete = "select * from REF_USER_GROUPE";
        
        //je prepare la requete pour lancer
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        
        //je lance ma requete
        ResultSet rset = pstmt.executeQuery(requete);
        
        while (rset.next()) {       // traitement du résulat
            ref.add(new Referentiel(rset.getInt(1), rset.getString(2)));
        }
        
        rset.close();
        pstmt.close();
        
    }

  
    
}
