/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_Prenotazione;

import com.mycompany.farmacysoftware.HomeFarmacista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manfr
 */
public class GestionePrenotazione extends javax.swing.JFrame {

   
    public GestionePrenotazione() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelGestionePrenotazione = new javax.swing.JLabel();
        bottoneIndietro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        OrdiniEffettuati = new javax.swing.JButton();
        bottoneAggiungiFarmaco = new javax.swing.JButton();
        bottoneModificaeAnnulla = new javax.swing.JButton();
        bottonePrenotazioniAutomatiche = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacy Software 1.0");
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);

        labelGestionePrenotazione.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelGestionePrenotazione.setText("Gestione Prenotazione");

        bottoneIndietro.setText("Indietro");
        bottoneIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneIndietroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        OrdiniEffettuati.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\icons8-ordine-di-acquisto-24.png")); // NOI18N
        OrdiniEffettuati.setText("Ordini Effettuati");
        OrdiniEffettuati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdiniEffettuatiActionPerformed(evt);
            }
        });

        bottoneAggiungiFarmaco.setBackground(new java.awt.Color(204, 255, 204));
        bottoneAggiungiFarmaco.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\icons8-pi??-30.png")); // NOI18N
        bottoneAggiungiFarmaco.setText("Ordina Farmaci");
        bottoneAggiungiFarmaco.setBorder(null);
        bottoneAggiungiFarmaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneAggiungiFarmacoActionPerformed(evt);
            }
        });

        bottoneModificaeAnnulla.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\edit-line.png")); // NOI18N
        bottoneModificaeAnnulla.setText("Modifica Annulla Ordine");
        bottoneModificaeAnnulla.setBorder(null);
        bottoneModificaeAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneModificaeAnnullaActionPerformed(evt);
            }
        });

        bottonePrenotazioniAutomatiche.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\icons8-sincronizzare-24.png")); // NOI18N
        bottonePrenotazioniAutomatiche.setText("Prenotazioni Automatiche");
        bottonePrenotazioniAutomatiche.setBorder(null);
        bottonePrenotazioniAutomatiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonePrenotazioniAutomaticheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrdiniEffettuati, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneAggiungiFarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneModificaeAnnulla, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottonePrenotazioniAutomatiche, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(222, 222, 222))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(bottoneAggiungiFarmaco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(bottoneModificaeAnnulla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(bottonePrenotazioniAutomatiche, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(OrdiniEffettuati, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGestionePrenotazione, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottoneIndietro)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGestionePrenotazione, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(bottoneIndietro))
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void bottoneAggiungiFarmacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneAggiungiFarmacoActionPerformed
        ClickAggiungiFarmaco();
    }//GEN-LAST:event_bottoneAggiungiFarmacoActionPerformed
    
    
    public void ClickAggiungiFarmaco(){
            try {
            // TODO add your handling code here:
            new OrdinaFarmaci().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GestionePrenotazione.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);  
    
    }
    
        
    
   
    
    
    private void bottoneModificaeAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneModificaeAnnullaActionPerformed
        ClickModificaAnnulla();
    }//GEN-LAST:event_bottoneModificaeAnnullaActionPerformed
   
    
    public void ClickModificaAnnulla(){
            try {
            // TODO add your handling code here:
            new ModificaOrdine().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GestionePrenotazione.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }
    
    
    private void bottonePrenotazioniAutomaticheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonePrenotazioniAutomaticheActionPerformed
        ClickPrenotazioneAutomatiche();
    }//GEN-LAST:event_bottonePrenotazioniAutomaticheActionPerformed
    
    
    public void ClickPrenotazioneAutomatiche(){
            try {
            // TODO add your handling code here:
            new PrenotazioniAutomatiche().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GestionePrenotazione.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }
    
    
    private void bottoneIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneIndietroActionPerformed
        // TODO add your handling code here:
        Indietro();
    }//GEN-LAST:event_bottoneIndietroActionPerformed
    
    
    public void Indietro(){
            new HomeFarmacista().setVisible(true);
        this.setVisible(false);
        
    }
    
    
    private void OrdiniEffettuatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdiniEffettuatiActionPerformed
        ClickOrdiniEffettuati();
    }//GEN-LAST:event_OrdiniEffettuatiActionPerformed
    
    
    public void ClickOrdiniEffettuati(){
        try {
            // TODO add your handling code here:
            new OrdiniEffettuati().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GestionePrenotazione.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionePrenotazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionePrenotazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionePrenotazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionePrenotazione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GestionePrenotazione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OrdiniEffettuati;
    private javax.swing.JButton bottoneAggiungiFarmaco;
    private javax.swing.JButton bottoneIndietro;
    private javax.swing.JButton bottoneModificaeAnnulla;
    private javax.swing.JButton bottonePrenotazioniAutomatiche;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelGestionePrenotazione;
    // End of variables declaration//GEN-END:variables

   
}
