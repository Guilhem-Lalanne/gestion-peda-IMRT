/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import appli.ModeleNomEmployeur;
import appli.tools;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metier.Enseignant;

/**
 *
 * @author p1313137
 */
public class FenetreModifEnseignant extends javax.swing.JDialog {
    
    public Enseignant ens;
    
    /**
     * 0 - init
     * 1 - modification
     * 2 - ajout
     * 3 - suppresion
     */
    public int action;
    
    /**
     * 0 - aucun action
     * 1 - action ok (il faut mettre à jour le vue principale)
     */
    private int resultat;
    
    Connection cnx;

    /**
     * Creates new form FenetreModifEnseignant
     */
    public FenetreModifEnseignant(java.awt.Frame parent, 
                                  Enseignant ens,
                                  ModeleNomEmployeur modelNomEmp,
                                  String libelle,
                                  Connection cnx
                                  ) {
        super(parent, true);
        
        this.ens = ens;
        this.action = 0;
        this.resultat = 0;
        this.cnx = cnx;
        
        initComponents();
     
         tools.debug(ens.toString());
         
         if (libelle == "Modifier fiche enseignant") {
            this.action = 1;
            this.lTitre.setText(libelle);
            this.txNomEns.setText(ens.getNomEnseignant());
            this.txPrenomEns.setText(ens.getPrenomEnseignant());
            this.txDateNaissanceEns.setText(ens.getDateNaissanceEnseignant());
            this.txAdresseEns.setText(ens.getAdresseEnseignant());
            this.txNumFixe.setText(ens.getNumeroTelFixeEnseignant());
            this.txNumMobile.setText(ens.getNumeroTelMobilEnseignant());
            this.txAdresseMail.setText(ens.getMailEnseignant());
            this.txProfession.setText(ens.getProfession());
            this.cbNomEmployeur.setModel(modelNomEmp);
            //this.txAdresseEmp.setText();
            this.ckCNI.setSelected(ens.getDocAdmPhotoCarteNat());
            this.ckSS.setSelected(ens.getDocAdmPhotoCarteSecu());
            this.ckBulletinSalaire.setSelected(ens.getDocAdmJustTrav());
            this.ckArreteNomination.setSelected(ens.getDocAdmRecepArreteNomin());
        } else if (libelle == "Ajouter fiche Enseignant") {
            this.action = 2;
            this.lTitre.setText(libelle);

        } else if (libelle == "Suprimer fiche Enseignant") {
            this.action = 3;
            this.lTitre.setText(libelle);
            this.txNomEns.setText(ens.getNomEnseignant());
            this.txPrenomEns.setText(ens.getPrenomEnseignant());
            this.txDateNaissanceEns.setText(ens.getDateNaissanceEnseignant());
            this.txAdresseEns.setText(ens.getAdresseEnseignant());
            this.txNumFixe.setText(ens.getNumeroTelFixeEnseignant());
            this.txNumMobile.setText(ens.getNumeroTelMobilEnseignant());
            this.txAdresseMail.setText(ens.getMailEnseignant());
            this.txProfession.setText(ens.getProfession());
            this.cbNomEmployeur.setModel(modelNomEmp);
            //this.txAdresseEmp.setText();
            this.ckCNI.setText(String.valueOf(ens.getDocAdmPhotoCarteNat()));
            this.ckSS.setText(String.valueOf(ens.getDocAdmPhotoCarteSecu()));
            this.ckBulletinSalaire.setText(String.valueOf(ens.getDocAdmJustTrav()));
            this.ckArreteNomination.setText(String.valueOf(ens.getDocAdmRecepArreteNomin()));
            this.btEnregistrerEns.setText("suprimer");
        }
    }
    
