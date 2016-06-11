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
public class LigneAgenda {
    
    public int line;
    public CelluleAgenda lundi;
    public CelluleAgenda mardi;
    public CelluleAgenda mercredi;
    public CelluleAgenda jeudi;
    public CelluleAgenda vendredi;
    
    public String Heure;
    

    public LigneAgenda(int i) {
        
        line = i;
        
        //Je crée les jours
        lundi = new CelluleAgenda();
        mardi = new CelluleAgenda();
        mercredi = new CelluleAgenda();
        jeudi = new CelluleAgenda();
        vendredi = new CelluleAgenda();
        
        Heure = convertHeure(Integer.toString(i));
        
    }

    public String getHeure() {
        return this.Heure;
    }
    
    public String convertHeure(String a) {
        return String.format("%2s", a).replace(' ', '0') + ":00";
    }
    
}
