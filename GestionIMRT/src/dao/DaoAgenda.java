/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import appli.tools;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.LigneAgenda;
import metier.Seance;

/**
 *
 * @author paul
 */
public class DaoAgenda {

    private Connection cnx;

    public DaoAgenda(Connection cnx) {
        this.cnx = cnx;
    }

    public void getSeances(List<Seance> listSeances, String date_debut, String date_fin) throws SQLException {
        
        String req = "select s.*,'UE:' || u.NO_UE || ' Salle: ' || sl.NOM_SALLE || ' Groupe: ' || g.CODE || ' ' || cc.NOM " +
                    "from gi_seance s " +
                    "inner join gi_cours c on s.id_cours = c.id " +
                    "inner join GI_ENSEIGNANT e on c.ID_ENSEIGNANT = e.id " +
                    "inner join gi_ue u on c.ID_UE = u.ID " +
                    "inner join GI_SALLE sl on s.ID_SALLE = sl.id " +
                    "inner join GI_GROUPE g on c.ID_GROUPE = g.id " +
                    "inner join GI_CLASSE cc on g.ID_CLASS = cc.ID "
                + "where s.date_seance >= ? and s.date_seance <= ?";
        
        //tools.debug(req);
        
        PreparedStatement pstmt = cnx.prepareStatement(req);
        pstmt.setDate(1, Date.valueOf(date_debut));
        pstmt.setDate(2, Date.valueOf(date_fin));
        
        ResultSet rset = pstmt.executeQuery();

        while (rset.next()) {       // traitement du résulat

            Seance s = new Seance(rset.getInt(1),
                                  rset.getString(2),
                                  rset.getInt(3),
                                  rset.getInt(4),
                                  rset.getInt(5),
                                  rset.getInt(6),
                                    rset.getString(7));
            
            listSeances.add(s);
        }

        rset.close();
        pstmt.close();
        
    }
    
    public void getSeanceUnique(Seance s, int id_seance) throws SQLException {
        
        String req = "select * from "
                + "gi_seance inner join gi_cours c on s.id_cours = c.id "
                + " "
                + "where id = ?";
        
        PreparedStatement pstmt = cnx.prepareStatement(req);
        pstmt.setInt(1, id_seance);
        
        ResultSet rset = pstmt.executeQuery();

        while (rset.next()) {       // traitement du résulat

            s = new Seance(rset.getInt(1),
                    rset.getString(2),
                    rset.getInt(3),
                    rset.getInt(4),
                    rset.getInt(5),
                    rset.getInt(6));
        }

        rset.close();
        pstmt.close();
    }
    
    public void updateSeance() {
        
    }

}
