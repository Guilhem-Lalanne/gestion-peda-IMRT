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
public class Classe {
    private String idClasse;
    private String IdPromotion;
    private String code;
    private String nom;

    public Classe(String code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    public String getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(String idClasse) {
        this.idClasse = idClasse;
    }

    public String getIdPromotion() {
        return IdPromotion;
    }

    public void setIdPromotion(String IdPromotion) {
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
        return "Classe{" + "idClasse=" + idClasse + ", IdPromotion=" 
                + IdPromotion + ", code=" + code + ", nom=" + nom + '}';
    }
    
}
