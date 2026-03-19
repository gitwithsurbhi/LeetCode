class Solution {
    private void helper(int []nums,int idx,List<List<Integer>>res,List<Integer>ans){
       
            res.add(new ArrayList<>(ans));
            
        
        for(int i=idx;i<nums.length;i++){
            if(i!=idx && nums[i]==nums[i-1])continue;

            ans.add(nums[i]);
            helper(nums,i+1,res,ans);
            ans.remove(ans.size()-1);
           
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>>res=new ArrayList<>();
         Arrays.sort(nums);
         helper(nums,0,res,new ArrayList<>());
         return res;
    }
}