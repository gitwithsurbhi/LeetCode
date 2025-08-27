class Solution {
    public int countPrimes(int n) {
        boolean []isPrime=new boolean[n+1];
    //    Arrays.fill(isPrime,true);
    for(int i=2;i<n;i++){
        isPrime[i]=true;
    }
       int ans=0; 
       for(int i=2;i<n;i++){
        if(isPrime[i]){
            ans++;
        }
        for(int j=i*2;j<n;j+=i){
            isPrime[j]=false;
        }
       }
       return ans;
    }
}