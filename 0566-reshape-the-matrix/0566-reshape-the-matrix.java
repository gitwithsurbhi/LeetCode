class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        if(r*c != m*n ){
            return mat;
        }
        int []newArr=new int[m*n];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             newArr[idx++]=mat[i][j];
            }
        }
        int [][]matrix=new int[r][c];
        for(int i=0;i<newArr.length;i++){
            matrix[i/c][i%c]=newArr[i];
        }

return matrix;
    }

}