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
        
        String req = "select * from gi_seance where date_seance >= ? and date_seance <= ?";
        
        tools.debug(req);
        
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
                                  rset.getInt(6));
            
            listSeances.add(s);
        }

        rset.close();
        pstmt.close();
        
    }

}
