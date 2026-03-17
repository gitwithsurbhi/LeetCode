class Solution {
    private boolean isVowel(char ch){
        return (ch =='a'|| ch=='e' || ch== 'i' || ch== 'o' || ch== 'u');
    }

    public int maxVowels(String s, int k) {
     int maxCount=0;
     for(int i=0;i<k;i++){
        if(isVowel(s.charAt(i))){
            maxCount++;
        }
     } 
     int l=0;
     int r=k-1;
     int count=maxCount;
     while(r<s.length()-1){
        if(isVowel(s.charAt(l))){
            count--;
        }
        l++;
        r++;
        if(isVowel(s.charAt(r))){
            count++;
        }
        maxCount=Math.max(count,maxCount);
     }  
     return maxCount;
    }
}