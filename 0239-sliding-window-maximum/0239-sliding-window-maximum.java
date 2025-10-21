class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []ans=new int[nums.length-k+1];
        int j=0;
        Deque<Integer>dq=new LinkedList<>();
        //analyse the window
        for(int i=0;i<k;i++){
            while(dq.size()>0 && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
          
          for(int i=k;i<nums.length;i++){
            ans[j++]=nums[dq.getFirst()];
        //remove ele who doesnt match in curr window

        while(dq.size()>0 && dq.getFirst()<=i-k){
            dq.removeFirst();
        }

        while(dq.size()>0 && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
}
            ans[j++]=nums[dq.getFirst()];

 
return ans;
    }
}