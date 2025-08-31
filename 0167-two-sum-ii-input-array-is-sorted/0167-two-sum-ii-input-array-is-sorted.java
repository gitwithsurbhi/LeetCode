class Solution {
    public int[] twoSum(int[] num, int target) {
      int []ans=new int[2];
       int lp=0,rp=num.length-1;
       while(lp!=rp){
        if(num[lp]+num[rp]==target){
            ans[0]=lp+1;
            ans[1]=rp+1;
            break;
        }
        else if(num[lp]+num[rp]>target){
            rp--;
        }
        else{
            lp++;
        }
       } 
       return ans;
    }
}