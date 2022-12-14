/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import com.mycompany.farmacysoftware.G_Prenotazione.OrdinaFarmaci;
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
    
    
    
    
    public void AggiungiAlCarrelloo(String farmaco, int qt, String tipo) throws SQLException{

        String numOrdine = null;
        int num = 0;
        int tip= Integer.parseInt(tipo);
       
        OrdinaFarmaci vc = new OrdinaFarmaci();
      
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
            
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM lista_ordini ORDER BY Nordine DESC");
        
        
        if(rs.next()|| !rs.next()){
                System.out.println("RS.NEXTINSIDE");
                
                try{
                    int nordine= rs.getInt("Nordine");
                    System.out.println("RS.NEXT1->TRY");
                    nordine++;
                    String sql = "Insert into carrello(ID, ListaFarmaci, Quantità, NumeroOrdine) VALUES (?, ?, ?, ?)";
                    PreparedStatement ps = conn.prepareStatement(sql);
                
                    ps.setInt(1,tip);
                    ps.setString(2,farmaco);
                    ps.setInt(3,qt);
                    ps.setInt(4,nordine);
                    ps.executeUpdate();
                
                    ps.close();
                    
                }catch(SQLException ex){
                    System.out.println("RS.NEXT2->CATCH");
                    String sql = "Insert into carrello(ID, ListaFarmaci, Quantità, NumeroOrdine) VALUES (?, ?, ?, ?)";
                    PreparedStatement ps = conn.prepareStatement(sql);
                
                    ps.setInt(1,tip);
                    ps.setString(2,farmaco);
                    ps.setInt(3,qt);
                    ps.setInt(4,1);
                    ps.executeUpdate();
                
                    ps.close();
                }
 

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
            }
   
    }
    
    
    
    
    
    
}
