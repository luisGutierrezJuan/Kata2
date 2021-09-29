package kata2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Entrar
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
       
        Histogram histo = new Histogram(data);
       
        Map<String, Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println (entry.getKey () + " ==> " + entry.getValue());
        }
    }  
}