import java.util.ArrayList;

public class DiagonalPath {
    public static void main(String[] args) {
        System.out.println(pathRet("", 3, 3));
    }

    public static ArrayList<String> pathRet(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row < 1 || col < 1) {  
            return list;
        }

        list.addAll(pathRet(p + "V", row - 1, col));    // TOWARDS DOWN 
        list.addAll(pathRet(p + "H", row, col - 1));    // TOWARDS RIGHT 
        list.addAll(pathRet(p + "D", row - 1, col - 1));// TOWARDS DIAGONAL 
        return list;
    }
}
