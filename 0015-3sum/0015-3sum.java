class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        HashSet<List<Integer>>set=new HashSet<>();
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
        
        int j=i+1,k=nums.length-1;
        while(j<k){
            int sum=nums[i];
            sum+=nums[j];
            sum+=nums[k];
            if(sum==0){
                List<Integer>a=new ArrayList<>();
                a.add(nums[i]);
                a.add(nums[j]);
                a.add(nums[k]);
                set.add(a);
                j++;
                k--;
            }
            else if(sum<0){
                j++;
            }
            else{
                k--;
            }
        }
      }
      for(List<Integer> arr:set){
        ans.add(arr);
      } 
      return ans; 
    }
}