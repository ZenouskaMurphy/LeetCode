/* NOT COMPLETED 
Code for creating binary search tree from scratch*/

public class CreateTree{

    class Node{
        int data;
        Node left;
        Node right; 
    
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    public void insert(int data){
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
        }
        else{
            Node current = root, parent = null;
        }

        while(true){
            if(data < current){
                current = current.left;
            }
        }
    }
    
}
