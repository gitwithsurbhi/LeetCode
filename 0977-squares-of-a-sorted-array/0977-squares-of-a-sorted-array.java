class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0,right=n-1,pos=n-1;
        int []ans=new int[n];
         while(left<=right){
         int leftptr=nums[left]*nums[left];
         int rightptr=nums[right]*nums[right];
         if(leftptr>rightptr){
            ans[pos--]=leftptr;
            left++;
         } else{
            ans[pos--]=rightptr;
            right--;
         } 
        }
        return ans;
    }
}