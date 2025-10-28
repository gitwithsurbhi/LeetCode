class Solution {
     private int count=0;
    private boolean isSafe(char[][]board,int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q')return false;

        }
         for(int i=row-1,j=col+1;i>=0 && j<board.length ;i--,j++){
            if(board[i][j]=='Q')return false;

        }
        return true;
    }
    private void nQueens(char[][]board,int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1);
                board[row][j]='.';
            }
        }
    }

    public int totalNQueens(int n) {
        count=0;
        char [][]board=new char[n][n];
        for(char []row:board){
            Arrays.fill(row,'.');
        }
    
     nQueens(board,0);  
     return count;
    }
}