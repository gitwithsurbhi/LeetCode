class Solution {
    private int min(int []list){
         int minimum=list[0];
         for(int i=1;i<list.length;i++){
            minimum=Math.min(minimum,list[i]);
         }
         return minimum;
    }
    public int numberOfSubstrings(String s) {
        int count=0;
        int list[]={-1,-1,-1};
        for(int i=0;i<s.length();i++){
          list[s.charAt(i)-'a']=i;
          if(list[0]!=-1 && list[1]!=-1 && list[2]!=-1 ){
            count +=min(list)+1;
          }
     }
        return count;
    }
}