class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        HashMap<Character,Integer>sMap=new HashMap<>();
        HashMap<Character,Integer>pMap=new HashMap<>();

       for(char c:p.toCharArray()){
        pMap.put(c,pMap.getOrDefault(c,0)+1);
       }
       int m=p.length();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        sMap.put(ch,sMap.getOrDefault(ch,0)+1);

        if(i>=m){
            char leftChar=s.charAt(i-m);
        sMap.put(leftChar,sMap.getOrDefault(leftChar,0)-1);
            if(sMap.get(leftChar)==0)sMap.remove(leftChar);
        }

        if(sMap.equals(pMap)){
            ans.add(i-m+1);
        }
       }
     return ans;   
    }
}