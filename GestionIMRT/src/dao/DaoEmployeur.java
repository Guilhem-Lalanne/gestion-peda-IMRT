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
import metier.Employeur;

/**
 *
 * @author paul
 */
public class DaoEmployeur {
      private Connection cnx;
      
     public void getCurrentEmployeur() throws SQLException {
        
        String req = "select * from ";
        PreparedStatement pstmt = cnx.prepareStatement(req);
        
        Employeur emp = new Employeur();
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            
         rset.getInt(1));
            p.setNomPromotion(rset.getString(2));
            p.setAnnée(rset.getString(3));
            
        }
        
        rset.close();
        pstmt.close();
        
        return emp;
        
    }
    
    /**
     * TODO: description
     * 
     * @param promotion
     * @return
     * @throws SQLException 
     */
    public Promotion getPromotion(String promotion) throws SQLException {
        
        String req = "select * from gi_promotion where ANNEE = ?";
        PreparedStatement pstmt = cnx.prepareStatement(req);
        pstmt.setString(1, promotion);
        
        Promotion p = new Promotion();
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            
            p.setIdPromotion(rset.getInt(1));
            p.setNomPromotion(rset.getString(2));
            p.setAnnée(rset.getString(3));
            
        }
        
        rset.close();
        pstmt.close();
        
        return p;
        
    }
    
}
}
