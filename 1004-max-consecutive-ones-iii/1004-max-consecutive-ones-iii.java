class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,maxLen=0,zero=0;
        while(r<nums.length){
            if(nums[r]==0)zero++;
            if(zero>k){
                if(nums[l]==0)zero--;
                l++;
            }
            if(zero<=k){
                int len=r-l+1;
                maxLen=Math.max(maxLen,len);
            }
            r++;
        }
        return maxLen;
    }
}  