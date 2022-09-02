package Control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;


public class ControlDiRicercaFarmaci {
    String barraDIRicerca;
    List<String> nome= new LinkedList<String>();
    List<String> id= new LinkedList<String>();
    List<String> quantita = new LinkedList<String>();
    List<String> numero_ordine = new LinkedList<String>();
    List<String> periodicità = new LinkedList<String>();
    List<String> nome_farmacia = new LinkedList<String>();
    List<String> indirizzi = new LinkedList<String>();
    List<String> status = new LinkedList<String>();
    
    public List<String> getListNF(){
        return nome_farmacia;
    }
    
    
    public List<String> getListN(){
    return  nome;
    }
    
    public List<String> getListI(){
    return  id;
    }
    
    public List<String> getListQ(){
    return  quantita;
    }
    
    public List<String> getListNo(){
    return  numero_ordine;
    }
    
    public List<String> getListPd(){
    return  periodicità;
    }
    
    public List<String> getListIZ(){
        return indirizzi;
    }

    public List<String> getStatus() {
        return status;
    }
    
    
    
    public void VisualizzaStatoOrdiniDipendente() throws SQLException{
        
        String luogo = "db_azienda";
        DBMSControl dc = new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from lista_ordini");
        
        
        while(rs.next())
            {
                String nOrdine = String.valueOf(rs.getInt("Nordine"));
               
                String stat = rs.getString("stato");
                
                
                numero_ordine.add(nOrdine);
                status.add(stat);
                
                
                
                }

    }
    
    
    public void VisualizzaOrdiniCorriere() throws SQLException{
        
        String luogo = "db_azienda";
        DBMSControl dc = new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from info_consegne");
        
        
        while(rs.next())
            {
                String nOrdine = String.valueOf(rs.getInt("Ordine"));
                String farmacia = rs.getString("Farmacia");
                String nomeIndirizzi = rs.getString("Indirizzo");
                String stat = rs.getString("Stato");
                
                
                numero_ordine.add(nOrdine);
                nome_farmacia.add(farmacia);
                indirizzi.add(nomeIndirizzi);
                status.add(stat);
                
                
                
                }

    }
    
    public void VisualizzaOrdini() throws SQLException{
        
        String luogo = "db_azienda";
        DBMSControl dc = new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from carrello");
        
        
        while(rs.next())
            {
                String name= rs.getString("ListaFarmaci");
                String ad= String.valueOf(rs.getInt("ID"));
                String quant= String.valueOf(rs.getInt("Quantità"));
                String no = String.valueOf(rs.getInt("NumeroOrdine"));
                
                nome.add(name);
                id.add(ad);
                quantita.add(quant);
                numero_ordine.add(no);
                }

    }
    
    
    
    
    
    public void VIsualizzaFarmaci() throws SQLException{
        
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from lista_farmaci");
        
        
        while(rs.next())
            {
                String name= rs.getString("Nome");
                String ad= String.valueOf(rs.getInt("ID"));
                
                nome.add(name);
                id.add(ad);
                }
        

    }
    
    public void VisualizzaFarmaciBanco() throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from lista_farmaci where ID = 0");
        
        while(rs.next())
            {
                String name= rs.getString("Nome");
                String ad= String.valueOf(rs.getInt("ID"));
                
                nome.add(name);
                id.add(ad);
                }
        
        
    }
    
    public void VisualizzaFarmaciAutomatici() throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from ordini_periodici");
        
        while(rs.next())
            {
                String name= rs.getString("ListaFarmaci");
                String quant= String.valueOf(rs.getInt("Quantità"));
                String pd= rs.getString("Periodicità");
                
                nome.add(name);
                quantita.add(quant);
                periodicità.add(pd);
                }
        
    }
    
  
    public void VisualizzaScorte() throws SQLException{
        String luogo = "db_farmacia";
        DBMSControl dc = new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from magazzino");
            
            while(rs.next()){
                
                String tipoId = String.valueOf(rs.getInt("tipo"));
                String nomeFarmaco = rs.getString("Farmaco");
                String qua = String.valueOf(rs.getInt("Quantità"));
           
                id.add(tipoId);
                nome.add(nomeFarmaco);
                quantita.add(qua);
                      
            }

    }
    
   public void VisualizzaCarrello() throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("select * from carrello");
            
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
   
    
 


   
    
    
    public void VisualizzaOrdiniDip() throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
        String stato = "daConsegnare";
        Statement st = (Statement)conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM lista_ordini WHERE stato = 'daConsegnare' ");
            
            while(rs.next()){
                String nOrdine = String.valueOf(rs.getInt("Nordine"));
                String farmacia = rs.getString("Farmacia");
                
                numero_ordine.add(nOrdine);
                nome_farmacia.add(farmacia);
                
                        
            }

    }
    

    public void EliminaElemento(String clicked_element_farmaco) throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
            String sql = "delete from carrello where ListaFarmaci= ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,clicked_element_farmaco);
            ps.execute();

    }
    
    public void EliminaElementoPeriodicita(String clicked_element_farmaco) throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
            String sql = "delete from ordini_periodici where ListaFarmaci= ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,clicked_element_farmaco);
            ps.execute();

    
    }
    
    public void ModificaOrdine(int qta, String clicked_element_farm ) throws SQLException{
        String luogo = "db_azienda";
        DBMSControl dc= new DBMSControl();
        Connection conn= dc.ConnessioneDBMS(luogo);
                String sql =  "update carrello set Quantità=? where ListaFarmaci=?";
                
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ps.setInt(1, qta);
                ps.setString(2, clicked_element_farm);
            
                ps.executeUpdate();
                ps.close();
                
            }

}
