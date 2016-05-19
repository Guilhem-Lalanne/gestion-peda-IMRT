/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author paul
 */
public class Salle {
    private int IdSalle;
    private String nomSalle;

    public Salle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    public int getIdSalle() {
        return IdSalle;
    }

    public void setIdSalle(int IdSalle) {
        this.IdSalle = IdSalle;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }
    
}
