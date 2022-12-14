/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_Prenotazione;


import Control.ControlDiRicercaFarmaci;
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
public class ModificaOrdine extends javax.swing.JFrame {

    DefaultTableModel tbcModel;
    LinkedList<String> tipoId= new LinkedList<String>();
    LinkedList<String> nomeFarmaco = new LinkedList<String>();
    LinkedList<String> qua = new LinkedList<String>();
    LinkedList<String> nOrdine = new LinkedList<String>();
    LinkedList<String> OrdiniDaEliminare= new LinkedList<String>();
    String clicked_element_farm= null;
    String clicked_element_qt= null;
    String clicked_element_farmaco;

    
    public ModificaOrdine() throws SQLException {
        initComponents();
        carica_CarrelloInModificaOrdine();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Indietro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bottoneConfermaModifica = new javax.swing.JButton();
        bottoneEliminaOrdine = new javax.swing.JButton();
        textfield_quantita = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Modifica Ordine");

        Indietro.setText("Indietro");
        Indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndietroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inserire Quantit??:");

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
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bottoneConfermaModifica.setBackground(new java.awt.Color(204, 255, 204));
        bottoneConfermaModifica.setText("Conferma Modifica");
        bottoneConfermaModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneConfermaModificaActionPerformed(evt);
            }
        });

        bottoneEliminaOrdine.setBackground(new java.awt.Color(255, 153, 153));
        bottoneEliminaOrdine.setText("Elimina Ordine");
        bottoneEliminaOrdine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneEliminaOrdineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfield_quantita, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bottoneEliminaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bottoneConfermaModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottoneConfermaModifica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bottoneEliminaOrdine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textfield_quantita, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(Indietro)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Indietro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void bottoneConfermaModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneConfermaModificaActionPerformed
       ConfermaModificaOrdine();  
    }//GEN-LAST:event_bottoneConfermaModificaActionPerformed

    
   public void ConfermaModificaOrdine(){
           int qta = Integer.parseInt(textfield_quantita.getText());
        System.out.println(qta + clicked_element_qt);
        
        
        int clicked_qt = Integer.parseInt(clicked_element_qt);
        
        if(qta != clicked_qt){
            ControlDiRicercaFarmaci fr = new ControlDiRicercaFarmaci();
            try {
                fr.ModificaOrdine( qta, clicked_element_farm );
            } catch (SQLException ex) {
                Logger.getLogger(ModificaOrdine.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Ordine Modificato");
        this.setVisible(false);
        try {
            new ModificaOrdine().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ModificaOrdine.class.getName()).log(Level.SEVERE, null, ex);
        } 
   
   } 
   
   
    private void bottoneEliminaOrdineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneEliminaOrdineActionPerformed
        EliminaOrdine();
    }//GEN-LAST:event_bottoneEliminaOrdineActionPerformed
    
    
    public void EliminaOrdine(){
            int row = jTable1.getSelectedRow();
        clicked_element_farmaco=jTable1.getModel().getValueAt(row, 1)+"";
        ControlDiRicercaFarmaci vc = new ControlDiRicercaFarmaci();
        try {
            vc.EliminaElemento(clicked_element_farmaco);
        } catch (SQLException ex) {
            Logger.getLogger(ModificaOrdine.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        try {
            new ModificaOrdine().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ModificaOrdine.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    private void IndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndietroActionPerformed
        Indietro();
    }//GEN-LAST:event_IndietroActionPerformed

    
    public void Indietro(){            
        // TODO add your handling code here:
        new GestionePrenotazione().setVisible(true);
        this.setVisible(false);
    }
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            JTable source = (JTable)evt.getSource();
            //int row = source.rowAtPoint( evt.getPoint() );
            int i = jTable1.getSelectedRow();
            int column = source.columnAtPoint( evt.getPoint() );
            clicked_element_farm=source.getModel().getValueAt(i, 1)+"";
            clicked_element_qt=source.getModel().getValueAt(i, 2)+"";
        
       
    }//GEN-LAST:event_jTable1MouseClicked

    
    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
        
    }//GEN-LAST:event_jTable1InputMethodTextChanged

    
    public void carica_CarrelloInModificaOrdine() throws SQLException{
        
        System.out.println("sono in caricaCarrello");
        String id = null;
        String nome = null;
        String quantita = null;
        String numero_ordine = null;
        
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
            java.util.logging.Logger.getLogger(ModificaOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificaOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificaOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificaOrdine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificaOrdine().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificaOrdine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Indietro;
    private javax.swing.JButton bottoneConfermaModifica;
    private javax.swing.JButton bottoneEliminaOrdine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textfield_quantita;
    // End of variables declaration//GEN-END:variables
}
