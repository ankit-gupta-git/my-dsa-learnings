
//Write a program to perform linear search on an array.
public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int target = 7;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
