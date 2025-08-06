class Solution {
    public int[][] generateMatrix(int n) {
        int [][]mat=new int[n][n];
        int left=0,right=n-1;
        int top=0,bottom=n-1;
        int val=1;
       int direction=0;
       while(left<=right && top<=bottom){
        if(direction==0){
            for(int colm=left;colm<=right;colm++){
                mat[top][colm]=val++;
            }
            top++;
        }
        else if(direction==1){
          for(int row=top;row<=bottom;row++){
            mat[row][right]=val++;
          }
          right--;
        }
        else if (direction==2){
            for(int colm=right;colm>=left;colm--){
                mat[bottom][colm]=val++;
            }
            bottom--;
        }
        else{
            for(int row=bottom;row>=top;row--){
                mat[row][left]=val++;
            }
            left++;
        }
        direction=(direction+1)%4;
       }
       return mat;
    }
}