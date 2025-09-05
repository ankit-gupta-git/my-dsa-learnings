public class NaturalNos {
    public static int printNaturalNos(int n) {
        if (n == 1) {
            return n;
        }
        int calcSum = printNaturalNos(n - 1);
        int sum = n + calcSum;
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printNaturalNos(n));
    }
}
