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
        if (head == null || head.next == null) {
        return head;
    }
    ListNode odd = head;
    ListNode even = head.next;
    ListNode oddest = odd;
    ListNode evest = even;
    while(even!=null&&even.next!=null){
        odd.next = even.next;
        odd = odd.next;
        even.next = odd.next;
        even = even.next;
        
    }
    odd.next = evest;
    return oddest;

   /* ListNode odd = new ListNode();
    ListNode even = new ListNode();
    ListNode oddHead = odd;
    ListNode evenHead = even;
    ListNode cur = head;
    boolean isOdd = true;

    while (cur != null) {
        if (isOdd) {
            odd.next = new ListNode(cur.val);
            odd = odd.next;
        } else {
            even.next = new ListNode(cur.val);
            even = even.next;
        }
        isOdd = !isOdd;
        cur = cur.next;
    }

    odd.next = evenHead.next;

    return oddHead.next;*/
    }
}