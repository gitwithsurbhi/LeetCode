class Solution {
    int m,n;
    int []dr={-1,0,1,0};
    int []dc={0,1,0,-1};
    int count=0;
    public void dfs(int[][] grid,boolean [][]visit,int r,int c){
        visit[r][c]=true;
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
           
            if(nr<0 || nc<0 || nr >=m || nc>=n){
                count++;
            }
            else if(grid[nr][nc]==0)count++;
            else if(grid[nr][nc]==1 && !visit[nr][nc]){
                dfs(grid,visit,nr,nc);
            }
        }
    }
    public int islandPerimeter(int[][] grid) {
       m=grid.length;
       n=grid[0].length;
       boolean [][]visit=new boolean[m][n];
       
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1){
                dfs(grid,visit,i,j);
                 return count;
            }
        }
       }

       
    return 0;  
    }
}