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
    public ListNode deleteMiddle(ListNode head) {
        

        if(head.next==null){
            return null;
        }
        ListNode fast = head,slow = head;
        fast = fast.next.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
        /*int size = find(head)/2;
        if(size<1){
            return null;
        }
        int i=0;
        ListNode cur = head;
        while(cur!=null){
            if(i+1==size&&cur.next!=null){
                cur.next = cur.next.next;
                break;
            }
           
            else{
                i++;
                cur = cur.next;
            }
        }
        return head;       
    }
    public int find(ListNode cur){
        int c =0;
        while(cur!=null){
            c++;
            cur = cur.next;
        }
        return c;*/
    }
}