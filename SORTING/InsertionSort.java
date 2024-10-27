import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 15, 2, -4, 1, 0 };
        System.out.println("Original --> " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted --> "+Arrays.toString(arr));
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j); // Swap function call
                } else {
                    break;
                }
            }
        }
    }

    // Swapping
    public static void swap(int[] arr, int large, int small) {
        int temp = 0;
        temp = arr[large];
        arr[large] = arr[small];
        arr[small] = temp;
    }
}