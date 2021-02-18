/* 
Reverse a singly linked list.
*/

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
class ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   //prev = current -1
        ListNode curr = head;   //current iterates from head position to tail position [current=0] 
        while (curr != null) {
            ListNode nextTemp = curr.next;  //next = current +1
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
