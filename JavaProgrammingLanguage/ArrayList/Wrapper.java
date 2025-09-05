import java.util.*;

public class Wrapper {
    public static void main(String[] args) {
        //wrapper class
        Integer in = Integer.valueOf(5);
        System.out.println(in);

        Float f = Float.valueOf(5.5f);
        System.out.println(f);

        Double d = Double.valueOf(5.5);
        System.out.println(d);

        Character ch = Character.valueOf('A');
        System.out.println(ch);

        Boolean bool = Boolean.valueOf(true);
        System.out.println(bool);

        ArrayList<Integer> list = new ArrayList<>();

        //add new element 
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //get an element index i
        int element = list.get(0);
        System.out.println(element);

        //print with for loop
        for (int i = 0; i < list.size(); i++) {  //in array length is method in array but in array list size is property
            System.out.println(list.get(i));
        }

        //print array list directly
        System.out.println(list);

        //adding element in some index
        list.add(1, 15);
        System.out.println(list);

        //remove element at index 0
        list.remove(0);
        System.out.println(list);

        //modify a element
        list.set(0, 25);
        System.out.println(list);

        //removing an element e
        list.remove(Integer.valueOf(30));
        System.out.println(list);

        //checking an element if exists
        if (list.contains(25)) {
            System.out.println("Element 25 exists in the list.");
        } else {
            System.out.println("Element 25 does not exist in the list.");
        }

        //if you don't specify the class, you can put anything into class
        ArrayList list2 = new ArrayList();
        list2.add("Hello");
        list2.add(10);
        list2.add(5.5);
        System.out.println(list2);

        // Integer c = 20;
        // int d = c; //unboxing
        // System.out.println(d);
    }
}