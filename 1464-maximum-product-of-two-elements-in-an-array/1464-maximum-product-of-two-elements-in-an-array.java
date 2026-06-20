class Solution {
    public int maxProduct(int[] nums) {
        /*
      PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
    int prod=1;
    prod*=pq.peek()-1;
    pq.remove();
    prod*=pq.peek()-1;
    return prod;
    */
    int max1=0;
    int max2=0;
    for(int num:nums){
        if(num>max1){
            max2=max1;
            max1=num;
         }
         else if(num > max2){
            max2=num;
         }
    }
    return (max1-1)*(max2-1);
    }
}