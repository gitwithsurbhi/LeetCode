class Solution {
    public int minimumDeletions(String s) {
        int aCount=0;
        for(char c:s.toCharArray()){
         if(c=='a')aCount++;
        }
        if(aCount==0)return 0;
        int result=s.length();
        int bCount=0;
        for(char c:s.toCharArray()){
            if(c=='a')aCount--;
            else
              bCount++;
            result=Math.min(result,aCount+bCount);

        }
        return result;
    }
}