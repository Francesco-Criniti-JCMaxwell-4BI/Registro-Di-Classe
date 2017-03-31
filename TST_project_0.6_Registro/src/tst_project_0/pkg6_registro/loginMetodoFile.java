/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;
import java.io.*;
import javax.swing.JOptionPane;
import static tst_project_0.pkg6_registro.formLogin.textPrivilegi;
/**
 *
 * @author vladi
 */
public class loginMetodoFile {
    public loginMetodoFile() throws InterruptedException{
        String utenteL = formLogin.textUtenteL.getText();
        String passwordL = String.valueOf(formLogin.textPasswordL.getPassword());
        String priv = formLogin.textPrivilegi.getText();
        String stpt;
        String stpt1;
       boolean corretto = false;
       boolean accesso = false;
       boolean procedo = false;
try{
    FileReader file = new FileReader("DataCenter\\userLogin\\"+utenteL+".txt");
        FileReader file1 = new FileReader("DataCenter\\userLogin\\"+utenteL+" Privilegi"+".txt");
    BufferedReader rfile1 = new BufferedReader(file1);
    BufferedReader rfile = new BufferedReader(file);
    corretto = true;
    while((stpt = rfile.readLine()) != null){
        formLogin.textDebug.setText(stpt);
     
    }
    rfile.close();
    while((stpt1 = rfile1.readLine()) != null){
     formLogin.textPrivilegi.setText(stpt1);
     System.out.println(priv);    
    }
    rfile1.close();
}catch(IOException e){
    System.out.println("File not found");
    textPrivilegi.setText("0+");
    corretto = false;
}
if(formLogin.textDebug.getText().equals(passwordL) && corretto == true){
    System.out.println("account trovato - procedo con login");
    accesso = true;

}else{
           JOptionPane.showMessageDialog(null,"I dati da lei inseriti sono errati!");  
           accesso = false;
}
if(priv.equals("0"))
{
    System.out.println("campo privilegi vuoto o pari a valori di default 0 , aggiorno!!");
     formLogin.jButton1.doClick();
}else{
        System.out.println("campo privilegi"+ priv);        
}
if(priv.equals("0+"))
{
    System.out.println("campo privilegi uguale a 0+ file non trovato, aggiorno!!");
}else{
        System.out.println("campo privilegi"+ priv);        
}
if(priv.equals("S") && accesso== true){
    formStudente ss = new formStudente();
    ss.setVisible(true);
    formStudente.labelUser.setText(utenteL);
   //new formLogin().hide();
}
if(priv.equals("P") && accesso== true){
    formProfessore ssp = new formProfessore();
    ssp.setVisible(true);
    formProfessore.labelUser.setText(utenteL);
    //new formLogin().hide();
}

    }
}

    

