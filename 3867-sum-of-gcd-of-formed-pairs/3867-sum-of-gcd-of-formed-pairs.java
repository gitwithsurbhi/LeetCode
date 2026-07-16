class Solution {
    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
     int []prefixGcd=new int[n];
     int mx=nums[0];
     for(int i=0;i<n;i++){
      mx=  Math.max(mx,nums[i]);
        prefixGcd[i]=gcd(mx,nums[i]);
     }   
     Arrays.sort(prefixGcd);
     long sum=0;
     for(int i=0;i<n/2;i++){
        sum+=gcd(prefixGcd[i],prefixGcd[n-i-1]);
     }
     return sum;
    }
}