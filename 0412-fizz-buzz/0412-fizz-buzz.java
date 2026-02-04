class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String>ans=new ArrayList<>();
        String a="";
        for(int i=1;i<=n;i++){
            if(i%3==0){
                if(i%5==0){
                    ans.add("FizzBuzz");
                }
                else{
                    ans.add("Fizz");
                }
            }
            else if(i%5==0){
                ans.add("Buzz");
            }
            else{
                
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }
}