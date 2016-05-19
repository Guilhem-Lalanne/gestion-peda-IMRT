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
public class Examen {
      private int idExamen;
      private int idSalle;
      private int idPresence;
      private int idGroupeSurveille;
      private String dateExamen;

    public Examen(int idSalle, int idPresence, int idGroupeSurveille, String dateExamen) {
        this.idSalle = idSalle;
        this.idPresence = idPresence;
        this.idGroupeSurveille = idGroupeSurveille;
        this.dateExamen = dateExamen;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getIdPresence() {
        return idPresence;
    }

    public void setIdPresence(int idPresence) {
        this.idPresence = idPresence;
    }

    public int getIdGroupeSurveille() {
        return idGroupeSurveille;
    }

    public void setIdGroupeSurveille(int idGroupeSurveille) {
        this.idGroupeSurveille = idGroupeSurveille;
    }

    public String getDateExamen() {
        return dateExamen;
    }

    public void setDateExamen(String dateExamen) {
        this.dateExamen = dateExamen;
    }

    
      
}
