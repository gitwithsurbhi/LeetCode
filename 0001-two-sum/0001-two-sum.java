class Solution {
    public int[] twoSum(int[] nums, int target) {
      /* Brute Force Approach
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
       }

    return new int[]{-1,-1};   
    */
    /* Optimsed Approach
    Arrays.sort(nums);
    int i=0;
    int j=nums.length-1;
    while(i<j){
        if(nums[i]+nums[j]==target){
            return new int[]{i,j};
        }
        else if(nums[i]+nums[j]>target){
            j--;
        }
        else{
            i++;
        }
    }
    return new int[]{-1,-1};
    */

    // Optimal Approach
    HashMap<Integer,Integer>map=new HashMap<>();
    
    for(int i=0;i<nums.length;i++){
       int first=nums[i];
       int sec=target-first;
        if(map.containsKey(sec)){
            return new int[]{i,map.get(sec)};
        }
        
        map.put(nums[i],i);
    }
    return new int[]{-1,-1};
    
    }
}