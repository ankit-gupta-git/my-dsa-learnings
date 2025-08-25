//Print numbers fom n to 1 (decreasing order)
public class RecursionBasics {
    public static void printDec(int n) { //5 4 3 2 1
        //base case
        if(n == 1) {
            System.out.print(n);
            return;
        }

        //self work
        System.out.print(n + " "); //n

        //recursive call
        printDec(n-1); //n-1, n-2, n-3, n-4 .....1
    }

    public static void main(String args[]) {
        int n = 5;
        printDec(n);
    }
}


//Print numbers fom n to 1 (increasing order)
// public class RecursionBasics {
//     public static void printInc(int n) {
//         if(n == 1) {                   //Base class
//             System.out.print(n+" ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n+" ");
//     }

//     public static void main(String args[]) {
//         int n = 10;
//         printInc(n);
//     }
// }