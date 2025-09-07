package PracticeSheets.Week1;

//Write a program to reverse an array in place.
public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        System.out.print("The original array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Reversing the array
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            // Swap numbers[start] and numbers[end]
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        System.out.print("The reversed array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
}
