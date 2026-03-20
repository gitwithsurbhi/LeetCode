class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=Integer.toString(num);
        int ans=0;
        for(int i=0;i<=s.length()-k;i++){
             String sub=s.substring(i,i+k);
             int val=Integer.parseInt(sub);
             if(val!=0 && num%val==0){
                ans++;
             }
        }
        return ans;
    }
}