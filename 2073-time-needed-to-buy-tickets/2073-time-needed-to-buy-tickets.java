class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        for(int i=0 ; i<tickets.length ; i++){
            q.offer(i);
        }
        while(tickets[k]>0){
            int person = q.poll();
            
            if(tickets[person] > 0){
                tickets[person]--;
            time++;
                q.offer(person);
            }
            else{
                continue;
            }
        }
        return time;
    }
}