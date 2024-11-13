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
    public ListNode middleNode(ListNode head) {
        ListNode fastpoi=head;
        ListNode slowpoi=head;
        while(fastpoi!=null && fastpoi.next!=null){
            slowpoi=slowpoi.next;
            fastpoi=fastpoi.next.next;

        }
        return slowpoi;
        
    }
}