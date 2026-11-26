class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)return false; 
        boolean flag =true;
        int i=10;
    while(n>0){
        n-=i;
      if(n<i-1)return flag;
       flag= !flag;
       
        i--;
        
      }
      return !flag; 
    }
}