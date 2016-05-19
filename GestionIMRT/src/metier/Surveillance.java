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
public class Surveillance {
    private int idSurveillance;
    private int idGroupeSurveillance;
    private int idEnseignant;
    private int role;

    public Surveillance(int idGroupeSurveillance, int idEnseignant, int role) {
        this.idGroupeSurveillance = idGroupeSurveillance;
        this.idEnseignant = idEnseignant;
        this.role = role;
    }

    public int getIdSurveillance() {
        return idSurveillance;
    }

    public void setIdSurveillance(int idSurveillance) {
        this.idSurveillance = idSurveillance;
    }

    public int getIdGroupeSurveillance() {
        return idGroupeSurveillance;
    }

    public void setIdGroupeSurveillance(int idGroupeSurveillance) {
        this.idGroupeSurveillance = idGroupeSurveillance;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
    
    
}
