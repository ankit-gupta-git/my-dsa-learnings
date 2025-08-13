package HackerRank;

import java.util.Scanner;
public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5 && n % 2 == 0) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20 && n % 2 == 0 ){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        
    }
}
