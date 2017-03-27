/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vladi
 */
public class menageAlunnoVoti {
    public menageAlunnoVoti(){
         int Max_val = 30;
        int array[] = new int[Max_val];
        int array1[] = new int[Max_val];
         int array2[] = new int[Max_val];
          int array3[] = new int[Max_val];
        String user = profMenageAlunno.user.getText();
            DefaultTableModel modelMate ,modelTst, modelInfo, modelIta;
            modelTst = (DefaultTableModel) profMenageAlunno.tabTst.getModel(); 
            modelMate = (DefaultTableModel) profMenageAlunno.tabMate.getModel(); 
            modelInfo = (DefaultTableModel) profMenageAlunno.tabInfo.getModel(); 
            modelIta = (DefaultTableModel) profMenageAlunno.tabIta.getModel();             
         try {
            FileReader readerMate = new FileReader("DataCenter\\Voti\\"+user+" Matematica"+".txt");
             FileReader readerInfo = new FileReader("DataCenter\\Voti\\"+user+" Informatica"+".txt");
              FileReader readerTst = new FileReader("DataCenter\\Voti\\"+user+" tst"+".txt");
               FileReader readerIta = new FileReader("DataCenter\\Voti\\"+user+" Italiano"+".txt");
            BufferedReader bufferedReaderMate = new BufferedReader(readerMate);
            BufferedReader bufferedReaderInfo = new BufferedReader(readerInfo); 
            BufferedReader bufferedReaderTst = new BufferedReader(readerTst); 
            BufferedReader bufferedReaderIta = new BufferedReader(readerIta); 
            String valx = bufferedReaderTst.readLine();
            String line;
            String line1;
            String line2;
            String line3;     
                while ((line1 = bufferedReaderMate.readLine()) != null) {
        System.out.println(line1);
            for(int j = 0 ; j<1;j++){
                array[j] = Integer.valueOf(line1); 
                modelMate.insertRow(modelMate.getRowCount(), new Object[]{array[j]});  
                System.out.println(array[j]);    
            }
            
             }
        while ((line = bufferedReaderTst.readLine()) != null) {
        System.out.println(line);
        for(int i = 0 ; i<1;i++){
         array1[i] = Integer.valueOf(line); 
         modelTst.insertRow(modelTst.getRowCount(), new Object[]{array1[i]});  
         System.out.println(array1[i]);    
            }
            
             }
       
         while ((line2 = bufferedReaderInfo.readLine()) != null) {
        System.out.println(line2);
        for(int k = 0 ; k<1;k++){
         array2[k] = Integer.valueOf(line2); 
         modelInfo.insertRow(modelInfo.getRowCount(), new Object[]{array2[k]});  
         System.out.println(array2[k]);    
            }
            
             }
                 while ((line3 = bufferedReaderIta.readLine()) != null) {
        System.out.println(line3);
        for(int x = 0 ; x<1;x++){
         array3[x] = Integer.valueOf(line3); 
         modelIta.insertRow(modelIta.getRowCount(), new Object[]{array3[x]});  
         System.out.println(array3[x]);    
            }
            
             }
           //model.insertRow(model.getRowCount(), new Object[]{line});
                  
                      
                       
////               for( int i=1;i<=2;i++){
////                  array[i] = Integer.valueOf(bufferedReaderTst.readLine());
////               System.out.println(array[i]);
////              model.insertRow(model.getRowCount(), new Object[]{"",array[i]});                           
            readerMate.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
