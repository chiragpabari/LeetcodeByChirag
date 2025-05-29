class Solution {

    public static boolean IsSafe(char[][] board, int row, int col) {

        int n = board.length;

        // Check row

        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        // Check column

        for (int j = 0; j < n; j++) {
            if (board[j][col] == 'Q')
                return false;
        }

        // Check North-East

        int i = row;
        int j = col;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j++;

        }

        // Check South-East

        i = row;
        j = col;

        while (i < n && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j++;
        }

        // Check South-West

        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j--;
        }

        // Check North-West

        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }

        return true;

    }

    public void nqueens(char[][] board, int row, List<List<String>> ans) {

        int n = board.length;

        if (row == n) { // Base case
            // Copy 2D char array to the list of strings
            List<String> ll = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str = "";
                for (int j = 0; j < n; j++) {
                    char curr = board[i][j];
                    str += curr;
                }
                ll.add(str);
            }
            ans.add(ll);
            return;
        }

        for (int j = 0; j < n; j++) {

            if (IsSafe(board, row, j)) { // Recursive work and Self work
                board[row][j] = 'Q';
                nqueens(board, row + 1, ans);
                board[row][j] = '.'; // Backtracking
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {

        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        nqueens(board, 0, ans);
        return ans;

    }
}