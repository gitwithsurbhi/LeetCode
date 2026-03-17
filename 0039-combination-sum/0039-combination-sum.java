class Solution {
    private void combination(int[] candidates, int target,int idx,ArrayList<Integer>ans, List<List<Integer>> res){
        if(idx==candidates.length){
             if(target==0 ){
                res.add(new ArrayList<>(ans));
             }
             return;
        }
        if(target>=candidates[idx]){
            ans.add(candidates[idx]);
            combination(candidates,target-candidates[idx],idx,ans,res);
            ans.remove(ans.size()-1); //Backtracking
        }
       combination(candidates,target,idx+1,ans,res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        combination(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
}