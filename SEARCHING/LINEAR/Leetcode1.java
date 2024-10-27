package LINEAR;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int element : nums){
            if(Integer.toString(element).length() % 2 == 0){
                count++;
            }
        }
        return count;
    } 
}