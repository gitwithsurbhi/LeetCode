class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n==0 || m==0 || n<m)return "";

        int l=0,r=0,count=m;
        int minLen=Integer.MAX_VALUE;
        int sIdx=-1;

        int []hash=new int[128];
        for( char c:t.toCharArray()){
            hash[c]++;
        }

        while(r<n){
            if(hash[s.charAt(r)]>0)count--;
            hash[s.charAt(r)]--;
             r++;
            while(count==0){
                if(r-l<minLen){
                   minLen= r-l;
                   sIdx=l;
                }

            hash[s.charAt(l)]++;
            if(hash[s.charAt(l)]>0)count++;
            l++;
            }

          
        }

       
       
return sIdx==-1 ? "" :s.substring(sIdx,sIdx+minLen);
    }
}