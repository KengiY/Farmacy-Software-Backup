package Control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;


public class ControlDiRicercaFarmaci {
    String barraDIRicerca;
    List<String> nome= new LinkedList<String>();
    List<String> id= new LinkedList<String>();
    
    
    
    public List<String> getListN(){
    return  nome;
    }
    
    public List<String> getListI(){
    return  id;
    }
    
    
    
    public void VIsualizzaFarmaci(){
        Connection conn= null;
        try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Manfro1234");
        if(conn!=null){
            System.out.println("connection done");
                    }
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from lista_farmaci");
        
        while(rs.next())
            {
                String name= rs.getString("Nome");
                String ad= String.valueOf(rs.getInt("ID"));
                nome.add(name);
                id.add(ad);



                }
        
        
        }catch (Exception e){
            System.out.println("connection ha sucato");
            }
    }

}
