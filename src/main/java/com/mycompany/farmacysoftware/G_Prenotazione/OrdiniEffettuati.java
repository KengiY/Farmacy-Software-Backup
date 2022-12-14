/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_Prenotazione;

import Control.ControlDiRicercaFarmaci;
import Control.ControlOrdini;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manfr
 */
public class OrdiniEffettuati extends javax.swing.JFrame {

    DefaultTableModel tbcModel;
    LinkedList<String> nOrdine = new LinkedList<String>();
    LinkedList<String> stat = new LinkedList<String>();
    LinkedList<String> farmacia = new LinkedList<String>();
    LinkedList<String> tipoId= new LinkedList<String>();
    LinkedList<String> nomeFarmaco = new LinkedList<String>();
    LinkedList<String> qua = new LinkedList<String>();   
    String clicked_element_nOrdine= null;
    String clicked_element_farmacia= null;   
    String clicked_element_farm= null;
    String clicked_element_qt= null;
    String clicked_element_ordine;
    
    public OrdiniEffettuati() throws SQLException {
        initComponents();
        caricaStatoOrdiniDip();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Visualizza = new javax.swing.JButton();
        EliminaOrdine = new javax.swing.JButton();
        ModificaOrdine = new javax.swing.JButton();
        fieldQuantita = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        indietro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(242, 242, 242));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Ordine", "Stato"
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        Visualizza.setText("Visualizza");
        Visualizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizzaActionPerformed(evt);
            }
        });

        EliminaOrdine.setText("Elimina Ordine");
        EliminaOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaOrdineActionPerformed(evt);
            }
        });

        ModificaOrdine.setText("Modifica Ordine");
        ModificaOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaOrdineActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Farmaci", "Quantit??", "Nordine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setText("Inserisci quantit??:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fieldQuantita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ModificaOrdine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EliminaOrdine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Visualizza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Visualizza, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldQuantita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ModificaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(EliminaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ordini Effettuati");

        indietro.setText("Indietro");
        indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indietroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(indietro)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(indietro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void indietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indietroActionPerformed
        // TODO add your handling code here:
        ClickIndietro();
    }//GEN-LAST:event_indietroActionPerformed
    
    
    public void ClickIndietro(){
        new GestionePrenotazione().setVisible(true);
        this.setVisible(false);
    }
    
    
    private void ModificaOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaOrdineActionPerformed
        ModificaOrdine();
    }//GEN-LAST:event_ModificaOrdineActionPerformed
    
    
    public void ModificaOrdine(){
        int qta = Integer.parseInt(fieldQuantita.getText());
        System.out.println(qta + clicked_element_qt);

        int clicked_qt = Integer.parseInt(clicked_element_qt);
        
        if(qta != clicked_qt){
            ControlDiRicercaFarmaci fr = new ControlDiRicercaFarmaci();
            try {
                fr.ModificaOrdine2( qta, clicked_element_farm );
            } catch (SQLException ex) {
                Logger.getLogger(ModificaOrdine.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, "Ordine Modificato");
        this.setVisible(false);
        try {
            new OrdiniEffettuati().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrdiniEffettuati.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private void EliminaOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminaOrdineActionPerformed
        eliminaOrdine();
    }//GEN-LAST:event_EliminaOrdineActionPerformed
    
    
    public void eliminaOrdine(){
                    ControlOrdini co= new ControlOrdini();
        try {
            co.EliminaOrdiniTotali2(clicked_element_nOrdine);
      
        } catch (SQLException ex) {
            Logger.getLogger(OrdiniEffettuati.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        try {
            new OrdiniEffettuati().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrdiniEffettuati.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            JTable source = (JTable)evt.getSource();
            int i = jTable1.getSelectedRow();
            
            int column = source.columnAtPoint( evt.getPoint() );
            clicked_element_nOrdine=source.getModel().getValueAt(i, 0)+"";
            System.out.println(clicked_element_nOrdine);
    }//GEN-LAST:event_jTable1MouseClicked

    
    private void VisualizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizzaActionPerformed
        try {
            visualizzafarmacifiltrati();
        } catch (SQLException ex) {
            Logger.getLogger(OrdiniEffettuati.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_VisualizzaActionPerformed

    
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
            JTable source = (JTable)evt.getSource();
            //int row = source.rowAtPoint( evt.getPoint() );
            int i = jTable2.getSelectedRow();
            int column = source.columnAtPoint( evt.getPoint() );
            clicked_element_farm=source.getModel().getValueAt(i, 1)+"";
            clicked_element_qt=source.getModel().getValueAt(i, 2)+"";
        
    }//GEN-LAST:event_jTable2MouseClicked
    
    
    public void caricaStatoOrdiniDip() throws SQLException{
        
        System.out.println("sono in caricaOrdiniCorriere");
     
        
        ControlDiRicercaFarmaci csod = new ControlDiRicercaFarmaci();
        
        csod.VisualizzaStatoOrdiniDipendente();
       
        nOrdine = (LinkedList<String>) csod.getListNo();
        stat = (LinkedList<String>) csod.getStatus();
        
        while(!nOrdine.isEmpty()){
            
            String tbcData[] = {nOrdine.getFirst(),stat.getFirst()};
            
            tbcModel = (DefaultTableModel)jTable1.getModel();
            tbcModel.addRow(tbcData);
            
            nOrdine.removeFirst();           
            stat.removeFirst();
        }
    }
    
    
    public void visualizzafarmacifiltrati() throws SQLException{
       
        String id = null;
        String nome = null;
        String quantita = null;
        String numero_ordine = null;       
        System.out.println(clicked_element_nOrdine);
        ControlOrdini slfpo = new ControlOrdini();
        System.out.println("stampaListaFarmaciPerOrdine()");
        int no = Integer.parseInt(clicked_element_nOrdine);
        slfpo.prendiFarmaciPerID(no);
        
        
        tipoId = (LinkedList<String>) slfpo.getId();
        nomeFarmaco = (LinkedList<String>) slfpo.getNome();
        qua = (LinkedList<String>) slfpo.getQuantita();
        nOrdine = (LinkedList<String>) slfpo.getNumero_ordine();
       
        while(!nOrdine.isEmpty()){
            System.out.println("WHILEINSIDE");
            String tbcData[] = {tipoId.getFirst(), nomeFarmaco.getFirst(), qua.getFirst(),nOrdine.getFirst()};
            
            tbcModel = (DefaultTableModel)jTable2.getModel();
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
            java.util.logging.Logger.getLogger(OrdiniEffettuati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdiniEffettuati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdiniEffettuati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdiniEffettuati.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new OrdiniEffettuati().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(OrdiniEffettuati.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminaOrdine;
    private javax.swing.JButton ModificaOrdine;
    private javax.swing.JButton Visualizza;
    private javax.swing.JTextField fieldQuantita;
    private javax.swing.JButton indietro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
