public class FloorBS {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9 };
        int input = 4;
        int element = findingFloor(nums, input);
        System.out.println(element);

    }

    public static int findingFloor(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return nums[mid];
            }
        }
        return nums[end];
    }
}