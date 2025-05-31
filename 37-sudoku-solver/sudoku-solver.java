class Solution {

    public static boolean IsValid(char[][] board, int row, int col, char num) {

        // Check row

        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num)
                return false;
        }

        // Check column

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num)
                return false;
        }

        // Check 3x3 grid

        int srow = row / 3 * 3;
        int scol = col / 3 * 3;

        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    public static void solve(char[][] board, int row, int col, char[][] grid) {

        if (row == 9) {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    grid[i][j] = board[i][j];
                }
            }
            return;
        }

        else if (board[row][col] != '.') {
            if (col < 8)
                solve(board, row, col + 1, grid);
            else
                solve(board, row + 1, 0, grid);
        }

        else {

            for (char ch = '1'; ch <= '9'; ch++) {
                if (IsValid(board, row, col, ch)) {
                    board[row][col] = ch;
                    if (col < 8)
                        solve(board, row, col + 1, grid);
                    else
                        solve(board, row + 1, 0, grid);
                    board[row][col] = '.'; // Backtracking
                }
            }
        }
    }

    public void solveSudoku(char[][] board) {

        char grid[][] = new char[9][9];
        solve(board, 0, 0, grid);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = grid[i][j];
            }
        }
    }
}