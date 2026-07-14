class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int left_sum = 0;
        int right_sum = total;
        for(int i=0;i<nums.length;i++){
            right_sum -= nums[i];
            ans[i] = Math.abs(left_sum - right_sum);
            left_sum+=nums[i];
        }
        return ans;
    }
}