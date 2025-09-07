package PracticeSheets.Week1;

//Write a program to find the smallest element in an array.
public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest element is: " + smallest);
    }
    
}
