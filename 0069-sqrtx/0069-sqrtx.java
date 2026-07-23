class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int low = 0;
        int high = x/2;
        while(low <= high){
            int mid = low + (high - low)/2;
            long square = (long) mid*mid;
            if(square < x){
                low = mid + 1;
            }
            else if(square > x){
                high = mid - 1;
            }
            else{
                return mid;
            }
        }
        return high;
    }
}