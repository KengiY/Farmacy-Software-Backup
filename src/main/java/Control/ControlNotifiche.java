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
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 39329
 */
public class ControlNotifiche {
    List<String> nome= new LinkedList<String>();
    List<String> tipo= new LinkedList<String>();
    
    
    public void InvioNotifica(int tipo, String mex, String luogo) throws SQLException{

        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM notifiche");
            
            
            
            if(rs.next()){
              
                
                String sql = "Insert into notifiche (idnotifiche, TipoNotifica) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
               
                ps.setInt(1,tipo);
                ps.setString(2,mex);

                
                ps.close();
            }/// tutto ok
    }
    
    public void caricaNotifiche(String luogo) throws SQLException{
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from notifiche ");
        
        while(rs.next())
            {
                String name= rs.getString("TipoNotifiche");
                String ad= String.valueOf(rs.getInt("idnotifiche"));
                
                nome.add(name);
                tipo.add(ad);
                }
        
        
    }
    public List<String> getListN(){
    return  nome;
    }
    
    public List<String> getListI(){
    return  tipo;
    }
    
}
