package com.kodnest.ds.SortingAlgos;

import java.util.Scanner;

public class InsertionSortExample {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length()");
		int[] numbers = {9, 5, 1, 4, 3};

        // Perform Insertion Sort
        insertionSort(numbers);

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Insertion Sort algorithm
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements of the sorted portion that are greater than the key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }
}