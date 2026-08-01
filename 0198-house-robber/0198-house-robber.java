class Solution {
    public int maxSum(int []nums,int i,int []dp){
        if(i==0)return nums[i];
        if(i<0)return 0;
        if(dp[i]!=-1)return dp[i];
        int pick=nums[i]+maxSum(nums,i-2,dp);
        int notPick=maxSum(nums,i-1,dp);
        return dp[i]=Math.max(pick,notPick);
    }
    public int rob(int[] nums) {
        int []dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
      return maxSum(nums,nums.length-1,dp);  
    }
}