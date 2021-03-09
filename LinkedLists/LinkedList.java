/*COMPLETED
/* Code for creating linked list from scratch*/

public class LinkedList {

//////////////////////////////////// CREATION OF LINKED LIST ////////////////////////////////////////////////////

    //Creating class for each node in a linkedlist 
    class Node{
        int data;
        Node next;

        //Assigning data and next pointer to each node
        public Node(int data){ 
            this.data = data;
            this.next = null; 
        }
    }

    //Represent head node and tail node of LinkedList
    public Node head = null;
    public Node tail = null;

//////////////////////////////////// ADD NODE TO LINKEDLIST ////////////////////////////////////////////////////

    //Method to add node to LinkedList
    public void addNode(int data){
        Node newNode = new Node(data);

        //check LinkedList to see if list is empty, if it is - point head and tail to new node
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        //if LinkedList is not empty,
        else{
            //current tail will now point to newNode
            tail.next = newNode;
            //newNode is now the tail
            tail = newNode;
        }
    }

//////////////////////////////////// COUNT NODES IN LINKEDLIST ////////////////////////////////////////////////////
    
    public int countNodes(){
        int number = 0;
        Node current = head;
        while (current != null){
            number++;
            current = current.next;
        }
        return number;
    }

//////////////////////////////////// DISPLAY NODES IN LINKEDLIST ////////////////////////////////////////////////////

    public void displayNodes(){
     Node current = head;
     if(head == null){
         System.out.println("empty list");
     }   
        System.out.println("Nodes of Single LinkedList: ");
         while(current != null){
            System.out.println(current.data +  " ");
             current = current.next;
         }
         System.out.println();
    }

    public static void main(String[] args){
        //Call class name here
        LinkedList ll = new LinkedList();

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);

        ll.displayNodes();

        System.out.println("Count of nodes in LinkedList: "  + ll.countNodes());
    }
}