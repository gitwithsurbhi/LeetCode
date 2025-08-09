class Solution {
    private boolean isFrequencySame(int []freq1,int []freq2){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        //storing frequency of s1
        int []freq=new int[26];
        for(int i=0;i<26;i++){
            freq[i]=0;
        }
         for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int windSize=s1.length();
       //storing frquency of s2
       for(int i=0;i<s2.length();i++){
int windIdx=0,idx=i;
 int []windFreq=new int[26];
       for(int j=0;j<26;j++){
         windFreq[j]=0;
       } 
while(windIdx < windSize && idx<s2.length()){
   windFreq[s2.charAt(idx)-'a']++;
   windIdx++;
   idx++;
}
if(isFrequencySame(freq,windFreq)){
   return true;
}
    
    }  
     return false;  
    }
}