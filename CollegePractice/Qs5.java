public class Qs5{
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= 4-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            for(int l=5;l<=i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}