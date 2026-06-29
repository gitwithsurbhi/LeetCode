class Solution {
    static class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public void bfs(char[][] grid,boolean [][]visit,int row,int col){
        int m=grid.length;
        int n=grid[0].length;

        visit[row][col]=true;

        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
          int nrow=q.peek().first;
          int ncol=q.peek().second;
          q.remove();
          int[] drow = {-1, 0, 1, 0};
int[] dcol = {0, 1, 0, -1};
for(int k=0; k<4; k++){
    int ro = nrow + drow[k];
    int co = ncol + dcol[k];
    if(ro>=0 && ro<m && co>=0 && co<n && !visit[ro][co] && grid[ro][co]=='1'){
        visit[ro][co] = true;
        q.add(new Pair(ro, co));
    }
}
        }
        
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        boolean [][]visit=new boolean[m][n];
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(!visit[row][col] && grid[row][col]=='1'){
                      count++;
                    bfs(grid,visit,row,col);
                  
                }
            }
        }
        return count;
    }
}