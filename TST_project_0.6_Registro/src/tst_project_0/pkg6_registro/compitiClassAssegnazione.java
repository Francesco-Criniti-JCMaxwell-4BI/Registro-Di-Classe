/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vladi
 */
public class compitiClassAssegnazione {
    public compitiClassAssegnazione(){
     String compiti = formCompiti.textCompiti.getText();
     String data = formCompiti.dataCompiti.getText();
     String materia = (String)formCompiti.selectMateria.getSelectedItem();
          File newFile = new File("DataCenter\\Compiti\\"+materia+"-"+ data+".txt");
          if(newFile.exists()){
          System.out.println("Il file esiste già o non la directory non esiste");} 
          else       
          try{ 
    }catch(Exception e)
    {        e.printStackTrace();
    }
         try{               
                 if(!(compiti.equals(""))&& !(data.equals(""))&& !(materia.equals("Seleziona la materia"))){
                  newFile.createNewFile();
                 FileWriter fileW = new FileWriter(newFile);
                 BufferedWriter buffW = new BufferedWriter(fileW);
                  buffW.write(compiti);                 
                  System.out.println("File Compiti,"+materia+"-"+ data+"creato con successo");
                   buffW.close();
                 }else{
                    System.out.println("Dati mancanti o incorretti");
                    JOptionPane.showMessageDialog(null,"Inserire dei valori corretti");  

                 }
             }catch(Exception e)
              {
                  e.printStackTrace();
              }                  
    }        
    }

