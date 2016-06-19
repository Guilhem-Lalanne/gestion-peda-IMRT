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
import metier.Salle;

/**
 *
 * @author paul
 */
public class DaoSalle {
    
  private Connection cnx;

    public DaoSalle(Connection cnx) {
        this.cnx = cnx;
    }
    
   public void getSalles(List<Salle> ues) throws SQLException {

        String req = "select * from gi_salle";
        PreparedStatement pstmt = cnx.prepareStatement(req);

        ResultSet rset = pstmt.executeQuery();

        while (rset.next()) {       // traitement du résulat

            ues.add(new Salle(rset.getInt(1), rset.getString(2)));
        }

        rset.close();
        pstmt.close();

    }
   
   public void insertSalle(Salle s) throws SQLException {
        
        String requete = "insert into gi_salle (id,nom_salle)"
                + " values (?,?)";
        String generatedColumns[] = { "ID" };
        PreparedStatement pstmt = cnx.prepareStatement(requete, generatedColumns);
        
        pstmt.setInt(1, s.getIdSalle());
        pstmt.setString(2, s.getNomSalle());

        pstmt.executeUpdate();
        
        try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                s.setIdSalle((int) generatedKeys.getInt(1));
            }
            else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
        
        pstmt.close();
        
    }
}
