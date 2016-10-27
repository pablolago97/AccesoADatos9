
package copycaracteres;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Copycaracteres {

    public static void main(String[] args) throws IOException {
        //Declarar 2 variables tipo 'file'
        //File texto10 = new File ("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/copycaracteres/texto10.txt");
        File texto11 = new File ("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/copycaracteres/texto11.txt");
        texto11.createNewFile();
        //Writer y Reader del archivo #1
        //FileWriter texto10a = new FileWriter(texto10);
        FileReader texto10b = new FileReader("/home/local/DANIELCASTELAO/plago-bergonpazos/NetBeansProjects/copycaracteres/texto10.txt");
        //Writer y Reader del archivo #2
        FileWriter texto11a = new FileWriter(texto11);
        //FileReader texto11b = new FileReader(texto11);
        
        
        int c;
        while((c= texto10b.read())!=-1){
        texto11a.write(c);
        }
        texto11a.close();
        texto10b.close();
        
        
        
        
        
    }
    
}
