class Solution {
    class Edge{
        int u;
        int v;
        int wt;
        public Edge(int u,int v,int wt){
            this.u=u;
            this.v=v;
            this.wt=wt;
        }
    }

    public void create(int[][] flights,ArrayList<Edge>[]graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++){
           int u=flights[i][0];
           int v=flights[i][1];
           int wt=flights[i][2];
           graph[u].add(new Edge(u,v,wt));
        }
     

    }
    class Info{
        int node;
        int cost;
        int stops;
        public Info(int node,int cost,int stops){
            this.node=node;
            this.cost=cost;
            this.stops=stops;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //Adjacency List
        ArrayList<Edge>[]graph=new ArrayList[n];
        create(flights,graph);

        int []dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        
        Queue<Info>q=new LinkedList<>();
        q.add(new Info(src,0,0));
        while(!q.isEmpty()){
            Info curr=q.poll();
            int cost=curr.cost;

            if(curr.stops>k){
                break;
            }
            for(Edge e:graph[curr.node]){
                if(cost!=Integer.MAX_VALUE && cost+e.wt <dist[e.v] && curr.stops<=k){
                   dist[e.v]=cost+e.wt;
                   q.add(new Info(e.v,dist[e.v],curr.stops+1));
                }
                
            }
        }
        if(dist[dst]==Integer.MAX_VALUE)return -1;
        else{
           return dist[dst];
        }
    }
}