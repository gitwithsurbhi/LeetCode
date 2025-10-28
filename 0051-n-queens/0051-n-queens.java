class Solution {
    private boolean isSafe(char [][]board,int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i-- ){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j-- ){
            if(board[i][j]=='Q'){
                return false;
            }
         }
        //right diagonal up
          for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++ ){
            if(board[i][j]=='Q'){
                return false;
            }
        }
 return true;

    }

    private void nQueens(List<List<String>>result,char[][]board ,int row){
      if(row==board.length){
        result.add(construct(board));
        return ;
      }
      for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){
            board[row][j]='Q';
            nQueens(result,board,row+1);
            board[row][j]='.';
        }
      }
    }

    public List<List<String>> solveNQueens(int n) {
    List<List<String>>result=new ArrayList<>();
        char [][]board=new char[n][n];
        for(char []row:board){
           Arrays.fill(row,'.');
        }
       nQueens(result,board,0);
       return result;
    }

    private List<String> construct(char[][]board){
        List<String>path=new ArrayList<>();
        for(char []row:board){
            path.add(new String(row));
        }
        return path;
    }
    
}