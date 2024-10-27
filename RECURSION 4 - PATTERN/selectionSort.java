import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 0, -4 };
        int row = arr.length - 1;
        sorting(arr, row, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr, int row, int col, int maxIndex) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            if (arr[col] > arr[maxIndex]) {
                maxIndex = col;
            }
            sorting(arr, row, ++col, maxIndex);
        } else {
            swap(arr, maxIndex, row);
            sorting(arr, --row, 0, maxIndex);
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}