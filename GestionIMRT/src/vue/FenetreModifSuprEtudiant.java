/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import metier.Etudiant;

/**
 *
 * @author paul
 */
public class FenetreModifSuprEtudiant extends javax.swing.JFrame {

    private boolean etatValidation;

    /**
     * Creates new form FenetreModifSuprEtudiant
     *
     * @param parent
     * @param etu
     */
    public FenetreModifSuprEtudiant(java.awt.Frame parent, Etudiant etu, String libelle) {
        initComponents();
        if (libelle == "Ajouter fiche Etudiant") {
            this.lTitre.setText(libelle);
            //todo code suprimer etudiant
        } else if (libelle == "Suprimer fiche Etudiant") {

            this.lTitre.setText(libelle);
            this.btEnregistrerEtu.setText("supprimer");
            // code suprimerr etuf=diant
        } else if (libelle == "Modifier fiche Etudiant") {

            this.lTitre.setText(libelle);
            this.txNomEtu.setText(etu.getNomEtudiant());
            this.txPrenomEtu.setText(etu.getPrenomEtudiant());
            this.txDateNaissanceEtu.setText(etu.getDateNaissanceEtudiant());
            this.txAdresse.setText(etu.getAdresseEtudiant());
            this.txNumFixe.setText(etu.getNumeroTelFixeEtudiant());
            this.txNumMobile.setText(etu.getNumeroTelMobilEtudiant());
            this.txAdresseMail.setText(etu.getMailEtudiant());
        }
    }

    public boolean doModal() {
        this.setVisible(true);
        return etatValidation;
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
        lNomEtu = new javax.swing.JLabel();
        txNomEtu = new javax.swing.JTextField();
        lPrenomEtu = new javax.swing.JLabel();
        txPrenomEtu = new javax.swing.JTextField();
        lDateNaissanceEtu = new javax.swing.JLabel();
        txDateNaissanceEtu = new javax.swing.JTextField();
        lAdresse = new javax.swing.JLabel();
        txAdresse = new javax.swing.JTextField();
        lNumFixe = new javax.swing.JLabel();
        txNumFixe = new javax.swing.JTextField();
        lNumMobile = new javax.swing.JLabel();
        txNumMobile = new javax.swing.JTextField();
        lAdresseMail = new javax.swing.JLabel();
        txAdresseMail = new javax.swing.JTextField();
        lClasse = new javax.swing.JLabel();
        cbClasse = new javax.swing.JComboBox<>();
        lGroupe = new javax.swing.JLabel();
        cbGroupe = new javax.swing.JComboBox<>();
        btEnregistrerEtu = new javax.swing.JButton();
        btAnnulerEtu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lTitre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lTitre.setText("titre");

        lNomEtu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNomEtu.setText("Nom");

        txNomEtu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lPrenomEtu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPrenomEtu.setText("Prénom");

        txPrenomEtu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lDateNaissanceEtu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lDateNaissanceEtu.setText("Date de naissance");

        txDateNaissanceEtu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lAdresse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lAdresse.setText("Adresse");

        lNumFixe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNumFixe.setText("Numero de telephone fixe");

        lNumMobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNumMobile.setText("Numero de telephone mobile");

        lAdresseMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lAdresseMail.setText("Adresse mail");

        lClasse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lClasse.setText("Classe");

        cbClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lGroupe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lGroupe.setText("Groupe");

        cbGroupe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btEnregistrerEtu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEnregistrerEtu.setText("Enregistrer");

        btAnnulerEtu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAnnulerEtu.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(lNomEtu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txNomEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(lPrenomEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txPrenomEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lDateNaissanceEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txDateNaissanceEtu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txAdresse)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lNumFixe)
                                        .addGap(30, 30, 30)
                                        .addComponent(txNumFixe))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lAdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txAdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                        .addComponent(lClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(btEnregistrerEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(lGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNumMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAnnulerEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txNumMobile)
                                        .addComponent(cbGroupe, 0, 143, Short.MAX_VALUE)))))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txNomEtu)
                        .addComponent(lPrenomEtu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lDateNaissanceEtu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txDateNaissanceEtu)
                        .addComponent(lNomEtu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txPrenomEtu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNumMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumFixe)
                    .addComponent(txNumFixe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNumMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txAdresseMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnregistrerEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAnnulerEtu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnnulerEtu;
    private javax.swing.JButton btEnregistrerEtu;
    private javax.swing.JComboBox<String> cbClasse;
    private javax.swing.JComboBox<String> cbGroupe;
    private javax.swing.JLabel lAdresse;
    private javax.swing.JLabel lAdresseMail;
    private javax.swing.JLabel lClasse;
    private javax.swing.JLabel lDateNaissanceEtu;
    private javax.swing.JLabel lGroupe;
    private javax.swing.JLabel lNomEtu;
    private javax.swing.JLabel lNumFixe;
    private javax.swing.JLabel lNumMobile;
    private javax.swing.JLabel lPrenomEtu;
    private javax.swing.JLabel lTitre;
    private javax.swing.JTextField txAdresse;
    private javax.swing.JTextField txAdresseMail;
    private javax.swing.JTextField txDateNaissanceEtu;
    private javax.swing.JTextField txNomEtu;
    private javax.swing.JTextField txNumFixe;
    private javax.swing.JTextField txNumMobile;
    private javax.swing.JTextField txPrenomEtu;
    // End of variables declaration//GEN-END:variables
}
