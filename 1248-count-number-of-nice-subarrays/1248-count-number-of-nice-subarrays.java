class Solution {
    private int helper(int []nums,int k){
        if(k<0)return 0;
        int l=0,r=0,sum=0,count=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>k){
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        } 
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
     for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            nums[i]=0;
        }else{
            nums[i]=1;
        }
     } 
     return helper(nums,k)-helper(nums,k-1);
    }
}