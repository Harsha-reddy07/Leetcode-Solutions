class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set = new HashSet<>();
       int left = 0;
       int sum = 0;
       int maxSum = 0;
       for(int right=0 ; right<s.length() ; right++){
        char ch = s.charAt(right);
        if(set.contains(ch)){
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
        } 
        else{
            set.add(ch);
        }
        sum = right - left + 1;
        maxSum = Math.max(sum,maxSum);
       }
       return maxSum;
    }
}