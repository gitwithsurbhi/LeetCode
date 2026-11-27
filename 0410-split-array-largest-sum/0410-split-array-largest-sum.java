class Solution {
    public int noOfSplit(int []nums,int mid){
       int split=1;
       int sum=0;
       for(int i=0;i<nums.length;i++){
        if(sum+nums[i]<=mid){
            sum+=nums[i];
        }
        else{
            sum=0;
            split++;
            sum+=nums[i];
        }
       }
    return split;
    }
    public int binarySearch(int []nums,int k){
        int max=Integer.MIN_VALUE;
     int sum=0;
     for(int n:nums){
        max=Math.max(n,max);
        sum+=n;
     }
     int low=max;
     int high=sum;
     while(low<=high){
        int mid=low+(high-low)/2;
        int split= noOfSplit(nums,mid);
        
        if(split >k){
           low=mid+1;
        }
        else {
           high=mid-1;
        }
     }
     return low;
    }
    public int splitArray(int[] nums, int k) {
      
        return binarySearch(nums,k);
    }
}