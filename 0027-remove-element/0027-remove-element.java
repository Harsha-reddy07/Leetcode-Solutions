class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != val){
                {
                    int temp=nums[left];
                    nums[left]=nums[j];
                    nums[j]=temp;
                    left++;
                }
            }
        }
        return left;
    }
}