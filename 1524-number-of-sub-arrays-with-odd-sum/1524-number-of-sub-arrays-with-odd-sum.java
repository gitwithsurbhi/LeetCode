class Solution {
    public int numOfSubarrays(int[] arr) {
       long count=0;
       long even=0;
       long odd=0; 
    if(arr[0]%2==0)even++;
    else odd++;
    for(int i=1;i<arr.length;i++){
       arr[i]=arr[i-1]+arr[i];
       if(arr[i]%2==0)even++;
       else odd++;
    }
    count=odd*even +odd;
    int mo=1000000007;
    
    return (int)(count%mo);
    }
}