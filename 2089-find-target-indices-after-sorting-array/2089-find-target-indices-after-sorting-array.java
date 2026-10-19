class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int count_small = 0;
        int count_equal = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] < target){
                count_small++;
            }
            else if(nums[i] == target){
                count_equal++;
            }
        }
        for(int i = count_small ; i<count_small + count_equal ; i++){
            list.add(i);
        }
       return list;
    }
}