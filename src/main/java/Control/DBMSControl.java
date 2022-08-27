/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 39329
 */
public class DBMSControl {
    String sql;
    Connection conn= null;
    public Connection ConnessioneDBMS(String dbms){
        try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbms,"root", "Manfro1234");
        if(conn!=null){
            System.out.println("connection done");
                    }

        }catch (Exception e){
            System.out.println(e);
            }
        return conn;
    }
     //   Statement st = (Statement)conn.createStatement();
       // ResultSet rs = st.executeQuery("select * from "+tabella);
        
}/*
public Connection getConnection(){
Connection conn;
try{
conn = DriverManager.getConnection("");
return conn;
} catch (Exception e){
return null;
}
public void executeQuery(String query, String message){
Connection conn = getConnection();
Statement st;
try{
st = conn.createStatement();
if((st.executeUpdate(query)) == 1){
JOptionPane.showMessageDialog("FATTO");
}else{
JOptionPane.showMessageDialog("FATTO");
}
}catch(Exception e){
System.out.println(e);
}
}*/