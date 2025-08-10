package PrinceSinghSheet;
import java.util.Scanner;
// Q1. Write a program to check whether a number is even or odd.

public class Qs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
