class Solution {
    public int totalFruit(int[] fruits) {
    //Brute force
      int max=0;
      for(int i=0;i<fruits.length;i++){
        HashSet<Integer>set=new HashSet<>();
        for(int j=i;j<fruits.length;j++){
            set.add(fruits[j]);
            if(set.size()>3)break;
            if(set.size()<=2){
            max=Math.max(max,j-i+1);

            }
        }
      } 
      return max; 
    //Optimsed approach
    /*
    int l=0,r=0,max=0;
    HashMap<Integer,Integer>map=new HashMap<>();
    while(r<fruits.length){
        map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
        if(map.size()>3){
            while(map.size()>3){
                map.put(fruits[l],map.get(fruits[l])--);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
               l++; 
            }
        }
       max=Math.max(max,r-l+1)  ;
       r++; 
    }
    return max;

   */

    }
}