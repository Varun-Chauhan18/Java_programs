
// Radix Sort is a non-comparative sorting algorithm that sorts elements by processing individual digits (or characters, or bits) from least significant to most significant (LSD Radix Sort) or vice versa (MSD Radix Sort). It's particularly efficient for sorting integers with a limited range of digits.
// Unlike comparison-based sorts (like QuickSort or MergeSort), Radix Sort doesn't compare elements to each other. Instead, it places elements into "buckets" based on the value of their current significant digit.
import java.util.Arrays;

public class Radix_sort {

    // Function to get the maximum value in the array
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // Counting sort for a specific digit place (exp = 1, 10, 100, ...)
    static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // Output array
        int[] count = new int[10]; // Digits range: 0–9

        // Count occurrences based on digit at exp
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array (traverse from right for stability)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy output to original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main radix sort function
    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Sort for every digit place (1s, 10s, 100s...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };

        System.out.println("Original Array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }
}
