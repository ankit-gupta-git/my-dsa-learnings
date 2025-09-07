package PracticeSheets.Week1;

// Write a program to access an element at a specific index in an array.
public class SpecificIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2; // Index to access (0-based)

        // Check if the index is valid
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return;
        }

        // Access the element at the specific index
        int element = arr[index];
        System.out.println("Element at index " + index + ": " + element);
    }
}
