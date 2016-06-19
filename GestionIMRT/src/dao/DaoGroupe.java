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
    

    public void getGroupes(List<Groupe> groupes, String Promotion, int idClasse) throws SQLException {
        
        String requete = "select g.id,g.id_class,g.code,c.nom,"
                + " p.nom_promotion || ' ' || c.nom  from gi_groupe g"
                + " inner join gi_classe c on g.id_class = c.id "
                + " inner join gi_promotion p on c.id_promotion = p.id "
                + " where p.annee = ? and c.id = ? ";
                        
        try (PreparedStatement pstmt = cnx.prepareStatement(requete)) {
            
            tools.debug("pro:" + Promotion);
            pstmt.setString(1, Promotion);
            pstmt.setInt(2, idClasse);
            
            tools.debug(requete);
            
            try (ResultSet rset = pstmt.executeQuery()) {
                while (rset.next()) {       // traitement du résulat
                    
                    groupes.add( new Groupe(
                            rset.getInt(1),
                            rset.getInt(2),
                            rset.getString(3),
                            rset.getString(4),
                            rset.getString(5)
                            )
                    );
                    
                }
            }
        }
        
    }

    public void insertGroupe(Groupe g) throws SQLException {
        
        String requete = "insert into gi_groupe (id_class,code)"
                + " values (?,?)";
        String generatedColumns[] = { "ID" };
        PreparedStatement pstmt = cnx.prepareStatement(requete, generatedColumns);
        
        pstmt.setInt(1, g.getIdClasse());
        pstmt.setString(2, g.getNom());

        pstmt.executeUpdate();
        
        try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                g.setIdGroupe((int) generatedKeys.getInt(1));
            }
            else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
        
        pstmt.close();
        
    }
    
    
}
