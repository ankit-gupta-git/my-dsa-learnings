import java.util.Scanner;
import java.util.Arrays;

public class AcendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number: ");

        int n = sc.nextInt();

        int[]arr = new int[n];

        System.out.println("Enter the Element: ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Array in ascending order: ");

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
