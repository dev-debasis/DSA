import java.util.Arrays;
import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the swapping index : ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        swap(arr, index1, index2);
        System.out.print(Arrays.toString(arr));
        sc.close();
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

}
