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
import java.util.ArrayList;
import java.util.List;
import metier.Enseignant;

/**
 *
 * @author paul
 */
public class DaoEnseignant {

    private Connection cnx;

    public DaoEnseignant(Connection cnx) {
        this.cnx = cnx;
    }

    public void getEnseignant(List<Enseignant> enseignant) throws SQLException {

        String requete = "select * from v_enseignant";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);

        while (rset.next()) {       // traitement du résulat
            int idEnseignant;
            String prenomEnseignant;
            String nomEnseignant;
            int idDiscipline;
            String dateNaissanceEnseignant;
            String adresseEnseignant;
            String numeroTelFixeEnseignant;
            String numeroTelMobilEnseignant;
            int mailEnseignant;
            String profession;
            int idEmployeur;
            Boolean docAdmPhotoCarteNat;
            Boolean docAdmPhotoCarteSecu;
            Boolean docAdmJustTrav;
            Boolean docAdmRecepArreteNomin;
            String userLogin = rset.getString(1);
            String userNom = rset.getString(2);
            String userGroupe = rset.getString(3);
            Enseignant.add(new Enseignant());

        }

        rset.close();
        pstmt.close();

    }
}
