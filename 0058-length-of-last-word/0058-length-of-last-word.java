class Solution {
    public int lengthOfLastWord(String s) {
       s= s.trim();
        int lastSpace=s.lastIndexOf(" ");
        int result=s.length()-1 -lastSpace;
        return result;
    }
}