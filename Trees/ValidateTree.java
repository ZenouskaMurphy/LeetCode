/* COMPLETED
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
*/

class ValidateTree {
    /*Recursive Solution*/
    public boolean validate(TreeNode root, Integer min, Integer max){
        //empty trees are valid BSTs
        if(root == null){
            return true;
        }
        // if node values are outside min and max boundaries, they are not valid BSTs
        if((min != null && root.val <= min) || (max != null && root.val >= max)){
            return false;
        }
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
        
    }
    public boolean isValidBST(TreeNode root){
      return validate(root, null, null);
    }
}