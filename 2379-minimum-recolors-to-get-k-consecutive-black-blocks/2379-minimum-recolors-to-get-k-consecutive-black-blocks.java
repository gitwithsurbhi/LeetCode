class Solution {
    public int minimumRecolors(String blocks, int k) {
    int bCount=0;
    int wCount=0;
    int min=0;
    for(int i=0;i<k;i++){
        if(blocks.charAt(i)=='W'){
            wCount++;
        }
        else{
            bCount++;
        }
    }
    min=wCount;
    int i=0,j=k-1; 
    while(j<blocks.length()-1){
     if(blocks.charAt(i)=='W' && wCount >0)wCount--;
     else if(blocks.charAt(i)=='B' && bCount >0)bCount--;
     i++;
     j++;
     if(blocks.charAt(j)=='W' )wCount++;
     else if(blocks.charAt(j)=='B')bCount++;

    min=Math.min(min,wCount);
    }  
    return min;
    }
}