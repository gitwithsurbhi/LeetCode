class Solution {
    private void reverse(int []arr,int st,int end){
           while(st<=end){
             int temp=arr[st];
             arr[st]=arr[end];
             arr[end]=temp;
             st++;
             end--;
           }
    }
    public void nextPermutation(int[] nums) {
      int piv=-1,n=nums.length;
      for(int i= n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            piv=i;
            break;
        }
      }  
      if(piv==-1){
        reverse(nums,0,n-1);
        return;
      }

      for(int i=n-1;i>piv;i--){
        if(nums[i]>nums[piv]){
            int temp=nums[i];
            nums[i]=nums[piv];
            nums[piv]=temp;
            break;
        }
      }

      reverse(nums,piv+1,n-1);
    }
}