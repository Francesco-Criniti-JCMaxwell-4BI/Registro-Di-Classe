/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author vladi
 */
public class CpwAlunno {
    public  CpwAlunno(){
       String password = String.valueOf(formStudente.passwCA.getPassword());
         String passwordNew = String.valueOf(formStudente.passwNA.getPassword());
          String passwordNewConf = String.valueOf(formStudente.passwNCA.getPassword());
          String user = formStudente.labelUser.getText();    
          String stpt;
          boolean stptTrue= false;
//    Manca la parte relativa al controllo della password corrente, ricordarsi di aggiungerla grazie!
try{
 FileReader file = new FileReader("DataCenter\\userLogin\\"+user+".txt");
   BufferedReader rfile = new BufferedReader(file);
   while((stpt = rfile.readLine()) != null){
      String VarTempo = stpt;
     System.out.println(VarTempo);
     if(VarTempo.equals(password)){
         stptTrue = true;
     }else{stptTrue = false;}
    }
}catch(IOException e){System.out.println(e);}
          if(!(passwordNew.equals(""))&& !(password.equals(""))&& !(passwordNewConf.equals("")) && passwordNew.equals(passwordNewConf) && stptTrue == true){
               try {
      FileWriter fw = new FileWriter("DataCenter\\userLogin\\"+user+".txt");
      PrintWriter pw = new PrintWriter(fw);
         pw.write(passwordNew);
         pw.flush(); 
         JOptionPane.showMessageDialog(null,"Password cambiata con successo");
         pw.close();
        } catch (IOException e) {
            e.printStackTrace();
          formStudente.textCompiti.append("errore");

        }
     }else{
         System.out.println("File non trovato");
       JOptionPane.showMessageDialog(null,"Impossibile cambiare la password");  

     }
          if(stptTrue == false){
              JOptionPane.showMessageDialog(null,"Password corrente non corretta");  
          }
    }
}
