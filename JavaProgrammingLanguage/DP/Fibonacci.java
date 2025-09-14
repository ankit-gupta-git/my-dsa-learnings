package DP;

public class Fibonacci {
    static int fibonacci(int n, int f[]) {
        //base case
        if (n == 0 || n == 1) {
            return n;
        }

        if(f[n] != 0) {
            return f[n];
        }

        //recursive case
        f[n] = fibonacci(n - 1, f) + fibonacci(n - 2, f);
        return f[n];
    }
    public static void main(String[] args) {
        int n = 10; // Example value for n
        int f[] = new int[n + 1]; //0, 0, 0, 0, 0
        System.out.println(fibonacci(n, f));
    }
}
