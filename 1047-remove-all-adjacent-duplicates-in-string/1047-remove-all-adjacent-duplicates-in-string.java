class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
        if(stack.isEmpty()){
            stack.push(ch);
        }
        else if(ch == stack.peek()){
            stack.pop();
        }
        else{
            stack.push(ch);
        }
    }
    while(!stack.isEmpty()){
        sb.append(stack.pop());
    }
    return sb.reverse().toString();
}
}