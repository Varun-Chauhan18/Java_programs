//Counting sort is a non-comparative sorting algorithm that is effective for sorting a collection of objects according to "keys" that are small positive integers. It works by counting the number of occurrences of each distinct key value, and then using that information to calculate the positions of each key value in the output sequence.

// Algorithm Steps:
// Find the Maximum Element
// Initialize Count Array
// Populate Count Array
// Calculate Cumulative Count
// Build Output Array
// Copy to Original Array

import java.util.Arrays;

public class Count_sort {

    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        // Step 1: Create count array
        int[] count = new int[max + 1];
        Arrays.fill(count, 0);

        // Step 2: Count frequency
        for (int num : arr) {
            count[num]++;
        }

        // Step 3: Cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Output array
        int[] output = new int[arr.length];

        // Step 5: Place elements into output array (stable sort)
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Step 6: Copy back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };

        System.out.println("Original Array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }
}
