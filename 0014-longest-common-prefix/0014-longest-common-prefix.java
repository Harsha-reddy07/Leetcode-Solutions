class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int min_len = strs[0].length();
        for(int i=0 ; i<strs.length ; i++){
            int length = strs[i].length();
            min_len = Math.min(min_len,length);
        }
        for(int i=0 ; i<min_len ; i++){
            boolean match = true;
            char ch = strs[0].charAt(i);
            for(int j=0 ; j<strs.length ; j++){
            if(strs[j].charAt(i) != ch ){
                match = false ;
                break;
                
            }
            }
            if(match){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}