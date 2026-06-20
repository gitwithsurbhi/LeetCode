class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
      for(int i=0;i<stones.length;i++){
        pq.add(stones[i]);
      }
      while(!pq.isEmpty()){
        if(pq.size()==1){
            return pq.peek();
        }
        int y=pq.peek();
        pq.remove();
        int x=pq.peek();
        pq.remove();
        if(x!=y){
            pq.add(y-x);
        }
        
      }
    return 0;
    }
}