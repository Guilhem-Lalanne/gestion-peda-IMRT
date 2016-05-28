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
public class Promotion {
    private int idPromotion;
    private String nomPromotion;
    private String année;

    public Promotion(String nomPromotion, String année) {
        this.nomPromotion = nomPromotion;
        this.année = année;
    }

    public Promotion() {
        //default constructor
    }

    public int getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(int idPromotion) {
        this.idPromotion = idPromotion;
    }

    public String getNomPromotion() {
        return nomPromotion;
    }

    public void setNomPromotion(String nomPromotion) {
        this.nomPromotion = nomPromotion;
    }

    public String getAnnée() {
        return année;
    }

    public void setAnnée(String année) {
        this.année = année;
    }
    
    
}
