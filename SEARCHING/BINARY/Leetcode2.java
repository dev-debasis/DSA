//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class Leetcode2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 5, 6, 7, 7, 7, 8 };
        int target = 7;
        int[] result = { -1, -1 };
        result[0] = firstOccurance(nums, target);
        result[1] = lastOccurance(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int firstOccurance(int[] nums, int target) {
        int start = 0, result = -1, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target <= nums[mid]) {
                end = mid - 1;
                result = mid;
            } else {
                start = mid + 1;
            }
        }
        return (result != -1 && nums[result] == target) ? result : -1;
    }
    // Finding the last index
    public static int lastOccurance(int[] nums, int target) {
        int start = 0, result = -1, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= nums[mid]) {
                start = mid + 1;
                result = mid;
            } else {
                end = mid - 1;
            }
        }
        return result != -1 && (nums[result] == target) ? result : -1;
    }
}
