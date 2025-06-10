import java.util.Scanner;

public class Insertion_sort {
    // Insertion Sort method
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Element to be inserted
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Insert key at correct position
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array input from user
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("ELEMENT " + (1 + i) + " :");
            arr[i] = sc.nextInt();
        }

        // Print original array
        System.out.println("\nOriginal Array:");
        printArray(arr);

        // Perform Insertion Sort
        insertionSort(arr);

        // Print sorted array
        System.out.println("\nSorted Array:");
        printArray(arr);

        sc.close();
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
