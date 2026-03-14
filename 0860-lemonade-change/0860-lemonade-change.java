class Solution {
    public boolean lemonadeChange(int[] bills) {
     int []freq=new int[3];
     for(int i=0;i<bills.length;i++){
        if(bills[i]==5){
            freq[0]++;
        }
        else if(bills[i]==10){
            freq[1]++;
            if(freq[0]>0){
                freq[0]--;
            }
            else{
                return false;
            }    
        }
        else{
            freq[2]++;
            if(freq[0]>0 && freq[1]>0){
                freq[0]--;
                freq[1]--;
            }
            else if(freq[0]>2){
                freq[0]-=3;
            }
            else{
                return false;
            }
        }

     }  
     return true; 
    }
}