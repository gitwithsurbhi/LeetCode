class Solution {
    public int[] shortestToChar(String s, char c) {
       int []ans=new int[s.length()];
       Arrays.fill(ans,Integer.MAX_VALUE);
       int idx=-1;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==c){
            idx=i;
            ans[i]=0;
        }
        else if(idx!=-1){
            ans[i]=Math.abs(i-idx);
        }

       } 
       idx=-1;
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==c){
            idx=i;
            ans[i]=0;
        }
        else if(idx!= -1 ){
            ans[i]=Math.min(ans[i],Math.abs(i-idx));
        }
       }
       return ans;
    }
}