package PracticeSheets.Week1;

// Write a program to insert an element at a specific position in an array. 
public class SpecificPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int position = 2; // Position to insert the element (0-based index)

        // Check if the position is valid
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position");
            return;
        }

        // Create a new array with one extra space
        int[] newArr = new int[arr.length + 1];

        // Copy elements up to the position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = elementToInsert;

        // Copy the remaining elements
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print the new array
        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
