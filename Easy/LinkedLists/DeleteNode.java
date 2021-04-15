/* COMPLETED
Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.

It is guaranteed that the node to be deleted is not a tail node in the list.
*/


 // Definition for singly-linked list.
    class Node{
        int data;
        Node next;
      
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
 

    class DeleteNode{
        public void deleteNode(Node node) {
            node.data = node.next.data;
            node.next = node.next.next;  
        }
    }