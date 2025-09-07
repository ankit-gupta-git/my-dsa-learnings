package PracticeSheets.Week1;

//Write a program to find the sum and average of an array.
public class SumAvg {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
