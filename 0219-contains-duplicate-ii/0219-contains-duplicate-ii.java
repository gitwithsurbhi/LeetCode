class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int j=map.get(nums[i]);
            int val=Math.abs(i-j);
        if(val<=k){
         return true;
        }
        else{
           map.put(nums[i],i); 
        }
}
        else{
             map.put(nums[i],i);
        }
       
     }
     return false;
         }
}