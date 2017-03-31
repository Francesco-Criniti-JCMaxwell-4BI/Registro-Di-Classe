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
public class ricercaStudente {
    public ricercaStudente(){
        String ricercaAlunno = formProfessore.ricerca.getText();
        try {
            FileReader reader = new FileReader("DataCenter\\userInfo\\"+ricercaAlunno+".txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            profMenageAlunno prm = new profMenageAlunno();    
            prm.setVisible(true);
            while ((line = bufferedReader.readLine()) != null) {             
                profMenageAlunno.textInformazioni.append("\n"+line);
            }
            reader.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
