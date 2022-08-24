/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import com.mycompany.farmacysoftware.Autenticazione.Login;
import com.mycompany.farmacysoftware.HomeCorriere;
import com.mycompany.farmacysoftware.HomeDipendenteAzienda;
import com.mycompany.farmacysoftware.HomeFarmacista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author 39329
 */
public class ControlLogin {
        String user;
        String pass;
        int passlog;
        public ControlLogin(String user, String pass){
            this.user=user;
            this.pass=pass;
        }
        
        public int getLog(){
            return passlog;
        }

        public void checkLogin() throws SQLException{
            Connection conn= null;
            char res= user.charAt(0);
            if(res=='f'){
                try{
                    int log = 1;
                    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_farmacia","root", "Bruno1234");
                    if(conn!=null){
                        System.out.println("connection done");
                    }
                
                    Statement st = (Statement)conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from credenziali_farmacista");

            //Control
                    while(rs.next())
                    {
                        if (rs.getString(1).equals(user) && rs.getString(2).equals(pass))
                        {
                            log = 0;
                            System.out.println(log);
                            break;
                        }


                    }

                    if(log == 0){

                        log = 1;
                        passlog=1;
                    }else{
                        JOptionPane.showMessageDialog(null, "Password Errata");
                    }

                }catch (Exception e){
                    System.out.println("connection ha sucato");
                }
            }else if(res=='d'){
                try{
                int log = 1;
                    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Bruno1234");
                    if(conn!=null){
                        System.out.println("connection done");
                    }
                
                    Statement st = (Statement)conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from credenziali_utente");

            //Control
                    while(rs.next())
                    {
                        if (rs.getString(1).equals(user) && rs.getString(2).equals(pass))
                        {
                            log = 0;
                            
                            System.out.println(log);
                            break;
                        }


                    }

                    if(log == 0){

                        log = 1;
                        passlog=1;
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Password Errata");
                    }
                }catch (Exception e){
                    System.out.println("connection ha sucato");
                }
            }else if(res=='c'){
                try{
                int log = 1;
                    conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_azienda","root", "Bruno1234");
                    if(conn!=null){
                        System.out.println("connection done");
                    }
                
                    Statement st = (Statement)conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from credenziali_utente");

            //Control
                    while(rs.next())
                    {
                        if (rs.getString(1).equals(user) && rs.getString(2).equals(pass))
                        {
                            log = 0;
                            System.out.println(log);
                            break;
                        }


                    }

                    if(log == 0){

                        log = 1;
                        passlog=1;
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Password Errata");
                    }

                }catch (Exception e){
                    System.out.println("connection ha sucato");
                }
            }
        }


}
  

