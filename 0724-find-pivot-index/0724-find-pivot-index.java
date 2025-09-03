class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        //prefixarray
      for(int i=1;i<n;i++){
        nums[i]+=nums[i-1];
      }  
      for(int i=0;i<n;i++){
        int leftSum=0,rightSum=0;
      leftSum=(i==0)?leftSum=0:nums[i-1];
      rightSum=(i==n-1)?rightSum=0:nums[n-1]-nums[i];
        if(leftSum==rightSum){
            return i;
        }
      }
      return -1;
    }
}