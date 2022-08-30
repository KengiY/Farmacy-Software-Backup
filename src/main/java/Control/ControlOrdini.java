/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author manfr
 */
public class ControlOrdini {
    
    
    
    
    
 
    public void addOrdine(int id, String farmaco, int qt , int no) throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM carrello");
        
        
        if(rs.next() || !rs.next()){
            String sql = "Insert into lista_ordini_totale (ID, ListaFarmaci, Quantità, NumeroOrdine) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
               
            ps.setInt(1,id);
            ps.setString(2,farmaco);
            ps.setInt(3,qt);
            ps.setInt(4,no);
            ps.executeUpdate();
            System.out.println("controlOrdini effettuata");
            ps.close();
            
        }
    }
    
 
    
    
    
    
}
