class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>>res=new ArrayList<>();
       boolean []freq=new boolean[nums.length];
       backtrack(nums,res,new ArrayList<>(),freq);
       return res;
    }
    private void backtrack(int[] nums,List<List<Integer>>res,List<Integer>ans,boolean []freq){
        if(ans.size()==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ans.add(nums[i]);
                backtrack(nums,res,ans,freq);
                ans.remove(ans.size()-1);
                freq[i]=false;

            }
        }
    }
}