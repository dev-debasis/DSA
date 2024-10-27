// package DSA PROBLEMS.ARRAY;
public class assending {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            // ASCENDING
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
            // DESCENDING
            else if (arr[i] < arr[i + 1]) {
                isDescending = false;
            }
        }
        if (isAscending) {
            System.out.print("Assending Order");
        } else if (isDescending) {
            System.out.print("Decending Order");
        }
        else {
            System.out.print("Not Sorted");
        }
    }
}