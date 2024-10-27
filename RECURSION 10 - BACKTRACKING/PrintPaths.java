import java.util.ArrayList;

public class PrintPaths {
    public static void main(String[] args) {
        path("", 3, 3);
        System.out.println(pathRet("", 3, 3));
    }

    public static void path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) { // Down
            path(p + "D", row - 1, col);
        }
        if (col > 1) { // Right
            path(p + "R", row, col - 1);
        }
    }

    public static ArrayList<String> pathRet(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(pathRet(p + "D", row - 1, col));
        }
        if (col > 1) {
            list.addAll(pathRet(p + "R", row, col - 1));
        }
        return list;
    }
}