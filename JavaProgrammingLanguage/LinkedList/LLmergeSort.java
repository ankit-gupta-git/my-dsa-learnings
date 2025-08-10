public class LLmergeSort {
    
    
    public Node mergeSort(Node head) {
        if(head == null && head.next != null){
            return head;
        }
        //find mid
        Node mid = getMid();
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }
    
    
    
    public static void main(String[] args) {

    }
}
