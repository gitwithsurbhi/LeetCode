class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>list=new ArrayList<>();
        
        int i=0;
        while(i<nums.length){
           int start=nums[i];
            while(i+1<nums.length && nums[i+1]==nums[i]+1){
                i++;
            }
            int end=nums[i];
            if(start==end){
                list.add(Integer.toString(start));
            }else{
                list.add(start+"->"+end);
            }
            i++;
        }
        return list;
    }
}