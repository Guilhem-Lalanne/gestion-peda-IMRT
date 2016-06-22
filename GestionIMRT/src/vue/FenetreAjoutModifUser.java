/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import appli.ModeleReferentiel;
import appli.tools;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metier.User;

/**
 *
 * @author Mateusz
 */
public class FenetreAjoutModifUser extends javax.swing.JDialog {
    
    private boolean etatValidation;
    private User modUser;
    
    /**
     * 0 - ajout
     * 1 - suppresion
     * 2 - modification
     */
    private int action;
    public Connection cnx;

    /**
     * 
     * @param parent
     * @param user
     * @param userGroupes
     * @param libelle 
     */
    public FenetreAjoutModifUser(java.awt.Frame parent,
            User user,
            ModeleReferentiel userGroupes,
            int action,
            Connection cnx) {
        
        super(parent, true);
        initComponents();
        
        this.modUser = user;
        this.action = action;
        this.cnx = cnx;
        this.lLibelle.setText(getLibelleAction(action));
        this.txLogin.setText(user.getLogin());
        this.txPrenomEtu1.setText(user.getFullname());
        this.cbUserGroupes.setModel(userGroupes);
        this.cbUserGroupes.setSelectedIndex(user.getGroupe()-1);
        
    }
    
    private String getLibelleAction(int a) {
        String ret = "";
        switch (a) {
            case 0: ret = "Ajouter un user"; break;
            case 1: ret = "Supprmier un user"; break;
            case 2: ret = "Modifier un user"; break;
            default: break;
        }
        
        return ret;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lNomEtu = new javax.swing.JLabel();
        txLogin = new javax.swing.JTextField();
        lPrenomEtu = new javax.swing.JLabel();
        lAdresse = new javax.swing.JLabel();
        cbUserGroupes = new javax.swing.JComboBox<>();
        lPrenomEtu1 = new javax.swing.JLabel();
        txPrenomEtu1 = new javax.swing.JTextField();
        lLibelle = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lNomEtu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNomEtu.setText("Login");

        txLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lPrenomEtu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPrenomEtu.setText("Mot de passe");

        lAdresse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lAdresse.setText("Groupe");

        cbUserGroupes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lPrenomEtu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPrenomEtu1.setText("Nom et Prénom");

        txPrenomEtu1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lLibelle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lLibelle.setText("libelle");

        jButton1.setText("Sauvegarder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lNomEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPrenomEtu1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(lAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPrenomEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbUserGroupes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txLogin)
                        .addComponent(txPrenomEtu1)
                        .addComponent(lLibelle)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lNomEtu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lLibelle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPrenomEtu, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPrenomEtu1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(txPrenomEtu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUserGroupes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        switch (action) {
            case 0: addUser(modUser);break;
            case 1: deleteUser();break;
            case 2: modifyUser();break;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void addUser(User u) {
        
        u.setLogin(txLogin.getText());
        u.setGroupe(cbUserGroupes.getSelectedIndex());
        
        int result;
        
        //TODO: VALIDATION
        /*

        CallableStatement cstmt = cnx.prepareCall ("{ ? = call ajouter_enseignant(?, ?,?,?,?,?,?,?}");

                cstmt.registerOutParameter (1, Types.INTEGER);
                
                cstmt.setString(2, ens.getNomEnseignant());
                cstmt.setString(3, ens.getPrenomEnseignant());
                cstmt.setString(4,ens.getDateNaissanceEnseignant());
                cstmt.setString(5,ens.getAdresseEnseignant());
                cstmt.setString(6,ens.getNumeroTelFixeEnseignant());
                cstmt.setString(7,ens.getNumeroTelMobilEnseignant());
                cstmt.setString(8,ens.getMailEnseignant());
                cstmt.setString(9,ens.getProfession());
                
                cstmt.execute();
                
                result = cstmt.getInt(1);

                tools.debug("Ajout : " + result);

                //if (result == 1) {

                    JOptionPane.showMessageDialog(null, "Ens "
                        +this.ens.getNomEnseignant()+" "+this.ens.getPrenomEnseignant()
                        + " a été bien ajouté",
                        "Information", JOptionPane.INFORMATION_MESSAGE);

                    this.resultat = 1;

                    this.dispose();
                    
            } catch (SQLException ex) {
                Logger.getLogger(FenetreModificationEnseignantAcienne.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FenetreModificationEnseignantAcienne.class.getName()).log(Level.SEVERE, null, ex);
            }
        */
    }
    
    private void deleteUser() {
        
    }
    
    private void modifyUser() {
        
    }
    
    public boolean doModal() {
        this.setVisible(true);
        return etatValidation;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbUserGroupes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lAdresse;
    private javax.swing.JLabel lLibelle;
    private javax.swing.JLabel lNomEtu;
    private javax.swing.JLabel lPrenomEtu;
    private javax.swing.JLabel lPrenomEtu1;
    private javax.swing.JTextField txLogin;
    private javax.swing.JTextField txPrenomEtu1;
    // End of variables declaration//GEN-END:variables
}
