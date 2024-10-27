package LINEAR;

import java.util.Arrays;

public class LinearSearch3 {
    public static void main(String[] args) {
        int[][] arr= {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        int target = 5;
        int element = findElement(arr, target);
        System.out.println(element);
        int[] index = findIndex(arr, target);
        System.out.println(Arrays.toString(index));
        int max = max(arr);
        System.out.println("Maximum is: "+max);
    }
    public static int findElement(int[][] arr, int target) {
        for (int[] arr1 : arr) {
            for (int element : arr1) {
                if (element == target) {
                    return element;
                }
            }
        }
        return '\0';
    }
    public static int[] findIndex(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1, -1}; 
    }

    //MAXIMUM

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] arr1 : arr) {
            for (int element : arr1) {
                if (max < element) {
                    max = element;
                }
            }
        }
        int[] indexOfMax = findIndex(arr, max);
        return max;
    }
    
}
