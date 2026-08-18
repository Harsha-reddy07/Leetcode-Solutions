class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];
        int pos =  nums.length - 1;;
        while(left <= right){
            int le_ele = nums[left] * nums[left];
            int ri_ele = nums[right] * nums[right];
            if(le_ele > ri_ele){
                res[pos] = le_ele;
                left++;
                pos--;
            }
            else{
                res[pos] = ri_ele;
                right--;
                pos--;
            }
        }
        return res;
    }
}