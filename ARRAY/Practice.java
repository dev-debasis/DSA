import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array of premitives
        // int arr[] = new int[4]; // Declaration of array
        // arr[0] = 1; // Intiliaging array
        // arr[1] = 1;
        // arr[2] = 1;
        // arr[3] = 1;

        // WAYS TO FETCH ELEMENTS

        // for(int elem : arr){
        // System.out.print(elem+" ");
        // }

        // System.out.print(Arrays.toString(arr)); // Most appropriate
        // // Array of Objects
        // String[] arr1 = new String[4];
        // for (int i = 0; i < arr1.length; i++) {
        //     arr1[i] = sc.nextLine();
        // }ṇ
        // System.out.print(Arrays.toString(arr1));
        // sc.close();


        // 2D ARRAY

        int[][] arr = new int[3][2];  // giving row size is mandatory but coloumn is n
        
        //INPUT
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
            
        }

        // OUTPUT
        for(int[] elem : arr){
            System.out.print(Arrays.toString(elem));
            System.out.println();
        }
    }
    
}