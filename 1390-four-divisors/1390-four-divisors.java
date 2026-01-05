class Solution {
    public int sumFourDivisors(int[] nums) {
   //Brute force approach
   int currSum=0;
   for(int i=0;i<nums.length;i++){
     int count=0;
     int sum=0;
     for(int j=1;j<=nums[i];j++){
        if(nums[i]%j==0){
            count++;
            sum+=j;
        }
        if(count>4){
            break;
        }
     }
     if(count == 4){
         currSum+=sum;
     }
     } 

     
     return currSum;
    }
}