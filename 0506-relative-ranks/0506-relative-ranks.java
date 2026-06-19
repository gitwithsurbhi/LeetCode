class Solution {
    static class Score implements Comparable<Score>{
        int val;
        int i;
        public Score(int val,int i){
            this.val=val;
            this.i=i;
        
        }
        @Override
        public int compareTo(Score s2){
            return s2.val-this.val;
        }
    }
    public String[] findRelativeRanks(int[] score) {
       PriorityQueue<Score>pq=new PriorityQueue<>();
       for(int i=0;i<score.length;i++){
        pq.add(new Score(score[i],i));
       } 

       String []res=new String[score.length];
       int count=0;
       while(!pq.isEmpty()){
        int idx=pq.peek().i;
        pq.remove();
        count++;
        if(count<=3){
          if(count==1){
            res[idx]="Gold Medal";
          } 
          if(count==2){
            res[idx]="Silver Medal";
          }
          if(count==3){
            res[idx]="Bronze Medal";
          }
        }
        else{
            res[idx]=Integer.toString(count);
        }
       }

        return res;
    }
}