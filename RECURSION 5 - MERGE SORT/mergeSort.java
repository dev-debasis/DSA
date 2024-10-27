import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 7, 9};
        int[] sortedArr = sorting(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sorting(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        
        int[] left = sorting(Arrays.copyOfRange(arr, 0, arr.length/2));
        int[] right = sorting(Arrays.copyOfRange(arr, arr.length/2, arr.length));
       return merging(left, right);
    }

    public static int[] merging(int[] first, int[] second) {
        int[] finalArr = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                finalArr[k] = first[i];
                i++;
                k++;
            } else {
                finalArr[k] = second[j];
                j++;
                k++;
            }
        }

        while (i < first.length) {
            finalArr[k] = first[i];
            i++;
            k++;
        } 
        while (j < second.length) {
            finalArr[k] = second[j];
            j++;
            k++;
        }

        return finalArr;
    }
}