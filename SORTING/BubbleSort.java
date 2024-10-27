// package DSA PROBLEMS.SORTING;

import java.util.Arrays;

class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 1, -2, -3, 0, 4, 0 };
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        // String Method
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}