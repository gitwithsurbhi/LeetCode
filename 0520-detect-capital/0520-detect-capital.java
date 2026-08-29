class Solution {
    
    public boolean detectCapitalUse(String word) {
       int u=0;
       int l=0;
       int n=word.length();
       for(int i=0;i<n;i++){
        if(Character.isUpperCase(word.charAt(i))){
            u++;
        }else{
            l++;
        }
       }
       if(u==n || l==n || u==1 && Character.isUpperCase(word.charAt(0)) )return true;
       else{
        return false;
       }
    }
}