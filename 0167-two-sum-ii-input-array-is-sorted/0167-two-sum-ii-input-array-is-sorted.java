class Solution {
    public int[] twoSum(int[] num, int target) {
     int lp=0,rp=num.length-1;
       while(lp!=rp){
        if(num[lp]+num[rp]==target){
          return new int[]{lp+1,rp+1};
        }
        else if(num[lp]+num[rp]>target){
            rp--;
        }
        else{
            lp++;
        }
       } 
       return new int[]{-1,-1};
    }
}