class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int minLen=Integer.MAX_VALUE;
       int l=0,r=0,sum=0;
       while(r<nums.length){
        sum+=nums[r];
         r++;
        while(sum>=target){
            minLen=Math.min(minLen,r-l);
            sum-=nums[l];
            l++;
        }
       
       } 
    return minLen==Integer.MAX_VALUE? 0: minLen;
    }
}