class Solution {
    public int maxProduct(int[] nums) {
      PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
    int prod=1;
    prod*=pq.peek()-1;
    pq.remove();
    prod*=pq.peek()-1;
    return prod;
    }
}