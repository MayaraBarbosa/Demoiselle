package Etiqueta;

import java.io.IOException;
import java.io.PrintWriter;
import static java.sql.DriverManager.println;

public class Etiqueta {

    public static void imprimirEtiqueta() throws IOException {

            try {
                String[] command = {"cmd",};
                Process p = Runtime.getRuntime().exec(command);
                new Thread(new ThreadSyncPipe(p.getErrorStream(), System.err)).start();
                new Thread(new ThreadSyncPipe(p.getInputStream(), System.out)).start();
                PrintWriter stdin = new PrintWriter(p.getOutputStream());
                stdin.println("type etiqueta.txt > ImpressoraCompartilhadaNoWindows"); 
                stdin.close();
                int returnCode = p.waitFor();
            } catch (Exception e) {
              
                println("erro" + e.getMessage());
            }
    }
}