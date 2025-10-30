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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        ListNode ans = head;
        int i=0;
        while(ans!=null){
            ans.val = arr.get(i++);
            ans = ans.next;
        }
        return head;
        
    }
}