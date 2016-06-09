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

        String requete = "select * from gi_enseignant";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);
        
        while (rset.next()) {       // traitement du résulat
            
            int idEnseignant                = rset.getInt(1);
            String prenomEnseignant         = rset.getString(2);
            String nomEnseignant            = rset.getString(3);
            int idDiscipline                = rset.getInt(4);
            String dateNaissanceEnseignant  = rset.getString(5);
            String adresseEnseignant        = rset.getString(6);
            String numeroTelFixeEnseignant  = rset.getString(7);
            String numeroTelMobilEnseignant = rset.getString(8);
            String mailEnseignant           = rset.getString(9);
            String profession               = rset.getString(10);
            int idEmployeur                 = rset.getInt(11);
            int docAdmPhotoCarteNat         = rset.getInt(12);
            int docAdmPhotoCarteSecu        = rset.getInt(13);
            int docAdmJustTrav              = rset.getInt(14);
            int docAdmRecepArreteNomin      = rset.getInt(15);
            
            
            Enseignant en = new Enseignant(idEnseignant,
                    prenomEnseignant,
                    nomEnseignant,
                    idDiscipline,
                    dateNaissanceEnseignant,
                    adresseEnseignant,
                    numeroTelFixeEnseignant,
                    numeroTelMobilEnseignant,
                    mailEnseignant, 
                    profession,
                    idEmployeur,
                    docAdmPhotoCarteNat,
                    docAdmPhotoCarteSecu,
                    docAdmJustTrav,
                    docAdmRecepArreteNomin);
            
            enseignant.add(en);
                    
        }

        rset.close();
        pstmt.close();

    }

     public void setEnseignant(Enseignant ens) throws SQLException {
         /*

        String requete = "insert into gi_enseignant (prenom,nom,ID_DISCIPLINE,DATE_NAISSANCE,"
                + "ADRESSE,NUMERO_TEL_FIXE,NUMERO_TEL_MOBILE,MAIL,PROFFESION"
                + "ID_EMPLOYEUR,DOC_ADM_PHOTO_CARTE_NA,DOC_ADM_PHOTO_CARTE_SECU,"
                + "DOC_ADM_JUST_TRAV,DOC_ADM_RECEP_ARRETE_NOMIN) values (?,?,?,?,?,?"
                + ",?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = cnx.prepareStatement(requete);
        pstmt.setString(2, ens.getPrenomEnseignant());
        pstmt.setString(3, ens.getNomEnseignant());
        pstmt.setInt(4, ens.getIdDiscipline());
        pstmt.setString(5, ens.getDateNaissanceEnseignant());
        pstmt.setString(6, ens.getAdresseEnseignant());
        pstmt.setString(7, ens.getNumeroTelFixeEnseignant());
        pstmt.setString(8, ens.getNumeroTelMobilEnseignant());
        pstmt.setString(9, ens.getProfession());
        pstmt.setInt(10, ens.getIdEmployeur());
        pstmt.setInt(11, ens.getDocAdmPhotoCarteNat());
        pstmt.setInt(12, ens.getDocAdmPhotoCarteSecu());
        pstmt.setInt(13, ens.getDocAdmJustTrav());
        pstmt.setInt(14, ens.getDocAdmRecepArreteNomin());
        pstmt.executeUpdate();

}
        pstmt.close();*/
    } 
}

