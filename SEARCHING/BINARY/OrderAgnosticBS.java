// package BINARY;

//Order agnostic BS means if a sorted array is given but we don't know in which order is it sorted assending or decending

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, -4, -5, -6, -7, -8 };
        int target = -5;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}