class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if(n==1){
            return 1;
        }
        int idx=0;
        for(int i=0;i<n;i++){
            char ch=chars[i];
            Integer count=0;
            while(i<n && chars[i]==ch){
                count++; i++;
            }
            chars[idx++]=ch;
            if(count>1){
               for( char ele:String.valueOf(count).toCharArray()){
                    chars[idx++]=ele;
                }
            }
            
          i--;  
        }
        return idx;
    }
}