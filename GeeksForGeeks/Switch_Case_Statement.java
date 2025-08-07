package GeeksForGeeks;

import java.util.List;

public class Switch_Case_Statement {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        switch(choice) {
         case 1: 
             return Math.PI * arr.get(0) * arr.get(0);
         
         case 2: 
             return arr.get(0) * arr.get(1);
             
         default:
              return 0;
        }
    }
}
