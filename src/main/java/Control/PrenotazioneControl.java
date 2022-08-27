/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 39329
 */
public class PrenotazioneControl {
    /*public void AggiungiAlCarrello(String farmaco, int qt, String tipo){
        System.out.println(farmaco+" "+ qt+" "+tipo );
    }*/

    
    
    public void AggiungiAlCarrello(String farmaco, int qt, String tipo) throws SQLException{

        String numOrdine = null;
        int num = 0;
        int tip= Integer.parseInt(tipo);
       
        
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
            
            Statement st = (Statement)conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM carrello");
            
           
        if(rs.next()){
                numOrdine = rs.getString("NumeroOrdine");
                num= Integer.parseInt (numOrdine);
                
                num++;
                numOrdine=Integer.toString(num);
                
               
                String sql = "Insert into carrello(ID, ListaFarmaci, Quantità, NumeroOrdine) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ps.setInt(1,tip);
                ps.setString(2,farmaco);
                ps.setInt(3,qt);
                ps.setInt(4,2);
                ps.executeUpdate();
                
                ps.close();
            }else{
                
                String sql = "Insert into carrello(ID, ListaFarmaci, Quantità, NumeroOrdine) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ps.setInt(1,tip);
                ps.setString(2,farmaco);
                ps.setInt(3,qt);
                ps.setInt(4,0);
                ps.executeUpdate();
                
                ps.close();
            }

        
    }
    
    
    
    public void addPAutomatica(String farmaco, int q, String p) throws SQLException{

        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
            Statement st = (Statement)conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM lista_farmaci");
            
            
            
            if(rs.next()){
              
                
                String sql = "Insert into ordini_periodici (ListaFarmaci, Quantità, Periodicità) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
               
                ps.setInt(2,q);
                ps.setString(1,farmaco);
                ps.setString(3,p);
                ps.executeUpdate();
                
                ps.close();
            }/// tutto ok


        
        
        
    }
    
    
    
}
