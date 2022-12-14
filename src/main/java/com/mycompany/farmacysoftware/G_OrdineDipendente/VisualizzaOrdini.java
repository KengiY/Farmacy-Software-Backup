/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_OrdineDipendente;

import Control.ControlDiRicercaFarmaci;
import Control.ControlOrdini;
import com.mycompany.farmacysoftware.G_Prenotazione.ModificaOrdine;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 39329
 */
public class VisualizzaOrdini extends javax.swing.JFrame {

    DefaultTableModel tbcModel;
    
    LinkedList<String> nOrdine= new LinkedList<String>();
    LinkedList<String> farmacia = new LinkedList<String>();
    LinkedList<String> tipoId= new LinkedList<String>();
    LinkedList<String> nomeFarmaco = new LinkedList<String>();
    LinkedList<String> qua = new LinkedList<String>();
    
   
    String clicked_element_nOrdine= null;
    String clicked_element_farmacia= null;

    String clicked_element_ordine;
    
    /**
     * Creates new form VisualizzaOrdini
     */
    public VisualizzaOrdini() throws SQLException {
        initComponents();
        visualizza_ordini_dip();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        Indietro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ConfermaOrdine = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        EliminaOrdine = new javax.swing.JButton();
        VisualizzaOrdine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaFarmaci = new javax.swing.JTable();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacy Software - Dipendente");
        setLocation(new java.awt.Point(600, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Visualizza Ordini");
        jLabel1.setToolTipText("");

        Indietro.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\arrow-left-circle-line.png")); // NOI18N
        Indietro.setText("Indietro");
        Indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndietroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        ConfermaOrdine.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\send-plane-fill.png")); // NOI18N
        ConfermaOrdine.setText("Conferma Ordine");
        ConfermaOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfermaOrdineActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Ordine", "Farmacia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        EliminaOrdine.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\delete-bin-fill.png")); // NOI18N
        EliminaOrdine.setText("Elimina Ordine");
        EliminaOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaOrdineActionPerformed(evt);
            }
        });

