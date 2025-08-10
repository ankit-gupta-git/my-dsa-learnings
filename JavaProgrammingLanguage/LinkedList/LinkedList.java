public class LinkedList {
    public static class Node {
        int data;
        Node next; //refrance variable to point next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 = newNode next = head
        newNode.next = head; //Link

        //step3 = head = newNode
        head = newNode;
    }

    public void addLast(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 = tail next = newNode
        tail.next = newNode;

        //step3 = tail = newNode
        tail = newNode;
    }

    public void print() {
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        } 
        Node newNode = new Node(data); 
        size++;
        Node temp  = head;
        int i = 0;

        while(i < idx - 1){
            temp = temp.next;
            i++;
        }

        //i = idx - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    //Remove operation in linked list
    public int removeFirst(){ //ll is empty
        if(size == 0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1){ //head and tail both same 
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
         if(size == 0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
         }else if(size == 1){ //head and tail both same
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
         }
         //prev : i =  size - 2
         Node prev = head;
         for(int i = 0; i < size - 2; i++){
             prev = prev.next;
         }

         int val = prev.next.data; //tail data
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

        public int itrSearch(int key){
            Node temp = head;
            int idx = 0;
            while(temp != null){
                if(temp.data == key){ //key found 
                    return idx;
                }
                temp = temp.next;
                idx++;
            }

            //key not found
            return -1;
        }

        public int helper (Node head, int key ){ //O(n)
            if(head == null){
                return -1;
            }
            if(head.data == key){
                return 0;
            }
            int idx = helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx + 1;
        }
        public int recSearch(int key){
            return helper(head, key);  
        }

        //To Reverse a Linked List
        public void reverse(){
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        public void deleteNthfromEnd(int n){
            //calculate size 
            int sz = 0;
            Node temp = head;
            while(temp != null){
                sz++;
                temp = temp.next;
            }

            if(n == sz){
                head = head.next; //removeFirst 
                return;
            }

            //sz - n
            int i = 1;
            int iToFind = sz - n;
            Node prev = head;
            while(i < iToFind){
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            size--;
        }

        //Slow fast Approach to find mid 
        public Node findMid(Node head){ //helper
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null){
                slow = slow.next; //+1
                fast = fast.next.next; //+2
            }
            return slow;//slow is my midNode
        }

        public boolean checkPalindrome(){
            if(head==null || head.next==null){
                return true;
            }
            //step1 - find mid
            Node midNode = findMid(head);

            //step2 - reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while(curr!= null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node right = prev;//right half head 
            Node left = head;

            //step3 - check left half & right half
            while(left!= null && right!= null){
                if(left.data!= right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
 
    public static void main (String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.add(2, 25);
        ll.print();
        System.out.println("Size: " + ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println("Size: " + ll.size);
        ll.removeLast();
        ll.print();
        System.out.println("Size: " + ll.size);
        System.out.println("Index of 25: " + ll.itrSearch(25));
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(2);
        ll.print();
    }
} 