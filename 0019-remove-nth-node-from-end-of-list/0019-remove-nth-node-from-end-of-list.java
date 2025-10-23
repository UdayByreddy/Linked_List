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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        int count = countTheLL(head);
        int removeIndex = count - n + 1;
        if (removeIndex == 1) {
            return head.next;
        }
        ListNode temp = head;
        int pos = 1;
        while (temp != null && temp.next != null) {
            if (pos == removeIndex - 1) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            pos++;
        }
        return head;

    }

    public int countTheLL(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}