package PrinceSinghSheet;

import java.util.Scanner;

public class Qs2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        if (n <= 1) {
            System.out.println("Not a prime number");
            return;
        }
        
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {  // Only check up to sqrt(n)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}

