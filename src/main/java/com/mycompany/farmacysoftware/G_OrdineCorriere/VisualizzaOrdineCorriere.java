/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_OrdineCorriere;

import Control.ControlDiRicercaFarmaci;
import Control.ControlNotifiche;
import Control.ControlOrdini;
import com.mycompany.farmacysoftware.G_OrdineDipendente.GestioneOrdine;
import com.mycompany.farmacysoftware.HomeCorriere;
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
public class VisualizzaOrdineCorriere extends javax.swing.JFrame {

    DefaultTableModel tbcModel;
    LinkedList<String> farmacia= new LinkedList<String>();
    LinkedList<String> nomeIndirizzi = new LinkedList<String>();
    LinkedList<String> stat = new LinkedList<String>();
    LinkedList<String> nOrdine = new LinkedList<String>();
    
    String Ordine;
    
    
    /**
     * Creates new form VisualizzaOrdineCorriere
     */
    public VisualizzaOrdineCorriere() throws SQLException {
        initComponents();
        caricaOrdiniCorriere();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Indietro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        JButton_OrdineConsegnato = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVOC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacy Software - Corriere");
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Visualizza Stato Ordine");
        jLabel1.setToolTipText("");

        Indietro.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\arrow-left-circle-line.png")); // NOI18N
        Indietro.setText("Indietro");
        Indietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndietroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        JButton_OrdineConsegnato.setBackground(new java.awt.Color(204, 255, 204));
        JButton_OrdineConsegnato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JButton_OrdineConsegnato.setIcon(new javax.swing.ImageIcon("C:\\Users\\manfr\\Documents\\GitHub\\Farmacy-Software-Backup\\icon\\truck-fill.png")); // NOI18N
        JButton_OrdineConsegnato.setText("Ordine Consegnato");
        JButton_OrdineConsegnato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_OrdineConsegnatoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Lista Ordini Corriere");

        jLabel3.setText("Clicca per confermare la consegna");

        jTableVOC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ordine", "Farmacia", "Indirizzo", "Stato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVOC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVOCMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVOC);
        if (jTableVOC.getColumnModel().getColumnCount() > 0) {
            jTableVOC.getColumnModel().getColumn(0).setResizable(false);
            jTableVOC.getColumnModel().getColumn(1).setResizable(false);
            jTableVOC.getColumnModel().getColumn(2).setResizable(false);
            jTableVOC.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(281, 281, 281))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(JButton_OrdineConsegnato, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JButton_OrdineConsegnato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Indietro)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Indietro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_OrdineConsegnatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_OrdineConsegnatoActionPerformed
        //INVIARE NOTIFICA
        consegnaOrdine();
    }//GEN-LAST:event_JButton_OrdineConsegnatoActionPerformed

    private void IndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndietroActionPerformed
        clickIndietro();
    }//GEN-LAST:event_IndietroActionPerformed

    private void jTableVOCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVOCMouseClicked
          
            JTable source = (JTable)evt.getSource();
            //int row = source.rowAtPoint( evt.getPoint() );
            int i = jTableVOC.getSelectedRow();
            
            int column = source.columnAtPoint( evt.getPoint() );
            Ordine=source.getModel().getValueAt(i, 0)+"";
            System.out.println(Ordine);
    }//GEN-LAST:event_jTableVOCMouseClicked

    
   public void clickIndietro(){
       new HomeCorriere().setVisible(true);
       this.setVisible(false);
   } 
    
    
   public void consegnaOrdine(){
      ControlOrdini oc = new ControlOrdini(); 
        
        try {
            oc.CambioStatoCorriere(Ordine);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ControlNotifiche cn = new ControlNotifiche();
        
        int tipo=1;
        
        String mex="pacco consegnato";
        String luogo= "db_farmacia";
        
        try {
            cn.InvioNotifica(tipo,  mex, luogo);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.setVisible(false);
        
        try {
            new VisualizzaOrdineCorriere().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(Level.SEVERE, null, ex);
        } 
   } 
    
     
   public void caricaOrdiniCorriere() throws SQLException{
        
        System.out.println("sono in caricaOrdiniCorriere");
     
        
        ControlDiRicercaFarmaci coc = new ControlDiRicercaFarmaci();
        
        coc.VisualizzaOrdiniCorriere();
       
        nOrdine = (LinkedList<String>) coc.getListNo();
        farmacia = (LinkedList<String>) coc.getListNF();
        nomeIndirizzi = (LinkedList<String>) coc.getListIZ();
        stat = (LinkedList<String>) coc.getStatus();
        
        while(!nOrdine.isEmpty()){
            
            String tbcData[] = {nOrdine.getFirst(),farmacia.getFirst(),nomeIndirizzi.getFirst(),stat.getFirst()};
            
            tbcModel = (DefaultTableModel)jTableVOC.getModel();
            tbcModel.addRow(tbcData);
            
            nOrdine.removeFirst();
            farmacia.removeFirst();
            nomeIndirizzi.removeFirst();
            stat.removeFirst();
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
            java.util.logging.Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VisualizzaOrdineCorriere().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VisualizzaOrdineCorriere.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Indietro;
    private javax.swing.JButton JButton_OrdineConsegnato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableVOC;
    // End of variables declaration//GEN-END:variables
}
