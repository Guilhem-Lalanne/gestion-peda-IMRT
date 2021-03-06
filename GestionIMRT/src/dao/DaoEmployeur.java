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
import metier.Employeur;

/**
 *
 * @author paul
 */
public class DaoEmployeur {

    private Connection cnx;

    public DaoEmployeur(Connection cnx) {
        this.cnx = cnx;
    }

    public void getEmployeur(List<Employeur> employeur) throws SQLException {

        String req = "select * from V_LISTE_EMPLOYEUR";
        PreparedStatement pstmt = cnx.prepareStatement(req);

        ResultSet rset = pstmt.executeQuery();

        while (rset.next()) {       // traitement du résulat

            int idEmployeur = rset.getInt(1);
            String nomEmployeur = rset.getString(2);
            String adresseEmployeur = rset.getString(3);
            
            Employeur emp = new Employeur(idEmployeur, nomEmployeur, adresseEmployeur);
            employeur.add(emp);
        }

        rset.close();
        pstmt.close();

    }
}
