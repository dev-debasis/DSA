import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 0, -4 };
        int row = arr.length - 1;
        sorting(arr, row, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            if (arr[col] > arr[col + 1]) {
                swap(arr, col, col + 1);
            }
            sorting(arr, row, col + 1);
        } else {
            sorting(arr, row - 1, 0);
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}