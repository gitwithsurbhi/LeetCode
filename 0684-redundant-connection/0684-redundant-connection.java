class Solution {
    class Disjoint{
        int []par;
        int []rank;
        Disjoint(int n){
            par=new int[n+1];
             for(int i=0;i<n+1;i++){
                par[i]=i;
             }
             rank=new int[n+1];
        }
        public int find(int x){
        if(x==par[x])return x;
        return par[x]=find(par[x]);
    }
    public void union(int a,int b){
        int parA=find(a);
        int parB=find(b);
        if(rank[parA]==rank[parB]){
            rank[parA]++;
            par[parB]=parA;
        }
        else if(rank[parA]>rank[parB]){
            par[parB]=parA;
        }
        else{
            par[parA]=parB;
        }
    }
    }
   
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
       Disjoint d=new Disjoint(n);
       int []ans=new int[2];
       for(int i=0;i<n;i++){
        int a=edges[i][0];
        int b=edges[i][1];
        if(d.find(a)==d.find(b)){
           ans[0]=a;
           ans[1]=b;
        }
        else{
          d.union(a,b);
        }
       }
    return ans;
    }
}