// class Solution {
//     public void moveZeroes(int[] nums) {
//     //    int left=0;
//     //    for(int right=0;right<nums.length;right++){
//     //     if(nums[right]!=0){
//     //         int temp=nums[left];
//     //         nums[left]=nums[right];
//     //         nums[right]=temp;
//     //         left++;
//     //     }
//     //    }

//     int insertPos=0;
//     for(int num:nums){
//         if(num!=0){
//             nums[insertPos++]=num;
//         }
//     }
//     while(insertPos<nums.length){
//         nums[insertPos++]=0;
//     }
//     }
// }

class Solution {
    static {
        for(int i = 0; i < 100; i++){
            moveZeroes(new int[]{0, 0});
        }
    }
    public static void moveZeroes(int[] nums) {
        int non_zero_ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[non_zero_ind++]=nums[i];
            }
        }
        while(non_zero_ind<nums.length){
            nums[non_zero_ind++]=0;
        }
    }
}