class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        /*
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        */
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs( nums[i])-1;
            nums[idx]=-Math.abs(nums[idx]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
    return ans;
    }
}