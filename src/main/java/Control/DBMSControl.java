/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.DriverManager;


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
            System.out.println("ConnectionDone");
                    }

        }catch (Exception e){
            System.out.println(e);
            }
        return conn;
    }
    
        
}