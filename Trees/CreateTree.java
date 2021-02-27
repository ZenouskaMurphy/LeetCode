/* NOT COMPLETED 
Code for creating binary search tree from scratch*/

public class CreateTree{

    //Creating class for each node in tree
    class Node{
        int data;
        Node left;
        Node right; 
        
        //Assigning data, left node and right node to each node
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Represent root node of tree
    public Node root = null;

    //Method to insert new node into tree
    public void insertNode(int data){
        Node newNode = new Node(data);

        //if there is no root, newNode is now the root
        if(root == null){
            root = newNode;
        }
        // connect current node to the root
        else{
            Node current = root, parent = null;

            while(true){
                // root node = current node = parent 
                parent = current;
            
                // if data value is less than data value of current/root/parent node -> insert node to left of tree
                if(data < current.data){
                    current = current.left;
                    if(current  == null){
                        parent.left = newNode;
                    }
                }
                // if data value is greater than current data value of current/root/parent -> insert node to right of tree
                else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                    }
                }
            }
        }
    }
 //////////////////////////////////////////////////////// OPERATIONS on BST ////////////////////////////////////////////////////////////////   

    public void inOrderTraversal(Node node){
        if(root == null){
            System.out.println("tree is empty");
        }
        else{
            if(node.left != null){
                inOrderTraversal(node.left);
                System.out.println(node.data + " ");
            }
            if(node.right !=null){
                inOrderTraversal(node.right);
                System.out.println(node.data + " ");
            }
        }
    }
    public static void main(String[] args){
        CreateTree bt = new CreateTree();

        bt.insertNode(50);
        bt.insertNode(30);
        bt.insertNode(70);
        bt.insertNode(90);

        
        //display binary tree
        bt.inOrderTraversal(bt.root);
    }
}
