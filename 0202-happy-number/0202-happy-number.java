class Solution {
    private int getSum(int n){
      int sum=0;
      while(n>0){
        int digit=n%10;
        sum+=digit*digit;
        n/=10;
      } 
      return sum;
    }

    public boolean isHappy(int n) {
        int slow=n;
        int fast=getSum(n);

        while(fast!=1 && fast!=slow){
            slow=getSum(slow);
            fast=getSum(getSum(fast));
        }
        return fast==1;
    }
}