public class DemoArrays {
    
    void demoarrays() {
        int[] arr = new int[5]; // 1D array with 5 elements
        System.out.println("Array initialized successfully.");
        System.out.println("Array length: " + arr.length); // prints number of elements
        arr[0] = 10; // assigning value to the first element
        System.out.println("First element: " + arr[0]);

        arr[1] = 20; // assigning value to the second element
        arr[2] = 30; // assigning value to the third element

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }   

        for (int value : arr) {  //for each - we can't print partial arrays
            System.out.println("Value in array: " + value);
        }

        int i = 0;
        while(i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        DemoArrays demo = new DemoArrays();
        demo.demoarrays();
    }
}
