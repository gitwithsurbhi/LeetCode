class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer,Integer>map=new HashMap<>();
    List<Integer>res=new ArrayList<>();
        for(int nums:nums1){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }

        for(int nums:nums2){
            if(map.containsKey(nums) && map.get(nums)>0){
                res.add(nums);
                map.put(nums,map.get(nums)-1);
            }
        }
      
     int []ans=new int[res.size()];
     int i=0;
        for(int key:res){
         ans[i++]=key;
        }

        return ans;
    }
}