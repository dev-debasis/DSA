// import java.util.ArrayList;

import java.util.ArrayList;

public class RestrictionPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };
       System.out.println(path("", maze, 0, 0));
    }

    public static ArrayList<String> path(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!maze[row][col]) {
            return list;
        }
        if (row < maze.length - 1) { // TOWARDS DOWN
            list.addAll(path(p + "D", maze, row + 1, col));
        }
        if (col < maze[row].length - 1) { // TOWARDS RIGHT
            list.addAll(path(p + "R", maze, row, col + 1));
        }
        return list;

    }
}
