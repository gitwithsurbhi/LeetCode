class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int l=0,r=0,maxLen=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                    l=map.get(s.charAt(r))+1;
                }

            }
            int len=r-l+1;
            maxLen=Math.max(maxLen,len);
            map.put(s.charAt(r),r);
            r++;
        }
        return maxLen;
    }
}