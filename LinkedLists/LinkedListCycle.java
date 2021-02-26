/* COMPLETED
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
*/

/**
 // Definition for singly-linked list.
 public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.HashSet;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        /*Hashing Solution*/
        //create hash table
        //iterate through list and add node addresses to hash table
        //do test to see if address of current node is already in HashSet.
        //if so = True [Proves there is a cycle]
        //if not = False

        HashSet<ListNode> hashSet = new HashSet<ListNode>();

        ListNode current = head;
        while(current != null){
            if(hashSet.contains(current)){
                return true;
            }
            hashSet.add(current);
            current = current.next;
        }
        return false;   
    } 
}