        VisualizzaOrdine.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\eye-fill.png")); // NOI18N
        VisualizzaOrdine.setText("Visualizza Ordine");
        VisualizzaOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizzaOrdineActionPerformed(evt);
            }
        });

        jTableListaFarmaci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lista Farmaci", "Quantit??", "NumeroOrdine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
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
        jTableListaFarmaci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaFarmaciMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListaFarmaci);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ConfermaOrdine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(VisualizzaOrdine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EliminaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(VisualizzaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConfermaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Indietro)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Indietro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndietroActionPerformed
        new GestioneOrdine().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IndietroActionPerformed

    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
  
        JTable source = (JTable)evt.getSource();
            //int row = source.rowAtPoint( evt.getPoint() );
            int i = jTable1.getSelectedRow();
            
            int column = source.columnAtPoint( evt.getPoint() );
            clicked_element_nOrdine=source.getModel().getValueAt(i, 0)+"";
            clicked_element_farmacia=source.getModel().getValueAt(i, 1)+"";

    }//GEN-LAST:event_jTable1MouseClicked
    
    
    private void ConfermaOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfermaOrdineActionPerformed
        confermaOrdine();        
    }//GEN-LAST:event_ConfermaOrdineActionPerformed

    private void EliminaOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminaOrdineActionPerformed
        eliminaOrdine();
    }//GEN-LAST:event_EliminaOrdineActionPerformed

    private void VisualizzaOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizzaOrdineActionPerformed
       visualizzaOrdiniFiltrati();        
    }//GEN-LAST:event_VisualizzaOrdineActionPerformed

    
    private void jTableListaFarmaciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaFarmaciMouseClicked
            JTable source = (JTable)evt.getSource();
            int i = jTableListaFarmaci.getSelectedRow();
            
            int column = source.columnAtPoint( evt.getPoint() );
            clicked_element_nOrdine=source.getModel().getValueAt(i, 3)+"";
            System.out.println(clicked_element_nOrdine);

    }//GEN-LAST:event_jTableListaFarmaciMouseClicked


    public void confermaOrdine(){
        ControlOrdini co= new ControlOrdini();
        try {
            co.Confermaordinicorriere(clicked_element_nOrdine);
            co.CambioStato(clicked_element_nOrdine);
            co.EliminaOrdiniTotali(clicked_element_nOrdine);

        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdini.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        try {
            new VisualizzaOrdini().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminaOrdine(){
        ControlOrdini co= new ControlOrdini();
        try {
            co.EliminaOrdiniTotali(clicked_element_nOrdine);
            co.EliminaOrdini(clicked_element_nOrdine);
      
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdini.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        try {
            new VisualizzaOrdini().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void visualizzaOrdiniFiltrati(){
        try {
            visualizzafarmacifiltrati();
            
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void stampaListaFarmaciPerOrdine() throws SQLException{
        
        String id = null;
        String nome = null;
        String quantita = null;
        String numero_ordine = null;
        
        System.out.println("stampaListaFarmaciPerOrdine()");
        
        ControlOrdini slfpo = new ControlOrdini();
        
        int row = jTable1.getSelectedRow();
        clicked_element_nOrdine = jTable1.getModel().getValueAt(row, 1)+"";
        slfpo.prendiFarmaciPerNordine(Integer.parseInt(clicked_element_nOrdine));
        
        tipoId = (LinkedList<String>) slfpo.getId();
        nomeFarmaco = (LinkedList<String>) slfpo.getNome();
        qua = (LinkedList<String>) slfpo.getQuantita();
        nOrdine = (LinkedList<String>) slfpo.getNumero_ordine();
       
        while(!nOrdine.isEmpty()){
            System.out.println("WHILEINSIDE");
            
            
            String tbcData[] = {tipoId.getFirst(), nomeFarmaco.getFirst(), qua.getFirst(),nOrdine.getFirst()};
            
            tbcModel = (DefaultTableModel)jTable1.getModel();
            tbcModel.addRow(tbcData);
            
            tipoId.removeFirst();
            nomeFarmaco.removeFirst();
            qua.removeFirst();
            nOrdine.removeFirst();
        }
  
        
        
        
       
    }
    
    public void visualizza_ordini_dip() throws SQLException{
        
        System.out.println("sono in VisualizzaOrdiniDipendente");
        
  
        ControlDiRicercaFarmaci vod = new ControlDiRicercaFarmaci();
        
        vod.VisualizzaOrdiniDip();
        
        
        farmacia = (LinkedList<String>) vod.getListNF();
        nOrdine = (LinkedList<String>) vod.getListNo();
        
        while(!nOrdine.isEmpty()){
            System.out.println("WHILEINSIDE");    
            String tbcData[] = {nOrdine.getFirst(), farmacia.getFirst()};
            
            tbcModel = (DefaultTableModel)jTable1.getModel();
            tbcModel.addRow(tbcData);
  
            nOrdine.removeFirst();
            farmacia.removeFirst();
        }
       
    }
    
    public void visualizzafarmacifiltrati() throws SQLException{
        
        System.out.println("visualizzafarmacifiltrati()");
        String id = null;
        String nome = null;
        String quantita = null;
        String numero_ordine = null;        
        System.out.println(clicked_element_nOrdine);
        ControlOrdini slfpo = new ControlOrdini();
        System.out.println("stampaListaFarmaciPerOrdine()");
        int no = Integer.parseInt(clicked_element_nOrdine);
        slfpo.prendiFarmaciPerNordine(no);
        
        
        tipoId = (LinkedList<String>) slfpo.getId();
        nomeFarmaco = (LinkedList<String>) slfpo.getNome();
        qua = (LinkedList<String>) slfpo.getQuantita();
        nOrdine = (LinkedList<String>) slfpo.getNumero_ordine();
       
        while(!nOrdine.isEmpty()){
            System.out.println("WHILEINSIDE");
            String tbcData[] = {tipoId.getFirst(), nomeFarmaco.getFirst(), qua.getFirst(),nOrdine.getFirst()};
            
            tbcModel = (DefaultTableModel)jTableListaFarmaci.getModel();
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
            java.util.logging.Logger.getLogger(VisualizzaOrdini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizzaOrdini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizzaOrdini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizzaOrdini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VisualizzaOrdini().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VisualizzaOrdini.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfermaOrdine;
    private javax.swing.JButton EliminaOrdine;
    private javax.swing.JButton Indietro;
    private javax.swing.JButton VisualizzaOrdine;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableListaFarmaci;
    // End of variables declaration//GEN-END:variables
}
