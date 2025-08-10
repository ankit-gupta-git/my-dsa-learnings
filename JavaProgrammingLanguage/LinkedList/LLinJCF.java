import java.util.LinkedList; //JCF
public class LLinJCF { 
    public static void main(String[] args){
        //create -
        LinkedList<Integer> ll = new LinkedList<>();

        //add -
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println("Original LinkedList: " + ll);

        //remove -
        ll.remove(2);
        System.out.println("LinkedList after removing 2nd element: " + ll);


        
        

    }
}
