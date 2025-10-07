class Solution {
   
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack<>();
        for(String token :tokens){
           switch(token){
            case "+":
            s.push(s.pop()+s.pop());
            break;

            case "-":
            int v1=s.pop();
            int v2=s.pop();
            s.push(v2-v1);
            break;

            case "*":
            s.push(s.pop()*s.pop());
            break;

            case "/":
            int div1=s.pop();
            int div2=s.pop();
            s.push(div2/div1);
            break;

            default:
            s.push(Integer.parseInt(token));
           } 

        }
        return s.pop();
    }
    
}