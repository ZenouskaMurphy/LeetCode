/* COMPLETED
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
*/

public class RemoveNthNode {

    //Definition for singly-linked list.
    public class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;


    public Node removeNthFromEnd(Node head, int n) {
        //get length of list [first iteration]
        Node current = head;
        int length = 0;
        while(current != null){
            current = current.next;
            length++; //= 5
        }
        
        //remove n from list [second iteration]
        current = head;
        int i = 0;
        int fromEnd = length -n + 1; //node to remove [4]
        while(current != null){
            i++;
            if(fromEnd == 1){ // if removing the first node
                return head.next;
            }
            if(i == (fromEnd-1)){ //i = node before node to be removed
                current.next = current.next.next; //point node 3 to node 5 for current.next 
            }
            current = current.next; // new current = node 5 
        }
        return head;
    }
}
