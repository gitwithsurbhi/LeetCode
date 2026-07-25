class Solution {
    public int maxProduct(int n) {
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        while(n>0){
            int r=n%10;
            if(r>max){
                max2=max;
                max=r;
            }
            else if(r>max2){
               max2=r;
            }
            n/=10;
        }
      return max2*max;  
    }
}