package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); //O(1);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(6);

        //Sort the list
        System.out.println(list);
        Collections.sort(list); //ascending order
        System.out.println("Sorted list = " + list);

        //Sort the list in descending order
        Collections.sort(list, Collections.reverseOrder()); 
        //Comparator - fnx that defines logic of sorting
        System.out.println("Sorted list in descending order = " + list);
    }
}
