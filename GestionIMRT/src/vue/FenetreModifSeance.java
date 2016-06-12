/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import appli.ModeleClasse;
import appli.tools;
import dao.DaoAgenda;
import dao.DaoClasse;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import metier.CelluleAgenda;
import metier.Seance;

/**
 *
 * @author Mateusz
 */
public class FenetreModifSeance extends javax.swing.JDialog {
    
    int resultat;
    int id_seance;
    Connection cnx;
    
    DaoClasse dc;
    DaoAgenda da;
    
    Seance currentSeance;
    
    int action;
    /**
     * 0 - ajout
     * 1 - modif
     */
    
    /**
     * Creates new form NewJDialog
     */
    public FenetreModifSeance(java.awt.Frame parent, CelluleAgenda seance, Connection cnx, int action) throws ParseException, SQLException {
        super(parent, true);
        initComponents();
        
       this.id_seance = seance.id_seance;
       this.cnx = cnx;
       this.resultat = 0;
       this.action = action;
       
       dc = new DaoClasse(cnx);
       da = new DaoAgenda(cnx);
       
       
       ModeleClasse mc = new ModeleClasse(dc);
       cbClasse.setModel(mc);
       
       if (this.action == 0) {
           //ajout
           this.lTitre.setText("Ajout Seance");
           pValidationCours.setVisible(false);
           
       } else {
           //modif
           this.lTitre.setText("Modification Seance");
           //da.getSeanceUnique(currentSeance, id_seance);
           
           //this.cbClasse.setSelectedIndex(currentSeance.get));
       }
       
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
       
       lDate.setText(df.format(seance.date));
       
       cbHeureDebut.setSelectedItem(tools.convertIntToHour(seance.heure));
       
       //3 heures par defaut
       cbHeureFin.setSelectedItem(tools.convertIntToHour(seance.heure+3));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbEnseignant = new javax.swing.JComboBox<>();
        lGroupe = new javax.swing.JLabel();
        cbClasse = new javax.swing.JComboBox<>();
        cbHeureFin = new javax.swing.JComboBox<>();
        btAnnuler = new javax.swing.JButton();
        lUE = new javax.swing.JLabel();
        lHeureFin = new javax.swing.JLabel();
        lHeureDebut = new javax.swing.JLabel();
        lDate = new javax.swing.JLabel();
        lSalle = new javax.swing.JLabel();
        lClasse = new javax.swing.JLabel();
        pValidationCours = new javax.swing.JPanel();
        rbValide = new javax.swing.JRadioButton();
        rbAnnule = new javax.swing.JRadioButton();
        lEnseignant = new javax.swing.JLabel();
        cbHeureDebut = new javax.swing.JComboBox<>();
        btValider = new javax.swing.JButton();
        cbGroupe = new javax.swing.JComboBox<>();
        cbSalle = new javax.swing.JComboBox<>();
        lTitre = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        cbUE = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbEnseignant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr dupont" }));

        lGroupe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lGroupe.setText("Groupe");

        cbClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IMRT1" }));

        cbHeureFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00" }));

        btAnnuler.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAnnuler.setText("Annuler");
        btAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnnulerActionPerformed(evt);
            }
        });

        lUE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lUE.setText("U.E");

        lHeureFin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lHeureFin.setText("Heure de fin");

        lHeureDebut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lHeureDebut.setText("Heure de debut");

        lDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lDate.setText("Date");

        lSalle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lSalle.setText("Salle");

        lClasse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lClasse.setText("Classe");

        pValidationCours.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Validation d'un cours", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        rbValide.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbValide.setText("  Cours ayant eu lieu");
        rbValide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbValideActionPerformed(evt);
            }
        });

        rbAnnule.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbAnnule.setText("  Cours annulé");

        javax.swing.GroupLayout pValidationCoursLayout = new javax.swing.GroupLayout(pValidationCours);
        pValidationCours.setLayout(pValidationCoursLayout);
        pValidationCoursLayout.setHorizontalGroup(
            pValidationCoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pValidationCoursLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(rbValide, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbAnnule, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        pValidationCoursLayout.setVerticalGroup(
            pValidationCoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pValidationCoursLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pValidationCoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbValide)
                    .addComponent(rbAnnule))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        lEnseignant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lEnseignant.setText("Enseignant");

        cbHeureDebut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00" }));

        btValider.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btValider.setText("Valider");

        cbGroupe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Groupe A" }));
        cbGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGroupeActionPerformed(evt);
            }
        });

        cbSalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4106" }));

        lTitre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lTitre.setText("Titre");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText(" Récurrence");

        cbUE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4.2" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btValider, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pValidationCours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lHeureDebut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lTitre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lUE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbHeureDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lHeureFin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbUE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lEnseignant, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(cbHeureFin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbEnseignant, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(119, 119, 119))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(398, 398, 398)
                                .addComponent(lSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(cbSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lHeureFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lHeureDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbHeureDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbHeureFin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEnseignant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEnseignant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pValidationCours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btValider, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int doModal() {
        this.setVisible(true);
        return resultat;
    }
    
    private void rbValideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbValideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbValideActionPerformed

    private void cbGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGroupeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGroupeActionPerformed

    private void btAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnnulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_btAnnulerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnnuler;
    private javax.swing.JButton btValider;
    private javax.swing.JComboBox<String> cbClasse;
    private javax.swing.JComboBox<String> cbEnseignant;
    private javax.swing.JComboBox<String> cbGroupe;
    private javax.swing.JComboBox<String> cbHeureDebut;
    private javax.swing.JComboBox<String> cbHeureFin;
    private javax.swing.JComboBox<String> cbSalle;
    private javax.swing.JComboBox<String> cbUE;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lClasse;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lEnseignant;
    private javax.swing.JLabel lGroupe;
    private javax.swing.JLabel lHeureDebut;
    private javax.swing.JLabel lHeureFin;
    private javax.swing.JLabel lSalle;
    private javax.swing.JLabel lTitre;
    private javax.swing.JLabel lUE;
    private javax.swing.JPanel pValidationCours;
    private javax.swing.JRadioButton rbAnnule;
    private javax.swing.JRadioButton rbValide;
    // End of variables declaration//GEN-END:variables
}
