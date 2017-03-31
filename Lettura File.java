package registro;
import java.io.*;

public class lettura {
    public lettura() throws InterruptedException{

          try { // eccezione
            FileReader reader = new FileReader("nome file"+".txt"); // asseagna a reader il file da andare ad aprire per poi leggere
            BufferedReader bufferedReader = new BufferedReader(reader); // cerca e legge il file 
 
            String line; // variabile 
 
            while ((line = bufferedReader.readLine()) != null) { // finchè non finisce di leggere il file, non finisce la lettura
               System.out.println("\n"+line); // stampa tutto il contenuto del file (ps. "\n" : va a capo)
            }
            reader.close(); // chiude la lettura
 
        } catch (IOException e) { // gestisce l'eccezione
            e.printStackTrace(); // se ci sono eccezzioni come ad esempio il fatto che non trova il file, stamperà l'errore
        }
}
}