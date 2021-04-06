/* COMPLETED 
Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.
*/

public class MiddleLinkedList {
    
    //Definition for singly-linked list.
    public class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;


    public Node middleNode(Node head){
        /*  Create two pointers, slow and fast
            Slow pointer traverses at normal pace
            Fast pointer traverses twice as fast
            Once fast pointer is at end of list, slow pointer is at middle 
        */
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
