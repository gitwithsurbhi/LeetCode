class Solution {
    class Pair{
        String s;
        int i;
        Pair(String s,int i){
            this.s=s;
            this.i=i;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
      Queue<Pair>q=new LinkedList();
      q.add(new Pair(beginWord,1));
      HashSet<String>set=new HashSet<>();
      for(String s:wordList){
        set.add(s);
      } 
      while(!q.isEmpty()){
        String word=q.peek().s;
        int steps=q.peek().i;
        q.remove();
        if(word.equals(endWord))return steps;
        char []newArr=word.toCharArray();
        for(int i=0;i<newArr.length;i++){
          char org=newArr[i];
           for(char ch='a';ch<='z';ch++){
              newArr[i]=ch;
              String repWord=new String(newArr);
              if(set.contains(repWord) ){
                set.remove(repWord);
                q.add(new Pair(repWord,steps+1));
              }  
            }
            newArr[i]=org;
        }
      }
      return 0;
    }
}