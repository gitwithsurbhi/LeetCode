class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int l=0;
        int r=0;
        int prod=1;
        while(r<nums.length){
            prod*=nums[r];
            r++; 
            while(prod>=k && l<r){
                prod=prod/nums[l];
                l++;
            }
            if(prod<k){
            count+= (r-l);
            }
               
        }
       return count;
    }
}