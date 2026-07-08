/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next !=null){
            slow=slow.next;
            fast = fast.next.next;
        } 
        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

    ListNode firstHalfEnd = findMiddle(head);
    ListNode secondHalfStart = reverse(firstHalfEnd.next);
    ListNode firstHalfStart = head;
    while(secondHalfStart != null){
        if(secondHalfStart.val != firstHalfStart.val){
            return false;
        }
        secondHalfStart = secondHalfStart.next;
        firstHalfStart = firstHalfStart.next;
    }
        return true;
    }
}