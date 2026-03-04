class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double maxAvg=0;
      for(int i=0;i<k;i++){
           sum+=nums[i];
      }
      maxAvg=sum/k;
      int r=k-1;
      int l=0;
      while(r<nums.length-1){
          sum-=nums[l];
          l++;
          r++;
          sum+=nums[r];
        maxAvg=Math.max(maxAvg,sum/k); 
      }
      return maxAvg;
    }
}