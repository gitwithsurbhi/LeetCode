class Solution {
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public int maxLength(int[] nums) {
        int len=0;
       
      
      for(int i=0;i<nums.length;i++){
        int gcdVal=nums[i];
       int lcm=nums[i];
       int prod=nums[i];
       if(prod==lcm*gcdVal)len= Math.max(len,1);
        for(int j=i+1;j<nums.length;j++){
            gcdVal=gcd(gcdVal,nums[j]);
            prod=nums[j]*prod;
            lcm = (lcm / gcd(lcm, nums[j])) * nums[j];
            if(prod==lcm*gcdVal){
                len=Math.max(len,j-i+1);
            }

        }
      }
      return len;
    }
}