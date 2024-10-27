import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        CyclicSort obj = new CyclicSort();
        System.out.println("Original --> " + Arrays.toString(arr));
        obj.sort(arr);
        System.out.println("Sorted --> " + Arrays.toString(arr));
    }

    // Cyclic Sort
    public void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctPosition = arr[i] - 1;
            if (arr[i] != arr[correctPosition]) {
                // Swap
                swap(arr, i, correctPosition);
            } else {
                i++;
            }

        }

    }

    // Swapping
    public void swap(int[] arr, int index1, int index2) {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}