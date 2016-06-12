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
    private String date;
    private int idCours;
    private int idSalle;
    private int heureDebut;
    private int heureFin;
    
    private String affichageTable;

    /**
     * Version pour la table
     * 
     * @param idSeance
     * @param date
     * @param idCours
     * @param idSalle
     * @param heureDebut
     * @param heureFin
     * @param affichageTable 
     */
    public Seance(int idSeance, String date, int idCours, int idSalle, int heureDebut, int heureFin, String affichageTable) {
        this.idSeance = idSeance;
        this.date = date;
        this.idCours = idCours;
        this.idSalle = idSalle;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.affichageTable = affichageTable;
    }

    /**
     * Version pour la modification
     */
    public Seance(int idSeance, String date, int idCours, int idSalle, int heureDebut, int heureFin) {
        this.idSeance = idSeance;
        this.date = date;
        this.idCours = idCours;
        this.idSalle = idSalle;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.affichageTable = "";
    }
    
    public String getAffichageTable() {
        return affichageTable;
    }

    public void setAffichageTable(String affichageTable) {
        this.affichageTable = affichageTable;
    }

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
    
    public String toString() {
        return (this.idSeance + " " +
        this.date + " " +
        this.idCours + " " +
        this.idSalle + " " +
        this.heureDebut + " " + this.heureFin + " ");
    }
    
}
