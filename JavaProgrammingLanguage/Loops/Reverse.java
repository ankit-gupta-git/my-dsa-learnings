package Loops;

public class Reverse {
    public static void main(String[] args) {
        int n = 10899;
        while(n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;
        // for (int i = n; i >= 1; i--){
            // System.out.println(i);
        }
        System.out.println();
    }

}
