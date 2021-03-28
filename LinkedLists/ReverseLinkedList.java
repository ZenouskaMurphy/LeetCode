/* COMPLETED
Reverse a singly linked list.
*/

class ReverseLinkedList{

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
     

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   //prev = current -1
        ListNode curr = head;   //current iterates from head position to tail position [current = 0] 
        while (curr != null) {
            ListNode nextTemp = curr.next;  //next = current +1
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
