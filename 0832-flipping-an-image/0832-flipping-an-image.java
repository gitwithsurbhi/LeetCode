class Solution {
   
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        //reverse
      for(int i=0;i<image.length;i++){
        int st=0,e=n-1;
        while(st<=e){
            int temp=image[i][st];
          image[i][st]=image[i][e];
          image[i][e]=temp;
          
          image[i][e]=image[i][e]==0?1:0;
          if(st!=e){
           image[i][st]=image[i][st]==0?1:0;
          }
          
            st++;
            e--;  
        }
      }
     return image;
    }
}