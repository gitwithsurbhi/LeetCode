class Solution {
    public int maximum69Number (int num) {
        int n=(int)Math.log10(num)+1;
        int []nums=new int[n];
        for(int i=n-1;i>=0;i--){
             nums[i]=num%10;
             num/=10;
        }

        for(int i=0;i<n;i++){
            if(nums[i]==6){
                nums[i]=9;
                break;
            }
        }
        String combined = Arrays.stream(nums)
                        .mapToObj(String::valueOf)
                        .reduce("", (a, b) -> a + b);
int result = Integer.parseInt(combined);
return result;
    }
}