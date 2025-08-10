package Patterns;
public class PatternBasics {
    public static void main(String[] args) {
        // Print a pattern of stars
        // int n = 5;
        // for(int i = 1; i <= 5; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        //HALF pyramid
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}   
