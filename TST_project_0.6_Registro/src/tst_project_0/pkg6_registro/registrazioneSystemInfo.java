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
public class registrazioneSystemInfo {
    
    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }
public registrazioneSystemInfo(){       
        String nome = amministratoreRegistrazione.textNome.getText();
        String dataNascita = amministratoreRegistrazione.textData.getText();
        String nazione = amministratoreRegistrazione.textNazione.getText();
        String comune = amministratoreRegistrazione.textComune.getText();
        String altreInfo = amministratoreRegistrazione.textAltro.getText();
         File newFile = new File("DataCenter\\userInfo\\"+nome+".txt");
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
                 buffW.write("Utente: " + nome);
                 buffW.newLine();
                 buffW.write("Data di nascita: " + dataNascita);
                 buffW.newLine();
                 if(amministratoreRegistrazione.radioM.isSelected()){
                 buffW.write("Sesso: Maschio" );
                }else{
                    buffW.write("Sesso: Femmina");
                 }
                 buffW.newLine();
                 buffW.write("Nazione: " + nazione);
                 buffW.newLine();
                 if(!(comune.equals(""))){
                 buffW.write("Comune: " + comune);
                 }else{
                 buffW.write("Comune: -");
                 }
                 buffW.newLine();
                 if(!(altreInfo.equals(""))){
                     buffW.write("Informazioni: " + altreInfo);
                 }else{
                     buffW.write("Informazioni: - ");
                 }
                System.out.println("File contenente le informazioni, creato con successo");
                 buffW.close();
             }catch(Exception e)
             {
                 e.printStackTrace();
             }               
    }
    }
    
}
