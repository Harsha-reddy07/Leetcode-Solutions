class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0 || n < 0 ){
            return false;
        }
        if(n == 1){
            return true;
        }
        int num = n;
     while(num != 1){
        num = num / 2;
        if(num*2 != n){
            return false;
        }
        n = num;
     }  
     return true;
    }
}