public class DisappearedElements {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        DisappearedElements obj = new DisappearedElements();
        obj.cyclicSort(arr);
        int res = obj.missingElements(arr);
        System.out.println(res);
    }

    // Cyclic Sort
    public void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctPosition = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctPosition]) {
                // Swap
                swap(arr, i, correctPosition);
            } else {
                i++;
            }
        }
    }

    // Swapping
    public void swap(int[] arr, int index1, int index2) {
        int temp = 0;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Finding the DisappearedElements
    public int missingElements(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;

    }
}

