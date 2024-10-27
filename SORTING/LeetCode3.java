// // https://leetcode.com/problems/find-the-duplicate-number/

// import java.util.Arrays;

// public class LeetCode3 {
//     public static void main(String... args) {
//         int[] nums = {8, 7, 3, 5, 3, 6, 1, 4 };
//         LeetCode3 obj = new LeetCode3();
//         int res[] = obj.findDuplicate(nums);
//         System.out.println(Arrays.toString(res));
//     }

//     // Finding Duplicates
//     // public int findDuplicate(int[] nums) {
//     //     int i = 0;

//     //     while (i < nums.length) {
//     //         if (nums[i] != i + 1) {
//     //             int correctPosition = nums[i] - 1;
//     //             if (nums[i] != nums[correctPosition]) {
//     //                 // Swap
//     //                 swap(nums, i, correctPosition);
//     //             } else {
//     //                 return nums[i];
//     //             }
//     //         } else {
//     //             i++;
//     //         }
//     //     }

//     //     return -1;
//     // }
//     public int[] findDuplicate(int[] nums) {
//         int i = 0;
//         while (i < nums.length) {
//             if (nums[i] != i + 1) {
//                 int correctPosition = nums[i] - 1;
//                 if (nums[i] != nums[correctPosition]) {
//                     // Swap
//                     swap(nums, i, correctPosition);
//                 } else {
//                     return new int[] {nums[i], nums[i]};
//                 }
//             } else {
//                 i++;
//             }
//         }

//         return new int[]{-1, -1};
//     }

//     // Swapping
//     public void swap(int[] arr, int index1, int index2) {
//         int temp = 0;
//         temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }

// }
