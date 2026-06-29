class Solution {
    private int dfs(ArrayList<Integer> []graph){
        int count=0;
        boolean []visit=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
             dfsUtil(graph,visit,i); 
            count++;
            }
           
        }
        return count;
}
private void dfsUtil(ArrayList<Integer> []graph,boolean []visit,int curr){
    visit[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
      int neigh=graph[curr].get(i);
      if(!visit[neigh]){
        dfsUtil(graph,visit,neigh);
      }
    }
}

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<Integer> []graph=new  ArrayList[isConnected.length];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        //Adjacency List
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    graph[i].add(j);
                    graph[j].add(i);
                }
            }
        }
        return dfs(graph);
    }
}