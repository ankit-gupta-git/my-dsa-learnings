package ArrayList;
import java.util.ArrayList;

public class BasicsArrayList {
    public static void main(String[] args) {
    //ClassName objName = new ClassName();
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1); //O(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1, 9); //O(n);
    System.out.println(list); 
    System.out.println(list.size());


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
    }
}
