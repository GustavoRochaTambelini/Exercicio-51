
package conjuntooperacao.src.conjuntooperacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexandre
 */


public class ConjuntoOperacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pathToFile = args[0];
        File fl = new File(pathToFile);
        String line;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(fl));
            
            while (br.ready()) {
                
                line = br.readLine();
                line = line.replace("{", "");
                line = line.replace("}", "");
                
                if (line.contains("u")) {
                    //insira aqui o método ou objeto que trata das uniões.
                }
                
                 if (line.contains("i")) {
                    //insira aqui o método ou objeto que trata das intersecções
                }
                 
                 if (line.contains("s")) {
                    //insira aqui o método ou objeto que trata das intersecções
                }
                 
                 if (!line.contains("u") && !line.contains("i") && !line.contains("s")) {
                    //insira aqui o método ou objeto que trata dacardinalidade
                }
                 
            }
            
            br.close();
                        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConjuntoOperacao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConjuntoOperacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
