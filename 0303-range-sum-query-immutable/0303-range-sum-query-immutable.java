class NumArray {
    private int []prefixSum;
    public NumArray(int[] nums) {
          //prefixsum array
       for(int i=1;i<nums.length;i++){
        nums[i]+=nums[i-1];
       } 
       this.prefixSum=nums;
    }
    
    public int sumRange(int left, int right) {
      int sum=(left==0)?prefixSum[right]:prefixSum[right]-prefixSum[left-1];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */