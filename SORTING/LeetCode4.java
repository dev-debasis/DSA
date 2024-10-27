// https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class LeetCode4 {
    public static void main(String[] args) {
        int[] nums = { 8, 7, 3, 5, 3, 6, 1, 4 };
        LeetCode4 obj = new LeetCode4();
        int res[] = obj.findDuplicate(nums);
        System.out.println(Arrays.toString(res));
    }

    // Finding Duplicates & Missing element
    public int[] findDuplicate(int[] nums) {

        // Cyclic sort for sorting as the given array is in range of [1-n]
        int i = 0;
        while (i < nums.length) {

            int correctPosition = nums[i] - 1;
            if (nums[i] != nums[correctPosition]) {
                // Swap
                swap(nums, i, correctPosition);
            } else {
                i++;
            }
        }

        // Returning Duplicate element & missing element
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[] { nums[j], j + 1 };
            }
        }

        return new int[] { -1, -1 };

    }

    // Swapping
    public void swap(int[] arr, int index1, int index2) {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
