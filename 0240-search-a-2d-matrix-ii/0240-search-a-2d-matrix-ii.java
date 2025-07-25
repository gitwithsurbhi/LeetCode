class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m=mat.length,n=mat[0].length;
        int r=0,c=n-1;  //mid
        while(r<m && c>=0){
            if(mat[r][c]==target)return true;
            else if( mat[r][c]>target ){
                c--;
            }
            else{
                r++;
            }

        }
        return false;
    }
}