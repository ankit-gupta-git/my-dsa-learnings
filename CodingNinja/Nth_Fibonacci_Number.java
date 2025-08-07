package CodingNinja;
import java.util.Scanner;

public class Nth_Fibonacci_Number {
    static int fibonacci(int n){

		int a = 0, b = 1, c; 

			for (int i = 1; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return a;
	}
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  System.out.println(fibonacci(n));
	}
}
