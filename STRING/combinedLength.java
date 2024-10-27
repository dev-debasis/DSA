// package DSA PROBLEMS.STRING;

import java.util.Scanner;

public class combinedLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // NUMBER OF STRINGS USER WANNA PROVIDE
        System.out.print("Enter the total element number : ");
        int element = sc.nextInt();

        String arr[] = new String[element];
        // int totalLength = 0;

        // INPUT STIRNGS FROM USER
        System.out.print("Enter String : ");
        for (int i = 0; i < element; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < element; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < element; i++) {
            System.out.println(arr[i].length());
        }
    }
}
