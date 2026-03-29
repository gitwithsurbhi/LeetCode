class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2))return true;
        int i=0,j=2;
        StringBuilder str=new StringBuilder(s2);
        while(j<s2.length()){
            char ch1=str.charAt(i);
            char ch2=str.charAt(j);
            str.setCharAt(i,ch2);
          str.setCharAt(j,ch1);
             if(s1.equals(str.toString()))return true;
             i++;j++;
          
        }
        return false;
    }
}