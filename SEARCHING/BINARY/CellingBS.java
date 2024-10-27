// package BINARY;

public class CellingBS {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 2, 1 };
        int input = 5;
        int element = findGreaterEqual(arr, input);
        System.out.println(element);
    }

    public static int findGreaterEqual(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[arr.length - 1];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            // Assending Order
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Descending Order
            else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        if (isAsc) {
            return arr[start];

        } else {
            return arr[end];
        }
    }

}
