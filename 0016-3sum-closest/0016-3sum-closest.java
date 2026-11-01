class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int abs=Math.abs(target-sum);
                if(abs<min){
                    ans=sum;
                    min=abs;
                }
                if(sum<target)
                {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    return ans;
    }
}