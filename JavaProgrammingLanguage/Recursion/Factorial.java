public class Factorial {
    public static int fact(int n){
        
        //base case
        if(n == 0) return 1;

        //smaller problem - recursive work
        int fnm1 = fact(n-1);

        //big problem - self work
        int ans = n * fnm1;             //n * (n-1)!
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
