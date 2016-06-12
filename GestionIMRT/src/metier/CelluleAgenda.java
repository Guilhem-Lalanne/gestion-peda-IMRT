/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mateusz
 */
public class CelluleAgenda {
    
    ArrayList<String> listeElements;
    
    public int day;
    public int heure;
    public int id_seance;
    public Date date;
    
    public CelluleAgenda(int d, int h, Date ladate, ArrayList<String> s) {
        day = d;
        heure = h;
        listeElements = s;
        date = ladate;
    }
    
    public String getValue() {
        
        String affichage = "";
        
        for (String s : listeElements) {
            affichage += s;
        }
        
        return affichage;
    }
    
    //private 
}
