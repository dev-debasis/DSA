public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 88, 100 };
        int target = 88;
        BinarySearch obj = new BinarySearch();
        int ans = obj.binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    public int binarySearch(int[] arr, int target, int start, int end) {

        // F(N) = 0(1) + F(N/2)  ---> Divide & conquer Recurance Relation 

        // Base Case
        if (start > end) {
            return -1;  // target doesn't exist
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {   // target is in the mid index
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);// target lies in right of mid
        }

        return binarySearch(arr, target, start, mid - 1); // target lies in left of mid 
    }
}