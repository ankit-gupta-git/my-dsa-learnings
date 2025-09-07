package PracticeSheets.Week1;

//Write a program to find the largest element in an array. 
public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest element is: " + largest);
    }
}
