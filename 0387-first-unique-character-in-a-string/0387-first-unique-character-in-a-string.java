class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
    Queue<Character>q=new LinkedList<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        q.add(ch);
        freq[ch-'a']++;
        while(!q.isEmpty() && freq[q.peek()-'a']>1){
            q.remove();
        }
        if(q.isEmpty()){
            System.out.println(-1);
        }
         }
        int ans=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==1){
               ans=i;
               break;
            }
        }
       
   
 return ans;
    }

}