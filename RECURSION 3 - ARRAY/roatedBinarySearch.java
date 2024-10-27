public class roatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(findIndex(arr, 6));
    }

    public static int helper(int[] arr, int target, int start, int end) {

        if (end < start) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) { // Base Condition
            return mid;
        }

        if (arr[start] <= arr[mid]) { // Sorted portion
            if (target >= arr[start] && target < arr[mid]) {
                return helper(arr, target, start, mid - 1);
            } else {
                return helper(arr, target, mid + 1, end);
            }
        }

        if (target > mid && target <= end) {
            return helper(arr, target, mid + 1, end);
        }
        else{
            return helper(arr, target, start, mid-1);
        }
    }

    public static int findIndex(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        return helper(arr, target, start, end);
    }

}