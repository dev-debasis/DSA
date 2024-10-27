import java.util.Arrays;

public class BinarySearch2DArray {

    public static void main(String[] args) {
        // int[][] arr = {
        //     {1, 21, 34, 42, 52},
        //     {6, 23, 38, 49, 54},
        //     {9, 26, 39, 50, 56},
        //     {12, 29, 40, 53, 58}
        // };
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        System.out.println(Arrays.toString(searchInSortedMatrix(arr, 12)));
    }

    public static int[] searchInSortedMatrix(int[][] arr, int target) {
        int row = 0, col = arr[row].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[]{row, col};
            } else if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}