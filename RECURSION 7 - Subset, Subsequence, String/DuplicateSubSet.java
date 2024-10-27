import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Arrays;

public class DuplicateSubSet {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        ArrayList<ArrayList<Integer>> ans = subset(arr);
        for (ArrayList<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        Arrays.sort(arr);
        int start = 0, end = 0;
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int idx = 0; idx < arr.length; idx++) {
            int n = outer.size();
            if (idx > 0 && arr[idx] == arr[idx - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            for (int i = start; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[idx]);
                outer.add(internal);
            }

        }
        return outer;
    }
}
