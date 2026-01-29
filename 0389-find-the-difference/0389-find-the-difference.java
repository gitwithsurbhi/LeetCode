class Solution {
    public char findTheDifference(String s, String t) {
        //brute force
        /*
        int []freq=new int[26];
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(freq[ch-'a']>0){
               freq[ch-'a']--;
            }
            else{
                freq[ch-'a']++;
            }
           
        }
        char ans='\0';
        for(int i=0;i<26;i++){
            if(freq[i]==1){
                 ans= (char)('a'+ i);
               
            }
        }
        return ans;
        */
        int []freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            freq[ch-'a']--;
            if(freq[ch-'a']<0){
                return ch;
            }
        }
        return ' ';
    }
}