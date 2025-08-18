class Solution {
    private static int partition(int []arr,int first,int last){
        int pivot=arr[last];
        int i=first-1;
        for(int j=first;j<last;j++){
            if(arr[j]>pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[last];
        arr[last]=temp;
        return i+1;
    }
    private static int quickSort(int []arr,int first,int last,int k){
       if(first<=last){
        int pos=partition(arr,first,last);
        int count=pos-first+1;
        if(count==k){
            return arr[pos];
        }
        else if(count > k){
          return  quickSort(arr,first,pos-1,k);
        }
        else{
          return  quickSort(arr,pos+1,last,k-count);
        }
       }
       return -1; 
    }
    public int findKthLargest(int[] arr, int k) {
       
     return  quickSort(arr,0,arr.length-1,k);
       
    }
}
