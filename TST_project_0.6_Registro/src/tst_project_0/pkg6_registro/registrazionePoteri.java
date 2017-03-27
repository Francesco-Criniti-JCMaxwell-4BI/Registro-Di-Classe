/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;
import java.io.*;
/**
 *
 * @author vladi
 */
public class registrazionePoteri {
    public registrazionePoteri(){
        String nome = amministratoreRegistrazione.textNome.getText();
         File newFile = new File("DataCenter\\userLogin\\"+nome+ " Privilegi"+".txt");
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
                if(amministratoreRegistrazione.radioAlunno.isSelected()){
                  buffW.write("S");
                  }else{
                   buffW.write("P");
                   }
                  System.out.println("File dei privilegi, creato con successo");
                   buffW.close();
             }catch(Exception e)
              {
                  e.printStackTrace();
              }               
    }       
    }
}
