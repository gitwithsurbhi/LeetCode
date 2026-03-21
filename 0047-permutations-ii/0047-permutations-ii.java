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
        HashSet<Integer>set=new HashSet();
        for(int i=idx;i<nums.length;i++){
           if(set.contains(nums[i]))continue;
           set.add(nums[i]);

           swap(i,idx,nums);
           backtrack(idx+1,nums,res);
           swap(i,idx,nums);
           
        }
    }
   private void swap(int i,int j,int nums[]){
    int t=nums[i];
    nums[i]=nums[j];
    nums[j]=t;
   }
}