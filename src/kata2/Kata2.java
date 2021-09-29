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
        int[] data = new int[15];
       
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
       
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
       
        for (int i = 0; i < data.length; i++){
            if (histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else{
                histogram.put(data[i], 1);
            }
        }
       
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println (entry.getKey () + " ==> " + entry.getValue());
        }
        //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
    }
   
}