class Solution {
    public int reverse(int n) {
        int copy=n;
        if(n<0){
            n=-n;
        }
        int rev=0;
        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;
            }
         if(copy<0){
            return -rev;
         }
         else{
            return rev;
         }   
    }
}