import java.util.Scanner;

class TwoDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the row size : ");
        int row = sc.nextInt();
        System.out.print(" Enter the Coloumn size : ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        // INPUT
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" Enter the value of " + i + " " + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        // OUTPUT
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // FIND NUM
        System.out.print(" Which number you wanna find : ");
        int findNum = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (findNum == arr[i][j]) {
                    System.out.print(findNum + " found at index : (" + i + "," + j+")");
                }
            }
        }
        sc.close();
    }
}
