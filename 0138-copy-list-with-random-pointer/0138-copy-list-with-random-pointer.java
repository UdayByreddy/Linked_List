/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Node temp = head;
        while(temp!=null){
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = temp.next.next;

        }
        Node temp1 = head;
        while(temp1!=null){
            Node copy = temp1.next;
            if(temp1.random!=null){
                copy.random = temp1.random.next;
            }
            else{
                copy.random = null;
            }
            temp1 = temp1.next.next;
        }
        Node dummy = new Node(-1);
        Node res = dummy;
        Node temp2 = head;
        while(temp2!=null){
            res.next = temp2.next;
            res = res.next;
            temp2.next = temp2.next.next;
            temp2 = temp2.next;
        }
        return dummy.next;
    }
}