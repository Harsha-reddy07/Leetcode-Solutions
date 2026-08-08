class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int low = 0;
        int high = nums.length - 1;
        int i=0;
        boolean found = false;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
               arr[i] = mid;
               found = true;
               high = mid - 1;
            }
        }
        if(!found){
            return new int[]{-1,-1};
        }
        i++;
        low = 0;
        high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else {
               arr[i] = mid;
               low = mid + 1;
            }
        }
        return arr;
    }
}