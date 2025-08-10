public class MultidimensionalArray {
    int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 

    void multiArrays() {
        int[][] arr = new int[3][3]; // 2D array with 3 rows and 3 columns
        System.out.println("Multidimensional array initialized successfully.");
        System.out.println("Array length: " + arr.length); // prints number of rows
    }

    public static void main(String[] args) {
        MultidimensionalArray obj = new MultidimensionalArray();
        obj.multiArrays();

        // Accessing arr2 from class-level
        int element = obj.arr2[1][2]; // 2nd row, 3rd column => 6
        System.out.println("Accessed element: " + element);

    }
}
