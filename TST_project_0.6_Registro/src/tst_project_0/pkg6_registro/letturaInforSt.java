/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author vladi
 */
public class letturaInforSt {
    public letturaInforSt() throws InterruptedException{
         String utenteL = formLogin.textUtenteL.getText();

          try {
            FileReader reader = new FileReader("DataCenter\\userInfo\\"+utenteL+".txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                formStudente.textInformazioni.append("\n"+line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
