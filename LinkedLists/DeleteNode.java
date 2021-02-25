/*
Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.

It is guaranteed that the node to be deleted is not a tail node in the list.
*/

/**
 // Definition for singly-linked list.
 public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class DeleteNode{
    public void deleteNode(ListNode node) {
        //get length of list [first iteration]
        ListNode current = head;
        int length = 0;
        while(current != null){
            current = current.next;
            length++;
        }
        
        //remove n from list [second iteration]
        current = head;
        int i = 0;
        int fromEnd = length -n + 1; // node to remove
        while(current != null){
            i++;
            if(i == (fromEnd-1)){ //if i = node before node to remove 
                current.next = current.next.next; //point node 3 to node 5 for current.next 
            }
            current = current.next; //current node will then be node 5 for next iteration 
        }
        return head;
    }
}