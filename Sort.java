package com.company;


// Task3

public class Sort {

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static int[] bubleSort(int[] arr) {
        int temp = 0;
        for (int i = arr.length; i > 0; i--) {
            for (int e = 0; e < (i - 1); e++) {
                if (arr[e] > arr[e + 1]) {
                    swap(arr, e, e + 1);
                }
            }
        }
        return arr;
    }

    public static int[] sheikerSort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int temp;
        do {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                }
            }
            left++;
        } while (left < right);
        return arr;
    }


    public static int[] selectionSort(int[] arr) {
        int buff;
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int e = i; e < arr.length; e++) {
                if (arr[e] < arr[index]) {
                    index = e;
                }
            }
            swap(arr, i, index);
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            int e = i;
            while (e > 0 && (arr[e] < arr[e - 1])) {
                temp = arr[e];
                arr[e] = arr[e - 1];
                arr[e - 1] = temp;
                e--;
            }
        }
        return arr;
    }

    public static int[] gmomeSort(int a[]) {
        int pos, temp;
        for (int i = 0; i < a.length; i++) {
            pos = i;
            while (pos > 0 && a[pos - 1] > a[pos]) {
                swap(a, pos, pos-1);
                pos = pos - 1;
            }
        }
        return a;
    }

}