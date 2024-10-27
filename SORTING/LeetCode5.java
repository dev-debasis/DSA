// import java.util.Arrays;

public class LeetCode5 {
    public static void main(String[] args) {
        int[] nums = { -1, 4, 3, 1 };
        int missingElement = missingNumber(nums);
        System.out.println(missingElement);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;

        // Perform cyclic sort
        int i = 0;
        while (i < n) {
            int correct = nums[i]-1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {

                // Swap the element to its correct position
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find the element that is not in its correct position
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all elements are in their correct positions, the missing number is n+1
        return n + 1;
    }

    // Swapping
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

