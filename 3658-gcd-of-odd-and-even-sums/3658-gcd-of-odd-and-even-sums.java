class Solution {
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
      int oddSum=n*(2*1+(n-1)*2)/2;
       int evenSum=n*(2*2+(n-1)*2)/2; 
      int res=gcd(oddSum,evenSum);
     return res;
    }
}