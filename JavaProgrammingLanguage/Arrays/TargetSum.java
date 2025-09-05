import java.util.Scanner;

public class TargetSum {
    static int pairSum(int arr[], int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) { //first number
            for (int j = i + 1; j < arr.length; j++) { //second number
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();
        System.out.println("Number of pairs: " + pairSum(arr, target));
    }
}
