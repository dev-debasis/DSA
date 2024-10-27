//https://leetcode.com/problems/find-in-mountain-array/description/

// 1. Find the peak element
// 2. Search target in the first part
// 3. If not found in the first part then go for the second part
public class Leetcode4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 2, 1 };
        int peakIndex = peakIndex(arr);
        int target = 3;
        int result = findingTarget(arr, target, peakIndex);
        System.out.println(result);
    }

    // FINDING PEAK
    public static int peakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // Assending
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            // Dscending
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
    }

    // Finding the target
    public static int findingTarget(int[] arr, int target, int peakIndex) {
        // First find in the first part (Assending part)
        int start = 0, end = peakIndex;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid != 0 && arr[mid - 1] == target) {
                    return mid - 1;
                } else {
                    return mid;
                }

            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // If loop breaks it means doesn't exist target in first part, Now find in
        // second Part (Descending)
        start = peakIndex + 1;
        end = arr.length - 1;
        // Descending part
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid != 0 && arr[mid - 1] == target) {
                    return mid - 1;
                } else {
                    return mid;
                }

            } else if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }
}
