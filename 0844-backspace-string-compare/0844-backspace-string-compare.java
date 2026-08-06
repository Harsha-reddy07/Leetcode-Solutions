class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> tt = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char chs = s.charAt(i);
            if(chs == '#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(chs);
            }
        }
        for(int j=0 ; j<t.length() ; j++){
            char cht = t.charAt(j);
            if(cht == '#'){
                 if(!tt.isEmpty()){
                    tt.pop();
                }
            }
            else{
                tt.push(cht);
            }
        }
        if(st.size() != tt.size()){
            return false;
        }
        int x = st.size();
        for(int i=0 ; i<x ; i++){
            if(st.peek() != tt.peek()){
                return false;
            }
            else{
                st.pop();
                tt.pop();
            }
        }
        return true;
    }
}