class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int j = 26;
        for(char i = 'a' ; i <= 'z' ; i++){
            map.put(i,j);
            j--;
        }
        int sum = 0;
        for(int i=0 ; i<s.length() ; i++){
            sum += (i+1)*map.get(s.charAt(i));
        }
        return sum ;
    }
}