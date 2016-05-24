/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import appli.tools;
import dao.SourceOracle;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

/**
 *
 * @author paul
 */
public class FenetreLogin extends javax.swing.JFrame {
    
    public static Connection cnx;

    /**
     * Creates new form NewJFrame
     */
    public FenetreLogin(Connection c) {
        
        this.cnx = c;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitre = new javax.swing.JLabel();
        lLogin = new javax.swing.JLabel();
        txLogin = new javax.swing.JTextField();
        lMotDePasse = new javax.swing.JLabel();
        pwMotDePasse = new javax.swing.JPasswordField();
        btValiderLogin = new javax.swing.JButton();
        btOubliMotDePasse = new javax.swing.JButton();
        btAnnulerLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion pédagogique de l'IMRT");

        lTitre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitre.setText("Gestion pédagogique de l'IMRT");

        lLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lLogin.setText(" Login");

        txLogin.setText("test");
        txLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLoginActionPerformed(evt);
            }
        });

        lMotDePasse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lMotDePasse.setText(" Mot de passe");

        pwMotDePasse.setText("test");
        pwMotDePasse.setToolTipText("");

        btValiderLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btValiderLogin.setText("ok");
        btValiderLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValiderLoginActionPerformed(evt);
            }
        });

        btOubliMotDePasse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btOubliMotDePasse.setText("Mot de passe oublié");

        btAnnulerLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAnnulerLogin.setText("Annuler");
        btAnnulerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnnulerLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btValiderLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(lLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btOubliMotDePasse)
                                .addGap(32, 32, 32)
                                .addComponent(btAnnulerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txLogin)
                            .addComponent(pwMotDePasse))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lMotDePasse, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(pwMotDePasse))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOubliMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValiderLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAnnulerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAnnulerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnnulerLoginActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btAnnulerLoginActionPerformed

    private void btValiderLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValiderLoginActionPerformed
        
        tools.debug("tries to connect with login: "+txLogin.getText()+" pass: "+pwMotDePasse.getPassword());
        
        try {
            int login_res = SourceOracle.Login(this.cnx, txLogin.getText(), pwMotDePasse.getPassword());
            
            if (login_res == 0) {
                //JOptionPane.showMessageDialog(this, "Login ok");
                
                //affichage fenetre principale
                
                FenetreAcceuilPrincipal fp = new FenetreAcceuilPrincipal(this.cnx);
                
                this.dispose();
                fp.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(this, "Login ko");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FenetreLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btValiderLoginActionPerformed

    private void txLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnnulerLogin;
    private javax.swing.JButton btOubliMotDePasse;
    private javax.swing.JButton btValiderLogin;
    private javax.swing.JLabel lLogin;
    private javax.swing.JLabel lMotDePasse;
    private javax.swing.JLabel lTitre;
    private javax.swing.JPasswordField pwMotDePasse;
    private javax.swing.JTextField txLogin;
    // End of variables declaration//GEN-END:variables
}
