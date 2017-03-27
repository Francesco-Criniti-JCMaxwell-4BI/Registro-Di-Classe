/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vladi
 */
public class addVotiAlunno {
    public addVotiAlunno(){
        String stpt;
        String materia = (String)profMenageAlunno.selectMateria.getSelectedItem();
        String user = profMenageAlunno.user.getText();
        String strFileData = profMenageAlunno.voto.getText();
       DefaultTableModel modelMate ,modelTst, modelInfo, modelIta;
            modelTst = (DefaultTableModel) profMenageAlunno.tabTst.getModel(); 
            modelMate = (DefaultTableModel) profMenageAlunno.tabMate.getModel(); 
            modelInfo = (DefaultTableModel) profMenageAlunno.tabInfo.getModel(); 
            modelIta = (DefaultTableModel) profMenageAlunno.tabIta.getModel();   
        try{
   File objFile = new File("DataCenter\\Voti\\"+user+" "+materia+".txt");

if (objFile.exists()) {
                FileWriter objFileWriter = new FileWriter(objFile.getAbsolutePath(), true);


                BufferedWriter objBufferedWriter = new BufferedWriter(objFileWriter);


                objBufferedWriter.newLine();
                objBufferedWriter.write(strFileData);


                objBufferedWriter.close();
                
                System.out.println("File modificato");
            }
 
 
  for( int i = modelTst.getRowCount() - 1; i >= 0; i-- ) {
        modelTst.removeRow(i);
    }
                    for( int i = modelMate.getRowCount() - 1; i >= 0; i-- ) {
        modelMate.removeRow(i);
    }
                            for( int i = modelInfo.getRowCount() - 1; i >= 0; i-- ) {
        modelInfo.removeRow(i);
    }
                                    for( int i = modelIta.getRowCount() - 1; i >= 0; i-- ) {
        modelIta.removeRow(i);
    }
  
  new menageAlunnoVoti();
}catch(Exception e){System.out.println(e);}
        
}
    }
        

   
