class Solution {
    public boolean isPerfectSquare(int num) {
        int lo=1,hi=num;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long sq=(long)mid*mid;
            if(sq==num)return true;
            if(sq>num){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return false;
    }
}