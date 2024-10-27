import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 4, 4, 7, 8 };
        // System.out.println("Target Element exist => " + isExist(arr, 4, 0));
        // System.out.println("First occured Index of the Target element => " + findElement(arr, 4, 0));
        // System.out.println("All the Indexes => " + findAllIndexes(arr, 4, 0));
        System.out.println("All the Indexes w/o passing the arrList as arg. => " + withoutArgument(arr, 4, 0));
    }

    // Checking whether the target element is exist or not
    public static boolean isExist(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || isExist(arr, target, ++index);
    }

    // Return the index of the target element if present
    public static int findElement(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;

        } else {
            return findElement(arr, target, ++index);

        }
    }

    // Return the indexes of the target element, if target element present twice in
    // the array then it will return both the indexes instead of returning the first
    // one

    public static ArrayList<Integer> helper(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return helper(arr, target, ++index, list);
    }

    public static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        return helper(arr, target, 0, list);
    }

    // Without passing arrayList as argument
    public static ArrayList<Integer> withoutArgument(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        // Base
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> fromBelowCalls = withoutArgument(arr, target, ++index);
        list.addAll(fromBelowCalls);
        return list;
    }
}