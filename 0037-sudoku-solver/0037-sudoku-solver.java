class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char digit = '1'; digit <= '9'; digit++) {
                        if (isSafe(board, row, col, digit)) {
                            board[row][col] = digit;
                            if (solve(board)) return true; // solution found
                            board[row][col] = '.'; // backtrack
                        }
                    }
                    return false; // no valid digit found
                }
            }
        }
        return true; // all cells filled
    }

    private boolean isSafe(char[][] board, int row, int col, char digit) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit || board[row][i] == digit) return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) return false;
            }
        }
        return true;
    }
}