    public int doModal() {
        this.setVisible(true);
        return resultat;
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
        lNomEns = new javax.swing.JLabel();
        txNomEns = new javax.swing.JTextField();
        lPrenomEns = new javax.swing.JLabel();
        txPrenomEns = new javax.swing.JTextField();
        lDateNaissanceEns = new javax.swing.JLabel();
        txDateNaissanceEns = new javax.swing.JTextField();
        lAdresseEns = new javax.swing.JLabel();
        txAdresseEns = new javax.swing.JTextField();
        lNumFixe = new javax.swing.JLabel();
        txNumFixe = new javax.swing.JTextField();
        lNumMobile = new javax.swing.JLabel();
        txNumMobile = new javax.swing.JTextField();
        lAdresseMail = new javax.swing.JLabel();
        txAdresseMail = new javax.swing.JTextField();
        lProfession = new javax.swing.JLabel();
        txProfession = new javax.swing.JTextField();
        lNomEmp = new javax.swing.JLabel();
        lAdresseEmp = new javax.swing.JLabel();
        txAdresseEmp = new javax.swing.JTextField();
        pStatutEN = new javax.swing.JPanel();
        rbEN = new javax.swing.JRadioButton();
        rbExterieur = new javax.swing.JRadioButton();
        pDocuments = new javax.swing.JPanel();
        ckCNI = new javax.swing.JCheckBox();
        ckSS = new javax.swing.JCheckBox();
        ckBulletinSalaire = new javax.swing.JCheckBox();
        ckArreteNomination = new javax.swing.JCheckBox();
        pUE = new javax.swing.JPanel();
        lListeComplete = new javax.swing.JLabel();
        spListeComplete = new javax.swing.JScrollPane();
        liListeComplete = new javax.swing.JList();
        btAjouterUE = new javax.swing.JButton();
        btSupprimerUE = new javax.swing.JButton();
        lListeEnseignee = new javax.swing.JLabel();
        spListeEnseignee = new javax.swing.JScrollPane();
        liListeEnseignee = new javax.swing.JList();
        btEnregistrerEns = new javax.swing.JButton();
        btAnnulerEns = new javax.swing.JButton();
        cbNomEmployeur = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lTitre.setText("Modification d'un Enseignant");

        lNomEns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNomEns.setText("Nom");

        txNomEns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lPrenomEns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPrenomEns.setText("Prénom");

        txPrenomEns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txPrenomEns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPrenomEnsActionPerformed(evt);
            }
        });

        lDateNaissanceEns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lDateNaissanceEns.setText("Date de naissance");

        txDateNaissanceEns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lAdresseEns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lAdresseEns.setText("Adresse");

        txAdresseEns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAdresseEnsActionPerformed(evt);
            }
        });

        lNumFixe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNumFixe.setText("Numero de telephone fixe");

        lNumMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNumMobile.setText("Numero de telephone mobile");

        lAdresseMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lAdresseMail.setText("Adresse mail");

        lProfession.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lProfession.setText("Profession");

        lNomEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNomEmp.setText("Nom employeur");

        lAdresseEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lAdresseEmp.setText("Adresse employeur");

        pStatutEN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statut EN", 0, 0, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        rbEN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbEN.setText("Education Nationale");

        rbExterieur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbExterieur.setText("Intervenant extérieur");

        javax.swing.GroupLayout pStatutENLayout = new javax.swing.GroupLayout(pStatutEN);
        pStatutEN.setLayout(pStatutENLayout);
        pStatutENLayout.setHorizontalGroup(
            pStatutENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pStatutENLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(pStatutENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pStatutENLayout.createSequentialGroup()
                        .addComponent(rbEN, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pStatutENLayout.createSequentialGroup()
                        .addComponent(rbExterieur, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pStatutENLayout.setVerticalGroup(
            pStatutENLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pStatutENLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbEN)
                .addGap(18, 18, 18)
                .addComponent(rbExterieur)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pDocuments.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documents administratifs ", 0, 0, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        ckCNI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckCNI.setText("  Photocopie de la carte nationale d’identité");

        ckSS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckSS.setText("  Photocopie de la carte de sécurité sociale");

        ckBulletinSalaire.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckBulletinSalaire.setText("  Justificatif de travail (bulletin de salaire)");

        ckArreteNomination.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ckArreteNomination.setText("  Réception de l’arrêté de nomination");

        javax.swing.GroupLayout pDocumentsLayout = new javax.swing.GroupLayout(pDocuments);
        pDocuments.setLayout(pDocumentsLayout);
        pDocumentsLayout.setHorizontalGroup(
            pDocumentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocumentsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pDocumentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckCNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pDocumentsLayout.createSequentialGroup()
                        .addGroup(pDocumentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ckArreteNomination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ckBulletinSalaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ckSS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pDocumentsLayout.setVerticalGroup(
            pDocumentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDocumentsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ckCNI)
                .addGap(18, 18, 18)
                .addComponent(ckSS)
                .addGap(18, 18, 18)
                .addComponent(ckBulletinSalaire)
                .addGap(18, 18, 18)
                .addComponent(ckArreteNomination)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pUE.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UE enseignée", 0, 0, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pUE.setToolTipText("");

        lListeComplete.setText("Liste des UE");

        liListeComplete.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spListeComplete.setViewportView(liListeComplete);

        btAjouterUE.setText(">>");

        btSupprimerUE.setText("<<");

        lListeEnseignee.setText("UE Enseignées");

        liListeEnseignee.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        spListeEnseignee.setViewportView(liListeEnseignee);

        javax.swing.GroupLayout pUELayout = new javax.swing.GroupLayout(pUE);
        pUE.setLayout(pUELayout);
        pUELayout.setHorizontalGroup(
            pUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUELayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUELayout.createSequentialGroup()
                        .addComponent(lListeComplete)
                        .addGap(85, 85, 85))
                    .addGroup(pUELayout.createSequentialGroup()
                        .addComponent(spListeComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAjouterUE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSupprimerUE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spListeEnseignee, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lListeEnseignee))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        pUELayout.setVerticalGroup(
            pUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUELayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lListeComplete)
                    .addComponent(lListeEnseignee))
                .addGroup(pUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pUELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spListeEnseignee, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spListeComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pUELayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btAjouterUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSupprimerUE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        btEnregistrerEns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEnregistrerEns.setText("Enregistrer");
        btEnregistrerEns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnregistrerEnsActionPerformed(evt);
            }
        });

        btAnnulerEns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAnnulerEns.setText("Annuler");

        cbNomEmployeur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbNomEmployeur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNomEmployeurItemStateChanged(evt);
            }
        });
        cbNomEmployeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomEmployeurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lAdresseEns, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(lNomEns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txNomEns, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(lPrenomEns, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(txPrenomEns, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(lDateNaissanceEns, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addComponent(txDateNaissanceEns, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txAdresseEns)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumFixe, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(txNumFixe, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lNumMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txNumMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lAdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lNomEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txAdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbNomEmployeur, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pDocuments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pStatutEN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(lProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pUE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lAdresseEmp)
                                    .addGap(54, 54, 54)
                                    .addComponent(txAdresseEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(lTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btEnregistrerEns, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAnnulerEns, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txNomEns)
                        .addComponent(lPrenomEns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lDateNaissanceEns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txDateNaissanceEns)
                        .addComponent(lNomEns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txPrenomEns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAdresseEns, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAdresseEns, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumFixe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNumFixe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNumMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txProfession, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lAdresseEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txAdresseEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lNomEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(cbNomEmployeur))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pStatutEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pDocuments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pUE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnregistrerEns, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAnnulerEns, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txPrenomEnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPrenomEnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPrenomEnsActionPerformed

    private void txAdresseEnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAdresseEnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txAdresseEnsActionPerformed

    private void btEnregistrerEnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnregistrerEnsActionPerformed
        if (this.action == 3){
            
            //je suis dqns suppresion
            try {

                int result;
                int id_suppression = this.ens.getIdEnseignant();

                CallableStatement cstmt = cnx.prepareCall ("{ ? = call SUPPRIMER_ENSEIGNANT(?)}");

                cstmt.registerOutParameter (1, Types.INTEGER);
                cstmt.setInt(2, id_suppression);
                cstmt.execute();
                result = cstmt.getInt(1);

                tools.debug("Suppresion : " + result);

                if (result == 1) {

                    JOptionPane.showMessageDialog(null, "Ens "
                        +this.ens.getNomEnseignant()+" "+this.ens.getPrenomEnseignant()
                        + " a été bien supprimé",
                        "Information", JOptionPane.INFORMATION_MESSAGE);

                    this.resultat = 1;

                    this.dispose();

                } else {
                    //result != 1
                    throw new Exception("Impossible de supprimer ens");
                }

            } catch (SQLException ex) {
                Logger.getLogger(FenetreModificationEnseignant.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FenetreModificationEnseignant.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else  if (this.action == 2){
            //ajout enseigenant
            try {

                int result;
                //int id_suppression = this.ens.getIdEnseignant();
                
                ens.setNomEnseignant(this.txNomEns.getText());
                ens.setPrenomEnseignant(this.txPrenomEns.getText());
                
                //TODO: VALIDATION

                CallableStatement cstmt = cnx.prepareCall ("{ ? = call ajouter_enseignant(?, ?)}");

                cstmt.registerOutParameter (1, Types.INTEGER);
                
                cstmt.setString(2, ens.getNomEnseignant());
                cstmt.setString(3, ens.getPrenomEnseignant());
                
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
                    
                /*
                } else {
                    //result != 1
                    throw new Exception("Impossible de supprimer ens");
                }*/

            } catch (SQLException ex) {
                Logger.getLogger(FenetreModificationEnseignant.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FenetreModificationEnseignant.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btEnregistrerEnsActionPerformed

    private void cbNomEmployeurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNomEmployeurItemStateChanged

    }//GEN-LAST:event_cbNomEmployeurItemStateChanged

    private void cbNomEmployeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomEmployeurActionPerformed

    }//GEN-LAST:event_cbNomEmployeurActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjouterUE;
    private javax.swing.JButton btAnnulerEns;
    private javax.swing.JButton btEnregistrerEns;
    private javax.swing.JButton btSupprimerUE;
    private javax.swing.JComboBox<String> cbNomEmployeur;
    private javax.swing.JCheckBox ckArreteNomination;
    private javax.swing.JCheckBox ckBulletinSalaire;
    private javax.swing.JCheckBox ckCNI;
    private javax.swing.JCheckBox ckSS;
    private javax.swing.JLabel lAdresseEmp;
    private javax.swing.JLabel lAdresseEns;
    private javax.swing.JLabel lAdresseMail;
    private javax.swing.JLabel lDateNaissanceEns;
    private javax.swing.JLabel lListeComplete;
    private javax.swing.JLabel lListeEnseignee;
    private javax.swing.JLabel lNomEmp;
    private javax.swing.JLabel lNomEns;
    private javax.swing.JLabel lNumFixe;
    private javax.swing.JLabel lNumMobile;
    private javax.swing.JLabel lPrenomEns;
    private javax.swing.JLabel lProfession;
    private javax.swing.JLabel lTitre;
    private javax.swing.JList liListeComplete;
    private javax.swing.JList liListeEnseignee;
    private javax.swing.JPanel pDocuments;
    private javax.swing.JPanel pStatutEN;
    private javax.swing.JPanel pUE;
    private javax.swing.JRadioButton rbEN;
    private javax.swing.JRadioButton rbExterieur;
    private javax.swing.JScrollPane spListeComplete;
    private javax.swing.JScrollPane spListeEnseignee;
    private javax.swing.JTextField txAdresseEmp;
    private javax.swing.JTextField txAdresseEns;
    private javax.swing.JTextField txAdresseMail;
    private javax.swing.JTextField txDateNaissanceEns;
    private javax.swing.JTextField txNomEns;
    private javax.swing.JTextField txNumFixe;
    private javax.swing.JTextField txNumMobile;
    private javax.swing.JTextField txPrenomEns;
    private javax.swing.JTextField txProfession;
    // End of variables declaration//GEN-END:variables

    
}
