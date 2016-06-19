/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import appli.ModeleListeCours;
import appli.tools;
import dao.DaoCours;
import dao.DaoEnseignant;
import dao.DaoGroupe;
import dao.DaoUe;
import java.awt.Frame;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metier.Cours;

/**
 *
 * @author Mateusz
 */
public class PanelCours extends javax.swing.JPanel {
    
    Connection cnx;
    
    
    DaoGroupe daoGroupe;
    DaoEnseignant daoEns;
    DaoUe daoUe;
    DaoCours daoC;
    
    ModeleListeCours mc;
    
    Frame myparent;
    
    /**
     * Creates new form PanelCours
     */
    public PanelCours(Connection c, Frame parent) {
        initComponents();
        
        this.setName("Gestion Cours");
        
        cnx = c;
        myparent = parent;
        
        daoGroupe = new DaoGroupe(cnx);
        daoEns = new DaoEnseignant(cnx);
        daoUe = new DaoUe(cnx);
        daoC = new DaoCours(cnx);
        
        mc = new ModeleListeCours(daoC);
        
        liListeCours.setModel(mc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        liListeCours = new javax.swing.JTable();
        btAjout = new javax.swing.JButton();
        btSuppression = new javax.swing.JButton();
        btSuppression1 = new javax.swing.JButton();

        liListeCours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(liListeCours);

        btAjout.setText("Ajout un cours");
        btAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjoutActionPerformed(evt);
            }
        });

        btSuppression.setText("Supprimer un cours");
        btSuppression.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuppressionActionPerformed(evt);
            }
        });

        btSuppression1.setText("Modifier un cours");
        btSuppression1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuppression1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAjout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSuppression1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSuppression)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSuppression)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAjout)
                        .addComponent(btSuppression1)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjoutActionPerformed

        //Classe c = ml.get(liListeClasse.getSelectedRow());
        Cours c = new Cours();

        FenetreAjoutModifCours f 
                = new FenetreAjoutModifCours(myparent, c, cnx, daoUe, daoEns, daoGroupe);
        c = f.doModal();

        if (c.getIdCours()!= 0) {
            tools.debug(c.toString());
            mc.insererLigne(c);
        }

    }//GEN-LAST:event_btAjoutActionPerformed

    private void btSuppressionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuppressionActionPerformed

        if (liListeCours.getSelectedRow() != -1) {

            try {

                int result;
                Cours current = this.mc.get(liListeCours.getSelectedRow());
                int id_suppression = current.getIdCours();

                CallableStatement cstmt = cnx.prepareCall ("{ ? = call SUPPRIMER_COURS(?)}");

                cstmt.registerOutParameter (1, Types.INTEGER);
                cstmt.setInt(2, id_suppression);
                cstmt.execute();
                result = cstmt.getInt(1);

                tools.debug("Suppresion : " + result);

                if (result == 1) {
                    //todo implementer methode modifier
                    JOptionPane.showMessageDialog(null, "Cours a été bien supprimé",
                        "Information", JOptionPane.INFORMATION_MESSAGE);

                    this.mc.supprimerLigne(liListeCours.getSelectedRow());

                } else {
                    //result != 1
                    throw new Exception("Impossible de supprimer ens");
                }

            } catch (SQLException ex) {
                Logger.getLogger(FenetreModifEnseignant.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FenetreModifEnseignant.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selectionner un ligne svp","Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btSuppressionActionPerformed

    private void btSuppression1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuppression1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSuppression1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjout;
    private javax.swing.JButton btSuppression;
    private javax.swing.JButton btSuppression1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable liListeCours;
    // End of variables declaration//GEN-END:variables
}
