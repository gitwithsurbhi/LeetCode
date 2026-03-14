class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       int capacity=truckSize;
       int maxUnits=0;
       
       Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);

       for(int i=0;i<boxTypes.length;i++){
           if(capacity>=boxTypes[i][0]){
            maxUnits+=boxTypes[i][0]*boxTypes[i][1];
            capacity-=boxTypes[i][0];
           }
           else{
            maxUnits+=(capacity*boxTypes[i][1]);
            capacity=0;
            break;
           }
       }
       return maxUnits;
    }
}