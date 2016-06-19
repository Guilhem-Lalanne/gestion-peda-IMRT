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
import java.util.List;
import metier.Cours;

/**
 *
 * @author Mateusz
 */
public class DaoCours {
    
    private Connection cnx;
    
    public DaoCours(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void getCours(List<Cours> crs) throws SQLException {
        
        String requete = "select c.id,c.ID_ENSEIGNANT,c.ID_GROUPE,c.ID_UE," +
                        "'class: ' || cc.NOM || ' groupe: ' || g.CODE," +
                        "u.NOM_UE," +
                        "e.NOM || ' ' || e.PRENOM" +
                        " " +
                        "from gi_cours c " +
                        "inner join GI_ENSEIGNANT e on c.ID_ENSEIGNANT = e.id " +
                        "inner join gi_ue u on c.ID_UE = u.ID " +
                        "inner join GI_GROUPE g on c.ID_GROUPE = g.id " +
                        "inner join GI_CLASSE cc on g.ID_CLASS = cc.ID ";
        
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        
        while (rset.next()) {       // traitement du résulat
            crs.add(new Cours(rset.getInt(1),
                    rset.getInt(2),
                    rset.getInt(3),
                    rset.getInt(4),
                    rset.getString(5),
                    rset.getString(6),
                    rset.getString(7)));
        }
        
        rset.close();
        pstmt.close();
        
    }
    
    public void getCoursParGroupe(List<Cours> crs, int id_groupe) throws SQLException {
        
        String requete = "select c.id,c.ID_ENSEIGNANT,c.ID_GROUPE,c.ID_UE," +
                        "'class: ' || cc.NOM || ' groupe: ' || g.CODE," +
                        "u.NOM_UE," +
                        "e.NOM || ' ' || e.PRENOM" +
                        " " +
                        "from gi_cours c " +
                        "inner join GI_ENSEIGNANT e on c.ID_ENSEIGNANT = e.id " +
                        "inner join gi_ue u on c.ID_UE = u.ID " +
                        "inner join GI_GROUPE g on c.ID_GROUPE = g.id " +
                        "inner join GI_CLASSE cc on g.ID_CLASS = cc.ID "
                + " where c.id_groupe = ? ";
        
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        
        pstmt.setInt(1, id_groupe);
        
        tools.debug("req cours");
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            crs.add(new Cours(rset.getInt(1),
                    rset.getInt(2),
                    rset.getInt(3),
                    rset.getInt(4),
                    rset.getString(5),
                    rset.getString(6),
                    rset.getString(7)));
        }
        
        rset.close();
        pstmt.close();
        
    }
    
    public void insertCours(Cours c) throws SQLException {
        
        String requete = "insert into gi_cours (id_enseignant,id_ue,id_groupe)"
                + " values (?,?,?)";
        String generatedColumns[] = { "ID" };
        PreparedStatement pstmt = cnx.prepareStatement(requete, generatedColumns);
        pstmt.setInt(1, c.getIdEnseignant());
        pstmt.setInt(2, c.getIdIe());
        pstmt.setInt(3, c.getIdGroupe());

        pstmt.executeUpdate();
        
        try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                c.setIdCours((int) generatedKeys.getInt(1));
            }
            else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
        
        pstmt.close();
    }
    
    
}
