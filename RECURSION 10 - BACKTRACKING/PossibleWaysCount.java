
public class PossibleWaysCount {
    public static void main(String[] args) {
        System.out.println(counting(3, 3));
    }

    // public static int counting(int row, int col) {
    // // Base Condition
    // if (row == 1 || col == 1) {
    // return 1;
    // }

    // int left = counting(row - 1, col);
    // int right = counting(row, col - 1);
    // return left + right;
    // }

    public static int counting(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int count = 0;
        count += counting(row - 1, col); // Down
        count += counting(row, col - 1); // Right
        return count;
    }
}