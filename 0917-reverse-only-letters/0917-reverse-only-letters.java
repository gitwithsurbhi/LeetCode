class Solution {
    private boolean isAlphabet(char ch){
     return  (ch >=65 && ch<=90) || (ch>=97 && ch<=122) ;
      }
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder(s);
      int i=0,j=s.length()-1;
      while(i<=j){
        if(!isAlphabet(sb.charAt(i))){
            i++;
        }
       else if(!isAlphabet(sb.charAt(j))){
            j--;
        }
      else if((isAlphabet(sb.charAt(i)) ) && (isAlphabet(sb.charAt(j)) )){
            char temp=sb.charAt(i);
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
       
       }
       
       
      }
     return sb.toString();  
    }
    
}