class Solution {
    public void subsetsProblem(int[] arr,int idx,List<Integer>row,List<List<Integer>>ans) {
    ans.add(new ArrayList<>(row));
    
    for(int i=idx;i<arr.length;i++){
    row.add(arr[i]);
    subsetsProblem(arr,i+1,row,ans);
    row.remove(row.size()-1);

    }    
    }

    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>ans=new ArrayList<>();
     subsetsProblem(nums,0,new ArrayList<>(),ans);
      return ans;
    }
}