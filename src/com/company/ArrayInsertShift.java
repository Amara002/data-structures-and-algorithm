package com.company;

import java.util.*;

public class ArrayInsertShift {

    public static int[] addX(int n, int arr[], int x) {
        int i;
        double middle = Math.ceil(arr.length / 2);

        int newarr[] = new int[n + 1];
        // newarr[n] = x;
        for (i = 0; i < n + 1; i++) {
            //  newarr[n] = x;
            if (i < middle) {
                newarr[i] = arr[i];
            }
            if (i == middle) {
                newarr[i] = x;
            } else if (i > middle) {
                newarr[i] = arr[i - 1];
            }
            // newarr[i] = arr[i];
        }


        return newarr;
    }

    public static void main(String[] args) {
        // write your code here
        int i;
        int arr[]
                = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int n = arr.length;

        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));

        int x = 50;

        arr = addX(n, arr, x);

        System.out.println("\nArray with " + x
                + " added:\n"
                + Arrays.toString(arr));

    }
}
