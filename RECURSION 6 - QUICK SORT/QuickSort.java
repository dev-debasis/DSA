import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 9, 9, -8, 7, 6, 5, 4, 3, 2, 1, 0, 0 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        // After chooosing the pivot element we have to put it in it's correct position.
        int partitionIndex = placingPivot(arr, start, end);
        quickSort(arr, start, partitionIndex);
        quickSort(arr, partitionIndex + 1, end);
    }

    public static int placingPivot(int[] arr, int start, int end) {
        int mid = start + (end - start) / 2;
        int pivotElement = arr[mid], i = start, j = end;
        while (i <= j) {

            while (arr[i] < pivotElement && i <= j) {
                i++;
            }

            while (arr[j] > pivotElement && j >= i) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return mid;
    }
    

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = 0;
        temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}