class Solution {
    static class Pair{
         int first;
         int sec;
         Pair(int first,int sec){
            this.first=first;
            this.sec=sec;

         }
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean [][]visit=new boolean[m][n];
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(i==0 || j==0 || i==m-1 || j==n-1){
                if(grid[i][j]==1){
                  q.add(new Pair(i,j));
                  visit[i][j]=true;
                }
              }
            }
        }
        int []dr={-1,0,1,0};
        int []dc={0,1,0,-1};
        
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().sec;
            q.remove();
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nr<m && nc>=0 && nc<n && !visit[nr][nc] && grid[nr][nc]==1){
                    q.add(new Pair(nr,nc));
                    visit[nr][nc]=true;;
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visit[i][j] && grid[i][j]==1)count++;
            }
        }
        return count;
    }
}