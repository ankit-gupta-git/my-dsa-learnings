package HashMap;
import java.util.*;

public class IterateHashmaps {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("China", 300);
        hm.put("Russia", 400);
        hm.put("Japan", 500);

        //Iterate
        Set<String> keys  = hm.keySet(); // Get the set of keys
        System.out.println(keys);
        for (String key : keys) { // Iterate through the keys
            System.out.println(key + ": " + hm.get(key)); // Print each key-value pair
        }
    }
    
}
