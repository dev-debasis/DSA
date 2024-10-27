package LINEAR;
import java.util.*;

public class LinearSearch1 {
    public static void main(StringSearch[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();
        int ans = linearSearch(arr, target);
        System.out.println("Target element which is " + target + " is found on index :" + ans);
        int element = linearSearchElement(arr, target);
        System.out.println("The element is : " + element);
        System.out.println(linearSearchExist(arr, target));
        sc.close();
    }
    // Target element exist or not
    public static boolean linearSearchExist(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // Target element's index
    public static int linearSearch(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;

            }

        }
        return -1;

    }

    // If wanna fetch the value
    public static int linearSearchElement(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MIN_VALUE;

    }
}