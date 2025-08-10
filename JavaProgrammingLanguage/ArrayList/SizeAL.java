package ArrayList;
import java.util.ArrayList;

public class SizeAL {
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
    //print the array list
    for(int i = 0; i<list.size(); i++){
        System.out.print(list.get(i) + " ");
    }
    System.out.println();
   }
  }
