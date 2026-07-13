class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1 ; i<=9 ; i++){
            int num = i;
            int next_digit = i+1;
            while(next_digit <= 9){
                num = num*10+next_digit;
                if(num >= low && num<=high){
                    list.add(num);
                }
                if(num > high){
                    break;
                }
                next_digit++;
            }
        }
       Collections.sort(list);
       return list;
    }
}