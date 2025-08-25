public class FibonacciNo {
    static int fib(int n){
        
        //base case
        if(n == 0 || n == 1) return n;

        //smaller problem - recursive work
        int prev = fib(n-1);         //(n-1)th fibonacci number
        int prevPrev = fib(n-2);         //(n-2)th fibonacci number

        //big problem - self work
        int ans = prev + prevPrev;       //fn = (n-1)th + (n-2)th
        return ans;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));
    }
}