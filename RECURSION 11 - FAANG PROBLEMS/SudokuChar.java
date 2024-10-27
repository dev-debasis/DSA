
class SudokuChar {

    public static void main(String[] args) {
        char[][] sudoku = {
                { '5', '3', '0', '0', '7', '0', '0', '0', '0' },
                { '6', '0', '0', '1', '9', '5', '0', '0', '0' },
                { '0', '9', '8', '0', '0', '0', '0', '6', '0' },
                { '8', '0', '0', '0', '6', '0', '0', '0', '3' },
                { '4', '0', '0', '8', '0', '3', '0', '0', '1' },
                { '7', '0', '0', '0', '2', '0', '0', '0', '6' },
                { '0', '6', '0', '0', '0', '0', '2', '8', '0' },
                { '0', '0', '0', '4', '1', '9', '0', '0', '5' },
                { '0', '0', '0', '0', '8', '0', '0', '7', '9' }
        };
        if (helper(sudoku)) {
            display(sudoku);
        }else{
            System.out.println("Can't find the answear");
        }
    }

    public static void display(char[][] board) {
        for (char[] row : board) {
            System.out.println(row);
        }
    }

    public static boolean isSafe(char[][] board, char num, int row, int col) {
        // Checking the Row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Checking the Col
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Checking the grid

        int rowStart = (row / 3) * 3;
        int colStart = (col / 3) * 3;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean helper(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == '0') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, num, row, col)) {
                            board[row][col] = num;
                            if (helper(board)) {
                                return true; // Found a solution
                            } else {
                                board[row][col] = '0'; // Backtrack
                            }
                        }
                    }
                    return false; // No suitable number
                }
            }

        }
        return true; // All cells are filled now
    }
}