class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int ans=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     while(i<nums.length && nums[i]==1){
        //         count++;
        //         i++;
        //     }
        // ans=Math.max(count,ans);
        // }
        // return ans;

        if(nums.length==1){
            if(nums[0]==0)return 0;
            else{
                return 1;
            }
        }
int count=0,ans=0;
        for(int i=0;i<nums.length;i++){
         if(nums[i]==0){
            count=0;
         }
         else{
            count++;
            ans=Math.max(ans,count);
         }

        }
// 
            // ans=Math.max(ans,count);

        return ans;
    }
}