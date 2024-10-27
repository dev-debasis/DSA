import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows & column size : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int arr1[][] = new int[col][row];
        //INPUT
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(" Enter value of ("+i+","+j+") : ");
                arr[i][j] = sc.nextInt();
            }
        }
        //TRANSPOSE 
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row ; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        //OUTPUT
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
