class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1)return 0;
        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE;
       int l=0;
       int r=k-1;
       while(r<nums.length){
        int diff=nums[r]-nums[l];
        minDiff=Math.min(minDiff,diff);
        l++;
        r++;
       }
       return minDiff;
    }
}