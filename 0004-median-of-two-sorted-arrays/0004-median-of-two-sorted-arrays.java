class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length;
       int n=nums2.length;
       int []merge=new int[m+n];
       int i=0,j=0,k=0;
       while(i<m && j<n){
        if(nums1[i]<nums2[j]){
            merge[k++]=nums1[i++];
        }else{
            merge[k++]=nums2[j++];
        }
       } 
       while(i<m){
         merge[k++]=nums1[i++];
       }
       while(j<n){
         merge[k++]=nums2[j++];
       }

       int mid=m+n;
       if(mid%2!=0){
        int  median= (mid+1)/2;
          return merge[median-1];
       }
       else{
         int m1= mid/2;
         double result=(double)(merge[m1-1] + merge[m1])/2;
          return result;
       }
    }
}