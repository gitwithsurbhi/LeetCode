class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=n-1;
        k=k%n;
        
        //Reversing whole Array
        while(i<j){
            int temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }

        i=0;
        int kptr=k-1;
        while(i<kptr){
             int temp=nums[i];
            nums[i++]=nums[kptr];
            nums[kptr--]=temp;
        }

         j=n-1;
        while(k<j){
             int temp=nums[k];
            nums[k++]=nums[j];
            nums[j--]=temp;
        }
    }
}