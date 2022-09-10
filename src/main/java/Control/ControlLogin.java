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

        //METODO CHECKCREDENZIALI
        public void checkLogin() throws SQLException{

            char res= user.charAt(0);
            if(res=='f'){
                    int log = 1;
                    String luogo = "db_farmacia";
                    DBMSControl dc= new DBMSControl();
                    Connection conn= dc.ConnessioneDBMS(luogo);
                    Statement st = (Statement)conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from credenziali_farmacista");

            
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

            }else if(res=='d'){
                int log = 1;
                String luogo = "db_azienda";
                DBMSControl dc= new DBMSControl();
                Connection conn= dc.ConnessioneDBMS(luogo);
                    Statement st = (Statement)conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from credenziali_utente");

            
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

            }else if(res=='c'){
                int log = 1;
                String luogo = "db_azienda";
                DBMSControl dc= new DBMSControl();
                Connection conn= dc.ConnessioneDBMS(luogo);
                    Statement st = (Statement)conn.createStatement();
                    ResultSet rs = st.executeQuery("select * from credenziali_utente");

            
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

            }
        }


}
  

