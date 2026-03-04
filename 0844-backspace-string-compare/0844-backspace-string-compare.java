class Solution {
    private String check(String str){
        StringBuilder s=new StringBuilder();
         for(char ch:str.toCharArray()){
            if(ch=='#'){
                if(s.length()!=0){
                  s.deleteCharAt(s.length()-1);
                }
               
            }
            else{
               s.append(ch);
            }
           
        }
        return s.toString();
    }
    public boolean backspaceCompare(String s, String t) {
     return check(s).equals(check(t));
    }
}