// import java.util.Arrays;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { -64, 25, 0, 12, 22, 11 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Selection Sorting
    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            // Find the maximum element in the remaining array
            int end = len-i-1;
            int maxElementIndex = maximum(arr, 0, end);

            // Swaping between max elemnet and it's correct position's element
            swap(arr, maxElementIndex, end);
        }
    }
    
    // Find maximum
    public static int maximum(int[] arr, int start, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // Swapping 
    public static void swap(int[] arr, int maxElementIndex, int end) {
        int temp = 0;
        temp = arr[end];
        arr[end] = arr[maxElementIndex];
        arr[maxElementIndex] = temp;
    }

}
