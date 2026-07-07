class Solution {
    public long sumAndMultiply(int n) {
        int num=n;
        int x=0;
        long sum=0;
        int pow=1;
        while(num>0){
           int r=num%10;
           if(r!=0){
            sum+=r;
            x+=(r*pow);
            pow*=10;
           } 
           num/=10;
        }
        long ans=sum*(long)x;
        return ans;
    }
}