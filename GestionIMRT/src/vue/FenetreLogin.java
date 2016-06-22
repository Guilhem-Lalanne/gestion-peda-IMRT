/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import appli.tools;
import dao.SourceOracle;
import dao.DaoUser;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metier.User;

/**
 *
 * @author paul
 */
public class FenetreLogin extends javax.swing.JFrame {
    
    public static Connection cnx;

    /**
     * Creates new form NewJFrame
     */
    public FenetreLogin(Connection c) throws InterruptedException {
        
        this.cnx = c;
        
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
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
        btAnnulerLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion pédagogique de la section l'IMRT du lycée La Martinère Duchère");

        lTitre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitre.setText("Gestion pédagogique de l'IMRT");

        lLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lLogin.setText(" Login");

        txLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLoginActionPerformed(evt);
            }
        });

        lMotDePasse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lMotDePasse.setText(" Mot de passe");

        pwMotDePasse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pwMotDePasse.setToolTipText("");

        btValiderLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btValiderLogin.setText("Connexion");
        btValiderLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValiderLoginActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btValiderLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAnnulerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btValiderLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAnnulerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            
            //tries to connect to database with login/password
            int login_res = SourceOracle.Login(this.cnx, txLogin.getText(), pwMotDePasse.getPassword());
            
            //connexion ok
            if (login_res == 0) {
                
                //je cherche le prop d'user
                DaoUser du = new DaoUser(this.cnx);
                
                User currentUser = du.getUser(txLogin.getText());
                
                //affichage de la fenetre principale
                FenetreAcceuilPrincipal fp = new FenetreAcceuilPrincipal(this.cnx,currentUser);
                
                this.dispose();
                fp.setVisible(true);
                
            } else {
                //connexion not ok
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
    private javax.swing.JButton btValiderLogin;
    private javax.swing.JLabel lLogin;
    private javax.swing.JLabel lMotDePasse;
    private javax.swing.JLabel lTitre;
    private javax.swing.JPasswordField pwMotDePasse;
    private javax.swing.JTextField txLogin;
    // End of variables declaration//GEN-END:variables
}
