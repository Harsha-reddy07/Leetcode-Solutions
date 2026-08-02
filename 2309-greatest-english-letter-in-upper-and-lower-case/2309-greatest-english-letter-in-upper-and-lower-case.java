class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            set.add(ch);
        }
        
        for(char j = 'Z' ; j>= 'A' ; j--){
            if(set.contains(j) && set.contains(Character.toLowerCase(j))){
                return Character.toString(j);
            }
        }
        return "";
    }
}