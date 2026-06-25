class Solution {
    public boolean hasPath(ArrayList<ArrayList<Integer>>graph,int src,int des,boolean []visit){
        if(src==des)return true;
        visit[src]=true;
        
        for(int n:graph.get(src)){
            if(!visit[n] && hasPath(graph,n,des,visit)){
                return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++)graph.add(new  ArrayList<>());
        for(int []e:edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);

        }
       boolean []visit=new boolean[n];
       return hasPath(graph,source,destination,visit);
    }
}