/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;

/**
 *
 * @author p0606160
 */
public class DaoEtudiant {
    
    private Connection cnx;
    
    public DaoEtudiant (Connection cnx) {
        this.cnx = cnx;
    }
    
}
