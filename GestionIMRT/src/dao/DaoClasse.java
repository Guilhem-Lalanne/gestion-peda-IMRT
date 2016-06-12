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
import metier.Classe;
import metier.Groupe;

/**
 *
 * @author Mateusz
 */
public class DaoClasse {
    
    private Connection cnx;
    
    public DaoClasse(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void getClasse(List<Classe> classes) throws SQLException {
        
        String requete = "select * from gi_classe";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        
        while (rset.next()) {       // traitement du résulat
            
            classes.add(new Classe(
                    rset.getInt(1),
                    rset.getInt(2),
                    rset.getString(3),
                    rset.getString(4)));
            
        }
        
        rset.close();
        pstmt.close();
        
    }
    
    
}
