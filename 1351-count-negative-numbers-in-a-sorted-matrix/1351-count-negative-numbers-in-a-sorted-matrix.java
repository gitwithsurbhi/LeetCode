class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int m=grid.length,n=grid[0].length;
        int row=0,colm=n-1;
        while(row<m && colm>=0){
         if(grid[row][colm]<0){
            count+=m-row;
            colm--;
         }
         else{
            row++;
         }
        }
        return count;
    }
}