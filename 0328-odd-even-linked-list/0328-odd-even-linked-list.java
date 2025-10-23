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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode odd =head, even = head.next;
        ListNode temp = odd,cur = even;
        while(temp!=null && temp.next!=null && cur!=null && cur.next!=null){
            temp.next = cur.next;
            temp = cur.next;
            cur.next = temp.next;
            cur = temp.next;
        }
        temp.next = even;
        return odd;

        
    }
}