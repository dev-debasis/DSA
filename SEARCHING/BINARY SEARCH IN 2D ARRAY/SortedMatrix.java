// import java.util.Arrays;

// public class SortedMatrix {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 { 1, 2, 3, 4, 5 },
//                 { 6, 7, 8, 9, 10 },
//                 { 11, 12, 13, 14 },
//                 { 15, 16, 17, 18 }
//         };
//         int target = 17;
//         System.out.println(Arrays.toString(indexOfTarget(arr, target)));
//     }

//     public static int[] indexOfTarget(int[][] arr, int target) {
//         int rowStart = 0, rowEnd = arr.length - 1;
//         int colStart = 0, colEnd = arr[rowStart].length - 1;
//         while (rowStart < arr.length && rowEnd >= 0 && colStart < arr[rowStart].length - 1 && colEnd >= 0) {
//             int midRow = rowStart + (rowEnd - rowStart) / 2;
//             int midCol = colStart + (colEnd - colStart) / 2;
//             if (arr[midRow][midCol] == target) {
//                 return new int[] { midRow, midCol };
//             }

//             else if (arr[midRow][midCol] < target) {
//                 rowStart = midRow;
//             } else {
//                 rowEnd = midRow;
//             }
//         }
//         return new int[] {-1, -1};
//     }
// }
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        int target = 17;
        System.out.println(Arrays.toString(indexOfTarget(arr, target)));
    }

    public static int[] indexOfTarget(int[][] arr, int target) {
        int rowStart = 0, rowEnd = arr.length - 1;
        int colStart = 0, colEnd = arr[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            int midRow = rowStart + (rowEnd - rowStart) / 2;
            int midCol = colStart + (colEnd - colStart) / 2;

            if (arr[midRow][midCol] == target) {
                return new int[]{midRow, midCol};
            } else if (arr[midRow][midCol] < target) {
                colStart = midCol + 1;
            } else {
                colEnd = midCol - 1;
            }

            // Check the upper and lower halves
            if (rowStart <= rowEnd && colStart <= colEnd) {
                if (arr[midRow][colStart] <= target && target <= arr[midRow][colEnd]) {
                    // If target is in the current row, update rowStart and rowEnd accordingly
                    colEnd = midCol - 1;
                } else {
                    // If target is not in the current row, update rowStart and rowEnd accordingly
                    rowEnd = midRow - 1;
                }
            }
        }

        return new int[]{-1, -1};
    }
}
