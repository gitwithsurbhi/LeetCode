class Solution {
   static class Pair{
      int first;
      int sec;
      int dis;
      public Pair(int first,int sec,int dis){
        this.first=first;
        this.sec=sec;
        this.dis=dis;
      }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [][]dist=new int[m][n];
        boolean [][]vis=new boolean[m][n];
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                  q.add(new Pair(i,j,0));
                  vis[i][j]=true;
                }
            }
        }
        int []dr={-1,0,1,0};
        int []dc={0,1,0,-1};

        while(!q.isEmpty()){
        int r=q.peek().first;
        int c=q.peek().sec;
        int d=q.peek().dis;
        q.remove();
        dist[r][c]=d;
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0 && nr<m && nc>=0 && nc<n && !vis[nr][nc]){
                q.add(new Pair(nr,nc,d+1));
                vis[nr][nc]=true;
            }
        }
        }
        return dist;
    }
}