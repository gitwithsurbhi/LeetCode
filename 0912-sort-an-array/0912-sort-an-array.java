class Solution {
    public void mergeSort(int []nums,int st,int ei){
        if(st >= ei)return ;
        int mid=st+(ei-st)/2;
        mergeSort(nums,st,mid);
        mergeSort(nums,mid+1,ei);
        merge(nums,st,mid,ei);
    }
    public void merge(int []nums,int st,int mid,int ei){
        int []temp=new int[ei-st+1];
    int i=st;
    int j=mid+1;
    int k=0;
    while(i<= mid && j<=ei){
        if(nums[i] < nums[j]){
            temp[k++]=nums[i++];
        }
        else{
            temp[k++]=nums[j++];
        }
    }
    while(i<= mid){
        temp[k++]=nums[i++]; 
    }
    while(j<= ei){
         temp[k++]=nums[j++];
    }
    for( k=0,i=st;k<temp.length;k++,i++){
        nums[i]=temp[k];
    }
    }

    public int[] sortArray(int[] nums) {
     mergeSort(nums,0,nums.length-1);
     return nums;
    }
}