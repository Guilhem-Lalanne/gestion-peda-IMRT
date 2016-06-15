/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import appli.ModeleClasse;
import appli.ModelePromotion;
import appli.tools;
import dao.DaoClasse;
import dao.DaoPromotion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Classe;
import metier.Promotion;

/**
 *
 * @author Mateusz
 */
public class FenetreAjoutModifClasse extends javax.swing.JDialog {
    
    public int resultat;
    
    ModelePromotion mp;
    
    DaoPromotion dao;
    DaoClasse daoC;
    
    public Classe maclass;

    /**
     * Creates new form FenetreAjoutModifClasse
     * @param parent
     * @param c
     * @param cnx
     */
    public FenetreAjoutModifClasse(java.awt.Frame parent, Classe c, Connection cnx) {
        
        super(parent, true);
        initComponents();
        
        this.setName("Ajout de la classe");
        
        resultat = 1;
        
        dao = new DaoPromotion(cnx);
        daoC = new DaoClasse(cnx);
        
        mp = new ModelePromotion(dao);
        
        this.maclass = c;
        
        cbPromotion.setModel(mp);
        
        cbPromotion.setSelectedIndex(0);
        
    }
    
    public Classe doModal() {
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
        txCode = new javax.swing.JTextField();
        lPromotion = new javax.swing.JLabel();
        cbPromotion = new javax.swing.JComboBox<>();
        lNom = new javax.swing.JLabel();
        txNom = new javax.swing.JTextField();
        bAjout = new javax.swing.JButton();
        bAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lCode.setText("Code");

        lPromotion.setText("Promotion");

        cbPromotion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lNom.setText("Nom");

        bAjout.setText("Ajout");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(txCode, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lPromotion)
                        .addGap(18, 18, 18)
                        .addComponent(cbPromotion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txNom, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bAjout)
                .addGap(30, 30, 30)
                .addComponent(bAnnuler)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPromotion)
                    .addComponent(cbPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCode)
                    .addComponent(txCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNom)
                    .addComponent(txNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAjout)
                    .addComponent(bAnnuler))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAjoutActionPerformed
        
        //preparation ajout
        String nom = txNom.getText();
        String code = txCode.getText();
        Promotion p = mp.get(cbPromotion.getSelectedIndex());
        
        tools.debug(p.toString());

        if (nom == "") {
            
        } else if (code == "") {
            
        } else if (p.getNomPromotion() == "") {
            
        } else {
            
            maclass = new Classe(0, p.getIdPromotion(), code, nom, p.getNomPromotion());
            
            tools.debug(maclass.toString());
            
            try {
                daoC.insertClasse(maclass);
                
            } catch (SQLException ex) {
                Logger.getLogger(FenetreAjoutModifClasse.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            resultat = 0;
            
        }
        
        this.dispose();
        
    }//GEN-LAST:event_bAjoutActionPerformed

    private void bAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_bAnnulerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAjout;
    private javax.swing.JButton bAnnuler;
    private javax.swing.JComboBox<String> cbPromotion;
    private javax.swing.JLabel lCode;
    private javax.swing.JLabel lNom;
    private javax.swing.JLabel lPromotion;
    private javax.swing.JTextField txCode;
    private javax.swing.JTextField txNom;
    // End of variables declaration//GEN-END:variables
}