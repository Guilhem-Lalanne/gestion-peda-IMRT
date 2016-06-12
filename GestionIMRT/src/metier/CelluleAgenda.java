/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Mateusz
 */
public class CelluleAgenda {
    
    String value;
    
    int day;
    int heure;
    
    public CelluleAgenda(int d, int h) {
        
        
        day = d;
        heure = h;
        
        
        value = d+" "+h;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
