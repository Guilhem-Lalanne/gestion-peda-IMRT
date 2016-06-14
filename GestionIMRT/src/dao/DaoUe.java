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
import metier.Ue;

/**
 *
 * @author paul
 */
public class DaoUe {
  private Connection cnx;

    public DaoUe(Connection cnx) {
        this.cnx = cnx;
    }
   public void getLisetUe(List<Ue> ues) throws SQLException {

        String req = "select * from gi_ue";
        PreparedStatement pstmt = cnx.prepareStatement(req);

        ResultSet rset = pstmt.executeQuery();

        while (rset.next()) {       // traitement du résulat

            int idUe = rset.getInt(1);
            String nomUe= rset.getString(2);
            String noUe = rset.getString(3);
            int idSemestre=rset.getInt(4); 
            int nbHeureEtudiant=rset.getInt(4);
            
            
            ues.add(new Ue(idUe,nomUe,noUe,idSemestre,nbHeureEtudiant));
        }

        rset.close();
        pstmt.close();

    }
}
