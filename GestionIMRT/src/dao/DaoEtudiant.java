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
import metier.Etudiant;

/**
 *
 * @author p0606160
 */
public class DaoEtudiant {

    private Connection cnx;

    public DaoEtudiant(Connection cnx) {
        this.cnx = cnx;
    }

    public void getListEtudiants(List<Etudiant> etudiants) throws SQLException {

        // Requete SQL select :
        // TODO créer vue SQL !
        String requete = "select * from GI_ETUDIANT";

        PreparedStatement pstmt = cnx.prepareStatement(requete);
        ResultSet rset = pstmt.executeQuery(requete);

        while (rset.next()) {       // traitement du résulat

            int etuId = rset.getInt(1);
            int etuIdGroupe = rset.getInt(2);
            String etuNom = rset.getString(3);
            String etuPrenom = rset.getString(4);
            String etuDateNaissance = rset.getString(5);
            String etuAdresse = rset.getString(6);
            String etuNumFixe = rset.getString(7);
            String etuNumMobile = rset.getString(8);
            String etuMail = rset.getString(9);
            int etuClasseId = rset.getInt(10);

            etudiants.add(new Etudiant(etuId,etuNom,
                    etuPrenom,
                    etuDateNaissance,
                    etuAdresse,
                    etuNumFixe,
                    etuNumMobile,
                    etuMail,etuClasseId));

        }

        rset.close();
        pstmt.close();

    }
    
    
    public Etudiant getEtudiant(int etuId) throws SQLException {
        
        // TODO : Modif des champs !
        // ie plus intéressant d'avoir le groupe et/ou la classe, imo (Guilhem)
        String req = "select etu.NOM, etu.PRENOM, etu.DATE_NAISSANCE, etu.ADRESSE "
                + " from GI_ETUDIANT etu "
                + "where etu.ID = ?";
        PreparedStatement pstmt = cnx.prepareStatement(req);
        
        tools.debug(req);
        
        Etudiant currentEtu = new Etudiant();
        
        pstmt.setInt(1, etuId);
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            
            currentEtu.setIdEtudiant(etuId);
            currentEtu.setNomEtudiant(rset.getString(1));
            currentEtu.setPrenomEtudiant(rset.getString(2));
            currentEtu.setDateNaissanceEtudiant(rset.getString(3));
            currentEtu.setAdresseEtudiant(rset.getString(4));            
                    
        }
        
        rset.close();
        pstmt.close();
        
        return currentEtu;
        
    }
    public void getEtudiantClasse(List<Etudiant> etudiants,int idClasse) throws SQLException {
        
        // TODO : Modif des champs !
        // ie plus intéressant d'avoir le groupe et/ou la classe, imo (Guilhem)
        String req = "select etu.id,etu.NOM, etu.PRENOM, etu.DATE_NAISSANCE  "
                + " from GI_ETUDIANT etu "
                + "where etu.ID_CLASSE = ?";
        PreparedStatement pstmt = cnx.prepareStatement(req);
        
        tools.debug(req);
        
        Etudiant currentEtu = new Etudiant();
        
        pstmt.setInt(1,idClasse);
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            
            currentEtu.setIdEtudiant(rset.getInt(1));
            currentEtu.setNomEtudiant(rset.getString(2));
            currentEtu.setPrenomEtudiant(rset.getString(3));
            currentEtu.setDateNaissanceEtudiant(rset.getString(4));
             etudiants.add(currentEtu);         
                    
        }
       
        rset.close();
        pstmt.close();
        
       
        
    }

    public void getEtudiantClasse(List<Etudiant> leConteneurEtu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
