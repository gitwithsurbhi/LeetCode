class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=0,j=i+1;
        // while(i<nums.length && j<nums.length){
        //     if(nums[i]==nums[j]){
        //         j++;
        //     }else{
        //         i++;
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //         j++;
        //     }
        // }
        // return i+1;

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}