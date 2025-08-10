package CallByValue;
import java.util.*;

public class CallByValue {
//     public static void swapValue(int a, int b) {  
//         //swap
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);

//     }
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;
//         swapValue(a, b);  //call by value (changes shows in function only not in main function)
//     }
// }


// public static int multiply(int a, int b) {
//     int product = a * b;
//     return product;
// }

// public static void main(String[] args) {
//     int a = 5;
//     int b = 10;
//     int prod = multiply(a, b);
//     System.out.println("a * b = " + prod);
//     prod = multiply(10, 20);
//     System.out.println("prod = " + prod);
//   }
// }


public static int factorial(int n) {
    int fact = 1;
    for  (int i = 1; i <= n; i++) {
        fact = fact * i;
    }
    return fact; //factorial of n
}

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     int fact = Factorial(n);
//     System.out.println("the factorial is : " + fact);
//   }
// }


public static int binCoeff(int n, int r) {
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n - r);

    int binCoeff = fact_n / (fact_r * fact_nmr);
    return binCoeff;
}

public static void main(String[] args) {
    System.out.println(binCoeff(5, 2));
  }
}





