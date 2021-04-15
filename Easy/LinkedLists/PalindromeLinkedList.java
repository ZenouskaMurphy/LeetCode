/*COMPLETED
Given a singly linked list, determine if it is a palindrome.

Input: 1->2->2->1
Output: true

Input: 1->2
Output: false
*/


/**
 // Definition for singly-linked list.
 public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        /*Stack Solution*/
        //create new stack
        //iterate through linkedlist for first time and push each element to new stack
        //iterate through linkedlist for second time and start with comparing l[0] with popped element of stack l[n]
        //if these are identical the whole way through = true
        //else = false

        Stack<Integer> stack = new Stack<Integer>();

        //first iteration to push to stack
        ListNode current = head;
        while(current != null){
            stack.push(current.val);
            current = current.next;
        }
        // second iteration to compare 
        current = head;
        while(current != null){
            int pop = stack.pop();
            if(current.val != pop){
                return false;
            }
            current = current.next;
        }
        return true;
    }   
}
