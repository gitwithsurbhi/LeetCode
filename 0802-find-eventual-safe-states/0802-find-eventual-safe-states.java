class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
     int []indeg=new int[n];
     ArrayList<Integer> []revGraph= new ArrayList[n]; 
     for(int i=0;i<n;i++){
        revGraph[i]=new ArrayList();
        }
    for(int i=0;i<n;i++){
        for(int j=0;j<graph[i].length;j++){
            revGraph[graph[i][j]].add(i);
            indeg[i]++;
        }
    }
    Queue<Integer>q=new LinkedList<>();

    List<Integer>ans=new ArrayList<>();

    for(int i=0;i<n;i++){
      if(indeg[i]==0){
        q.add(i);
      }
    }
    while(!q.isEmpty()){
        int curr=q.poll();
        ans.add(curr);
        for(int i=0;i<revGraph[curr].size();i++){
            int ele=revGraph[curr].get(i);
            indeg[ele]--;
            if( indeg[ele]==0)q.add(ele);
        }
    }
   
    Collections.sort(ans);
    return ans;
    }
}