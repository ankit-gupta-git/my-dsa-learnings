import java.util.*;

public class LinkedHashMapBasics {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();  //keys are insertion ordered
         lhm.put("India",  150);
         lhm.put("Russia", 748);
         lhm.put("China",  289);

         System.out.println(lhm);

        TreeMap<String, Integer> thm = new TreeMap<>();  //sorts on the basis of key
         thm.put("India",  150);
         thm.put("Russia", 748);
         thm.put("China",  289);
         thm.put("Indonesia", 120);

         System.out.println(thm);

        HashMap<String, Integer> hm = new HashMap<>();    //unordered
         hm.put("India",  150);
         hm.put("Russia", 748);
         hm.put("China",  289);

         System.out.println(hm);

    }   
}
