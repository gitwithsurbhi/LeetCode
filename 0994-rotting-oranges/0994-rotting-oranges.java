class Solution {
    class Pair{
        int first;
        int sec;
        int tm;
        Pair(int first,int sec,int tm){
            this.first=first;
            this.sec=sec;
            this.tm=tm;
        }
    }
    public int orangesRotting(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
       int [][]vis=new int[m][n];
       int cntFresh=0;
       Queue<Pair>q=new LinkedList<>();
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==2){
               q.add(new Pair(i,j,0));
                vis[i][j]=2;
            }
            else{
                vis[i][j]=0;
            }
            if(grid[i][j]==1)cntFresh++;
        }
       }
    int tm=0; 
     int []dr={-1,0,1,0};
     int []dc={0,1,0,-1};
     int cnt=0;
     while(!q.isEmpty()){
       int r=q.peek().first;
        int c=q.peek().sec;
        int t=q.peek().tm;
      tm=Math.max(t,tm);
      q.remove();
      for(int i=0;i<4;i++){

        int nr=r + dr[i];
        int nc=c+dc[i];
        
        if(nr>=0 && nr<m && nc>=0 && nc<n && vis[nr][nc]!=2 && grid[nr][nc]==1){
            q.add(new Pair(nr,nc,t+1));
            vis[nr][nc]=2;
            cnt++;
        }
      }  
     }
     if(cnt!=cntFresh){
        return -1;
     }
     return tm;
    }
}