package HashMap;
import java.util.*;

public class LinkedHashMapBasics {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
         lhm.put("India",  150);
         lhm.put("Russia", 748);
         lhm.put("China",  289);

         System.out.println(lhm);

    }   
}
