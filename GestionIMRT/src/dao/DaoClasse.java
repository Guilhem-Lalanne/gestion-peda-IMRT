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
import java.sql.Statement;
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
    
    public void getClasses(List<Classe> classes) throws SQLException {
        
        String requete = "select g.id,g.id_promotion,g.code,g.nom,"
                + "p.nom_promotion,p.annee "
                + "from gi_classe g "
                + " inner join gi_promotion p on g.id_promotion = p.id ";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        
        while (rset.next()) {       // traitement du résulat
            
            classes.add(new Classe(
                    rset.getInt(1),
                    rset.getInt(2),
                    rset.getString(3),
                    rset.getString(4),
                    rset.getString(5)));
        }
        
        rset.close();
        pstmt.close();
        
    }
    
    public void insertClasse(Classe c) throws SQLException {
        
        String requete = "insert into gi_classe (id_promotion,code,nom)"
                + " values (?,?,?)";
        String generatedColumns[] = { "ID" };
        PreparedStatement pstmt = cnx.prepareStatement(requete, generatedColumns);
        pstmt.setInt(1, c.getIdPromotion());
        pstmt.setString(2, c.getCode());
        pstmt.setString(3, c.getNom());

        pstmt.executeUpdate();
        
        try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                c.setIdClasse((int) generatedKeys.getInt(1));
            }
            else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
        
        pstmt.close();
    }
    
    
}
