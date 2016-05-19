/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Date;

/**
 *
 * @author paul
 */
public class Seance {
    private int idSeance;
    private Date date;
    private int idCours;
    private int idSalle;
    private int heureDebut;
    private int heureFin;

    public Seance(int idSeance, Date date, int idCours, int idSalle, int heureDebut, int heureFin) {
        this.idSeance = idSeance;
        this.date = date;
        this.idCours = idCours;
        this.idSalle = idSalle;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public Seance(Date date, int idCours, int idSalle, int heureDebut, int heureFin) {
        this.date = date;
        this.idCours = idCours;
        this.idSalle = idSalle;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }
    
}
