import java.util.Arrays;
import java.util.Scanner;

public class ArraysQues {
    // 1. Find the largest element in an array
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // 2. Find the smallest element in an array
    public static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    // 3. Calculate sum and average of array elements
    public static void sumAndAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        double avg = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

    // 4. Reverse an array in place
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    // 5. Linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // 6. Binary search (array must be sorted)
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 7. Insert element at specific position
    public static int[] insertAt(int[] arr, int element, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index.");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) newArr[i] = element;
            else newArr[i] = arr[j++];
        }
        return newArr;
    }

    // 8. Delete element from specific index
    public static int[] deleteAt(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index.");
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) newArr[j++] = arr[i];
        }
        return newArr;
    }

    // 9. Merge two sorted arrays into a single sorted array
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) result[k++] = a[i++];
            else result[k++] = b[j++];
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }

    // 10. Count even and odd elements
    public static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

    // Main method 
    public static void main(String[] args) {
        int[] array = {12, 7, 5, 3, 8, 10};

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Largest: " + findLargest(array));
        System.out.println("Smallest: " + findSmallest(array));
        sumAndAverage(array);

        reverseArray(array);
        System.out.println("Reversed: " + Arrays.toString(array));

        int target = 8;
        int index = linearSearch(array, target);
        System.out.println("Linear Search: Element " + target + " found at index " + index);

        Arrays.sort(array);
        System.out.println("Sorted for Binary Search: " + Arrays.toString(array));
        index = binarySearch(array, target);
        System.out.println("Binary Search: Element " + target + " found at index " + index);

        int[] inserted = insertAt(array, 15, 2);
        System.out.println("After Insertion at index 2: " + Arrays.toString(inserted));

        int[] deleted = deleteAt(array, 3);
        System.out.println("After Deletion at index 3: " + Arrays.toString(deleted));

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged Sorted Arrays: " + Arrays.toString(merged));

        countEvenOdd(array);
    }
}
