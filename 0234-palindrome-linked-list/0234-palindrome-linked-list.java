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
    public boolean isPalindrome(ListNode head) {
        int length =0;
        ListNode prev = head;
        while(prev!=null){
            length++;
            prev = prev.next;
        }
       
        int[] arr = new int[length];
        ListNode cur = head;
        int j =0;
        while(cur!=null){
           arr[j++] = cur.val;
            cur = cur.next;
        }
        return find(arr);
        
    }
    public static boolean find(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}