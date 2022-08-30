/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_Scorte;


import Control.ControlDiRicercaFarmaci;
import com.mycompany.farmacysoftware.HomeFarmacista;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author manfr
 */
public class GestioneScorte extends javax.swing.JFrame {

    LinkedList<String> name= new LinkedList<String>();
    LinkedList<String> ad= new LinkedList<String>();
    LinkedList<String> pd= new LinkedList<String>();
    LinkedList<String> quant= new LinkedList<String>();
    
    DefaultTableModel tbgsModel;
  


    /**
     * Creates new form VisualizzaScorte
     */
    public GestioneScorte() throws SQLException {
        initComponents();
        carica_tabellaScorte();
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
        bottoneIndietro = new javax.swing.JButton();
        PannelloRicerca = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        barraDiRicerca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacy Software 1.0");
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gestione Scorte");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, 30));

        bottoneIndietro.setText("Indietro");
        bottoneIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneIndietroActionPerformed(evt);
            }
        });
        getContentPane().add(bottoneIndietro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        PannelloRicerca.setBackground(new java.awt.Color(0, 102, 102));
        PannelloRicerca.setForeground(new java.awt.Color(242, 242, 242));
        PannelloRicerca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Farmaco", "Nome Farmaco", "Quantità"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
        }

        PannelloRicerca.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 440));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Cerca il Farmaco:");
        PannelloRicerca.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));
        PannelloRicerca.add(barraDiRicerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 320, 30));

        jButton1.setText("Cerca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PannelloRicerca.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 110, 30));

        getContentPane().add(PannelloRicerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 54, 670, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoneIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneIndietroActionPerformed
        // TODO add your handling code here:
        new HomeFarmacista().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bottoneIndietroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String br= barraDiRicerca.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tbgsModel);
        jTable5.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(br));
    }//GEN-LAST:event_jButton1ActionPerformed


     public void carica_tabellaScorte() throws SQLException{
                String br= null;
                String nome = null;
                String id = null;
                ControlDiRicercaFarmaci rf = new ControlDiRicercaFarmaci();
        
                rf.VisualizzaScorte();
        

                ad= (LinkedList<String>) rf.getListI();
                name= (LinkedList<String>) rf.getListN();
                quant = (LinkedList<String>) rf.getListQ();
                
                while(!name.isEmpty()){

                    String tbData[]= {ad.getFirst(), name.getFirst(), quant.getFirst() };
                    
                    
                    tbgsModel = (DefaultTableModel)jTable5.getModel();
                    tbgsModel.addRow(tbData);
                    ad.removeFirst();
                    name.removeFirst();
                    quant.removeFirst();
        }}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
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
            java.util.logging.Logger.getLogger(GestioneScorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestioneScorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestioneScorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestioneScorte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestioneScorte().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GestioneScorte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PannelloRicerca;
    private javax.swing.JTextField barraDiRicerca;
    private javax.swing.JButton bottoneIndietro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}