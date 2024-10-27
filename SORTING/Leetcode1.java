public class Leetcode1 {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 0 };
        Leetcode1 obj = new Leetcode1();
        int result = obj.missingNumber(nums);
        System.out.println(result);
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Perform cyclic sort
        int i = 0;
        while (i < n) {
            if (nums[i] < n && nums[i] != i) {
                // Swap the element to its correct position
                swap(nums, i);
            } else {
                i++;
            }
        }

        // Find the first element that is not in its correct position
        for (i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        // If all elements are in their correct positions, the missing number is n
        return n;
    }

    // Swapping
    public void swap(int[] nums, int i) {
        int temp = nums[i];
        nums[i] = nums[temp];
        nums[temp] = temp;
    }
}