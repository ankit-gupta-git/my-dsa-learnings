package HashMap;
import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        //create 
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1) time complexity
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("China", 300);
        hm.put("Russia", 400);
        hm.put("Japan", 500);

        System.out.println(hm); // {India=100, USA=200, China=300, Russia=400, Japan=500}

        //Get - O(1) time complexity
        int population = hm.get("India"); // get the value associated with the key "India"
        System.out.println("Population of India: " + population); // Population of India: 100

        System.out.println(hm.get("Indonesia")); // null

        //constainsKey - O(1) time complexity
        System.out.println(hm.containsKey("India")); // true

        System.out.println(hm.containsKey("Indonesia")); // false

        //Remove - O(1) time complexity
        hm.remove("India"); // remove the key-value pair with key "India" 
        System.out.println(hm); // {USA=200, China=300, Russia=400, Japan=500}

        //Size - O(1) time complexity
        System.out.println("Size of HashMap: " + hm.size()); // Size of HashMap: 4

        //IsEmpty - O(1) time complexity
        System.out.println("Is HashMap empty? " + hm.isEmpty()); // Is HashMap empty? false

        //Clear - O(n) time complexity
        hm.clear(); // remove all key-value pairs from the HashMap
        System.out.println("Size of HashMap after clear: " + hm.size()); // Size of HashMap after clear: 0
    }
}
