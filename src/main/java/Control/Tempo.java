/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author manfr
 */
public class Tempo {
    
 public void  Data() throws ParseException{
   
        
    DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
    System.out.println(df.format(new Date()));
     
 
 
 
 
 }
    
 
    
    
}
