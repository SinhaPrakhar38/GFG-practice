class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> stack=new Stack<>();
        int idx=0;
        
        while(idx<S.length()){
            stack.push(S.charAt(idx));
            idx++;
        }
        
        StringBuilder sb=new StringBuilder("");
        
        while(!stack.isEmpty()){
            char curr=stack.pop();
            sb.append(curr);
        }
        
        return sb.toString();
    }

}
