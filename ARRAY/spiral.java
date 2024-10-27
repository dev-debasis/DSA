import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row size : ");
        int rowSize = sc.nextInt();
        System.out.print("Coloumn size : ");
        int colSize = sc.nextInt();
        int arr[][] = new int[rowSize][colSize];
        // INPUT
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(" Enter the value of (" + i + "," + j + ") : ");
                arr[i][j] = sc.nextInt();
            }
        }
        // OUTPUT

        int rowStart = 0, rowEnd = rowSize - 1, colStart = 0, colEnd = colSize - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // TRAVERSE RIGHT
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++;
            // TRAVERSE DOWN
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;
            if (rowStart <= rowEnd) {

                // TRAVERSE LEFT
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(arr[rowEnd][i] + " ");
                }

                rowEnd--;
            }
            if (colStart <= colEnd) {

                // TRAVERSE UP
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(arr[i][colStart] + " ");
                }
                colStart++;
            }
        }
        sc.close();
    }
}
