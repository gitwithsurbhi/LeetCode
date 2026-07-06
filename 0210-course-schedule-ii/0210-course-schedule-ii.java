class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Adjacency List
        ArrayList<Integer> []graph=new ArrayList[numCourses];
        int []indeg=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            indeg[prerequisites[i][0]]++;
        }
        Queue<Integer>q=new LinkedList<>();
           for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
           }

        int []ans=new int[numCourses];
        ArrayList<Integer>res=new ArrayList<>();
        
        while(!q.isEmpty()){
          int num=q.poll();
          res.add(num);
          for(int n:graph[num]){
            indeg[n]--;
            if(indeg[n]==0)q.add(n);
          }
         
        }
      if(res.size()!=numCourses)return new int[0];
      else{
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
      }
    }
}