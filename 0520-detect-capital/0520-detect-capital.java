class Solution {
    public boolean isUpperCase(char c){
        return c>='A' && c<='Z';
    }
    public boolean detectCapitalUse(String word) {
       if(word == word.toUpperCase())return true;
       else if(word== word.toLowerCase())return true;
       else {
        String str=word.substring(1);
        
        if(isUpperCase(word.charAt(0)) && str== str.toLowerCase())return true;
        else{
            return false;
        }  
       }
    }
}