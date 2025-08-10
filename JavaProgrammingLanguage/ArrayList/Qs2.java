package ArrayList;
import java.util.ArrayList;

//swap two numbers 
public class Qs2 {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int idx1 = 1; int idx2 = 2;
        System.out.println("Before swapping: " + list);
        swap(list, idx1, idx2);
        System.out.println("After swapping: " + list);
    }
}
