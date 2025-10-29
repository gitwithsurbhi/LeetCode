class Solution {
    private boolean isSafe(char[][] board, int row, int col, char digit) {
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == digit) return false;
            if (i != col && board[row][i] == digit) return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if ((i != row || j != col) && board[i][j] == digit) return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char digit = board[row][col];
                if (digit != '.') {
                    board[row][col] = '.'; // Temporarily remove to check validity
                    if (!isSafe(board, row, col, digit)) return false;
                    board[row][col] = digit; // Restore
                }
            }
        }
        return true;
    }
}