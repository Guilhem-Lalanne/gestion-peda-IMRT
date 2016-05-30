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
            int idEnseignant= rset.getInt(1);
            String prenomEnseignant= rset.getString(2);
            String nomEnseignant= rset.getString(3);
            int idDiscipline= rset.getInt(4);
            String dateNaissanceEnseignant= rset.getString(5);
            String adresseEnseignant= rset.getString(6);
            String numeroTelFixeEnseignant = null;
            String numeroTelMobilEnseignant;
            int mailEnseignant = 0;
            String profession = null;
            int idEmployeur;
            Boolean docAdmPhotoCarteNat = null;
            Boolean docAdmPhotoCarteSecu = null;
            Boolean docAdmJustTrav = null;
            Boolean docAdmRecepArreteNomin = null;
            String userLogin = rset.getString(1);
            String userNom = rset.getString(2);
            String userGroupe = rset.getString(3);
            
            Enseignant en = new Enseignant(prenomEnseignant, nomEnseignant,
                    idEnseignant, dateNaissanceEnseignant, adresseEnseignant,
                    numeroTelFixeEnseignant, mailEnseignant, profession,
                    userLogin, adresseEnseignant, docAdmPhotoCarteNat,
                    docAdmPhotoCarteSecu, docAdmJustTrav, docAdmRecepArreteNomin);

        }

        rset.close();
        pstmt.close();

    }
}
