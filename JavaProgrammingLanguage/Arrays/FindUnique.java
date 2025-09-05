public class FindUnique {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 2, 3, 1, 6};
        
        for (int i = 0; i < numbers.length; i++) {
            // boolean isUnique = true;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    // isUnique = false;
                    // break;
                    numbers[i] = -1; // Mark as non-unique
                    numbers[j] = -1; // Mark as non-unique
                }
            }
        }

            int ans = -1;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    ans = numbers[i];
                      System.out.println("unique element is: " + numbers[i]);
                }
            }
            // if (isUnique) {
            //     System.out.println("The unique element is: " + numbers[i]);
            //     break;
            // }

            System.out.println("The unique element is: " + ans);
          
            // return ans;
        }

}
