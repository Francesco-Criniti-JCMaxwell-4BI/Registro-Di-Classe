package registro;

import java.io.*;

public class registrazionePoteri {
 public registrazionePoteri(){
File newFile = new File("nome file"+".txt");  // attribuisco a newFile l'attributo nome del file da creare
         if(newFile.exists()){ // se il file esiste
          System.out.println("Il file esiste già o non la directory non esiste");   // mi restituisce un messaggio di errore
         }else{ // altrimenti
          try{ //provo
        newFile.createNewFile();    // se non esiste crea il file    
    }catch(Exception e) // gestisce eccezione
    {
        e.printStackTrace();  // stampa eventuali messaggi di errore
    }
       try{ // se il file è stato creato con successo, posso finalmente scriverci sopra
                 FileWriter fileW = new FileWriter(newFile);  // accedo a FileWriter per poter scrivere su file
                 BufferedWriter buffW = new BufferedWriter(fileW);    // accedo al file e si mette in attesa                     
                  buffW.write("IL mio testo qua");  // scrive nel file , per andare a capo usa, " buffW.nextLine(); "
                  System.out.println("Contenuto salvato e aggiunto con successo"); // messaggio di conferma
                   buffW.close();  // chiude il file e salva
             }catch(Exception e) // gestisce eccezione
              {
                  e.printStackTrace();  // stampa eventuali messaggi di errore
              }                
    }   