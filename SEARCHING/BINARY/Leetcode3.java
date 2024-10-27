//https://leetcode.com/problems/peak-index-in-a-mountain-array/
// public class Leetcode3 {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,2,0};
//         int index = method(arr);
//         System.out.println(arr[index]);
//     }
//     public static int method(int[] arr) {
//         int first = 0,second = 1;
//         while (arr[first] < arr[second]){
//             first++;
//             second++;
//         }
//         return first;
//     }
// }



public class Leetcode3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 0 };
        int index = method(arr);
        System.out.println(arr[index]);
    }

    public static int method(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}



class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int len = nums.length;
        int end = len-1;
        int firstArrStartIndex = 0;
        int point = findMidPoint(nums);
        int firstArrEndIndex = point;
        int secondArrStartIndex = point+1;
        int secondArrEndIndex = len-1;
        int[] arr1 = new int[firstArrEndIndex+1];
        int[] arr2 = new int[len-(firstArrEndIndex+1)];
        for(int i = firstArrStartIndex; i <= firstArrEndIndex; i++){
            arr1[i] = nums[i];
        }
        for(int i = secondArrStartIndex; i <= secondArrEndIndex; i++){
            arr2[i] = nums[i];
        }
        if(target >= arr1[0])
        { // Exist in first array
            while(start <= end)
            {
                int mid = start+(end-start)/2;
                if(arr1[mid] == target){
                    return  mid;
                }
                else if(arr1[mid] < target){
                start = mid+1;
                }
                else {
                    end = mid-1;
                }
            
            }
        }
        else
        {
            while(start <= end)
            {
                int mid = start+(end-start)/2;
                if(arr2[mid] == target){
                    return  mid;
                }
                else if(arr2[mid] < target){
                start = mid+1;
                }
                else {
                    end = mid-1;
                }
            
            }
            
        }
        return -1;
    }
    public static int findMidPoint(int[] nums)
    {
        int point = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[i+1]){
                return i;
            }
        }
        return -1;
    }
}
