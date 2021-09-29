/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author uluis
 */
public class Histogram<T> {
    private final T[] data;
        
        public Histogram(T[] d){
            this.data = d;
        }
        
        public T[] get(){
            return data;
        }
        
        public Map<T, Integer> getHistogram(){
            Map<T, Integer> histogram = new HashMap<T, Integer>();
            for (T key : data) {
                histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            }
            return histogram;
        }
}
