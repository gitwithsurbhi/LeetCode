class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int []ans=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        ans[i]=arr[i];
       }
       Arrays.sort(ans);
       HashMap<Integer,Integer>map=new HashMap<>();
       int rank=1;
       for(int i:ans){
        if(!map.containsKey(i)){
           map.put(i,rank++);
        }
       }

       for(int i=0;i<arr.length;i++){
        ans[i]=map.get(arr[i]);
       }
    return ans;  
    }
}