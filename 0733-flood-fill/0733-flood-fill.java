class Solution {
    private int m,n;
    private int []dr={-1,0,1,0};
    private int []dc={0,1,0,-1};

    private void dfs(int[][] image, int[][] ans,int sr, int sc, int newColor,int iniColor){
       ans[sr][sc]=newColor;
       for(int i=0;i<4;i++){
        int nr=sr+dr[i];
        int nc=sc+dc[i];
        if(nr>=0 && nc>=0 && nr<m && nc<n && image[nr][nc]==iniColor && ans[nr][nc]!=newColor){
            dfs(image,ans,nr,nc,newColor,iniColor);
        }
       }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m=image.length;
        n=image[0].length;
        int [][]ans=new int[m][n];
        int iniColor=image[sr][sc];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=image[i][j];
            }
        }
        dfs( image, ans, sr,  sc,  color,iniColor);
        return ans;
    }
}