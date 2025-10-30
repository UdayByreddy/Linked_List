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
        ListNode cur = head;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
   
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next==null){
            return head;
        }
       
       int length = 1;
       ListNode cur = head;
       while(cur.next!=null){
        length++;
        cur = cur.next;

       }
       k = k%length;
       if(k==0) return head;
       ListNode prev = reverse(head);
       int size=1;
       ListNode temp = prev;
       while(size!=k){
        temp = temp.next;
        size++;
       }
       if(temp==null) return prev;
       ListNode second = temp.next;
       temp.next = null;

       ListNode ans1 = reverse(prev);
       ListNode ans2 = reverse(second);
       ListNode temp2 = ans1;
       while(temp2.next!=null){
        temp2 = temp2.next;
       }
       temp2.next = ans2;
       return ans1;

        
    }
}