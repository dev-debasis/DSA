import java.util.Arrays;

public class PrintingMatrix {
    public static void main(String[] args) {
        int[][] maze = new int[3][3];
        path("", maze, 0, 0, 1);
    }

    public static void path(String p, int[][] maze, int row, int col, int num) {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length || maze[row][col] != 0) {
            return; // Out of bounds or already visited
        }
        maze[row][col] = num;
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            for (int[] r : maze) {
                System.out.println(Arrays.toString(r));
            }
            System.out.println("Final Path: " + p);
            maze[row][col] = 0;
            return;
        }
        path(p + "D", maze, row + 1, col, num + 1); // TOWARDS DOWN
        path(p + "R", maze, row, col + 1, num + 1); // TOWARDS RIGHT
        path(p + "U", maze, row - 1, col, num + 1); // TOWARDS UP
        path(p + "L", maze, row, col - 1, num + 1); // TOWARDS LEFT
        maze[row][col] = 0;
        return;
    }
}