/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author vladi
 */
public class letturaCompiti {
    public letturaCompiti(){
     String data = formStudente.dataCompiti.getText();
     String materia = (String)formStudente.selectMateria.getSelectedItem();
     if(!(materia.equals("Seleziona la materia")) && !(data.equals(""))){
          try {
            FileReader reader = new FileReader("DataCenter\\Compiti\\"+materia+"-"+ data+".txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
            formStudente.textCompiti.setText(null);
            while ((line = bufferedReader.readLine()) != null) {
                formStudente.textCompiti.append("\n"+line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
            formStudente.textCompiti.setText(null);
          formStudente.textCompiti.append("Nessun compito assegnato per questo giorno");

        }
     }else{
         System.out.println("File non trovato");
       JOptionPane.showMessageDialog(null,"Selezionare la materia e la data in formato (es: 10.02.2017)");  

     }
}
}
