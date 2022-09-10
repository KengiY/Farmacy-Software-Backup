/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_Prenotazione;

import Control.ControlDiRicercaFarmaci;
import Control.ControlNotifiche;
import Control.ControlOrdini;
import com.mycompany.farmacysoftware.Agg_Magazzino.AggiornaMagazzino;
import com.mycompany.farmacysoftware.G_OrdineCorriere.VisualizzaOrdineCorriere;
import com.mycompany.farmacysoftware.G_Prenotazione.ModificaOrdine;
import com.mycompany.farmacysoftware.G_Prenotazione.GestionePrenotazione;
import com.mycompany.farmacysoftware.G_Prenotazione.GestionePrenotazione;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manfr
 */
public class VisualizzaCarrello extends javax.swing.JFrame {
    
    DefaultTableModel tbcModel;    
    LinkedList<String> tipoId= new LinkedList<String>();
    LinkedList<String> nomeFarmaco = new LinkedList<String>();
    LinkedList<String> qua = new LinkedList<String>();
    LinkedList<String> nOrdine = new LinkedList<String>();
    

    
    
    public VisualizzaCarrello() throws SQLException {
        initComponents();
        carica_Carrello();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bottoneIndietro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bottoneConfermaOrdine = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        bottoneModificaOrdine = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacy Software");
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Visualizza Carrello");

        bottoneIndietro.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\reply-fill.png")); // NOI18N
        bottoneIndietro.setText("Indietro");
        bottoneIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneIndietroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lista Farmaci", "Quantita", "Numero Ordine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bottoneConfermaOrdine.setBackground(new java.awt.Color(204, 255, 204));
        bottoneConfermaOrdine.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\send-plane-fill.png")); // NOI18N
        bottoneConfermaOrdine.setText("Conferma Ordine");
        bottoneConfermaOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneConfermaOrdineActionPerformed(evt);
            }
        });

        bottoneModificaOrdine.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\edit-line.png")); // NOI18N
        bottoneModificaOrdine.setText("Modifica Ordine");
        bottoneModificaOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneModificaOrdineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bottoneModificaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bottoneConfermaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottoneModificaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(bottoneConfermaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottoneIndietro)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneIndietro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void bottoneIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneIndietroActionPerformed
        ClickIndietro();
    }//GEN-LAST:event_bottoneIndietroActionPerformed
    
    
    public void ClickIndietro(){
        new GestionePrenotazione().setVisible(true);
        this.setVisible(false);
    }
    
    
    private void bottoneConfermaOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneConfermaOrdineActionPerformed
        ConfermaOrdine();
    }//GEN-LAST:event_bottoneConfermaOrdineActionPerformed
    
    
    public void ConfermaOrdine(){
        try {
        carica_carrelloOrdini();

        }catch (SQLException ex) {
            Logger.getLogger(VisualizzaCarrello.class.getName()).log(Level.SEVERE, null, ex);
        } 
        ControlNotifiche cn = new ControlNotifiche();
        int tipo=1;
        String mex= "nuovo ordine";
        String luogo= "db_azienda";
        try {
            cn.InvioNotifica(tipo,  mex, luogo);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        try {
            new VisualizzaCarrello().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    private void bottoneModificaOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneModificaOrdineActionPerformed
        ClickModificaOrdine();
    }//GEN-LAST:event_bottoneModificaOrdineActionPerformed
    
    
    public void ClickModificaOrdine(){
        try {
        new ModificaOrdine().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaCarrello.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }
    
    
    public void carica_carrelloOrdini() throws SQLException{
        ControlDiRicercaFarmaci vo = new ControlDiRicercaFarmaci();
        vo.VisualizzaOrdini();
        
        tipoId = (LinkedList<String>) vo.getListI();
        nomeFarmaco = (LinkedList<String>) vo.getListN();
        qua = (LinkedList<String>) vo.getListQ();
        nOrdine = (LinkedList<String>) vo.getListNo();
        
        ControlOrdini ao = new ControlOrdini();
        
        while(!nOrdine.isEmpty()){
            
            int tipoid = Integer.parseInt(tipoId.getFirst());
            String n = nomeFarmaco.getFirst();
            int q = Integer.parseInt(qua.getFirst());
            int nor = Integer.parseInt(nOrdine.getFirst());
            
            
            ao.addOrdine(tipoid, n, q, nor);
            
            
            tipoId.removeFirst();
            nomeFarmaco.removeFirst();
            qua.removeFirst();
            nOrdine.removeFirst();
        }
        
        ao.elimina();
        ao.addOrdineDipendente();
        
        
    }
    
    
    public void carica_Carrello() throws SQLException{
        
        System.out.println("sono in caricaCarrello");
     
        
        ControlDiRicercaFarmaci vc = new ControlDiRicercaFarmaci();
        
        vc.VisualizzaCarrello();
        
        tipoId = (LinkedList<String>) vc.getListI();
        nomeFarmaco = (LinkedList<String>) vc.getListN();
        qua = (LinkedList<String>) vc.getListQ();
        nOrdine = (LinkedList<String>) vc.getListNo();
        
        while(!nOrdine.isEmpty()){
            
            String tbcData[] = {tipoId.getFirst(), nomeFarmaco.getFirst(), qua.getFirst(),nOrdine.getFirst()};
            
            tbcModel = (DefaultTableModel)jTable1.getModel();
            tbcModel.addRow(tbcData);
            
            tipoId.removeFirst();
            nomeFarmaco.removeFirst();
            qua.removeFirst();
            nOrdine.removeFirst();
        }
                   
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
            java.util.logging.Logger.getLogger(VisualizzaCarrello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizzaCarrello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizzaCarrello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizzaCarrello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VisualizzaCarrello().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VisualizzaCarrello.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneConfermaOrdine;
    private javax.swing.JButton bottoneIndietro;
    private javax.swing.JButton bottoneModificaOrdine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
