/* COMPLETED
Reverse a singly linked list.
*/

class ReverseLinkedList{

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
     

    public Node reverseList(Node head) {
        Node prev = null;       //prev = current -1
        Node current = head;    //current iterates from head position to tail position [current = 0] 
        Node next = null;       //next = current + 1
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
