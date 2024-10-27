import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 7, 9, 0, -4, -2, -6, 0, -4 };
        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        // Dividing the left part
        divide(arr, start, mid);

        // Dividing the right part
        divide(arr, mid + 1, end);

        // Merging two parts

        merging(arr, start, mid, end);
    }

    public static void merging(int[] arr, int start, int mid, int end) {
        int idx1 = start, idx2 = mid + 1, tempidx = 0;
        int[] temp = new int[end - start + 1];

        while (idx1 <= mid && idx2 <= end) {

            if (arr[idx1] <= arr[idx2]) {
                temp[tempidx++] = arr[idx1++];
            } else {
                temp[tempidx++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            temp[tempidx++] = arr[idx1++];
        }
        while (idx2 <= end) {
            temp[tempidx++] = arr[idx2++];
        }


        // Copying the temp array to original one 

        // for (int i = 0; i < temp.length; i++) {
        //     arr[start + i] = temp[i];
        // }

        // Advance way to copy 
        int[] merged = Arrays.copyOfRange(temp, 0, temp.length);
        System.arraycopy(merged, 0, arr, start, merged.length);

    }
}
