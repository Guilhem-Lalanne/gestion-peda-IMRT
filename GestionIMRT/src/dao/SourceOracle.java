/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import appli.tools;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;
import javax.imageio.stream.FileImageInputStream;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Mateusz
 */
public class SourceOracle {
    
    
    public static Connection getConnextion() throws FileNotFoundException, IOException, SQLException {
        
        FileInputStream f = new FileInputStream("src/dao/connexion.properties");
        
        //on lit le props de la connexion de fichier
        Properties prop = new Properties();
        
        prop.load(f);
        
        OracleDataSource ods = new OracleDataSource();
        
        tools.debug(prop.getProperty("server"));
        
        ods.setDriverType(prop.getProperty("driver"));
        ods.setServiceName(prop.getProperty("service"));
        ods.setServerName(prop.getProperty("server"));
        ods.setPortNumber(Integer.valueOf(prop.getProperty("port")));
        ods.setUser(prop.getProperty("user"));
        ods.setPassword(prop.getProperty("pswd"));
        
        return ods.getConnection();
    }
    
    public static boolean Login(Connection cnx, String userLogin, char[] password) throws SQLException {
        
        CallableStatement cstmt = cnx.prepareCall ("{ ? = call GI_USER_SECURITY.valid_user (?, ?)}");
        
        tools.debug(userLogin + " " + password);
        
        cstmt.registerOutParameter (1, Types.INTEGER);
        cstmt.setString (2, userLogin);  
        cstmt.setString (3, String.valueOf(password)); 
        
        cstmt.execute ();
        
        int result = cstmt.getInt(1);
        
        tools.debug(result);

        return false;
        
    }
    
}
