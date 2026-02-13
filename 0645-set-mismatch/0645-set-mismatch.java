class Solution {
    public int[] findErrorNums(int[] nums) {
        /*
        int []freq=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int miss,dup;
        miss=dup=0;
        for(int i=1;i<=nums.length;i++){
            if(freq[i]>1){
               dup=i;
            }
            if(freq[i]==0){
              miss=i;
            }
        }
    return new int[]{dup , miss};
    */
    HashSet<Integer>set=new HashSet<>();
    int miss,dup;
    miss=dup=0;
    for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
           dup=nums[i];
        }
       set.add(nums[i]);
    }
    
    for(int i=1;i<=nums.length;i++){
       
        if(!set.contains(i)){
            miss=i;
        }
    }
    return new int[]{dup , miss};
    }
}