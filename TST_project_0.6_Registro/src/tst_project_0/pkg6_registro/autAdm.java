/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tst_project_0.pkg6_registro;
import javax.swing.JOptionPane;
/**
 *
 * @author vladi
 */
public class autAdm {    
    String autenticazione = "jcmaxwellADM";
    String passw = "";
public String getAutenticazione() {
        return autenticazione;
    }

    public void setAutenticazione(String autenticazione) {
        this.autenticazione = autenticazione;
    }

    public String getPasswAut() {
        return passw;
    }

    public void setPasswAut(String passwAut) {
        this.passw = passwAut;
    }
    public autAdm() {
       boolean doneB = false;
       this.autenticazione = autenticazione;
       this.passw = passw;      
      while(passw.equals(autenticazione)== false) {
           passw = JOptionPane.showInputDialog("Inserisci la password per poter registrare un nuovo account: ");
        if(passw.equals(autenticazione)== true){doneB = true;}
            else{doneB = false;}
        }
      if(doneB == true)
    {
        amministratoreRegistrazione admr = new amministratoreRegistrazione();
        admr.setVisible(true);
    }
      }
    }

    
    

   
