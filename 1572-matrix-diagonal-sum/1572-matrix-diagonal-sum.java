class Solution {
    public int diagonalSum(int[][] mat) {
        int total =0 ;
        for(int i=0 ; i<mat.length ; i++){
            total += mat[i][i];
        }
        for(int i=0 ; i<mat.length ; i++){
            total += mat[i][mat.length - 1 - i];
        }
        if(mat.length % 2 ==1){
            total -= mat[mat.length/2][mat.length/2];
        }
        return total;
    }
}