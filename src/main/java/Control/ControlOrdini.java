/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import com.mycompany.farmacysoftware.G_OrdineDipendente.FarmaciPerOrdine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manfr
 */
public class ControlOrdini {
    
    List<String> nome= new LinkedList<String>();
    List<String> id= new LinkedList<String>();
    List<String> quantita = new LinkedList<String>();
    List<String> numero_ordine = new LinkedList<String>();

    public List<String> getNome() {
        return nome;
    }

    public List<String> getId() {
        return id;
    }

    public List<String> getQuantita() {
        return quantita;
    }

    public List<String> getNumero_ordine() {
        return numero_ordine;
    }
    
    
    
    
    
    
 
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
    
    public void prendiFarmaciPerNordine(int no) throws SQLException{
        

        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM lista_ordini_totalem WHERE NumeroOrdine = " + no);
        
        while(rs.next()){
            
                String tipoId = String.valueOf(rs.getInt("ID"));
                String nomeFarmaco = rs.getString("ListaFarmaci");
                String qua = String.valueOf(rs.getInt("Quantità"));
                String nOrdine = String.valueOf(rs.getInt("NumeroOrdine"));
            
                id.add(tipoId);
                nome.add(nomeFarmaco);
                quantita.add(qua);
                numero_ordine.add(nOrdine);
      
        }
        
    }
    
    
    
    
    
    
    
    
 
    public void elimina() throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        PreparedStatement ps = conn.prepareStatement("delete from carrello ");
        ps.execute();
    }
    
    public void addOrdineDipendente() throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        int nordine = 1;
        String farmacia= "1farm";
        int idordine= 2;
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM lista_ordini ORDER BY Nordine DESC");
        if(rs.next()|| !rs.next()){
            try{

                nordine= rs.getInt("Nordine");
                nordine++;
                
                String sql =  "Insert into lista_ordini(Nordine, Farmacia, idordine) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1,nordine);
                ps.setString(2,farmacia);
                ps.setInt(3,idordine);
                ps.execute();
                ps.close();
            }catch(SQLException ex){
                String sql =  "Insert into lista_ordini(Nordine, Farmacia, idordine) VALUES (?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1,nordine);
                ps.setString(2,farmacia);
                ps.setInt(3,idordine);
                ps.execute();
                ps.close();
        }
        
        }
    }
    
    
}
