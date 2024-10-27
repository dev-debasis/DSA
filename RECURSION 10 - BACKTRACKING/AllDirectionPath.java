import java.util.ArrayList;

public class AllDirectionPath {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
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

        if (row > maze.length - 1 || col > maze.length - 1 || row < 0 || col < 0 || maze[row][col] == false) {
            return list;
        }
        
        maze[row][col] = false; // Considering this block in my path

        list.addAll(path(p + "D", maze, row + 1, col)); // TOWARDS DOWN

        list.addAll(path(p + "R", maze, row, col + 1)); // TOWARDS RIGHT

        list.addAll(path(p + "U", maze, row - 1, col)); // TOWARDS UP

        list.addAll(path(p + "L", maze, row, col - 1)); // TOWARDS LEFT

        // this line wil occurs when the function will be over. so, the funuction gets
        // removed also remove the changes that we did in this function
        maze[row][col] = true;

        return list;
    }
}
