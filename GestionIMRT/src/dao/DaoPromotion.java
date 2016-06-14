package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import metier.Promotion;
import metier.User;

/**
 *
 * @author mholota
 */
public class DaoPromotion {
    
    private Connection cnx;
    
    public DaoPromotion (Connection cnx) {
        this.cnx = cnx;
    }
    
    public Promotion getCurrentPromotion() throws SQLException {
        
        String req = "select * from gi_promotion where id = (select max(id) from gi_promotion)";
        PreparedStatement pstmt = cnx.prepareStatement(req);
        
        Promotion p = new Promotion();
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            
            p.setIdPromotion(rset.getInt(1));
            p.setNomPromotion(rset.getString(2));
            p.setAnnée(rset.getString(3));
            
        }
        
        rset.close();
        pstmt.close();
        
        return p;
        
    }
    
    /**
     * TODO: description
     * 
     * @param promotion
     * @return
     * @throws SQLException 
     */
    public Promotion getPromotion(String promotion) throws SQLException {
        
        String req = "select * from gi_promotion where ANNEE = ?";
        PreparedStatement pstmt = cnx.prepareStatement(req);
        pstmt.setString(1, promotion);
        
        Promotion p = new Promotion();
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            
            p.setIdPromotion(rset.getInt(1));
            p.setNomPromotion(rset.getString(2));
            p.setAnnée(rset.getString(3));
            
        }
        
        rset.close();
        pstmt.close();
        
        return p;
        
    }

    public void getPromotions(List<Promotion> leConteneur) throws SQLException {
        
        String req = "select * from gi_promotion";
        PreparedStatement pstmt = cnx.prepareStatement(req);
        
        ResultSet rset = pstmt.executeQuery();
        
        while (rset.next()) {       // traitement du résulat
            
            Promotion p = new Promotion();
            
            p.setIdPromotion(rset.getInt(1));
            p.setNomPromotion(rset.getString(2));
            p.setAnnée(rset.getString(3));
            
            leConteneur.add(p);
            
        }
        
        rset.close();
        pstmt.close();
        
    }
    
}
