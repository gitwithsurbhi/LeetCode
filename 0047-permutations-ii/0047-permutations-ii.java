class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        backtrack(0,nums,res);
        return res;
    }
    private void backtrack(int idx,int []nums,List<List<Integer>>res){
        if(idx==nums.length){
            ArrayList<Integer>ds= new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<nums.length;i++){
           if(i>idx && nums[i]==nums[i-1])continue;

           swap(idx,i,nums);
           backtrack(idx+1,nums,res);
           swap(idx,i,nums);
           
        }
    }
   private void swap(int i,int j,int nums[]){
    int t=nums[i];
    nums[i]=nums[j];
    nums[j]=t;
   }
}