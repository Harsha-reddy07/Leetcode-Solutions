class Solution {
    public int arrangeCoins(int n) {
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            long stairs = (long) mid*(mid+1)/2;
            if(n < stairs){
                high = mid -1;
            }
            else if(n > stairs){
                low = mid + 1;
            }
            else{
                return mid;
            }
        }
        return high;
    }
}