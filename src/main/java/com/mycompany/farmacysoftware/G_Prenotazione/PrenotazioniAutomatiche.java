/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.farmacysoftware.G_Prenotazione;

import Control.ControlDiRicercaFarmaci;
import Control.PrenotazioneControl;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author manfr
 */
public class PrenotazioniAutomatiche extends javax.swing.JFrame {

    LinkedList<String> name= new LinkedList<String>();
    LinkedList<String> ad= new LinkedList<String>();
    LinkedList<String> pd= new LinkedList<String>();
    LinkedList<String> quant= new LinkedList<String>(); 
    DefaultTableModel tbpaModel;
    String clicked_element_farm= null;
    
    
    
   
    public PrenotazioniAutomatiche() throws SQLException {
        initComponents();
        carica_tabella();
        carica_tabellaOrdiniPeriodici();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        bottoneIndietro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        spinnerqt = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        barraDiRicerca = new javax.swing.JTextField();
        Cerca = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combodate = new javax.swing.JComboBox<>();
        bottoneConferma = new javax.swing.JButton();
        bottone_elimina = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacy Software 1.0");
        setLocation(new java.awt.Point(600, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Prenotazioni Automatiche");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bottoneIndietro.setText("Indietro");
        bottoneIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneIndietroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Cerca:");

        barraDiRicerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraDiRicercaActionPerformed(evt);
            }
        });

        Cerca.setText("Cerca");
        Cerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CercaActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Farmaco", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
        }

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Farmaco", "Quantità", "Periodicità"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPane3.setViewportView(jTable4);

        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Lista Farmaci Cercati");

        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Lista Farmaci P.Automatica");

        combodate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 a Settimana", "2 a Settimana", "3 a Settimana", "4 a Settimana" }));
        combodate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodateActionPerformed(evt);
            }
        });

        bottoneConferma.setBackground(new java.awt.Color(204, 255, 204));
        bottoneConferma.setText("Conferma");
        bottoneConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneConfermaActionPerformed(evt);
            }
        });

        bottone_elimina.setText("Elimina");
        bottone_elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottone_eliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraDiRicerca)
                        .addGap(18, 18, 18)
                        .addComponent(Cerca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bottone_elimina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottoneConferma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combodate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spinnerqt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(barraDiRicerca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addComponent(spinnerqt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combodate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bottone_elimina, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bottoneConferma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottoneIndietro)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void combodateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodateActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_combodateActionPerformed

    
    private void bottoneIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneIndietroActionPerformed
        // TODO add your handling code here:
        ClickIndietro();
    }//GEN-LAST:event_bottoneIndietroActionPerformed
    
    
    public void ClickIndietro(){
        new GestionePrenotazione().setVisible(true);
        this.setVisible(false);
    }
    
    
    private void CercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CercaActionPerformed
        ClickCerca();
    }//GEN-LAST:event_CercaActionPerformed
    
    
    public void ClickCerca(){
        String br= barraDiRicerca.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tbpaModel);
        jTable3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(br));
    
    }
    
    
    private void bottoneConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneConfermaActionPerformed
        // TODO add your handling code here:
        Conferma();
    }//GEN-LAST:event_bottoneConfermaActionPerformed

    
    public void Conferma(){
        PrenotazioneControl ad = new PrenotazioneControl();
        int qt = (int)spinnerqt.getValue();
        String dt = combodate.getSelectedItem().toString();
        
        if(qt>0){
        System.out.println(clicked_element_farm + " " + qt + " " + dt);
            try {
                ad.addPAutomatica(clicked_element_farm, qt, dt);
            } catch (SQLException ex) {
                Logger.getLogger(PrenotazioniAutomatiche.class.getName()).log(Level.SEVERE, null, ex);
            }
        this.setVisible(false);
            try {
                new PrenotazioniAutomatiche().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(PrenotazioniAutomatiche.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "La quantità deve essere maggiore di 0");
        }
    
    }
    
    
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
            JTable source = (JTable)evt.getSource();
            //int row = source.rowAtPoint( evt.getPoint() );
            int i = jTable3.getSelectedRow();
            int column = source.columnAtPoint( evt.getPoint() );
            clicked_element_farm=source.getModel().getValueAt(i, 0)+"";
            System.out.println(clicked_element_farm);
    }//GEN-LAST:event_jTable3MouseClicked


    private void bottone_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottone_eliminaActionPerformed
        // TODO add your handling code here:
        BottoneElimina();
    }//GEN-LAST:event_bottone_eliminaActionPerformed
    
    
    public void BottoneElimina(){
            try{
        int row = jTable4.getSelectedRow();
        clicked_element_farm = jTable4.getModel().getValueAt(row, 0)+"";
        ControlDiRicercaFarmaci vc = new ControlDiRicercaFarmaci();
        vc.EliminaElementoPeriodicita(clicked_element_farm);
        this.setVisible(false);
        new PrenotazioniAutomatiche().setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    private void barraDiRicercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraDiRicercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraDiRicercaActionPerformed


    public void carica_tabella() throws SQLException{
                String br= null;
                String nome = null;
                String id = null;
                ControlDiRicercaFarmaci rf= new ControlDiRicercaFarmaci();
        
                rf.VisualizzaFarmaciBanco();
        

                name= (LinkedList<String>) rf.getListN();
                ad= (LinkedList<String>) rf.getListI();
                while(name.size()!=0){

                    String tbData[]= {name.getFirst(), ad.getFirst()};
                    
                    
                    tbpaModel = (DefaultTableModel)jTable3.getModel();
                    tbpaModel.addRow(tbData);
                    name.removeFirst();
                    ad.removeFirst();
        }}
    
    
    public void carica_tabellaOrdiniPeriodici() throws SQLException{
                String br= null;
                String nome = null;
                String id = null;
                ControlDiRicercaFarmaci rf= new ControlDiRicercaFarmaci();
        
                rf.VisualizzaFarmaciAutomatici();
        

                name= (LinkedList<String>) rf.getListN();
                quant = (LinkedList<String>) rf.getListQ();
                pd =  (LinkedList<String>) rf.getListPd();
                
                while(name.size()!=0){

                    String tbData[]= {name.getFirst(), quant.getFirst(), pd.getFirst() };
                    
                    
                    tbpaModel = (DefaultTableModel)jTable4.getModel();
                    tbpaModel.addRow(tbData);
                    name.removeFirst();
                    quant.removeFirst();
                    pd.removeFirst();
        }}
    
   
       
    
    
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
            java.util.logging.Logger.getLogger(PrenotazioniAutomatiche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrenotazioniAutomatiche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrenotazioniAutomatiche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrenotazioniAutomatiche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PrenotazioniAutomatiche().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PrenotazioniAutomatiche.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerca;
    private javax.swing.JTextField barraDiRicerca;
    private javax.swing.JButton bottoneConferma;
    private javax.swing.JButton bottoneIndietro;
    private javax.swing.JButton bottone_elimina;
    private javax.swing.JComboBox<String> combodate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JSpinner spinnerqt;
    // End of variables declaration//GEN-END:variables
}
