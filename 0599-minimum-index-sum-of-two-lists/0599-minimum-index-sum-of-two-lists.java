class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>map1=new HashMap<>();
        HashMap<String,Integer>map2=new HashMap<>();
        for(int i=0;i<list1.length;i++){
               
               map1.put(list1[i],i);
        }
         for(int i=0;i<list2.length;i++){
             
               map2.put(list2[i],i);

        }
        HashMap<String,Integer>map3=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            String s=list1[i];
              if(map1.containsKey(s) && map2.containsKey(s)){
                
                int x=map1.get(s)+map2.get(s);
                map3.put(s,x);
                min=Math.min(x,min);
              }
        }

        ArrayList<String> str=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            if(map3.containsKey(list1[i]) && map3.get(list1[i])==min){
                str.add(list1[i]);
            }
        }
       String[] arr = str.toArray(new String[0]);
       return arr;
    }
}