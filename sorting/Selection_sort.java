// SELECTION SORT
//selection sort works by repeatedly finding thhhe minimum (or maximum) element from the unsorted portion of the array and placing it at the beginning 

import java.util.Scanner;

public class Selection_sort {
    // Selection Sort logic
    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the index of the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap current element with the found minimum
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("ELEMENTS " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }

        // Print original array
        System.out.println("\nOriginal Array:");
        printArray(arr);

        // Perform Selection Sort
        selectionSort(arr);

        // Print sorted array
        System.out.println("\nSorted Array:");
        printArray(arr);

        sc.close();
    }

    // Print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
