/* COMPLETED
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/

/**
 // Definition for singly-linked list.
 public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists{
    /*Recursive Solution*/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        // if l1 < l2, add l1 to list. Next comparison is next l1 value vs l2 value used here
        if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        // if l2 < l1, add l2 to list. Next comparison is l1 value used here vs next l2 value
        else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
