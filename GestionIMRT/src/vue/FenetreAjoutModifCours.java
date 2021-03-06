/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import appli.ModeleEnseignant;
import appli.ModeleGroupe;
import appli.ModeleUe;
import appli.tools;
import dao.DaoCours;
import dao.DaoEnseignant;
import dao.DaoGroupe;
import dao.DaoUe;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Cours;

/**
 *
 * @author Mateusz
 */
public class FenetreAjoutModifCours extends javax.swing.JDialog {
    
    public int resultat;
    
    ModeleUe mue;
    ModeleEnseignant me;
    ModeleGroupe mg;
    
    DaoCours dc;
    
    public Cours maclass;

    /**
     * 
     * @param parent
     * @param c
     * @param cnx
     * @param du
     * @param de
     * @param dg 
     */
    public FenetreAjoutModifCours(java.awt.Frame parent, Cours c, Connection cnx,
            DaoUe du, DaoEnseignant de, DaoGroupe dg) {
        
        super(parent, true);
        initComponents();
        
        this.setTitle("Ajout du groupe");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        resultat = 1;
        
        this.maclass = c;
        this.dc = new DaoCours(cnx);
        
        mue = new ModeleUe(du);
        me = new ModeleEnseignant(de);
        mg = new ModeleGroupe(dg);
        
        cbUE.setModel(mue);
        cbEnseignant.setModel(me);
        cbGroupe.setModel(mg);
        
    }
    
    public Cours doModal() {
        this.setVisible(true);
        return maclass;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCode = new javax.swing.JLabel();
        lPromotion = new javax.swing.JLabel();
        bAjout = new javax.swing.JButton();
        bAnnuler = new javax.swing.JButton();
        lCode1 = new javax.swing.JLabel();
        cbEnseignant = new javax.swing.JComboBox<>();
        cbUE = new javax.swing.JComboBox<>();
        cbGroupe = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lCode.setText("UE");

        lPromotion.setText("Enseignant");

        bAjout.setText("Ajouter");
        bAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAjoutActionPerformed(evt);
            }
        });

        bAnnuler.setText("Annuler");
        bAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnnulerActionPerformed(evt);
            }
        });

        lCode1.setText("Groupe");

        cbEnseignant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbUE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbGroupe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lCode)
                        .addGap(68, 68, 68)
                        .addComponent(cbUE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lPromotion)
                        .addGap(28, 28, 28)
                        .addComponent(cbEnseignant, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lCode1)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(bAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbGroupe, 0, 802, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPromotion)
                    .addComponent(cbEnseignant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCode)
                    .addComponent(cbUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCode1)
                    .addComponent(cbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjoutActionPerformed
        
        //preparation ajout
        int id_ens = this.me.get(cbEnseignant.getSelectedIndex()).getIdEnseignant();
        int id_ue = this.mue.get(cbUE.getSelectedIndex()).getIdUe();
        int id_groupe = this.mg.get(cbGroupe.getSelectedIndex()).getIdGroupe();
        
        if (id_ens == 0) {
            
        }else if (id_groupe == 0) {
            
        }else if (id_ue == 0) {
            
        } else {
            
            maclass.setIdEnseignant(id_ens);
            maclass.setIdIe(id_ue);
            maclass.setIdGroupe(id_groupe);
            
            maclass.setNomEns(this.me.get(cbEnseignant.getSelectedIndex()).getNomEnseignant()
            + " " + this.me.get(cbEnseignant.getSelectedIndex()).getPrenomEnseignant()
            );
            
            maclass.setNomUE(this.mue.get(cbUE.getSelectedIndex()).getNomUe());
            
            maclass.setNomClasse(this.mg.get(cbGroupe.getSelectedIndex()).getClassFullname());
            
            tools.debug(maclass.toString());
            
            try {
                dc.insertCours(maclass);
                
            } catch (SQLException ex) {
                Logger.getLogger(FenetreAjoutModifCours.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            resultat = 0;
            
            this.dispose();
        }
        
    }//GEN-LAST:event_bAjoutActionPerformed

    private void bAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_bAnnulerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAjout;
    private javax.swing.JButton bAnnuler;
    private javax.swing.JComboBox<String> cbEnseignant;
    private javax.swing.JComboBox<String> cbGroupe;
    private javax.swing.JComboBox<String> cbUE;
    private javax.swing.JLabel lCode;
    private javax.swing.JLabel lCode1;
    private javax.swing.JLabel lPromotion;
    // End of variables declaration//GEN-END:variables
}
