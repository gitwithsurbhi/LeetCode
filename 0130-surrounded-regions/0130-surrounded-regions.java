class Solution {
    private int m,n;
    private int []dr={-1,0,1,0};
    private int []dc={0,1,0,-1};
    public void dfs(char[][] board,boolean [][]visit,int r,int c){
        visit[r][c]=true;
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nr<m && nc>=0 && nc<n && board[nr][nc]=='O' && !visit[nr][nc]){
                dfs(board,visit,nr,nc);
            }
        }
    }

    public void solve(char[][] board) {
        m=board.length;
        n=board[0].length;

     boolean [][]visit=new boolean[m][n];
     for(int i=0;i<n;i++){
        if(board[0][i]=='O' && !visit[0][i]){
            dfs(board,visit,0,i);
        }
        if(board[m-1][i]=='O' && !visit[m-1][i]){
            dfs(board,visit,m-1,i);
        }
     } 

     for(int i=0;i<m;i++){
        if(board[i][0]=='O' && !visit[i][0]){
            dfs(board,visit,i,0);
        }
        if(board[i][n-1]=='O' && !visit[i][n-1]){
            dfs(board,visit,i,n-1);
        }
     }

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(!visit[i][j] && board[i][j]=='O'){
                board[i][j]='X';
            }
        }
    }
    }
}