// BUBBLE SORT :-
// in bubble sort we repeatedly iterate through the list and the adjacent elements are compared and then swaped if they are in wrong order this iterations is repeated until the list is sorted . 
// its called bubble sort because larger elements "bubble up " to te end of the array in each pass 

import java.util.Scanner;

public class Bubble_sort {

    // Bubble sort method
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, array is sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements of arrays: ");
        for (int i = 0; i < n; i++) {
            System.out.print("ELEMENT " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr); // Sorting the array

        System.out.println("\nSorted Array:");
        printArray(arr);

        sc.close();
    }

    // method to print the array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
