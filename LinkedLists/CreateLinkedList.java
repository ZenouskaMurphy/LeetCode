/* Code for creating linked list from scratch*/

public class CreateLinkedList {

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

    //Method to add node to LinkedList
    public void addNode(int data){
        Node newNode = new Node(data);

        //check LinkedList to see if list is empty, if it is newNode is now the head and tail
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        //if LinkedList is not empty, add newNode to the end of current List (after tail)
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }


    /////////////////////////////////// OPERATIONS on LinkedList    //////////////////////////////////////////////////////////////////////////////////
    
    public int countNodes(){
        int number = 0;
        Node current = head;
        while (current != null){
            number++;
            current = current.next;
        }
        return number;
    }

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
        CreateLinkedList ll = new CreateLinkedList();

        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);

        ll.displayNodes();

        System.out.println("Count of nodes in LinkedList: "  + ll.countNodes());
    }
}