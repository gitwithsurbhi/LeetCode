class Solution {
    class Edge{
        int des;
        int wt;
        Edge(int des,int wt){
            this.des=des;
            this.wt=wt;
        }
    }
    class Pair {
        long dis;
        int node;
        Pair(long dis,int node){
            this.dis=dis;
            this.node=node;
        }
       
    }
    public int countPaths(int n, int[][] roads) {
       //Adjacency List
        ArrayList<Edge>[]graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList();
        }
        for(int i=0;i<roads.length;i++){
            graph[roads[i][0]].add(new Edge(roads[i][1],roads[i][2]));
            graph[roads[i][1]].add(new Edge(roads[i][0],roads[i][2]));   
        }
        long []dist=new long[n];
        int []ways=new int[n];
       Arrays.fill(dist,Long.MAX_VALUE);
       dist[0]=0;
        int mod=(int)1e9+7;
        PriorityQueue<Pair>q=new PriorityQueue<>((a,b)->Long.compare(a.dis,b.dis));
        q.add(new Pair(0,0));
        ways[0]=1;
        while(!q.isEmpty()){
            Pair p=q.poll();
            long dis=p.dis;
            int node=p.node;
            if(dis > dist[node])continue;

            for(int i=0;i<graph[node].size();i++){
                Edge e=graph[node].get(i);
                int neigh=e.des;
                int wt=e.wt;
                if(dis+wt< dist[neigh]){
                    dist[neigh]=dis+wt;
                    q.add(new Pair(dist[neigh],neigh));
                    ways[neigh]=ways[node];
                }
                else if(dis+wt == dist[neigh]){
                    ways[neigh]=(ways[neigh]+ways[node])%mod;
                }
            }
        }
    return ways[n-1]%mod;
    }
}