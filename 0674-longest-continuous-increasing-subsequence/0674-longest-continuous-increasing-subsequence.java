class Solution {
    public int findLengthOfLCIS(int[] nums) {
       int longest=1;
       int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
               count++;
            }
            else{
                count=1;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}