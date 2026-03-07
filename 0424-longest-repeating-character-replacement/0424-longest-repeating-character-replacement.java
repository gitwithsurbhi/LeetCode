class Solution {
    public int characterReplacement(String s, int k) {
       int l=0,r=0,maxLen=0,maxF=0;
       HashMap<Character,Integer>map=new HashMap<>();
       while(r<s.length()){
        char ch=s.charAt(r);
        map.put(ch,map.getOrDefault(ch,0)+1);
        maxF=Math.max(maxF,map.get(ch));
        if((r-l+1)-maxF > k){
          map.put(s.charAt(l),map.getOrDefault(ch,0)-1);  
          l++;
        }
        if((r-l+1)-maxF<=k){
            maxLen=Math.max(maxLen,r-l+1);
        }
        r++;
       }
       return maxLen;
    }
}