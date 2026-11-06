class Solution {
    public String firstRow=  "qwertyuiop";
    public   String secRow="asdfghjkl";
    public  String thirdRow = "zxcvbnm";
    public boolean check(String s,String row){
        
        for(char c:s.toCharArray()){
            if(row.indexOf(c)== -1)return false;
        }
        return true;
    }
    public String[] findWords(String[] words) {
     ArrayList<String>ans=new ArrayList<>();
      for(int i=0;i<words.length;i++){
        String word=words[i].toLowerCase();
       
         if(firstRow.indexOf(word.charAt(0))!= -1){
            if(check(word,firstRow))ans.add(words[i]);
         }
         else if(secRow.indexOf(word.charAt(0))!= -1){
            if(check(word,secRow))ans.add(words[i]);
        }
        else if(thirdRow.indexOf(word.charAt(0))!= -1){
            if(check(word,thirdRow))ans.add(words[i]);
        
        }
      }
      String []list=new String[ans.size()];
      for(int i=0;i<list.length;i++){
        list[i]=ans.get(i);
      }
      return list;
    }
}