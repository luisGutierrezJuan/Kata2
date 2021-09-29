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
        Integer[] data = new Integer[15];
       
        data[0] = 12;
        data[1] = 20;
        data[2] = 45;
        data[3] = 30;
        data[4] = 74;
        data[5] = 89;
        data[6] = 17;
        data[7] = 11;
        data[8] = 6;
        data[9] = 95;
        data[10] = 77;
        data[11] = 77;
        data[12] = 77;
        data[13] = 77;
        data[14] = 77;
       
        Histogram histo = new Histogram(data);
       
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println (entry.getKey () + " ==> " + entry.getValue());
        }
    }  
}