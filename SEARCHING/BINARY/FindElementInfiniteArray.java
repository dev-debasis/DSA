import java.util.*;
public class FindElementInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,8,9,10,12,14,22,37,49,56,89,208,785,984};
        int target = 300;
        
    }
    public static int indexFinding(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while (start <= end) {
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        start = 
    }
}
 