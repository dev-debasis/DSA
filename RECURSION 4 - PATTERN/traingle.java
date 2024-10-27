
public class traingle {
    public static void main(String[] args) {
        traingle1(4, 0);
        traingle2(4, 0);
    }

    public static void traingle1(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            System.out.print("*");
            traingle1(row, col + 1);
        } else {
            System.out.println();
            traingle1(row - 1, 0);
        }
    }

    public static void traingle2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            traingle2(row, col + 1);
            System.out.print("*");
        } else {
            traingle2(row - 1, 0);
            System.out.println();
        }
    }
}