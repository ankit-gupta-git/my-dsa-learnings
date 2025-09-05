
import java.util.ArrayList;
import java.util.Collections;

public class BasicsArrayList {
    public static void main(String[] args) {
    //ClassName objName = new ClassName();                 //vectors do same thing in C++ as array list in java
    //part of java collection framework
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1); //O(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1, 9); //O(n);
    System.out.println(list); 
    System.out.println(list.size());

    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i) + "");
    }

    //to print reverse
    for (int i = list.size() - 1; i >= 0; i--) {
        System.out.println(list.get(i) + "");
    }


    //Get operation - O(1)
    int element = list.get(2);
    System.out.println(element);

    //Delete - O(n)
    list.remove(4);
    System.out.println(list);

    //Set - O(n)
    list.set(2, 10);
    System.out.println(list);

    //Contains - O(n)
    System.out.println(list.contains(10));
    System.out.println(list.contains(100));


    Collections.sort(list);
    System.out.println(list);

    //descending
    Collections.sort(list, Collections.reverseOrder());
    //comparator - fnx logic
    System.out.println(list);


    }
}
