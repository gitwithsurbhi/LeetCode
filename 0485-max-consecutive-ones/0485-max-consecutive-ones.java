class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(i<nums.length && nums[i]==1){
                count++;
                i++;
            }
        ans=Math.max(count,ans);
        }
        return ans;
    }
}