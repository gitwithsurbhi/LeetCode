class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []ans=new int[2];
        int n=grid.length*grid.length;
        int expectedSum=0,actualSum=0;
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int ele=grid[i][j];
                actualSum+=ele;
                if(set.contains(ele)){
                    ans[0]=ele;
                    
                }
                set.add(ele);
            }
        }
        expectedSum=n*(n+1)/2;
        ans[1]=expectedSum+ans[0]-actualSum;

      
    return ans;

    }
}