package PrinceSinghSheet;
import java.util.Scanner;

public class Qs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        boolean isleapyear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        System.out.println(isleapyear ? "Leap year" : "Not a leap year");
        }
    }
