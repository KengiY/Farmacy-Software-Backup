/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import com.mycompany.farmacysoftware.Autenticazione.AggiornamentoPassword;
import com.mycompany.farmacysoftware.Autenticazione.Login;
import com.mycompany.farmacysoftware.Autenticazione.RecuperoPassword;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 39329
 */
public class ControlRecuperoPassword {
        String user;
        String passUser;
        int passlog;
        int lof;
        public ControlRecuperoPassword(String user){
            this.user=user;
        }


      
    public void checkUser() throws SQLException{
            Connection conn= null;

                try{
                    int log = 1;
                    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_farmacia","root", "Manfro1234");
                    if(conn!=null){
                        System.out.println("connection done");
                    }
                
                    Statement st = (Statement)conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from credenziali_farmacista");

            //Control
                    while(rs.next())
                    {
                        if (rs.getString(1).equals(user))
                        {
                            
                            log = 0;
                            System.out.println(log);
                            break;
                        }


                    }

                    if(log == 0){
                        log = 1;
                        passUser=rs.getString(1);
                        passlog=1;
                    }else{
                        JOptionPane.showMessageDialog(null, "User inesistente");
                    }

                }catch (Exception e){
                    System.out.println("connection ha sucato");
                }
           

        }
        
        public String getUser(){
            return passUser;
        }
        public int getLog(){
            return passlog;
        }
        public int getlof(){
        return lof;
        }
        
        public void AggiornamentoPass(String user, String pass){
            Connection conn= null;
            user= user;
            pass = pass;
            char res= user.charAt(0);
            
            if(res=='f'){
                try{
                    int log = 1;
                    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_farmacia","root", "Manfro1234");
                    if(conn!=null){
                        System.out.println("connection done");
                    }
                    
                    String sql =  "update credenziali_farmacista set Password=? where Username=?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    
                    ps.setString(1,pass);
                    ps.setString(2,user);
                    ps.executeUpdate();
                    ps.close();
                    
                    System.out.println(pass);
                    JOptionPane.showMessageDialog(null, "Password aggiornata");
                    lof=1;



                }catch (Exception e){
                    System.out.println("connection ha sucato");
                }
        }else if (res=='d'){
            try{
                    int log = 1;
                    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Manfro1234");
                    if(conn!=null){
                        System.out.println("connection done");
                    }
                    
                    String sql =  "update credenziali_utente set Password=? where Username=?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    
                    ps.setString(1,pass);
                    ps.setString(2,user);
                    ps.executeUpdate();
                    ps.close();
                    
                    System.out.println(pass);
                    JOptionPane.showMessageDialog(null, "Password aggiornata");
                    lof=1;

                }catch (Exception e){
                    System.out.println("connection ha sucato");
                }
        }else if (res=='c'){
        try{
                    int log = 1;
                    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Manfro1234");
                    if(conn!=null){
                        System.out.println("connection done");
                    }
                    
                    String sql =  "update credenziali_utente set Password=? where Username=?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    
                    ps.setString(1,pass);
                    ps.setString(2,user);
                    ps.executeUpdate();
                    ps.close();
                    
                    System.out.println(pass);
                    JOptionPane.showMessageDialog(null, "Password aggiornata");
                    lof=1;

            

                }catch (Exception e){
                    System.out.println("connection ha sucato");
                }
        }
        
        
        
        }
}

