class Solution {
    private void backtrack(String s,int idx, List<List<String>>res,List<String>ans){
        //base case
    if(idx==s.length()){
        res.add(new ArrayList<>(ans));
        return;
    }
    for(int i=idx;i<s.length();i++){
        if(isPalidrome(s,idx,i)){
          ans.add(s.substring(idx,i+1));
          backtrack(s,i+1,res,ans);
          ans.remove(ans.size()-1);
        }
    }
    }

    private boolean isPalidrome(String s,int st,int end){
      while(st<=end){
        if(s.charAt(st)!=s.charAt(end)){
            return false;
        }
        st++;
        end--;
      }
      return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>ans=new ArrayList<>();
         backtrack(s,0,res,ans);
         return res;
    }
}