class Solution {
    public long pickGifts(int[] gifts, int k) {
      PriorityQueue<Integer>pq=new  PriorityQueue<>(Comparator.reverseOrder());
      for(int gift:gifts){
        pq.add(gift);
      } 
    for(int i=0;i<k;i++){
      int num=(int)(Math.sqrt(pq.poll()));
       pq.add(num);
    }
    long sum=0;
    while(!pq.isEmpty()){
     sum+=pq.poll();
     
    }
    return sum;
}
}