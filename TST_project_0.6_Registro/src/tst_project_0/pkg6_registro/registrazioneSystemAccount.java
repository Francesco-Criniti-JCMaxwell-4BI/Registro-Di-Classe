/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author vladi
 */
public class registrazioneSystemAccount {
    public registrazioneSystemAccount(){
        String nome = amministratoreRegistrazione.textNome.getText();
        String passw = String.valueOf(amministratoreRegistrazione.textPasswordC.getPassword());
         File newFile = new File("DataCenter\\userLogin\\"+nome+".txt");
         if(newFile.exists()){
          System.out.println("Il file esiste già o non la directory non esiste");   
         }else{
          try{
        newFile.createNewFile();
        
    }catch(Exception e)
    {
        e.printStackTrace();
    }
             try{
                 FileWriter fileW = new FileWriter(newFile);
                 BufferedWriter buffW = new BufferedWriter(fileW);
                 buffW.write(passw);
                // if(amministratoreRegistrazione.radioAlunno.isSelected()){
                 //  buffW.write("Privilegi:  Studente");
                  // }else{
                 //  buffW.write("Privilegi: Professore");
                 //  }
                  System.out.println("File per il login, creato con successo");
                   buffW.close();
             }catch(Exception e)
              {
                  e.printStackTrace();
              }               
    }
    }
}
