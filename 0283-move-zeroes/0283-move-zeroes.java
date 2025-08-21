class Solution {
    public void moveZeroes(int[] nums) {
    //    int left=0;
    //    for(int right=0;right<nums.length;right++){
    //     if(nums[right]!=0){
    //         int temp=nums[left];
    //         nums[left]=nums[right];
    //         nums[right]=temp;
    //         left++;
    //     }
    //    }

    int insertPos=0;
    for(int num:nums){
        if(num!=0){
            nums[insertPos++]=num;
        }
    }
    while(insertPos<nums.length){
        nums[insertPos++]=0;
    }
    }
}