package com.kodnest.ds.SortingAlgos;

import java.util.Scanner;

class Array {
    private int arr[];
    private int size;

    // Constructor to create an array
    public Array(int size) {
        this.size = size;
        arr = new int[size];
        System.out.println("Array of size " + size + " get created");
    }

    // Method to insert an element at a specific position
    public void insert(int pos, int elem) {
        if (pos < 0 || pos >= size) {
            System.out.println("Insertion failed: Invalid position");
            return;
        }
        arr[pos] = elem;
        System.out.println("Inserted " + elem + " at position " + pos);
    }

    // Method to delete an element at a specific position
    public void delete(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Deletion failed: Invalid position");
            return;
        }
        arr[pos] = 0; // Assuming 0 indicates a vacant spot
        System.out.println("Deleted element at position " + pos);
    }

    // Method to display all elements in the array
    public void display() {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to get an element at a specific index
    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Get failed: Invalid index");
            return -1; // Indicating an error
        }
        return arr[index];
    }
}

public class PaypalProduct {
    public static void main(String[] args) {
        // Create an array of size 5
        Array array = new Array(5);
        //Scanner Scan =new Scanner(System.in);
        //System.out.println("Array of Size "+size+" Created");
        

        // Insert elements
        array.insert(0, 10);
        array.insert(1, 20);
        array.insert(2, 30);

        // Display elements
        array.display();

        // Get an element at index 1
        int elem = array.get(1);
        System.out.println("Element at index 1: " + elem);

        // Delete an element at position 1
        array.delete(1);

        // Display elements after deletion
        array.display();
    }
}
