class Solution {
    public int helper(int []nums){
        int prev2=0;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            int take=nums[i];
            if(i>1){
                take+=prev2;
            }
            int notTake=prev;
            int curr=Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int []temp=new int[nums.length-1];
        int []temp2=new int[nums.length-1];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                temp[j++]=nums[i];
            }
            if(i!=nums.length-1){
                temp2[i]=nums[i];
            }
        }
    return Math.max(helper(temp),helper(temp2));
    }
}