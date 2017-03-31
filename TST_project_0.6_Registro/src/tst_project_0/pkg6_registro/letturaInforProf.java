/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author vladi
 */
public class letturaInforProf {
    public letturaInforProf(){
                 String utenteL = formLogin.textUtenteL.getText();

          try {
            FileReader reader = new FileReader("DataCenter\\userInfo\\"+utenteL+".txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 
            while ((line = bufferedReader.readLine()) != null) {
                formProfessore.textInformazioni.append("\n"+line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
