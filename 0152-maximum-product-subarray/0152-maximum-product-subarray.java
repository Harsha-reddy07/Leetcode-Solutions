class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int ans = nums[0];
        for(int i=1 ; i< nums.length ; i++){
           int prevMin = min;
           int prevMax = max;
           min = Math.min(nums[i],Math.min(prevMin*nums[i],prevMax*nums[i]));
           max = Math.max(nums[i],Math.max(prevMax*nums[i],prevMin*nums[i]));
           ans = Math.max(ans,max);
        }
        return ans;
    }
}