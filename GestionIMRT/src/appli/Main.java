/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appli;

import dao.SourceOracle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import vue.FenetreLogin;

/**
 *
 * @author p1313137
 */
public class Main {
    
    public static Connection cnx;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, SQLException {
        
        //je lance le fenetre principale
        
        cnx = SourceOracle.getConnextion();
        
        FenetreLogin fl = new FenetreLogin(Main.cnx);
        
        fl.setVisible(true);
        
        

        
    }
    
}
