class Solution {
    private int binToDec(int num){
        int ans=0,pd=0,pow=1;
        while(num>0){
            pd=num%10;
            ans+=pd*pow;
            pow*=2;
            num/=10;
        }
        return ans;
    }
     private long decToBin(long num){
        long ans=0,pd=0,pow=1;
        while(num>0){
            pd=num%2;
            ans+=pd*pow;
            pow*=10;
            num/=2;
        }
        return ans;
    }
    public String addBinary(String a, String b) {
     int num1= binToDec(Integer.parseInt(a));   
      int num2=binToDec(Integer.parseInt(b));

      long ans=(num1+num2);
      long answer=decToBin(ans);
 
       return Long.toString(answer);
     
    }
}