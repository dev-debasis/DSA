import java.util.Arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 1, 3));
        reverse(arr);
    }

    public static int max(int[] arr) {
        int max = arr[0];
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Maximum in a range
    public static int maxInRange(int[] arr, int start, int end) {
        int max = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Reverse the array // {1,2,3,4}
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // SWAP
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }
}   