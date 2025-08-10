package Functions;
import java.util.Scanner;

public class functionsJava {
//     public static int printAvg(int num1, int num2, int num3) {
//         int avg = (num1 + num2 + num3) / 2;
//         return avg;
//     }
//         public static void main(String[] args) {
//             Scanner sc  = new Scanner(System.in);
//             System.out.print("Enter a number 1 : ");
//             int num1 = sc.nextInt();

//             System.out.print("Enter a number 2 : ");
//             int num2 = sc.nextInt();

//             System.out.print("Enter a number 3 : ");
//             int num3 = sc.nextInt();
           
//             int avg = printAvg(num1, num2, num3);
//             System.out.println(avg); //function calls
//         }

//     }


//  public static void printOdd(int n) { 
//     for (int i = 1; i <= n; i++) {
//         if (i % 2 != 0) {
//             System.out.println(i);
//         }
//     }
// }            
//         public static void main (String[] args) {
//             Scanner sc  = new Scanner(System.in);
//             System.out.print("Enter a number : ");
//             int n = sc.nextInt();
//             printOdd(n);
//     }
//  }


//   public static void printGreater(int num1, int num2) {
//      if (num1 > num2) {
//          System.out.println(num1 + " is greater than " + num2); //concatenate
//      } else if (num1 == num2) {
//         System.out.println(num1 + " is equal to " + num2);
//      } else {
//          System.out.println(num2 + " is greater than " + num1);
//      }
//   }
//   public static void main (String[] args) {
//      Scanner sc  = new Scanner(System.in);
//      System.out.print("Enter first number : ");
//      int num1 = sc.nextInt();
//      System.out.print("Enter second number : ");
//      int num2 = sc.nextInt();
//      printGreater(num1, num2);
//   }
// }


// public static float printCircumference(int n) {
//     float circum =  2 * 3.14f * n; 
//     return circum; 
// }

// public static void main(String[] args) {
//     Scanner sc  = new Scanner(System.in);
//     System.out.print("Enter a number : ");
//     int n = sc.nextInt();
//     float circum = printCircumference(n);
//     System.out.println("Circumference of the circle is: " + circum);
//   }
// }

// public static void printVote(int n) {
//     if (n >= 18) {
//         System.out.println("person is eligible for the vote");
//         } else {
//             System.out.println("person is not eligible for the vote");
//         }
// }
// public static void main(String[] args) {
//     Scanner sc  = new Scanner(System.in);
//     System.out.print("Enter age of the person : ");
//     int n = sc.nextInt();
//     printVote(n);
//   }
// }


public static void printPrime(int n) {
    if (n <= 2) {
        System.out.println("is not a prime");
        return;
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if ( n % i == 0 ) {
            System.out.println("is not a prime");
            return;
        }
    }
    System.out.println("is a prime");
}

public static void primesInRange(int n) {
    for (int i=2; i <= n; i++) {
        if(printPrime(i)) {
            System.out.println(i + "");
        }
    }
}

public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    printPrime(n);
    primesInRange(30);
   }
}
