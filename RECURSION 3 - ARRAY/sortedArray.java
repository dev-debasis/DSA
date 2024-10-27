
public class sortedArray {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 0 };
        System.out.println(isSorted(arr));
    }

    public static boolean helper(int[] arr, int i) {
        // Base conditon
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] <= arr[arr.length - 1]) { // For Assending
            return arr[i] <= arr[i + 1] && helper(arr, ++i);
        } else {
            return arr[i] >= arr[i + 1] && helper(arr, ++i); // For Decending

        }
    }

    public static boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }
}