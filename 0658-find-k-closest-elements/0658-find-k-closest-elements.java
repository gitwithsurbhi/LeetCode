class Solution {

    static class Helper implements Comparable<Helper>{
     int ele;
     int x;
     public Helper(int ele,int x){
        this.ele=ele;
        this.x=x;
     }
     @Override
     public int compareTo(Helper h2){
       int diff1 = Math.abs(this.ele - x);
            int diff2 = Math.abs(h2.ele - x);

            if (diff1 != diff2) {
                return diff1 - diff2; // smaller difference first
            }
            return this.ele - h2.ele;
    } 
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>res=new ArrayList<>();
        PriorityQueue<Helper>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(new Helper(arr[i],x));
        }
        for(int i=0;i<k;i++){
            res.add(pq.poll().ele);
        }
        Collections.sort(res); 
        return res;
    }
}