/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;

/**
 *
 * @author Mateusz
 */
public class CelluleAgenda {
    
    ArrayList<String> listeElements;
    
    int day;
    int heure;
    public int id_seance;
    
    public CelluleAgenda(int d, int h, ArrayList<String> s) {
        day = d;
        heure = h;
        listeElements = s;
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
