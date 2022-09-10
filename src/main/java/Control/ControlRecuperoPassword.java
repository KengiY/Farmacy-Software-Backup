/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import com.mycompany.farmacysoftware.Autenticazione.AggiornamentoPassword;
import com.mycompany.farmacysoftware.Autenticazione.Login;
import com.mycompany.farmacysoftware.Autenticazione.RecuperoPassword;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ControlRecuperoPassword {
        String user;
        String passUser;
        int passlog;
        int lof;
        public ControlRecuperoPassword(String user){
            this.user=user;
        }


      
    public void checkUser() throws SQLException{

    int log = 1;
    String luogo = "db_farmacia";
    DBMSControl dc= new DBMSControl();
    Connection conn= dc.ConnessioneDBMS(luogo);

                    Statement st = (Statement)conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from credenziali_farmacista");

            
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
                        JOptionPane.showMessageDialog(null, "Username inesistente, Riprova!");
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
        
        public void AggiornamentoPass(String user, String pass) throws SQLException{

            user= user;
            pass = pass;
            char res= user.charAt(0);
            
            if(res=='f'){
                int log = 1;
                String luogo = "db_farmacia";
                DBMSControl dc= new DBMSControl();
                Connection conn= dc.ConnessioneDBMS(luogo);

                    String sql =  "update credenziali_farmacista set Password=? where Username=?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    
                    ps.setString(1,pass);
                    ps.setString(2,user);
                    ps.executeUpdate();
                    ps.close();
                    
                    System.out.println(pass);
                    JOptionPane.showMessageDialog(null, "Password Aggiornata");
                    lof=1;


            }else if (res=='d'){
                int log = 1;
                String luogo = "db_azienda";
                DBMSControl dc= new DBMSControl();
                Connection conn= dc.ConnessioneDBMS(luogo);

                    String sql =  "update credenziali_utente set Password=? where Username=?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    
                    ps.setString(1,pass);
                    ps.setString(2,user);
                    ps.executeUpdate();
                    ps.close();
                    
                    System.out.println(pass);
                    JOptionPane.showMessageDialog(null, "Password Aggiornata");
                    lof=1;
            }else if (res=='c'){
                int log = 1;
                String luogo = "db_azienda";
                DBMSControl dc= new DBMSControl();
                Connection conn= dc.ConnessioneDBMS(luogo);

                    String sql =  "update credenziali_utente set Password=? where Username=?";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    
                    ps.setString(1,pass);
                    ps.setString(2,user);
                    ps.executeUpdate();
                    ps.close();
                    
                    System.out.println(pass);
                    JOptionPane.showMessageDialog(null, "Password Aggiornata");
                    lof=1;
        }
        
        
        
        }
}

