public class InvertedHalfPyramid {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++){
            // Print spaces
            for (int j = 1;  j <=5-i; j++){
                    System.out.print(" ");
                }

                // Print stars
                for(int j = 1;  j <= i; j++){
                    System.out.print("*");
                }
                
               System.out.println();
            }
    }
}
