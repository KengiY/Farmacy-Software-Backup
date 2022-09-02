package com.mycompany.farmacysoftware;

import com.mycompany.farmacysoftware.Agg_Magazzino.AggiornaMagazzino;
import com.mycompany.farmacysoftware.Autenticazione.Login;
import com.mycompany.farmacysoftware.G_Prenotazione.GestionePrenotazione;
import com.mycompany.farmacysoftware.G_Scorte.GestioneScorte;
import com.mycompany.farmacysoftware.G_Scorte.GestioneScorte;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template




/**
 *
 * @author manfr
 */
public class HomeFarmacista extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public HomeFarmacista() {
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

        jDialog1 = new javax.swing.JDialog();
        bottoneLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bottoneAggiornaMagazzino = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        bottoneGestioneScorte = new javax.swing.JButton();
        bottoneGestionePrenotazione = new javax.swing.JButton();
        bottoneNotifiche = new javax.swing.JButton();
        home_benvenuto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacy Software 1.0");
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);

        bottoneLogout.setText("Logout");
        bottoneLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneLogoutActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 480));

        bottoneAggiornaMagazzino.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\refresh-fill.png")); // NOI18N
        bottoneAggiornaMagazzino.setText("Aggiorna Magazzino");
        bottoneAggiornaMagazzino.setPreferredSize(new java.awt.Dimension(158, 158));
        bottoneAggiornaMagazzino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneAggiornaMagazzinoActionPerformed(evt);
            }
        });

        bottoneGestioneScorte.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\red-packet-fill.png")); // NOI18N
        bottoneGestioneScorte.setText("Gestione Scorte");
        bottoneGestioneScorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneGestioneScorteActionPerformed(evt);
            }
        });

        bottoneGestionePrenotazione.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\icons8-scatola-consegnata-24.png")); // NOI18N
        bottoneGestionePrenotazione.setText("Gestione Prenotazione");
        bottoneGestionePrenotazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneGestionePrenotazioneActionPerformed(evt);
            }
        });

        bottoneNotifiche.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\notification-4-fill.png")); // NOI18N
        bottoneNotifiche.setText("Notifiche");
        bottoneNotifiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneNotificheActionPerformed(evt);
            }
        });

        home_benvenuto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        home_benvenuto.setForeground(new java.awt.Color(242, 242, 242));
        home_benvenuto.setText("Benvenuto Farmacista");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jSeparator2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bottoneGestioneScorte, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bottoneGestionePrenotazione))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bottoneAggiornaMagazzino, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(bottoneNotifiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home_benvenuto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(home_benvenuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottoneAggiornaMagazzino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneGestionePrenotazione, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottoneGestioneScorte, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneNotifiche, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Home");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\icons8-bastone-di-asclepio-40.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottoneLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bottoneLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoneLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneLogoutActionPerformed
        // TODO add your handling code here:
            new Login().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_bottoneLogoutActionPerformed

    private void bottoneGestionePrenotazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneGestionePrenotazioneActionPerformed
            new GestionePrenotazione().setVisible(true);
            this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bottoneGestionePrenotazioneActionPerformed

    private void bottoneAggiornaMagazzinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneAggiornaMagazzinoActionPerformed
            new AggiornaMagazzino().setVisible(true);
            this.setVisible(false); 
    }//GEN-LAST:event_bottoneAggiornaMagazzinoActionPerformed

    private void bottoneGestioneScorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneGestioneScorteActionPerformed
        try {
            new GestioneScorte().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomeFarmacista.class.getName()).log(Level.SEVERE, null, ex);
        }
            this.setVisible(false); 
    }//GEN-LAST:event_bottoneGestioneScorteActionPerformed

    private void bottoneNotificheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneNotificheActionPerformed
        try {
            new NotificheDipendente().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomeFarmacista.class.getName()).log(Level.SEVERE, null, ex);
        }
            this.setVisible(false); 
    }//GEN-LAST:event_bottoneNotificheActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HomeFarmacista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFarmacista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFarmacista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFarmacista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFarmacista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneAggiornaMagazzino;
    private javax.swing.JButton bottoneGestionePrenotazione;
    private javax.swing.JButton bottoneGestioneScorte;
    private javax.swing.JButton bottoneLogout;
    private javax.swing.JButton bottoneNotifiche;
    private javax.swing.JLabel home_benvenuto;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
