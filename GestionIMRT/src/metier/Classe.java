/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import appli.tools;

/**
 *
 * @author paul
 */
public class Classe {
    
    private int idClasse;
    private int IdPromotion;
    private String code;
    private String nom;
    private String Promotion;

    
    public Classe() {
        
    }
    
    public Classe(int classe, int promotion, String code, String nom) {
        this.idClasse = classe;
        this.IdPromotion = promotion;
        this.code = code;
        this.nom = nom;
    }
    
    public Classe(int classe, int promotion, String code, String nom, String promotion_s) {
        tools.debug(promotion_s);
        this.idClasse = classe;
        this.IdPromotion = promotion;
        this.code = code;
        this.nom = nom;
        this.Promotion = promotion_s;
    }
    
    public String getPromotion() {
        return Promotion;
    }

    public void setPromotion(String Promotion) {
        this.Promotion = Promotion;
    }

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public int getIdPromotion() {
        return IdPromotion;
    }

    public void setIdPromotion(int IdPromotion) {
        this.IdPromotion = IdPromotion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Classe{" + "idClasse=" + idClasse + ", IdPromotion=" + IdPromotion + ", code=" + code + ", nom=" + nom + ", Promotion=" + Promotion + '}';
    }

}
