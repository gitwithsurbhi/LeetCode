class Solution {
    class Edge{
        int dest;
        int wt;
        public Edge(int dest,int wt){
            this.dest=dest;
            this.wt=wt;
        }
    }
    class Info implements Comparable<Info>{
        int node;
        int cost;
        Info(int n,int c){
            this.node=n;
            this.cost=c;
        }
        @Override
        public int compareTo(Info i2){
            return this.cost-i2.cost;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edge> []graph=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<times.length;i++){
            graph[times[i][0]].add(new Edge(times[i][1],times[i][2]));
        }
        int []dist=new int[n+1];
        for(int i=1;i<=n;i++){
            if(i!=k){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Info>pq=new PriorityQueue<>();
        pq.add(new Info(k,0));
        while(!pq.isEmpty()){
            Info curr=pq.poll();
            int cost=curr.cost;
            for(Edge e:graph[curr.node]){
                if(cost!=Integer.MAX_VALUE && cost+e.wt < dist[e.dest]){
                    dist[e.dest]=cost+e.wt ;
                    pq.add(new Info(e.dest,dist[e.dest]));
                }
            }
        }
        int min=-1;
        for(int i=1;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE){
                 min=-1;break;
            }
            
            else{
            min=Math.max(dist[i],min);
            }
        }
        return min;
    }
}