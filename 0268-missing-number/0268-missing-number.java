class Solution {
    public int missingNumber(int[] nums) {
        long n=nums.length;
        long sum = n*(n+1)/2;
        long arr_total = 0;
        for(int i=0;i<n;i++){
            arr_total+=nums[i];
        }
        long missing = sum - arr_total;
        return (int) missing;
    }
}