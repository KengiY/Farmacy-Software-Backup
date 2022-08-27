/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 39329
 */
public class PrenotazioneControl {
    /*public void AggiungiAlCarrello(String farmaco, int qt, String tipo){
        System.out.println(farmaco+" "+ qt+" "+tipo );
    }*/

    
    
    public void AggiungiAlCarrello(String farmaco, int qt, String tipo){

        String numOrdine = null;
        int num = 0;
        int tip= Integer.parseInt(tipo);
       
        
        Connection conn= null;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Bruno1234");
            if(conn!=null){
                System.out.println("connection done");
                    }
            System.out.println("sono un sacco ghei");
            Statement st = (Statement)conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM carrello");
            
           
        if(rs.next()){
                numOrdine = rs.getString("NumeroOrdine");
                num= Integer.parseInt (numOrdine);
                System.out.println("NumOrdine" + num);
                num++;
                numOrdine=Integer.toString(num);
                System.out.println(num+farmaco+qt+tipo);
                System.out.println("sono un pochino ghei");
                String sql = "Insert into carrello(ID, ListaFarmaci, Quantità, NumeroOrdine) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                System.out.println("sono un po ghei");
                ps.setInt(1,tip);
                ps.setString(2,farmaco);
                ps.setInt(3,qt);
                ps.setInt(4,2);
                ps.executeUpdate();
                System.out.println("sono tanto ghei");
                ps.close();
            }else{
                System.out.println(num+farmaco+qt+tipo);
                System.out.println("sono un pochino ghei");
                String sql = "Insert into carrello(ID, ListaFarmaci, Quantità, NumeroOrdine) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                System.out.println("sono un po ghei");
                ps.setInt(1,tip);
                ps.setString(2,farmaco);
                ps.setInt(3,qt);
                ps.setInt(4,0);
                ps.executeUpdate();
                System.out.println("sono tanto ghei");
                ps.close();
            }
            
                
                
        }catch (Exception e){
            System.out.println(e);
         }
        
    }
    
    
    
    public void addPAutomatica(String farmaco, int q, String p){

        Connection conn= null;
        try{
            
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Bruno1234");
            
            if(conn!=null){
                System.out.println("connection done");
                    }
            System.out.println("sono un sacco ghei");
            
            Statement st = (Statement)conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM lista_farmaci");
            
            
            
            if(rs.next()){
              
                
                String sql = "Insert into ordini_periodici (ListaFarmaci, Quantità, Periodicità) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                System.out.println("sono un po ghei");
                ps.setInt(2,q);
                ps.setString(1,farmaco);
                ps.setString(3,p);
                ps.executeUpdate();
                System.out.println("sono tanto ghei");
                ps.close();
            }/// tutto ok

                
        }catch (Exception e){
            System.out.println(e);
         }
        
        
        
    }
    
    
    
}
