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
 * @author 39329
 */
public class ControlMagazzino {
    
    
    public void addMagazzino(String id, String farmaco, int qt) throws SQLException{
        String luogo = "db_farmacia";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM magazzino");
        
        if(rs.next() || !rs.next()){
            String sql = "Insert into magazzino (tipo, Farmaco, quantità) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
               
            ps.setString(1,id);
            ps.setString(2,farmaco);
            ps.setInt(3,qt);
            ps.executeUpdate();
            System.out.println("INSERT DONE");
            ps.close();
        }
    }
}
