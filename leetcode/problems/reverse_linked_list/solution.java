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
    public ListNode reverseList(ListNode head) {
        return recursiveReverseList(head, null);
    }
    public ListNode recursiveReverseList(ListNode head, ListNode prev){
        if(head == null) return prev;

        ListNode next = head.next;
        head.next = prev;
        return recursiveReverseList(next, head);
    }
}