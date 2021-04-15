/* COMPLETED
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
*/

public class Symmetric {
    /*Recursive Solution*/
    /* Split tree into two subtrees*/
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    public boolean isMirror(TreeNode t1, TreeNode t2){
        /*If both roots are null -> mirror */
        if(t1 == null  && t2 == null){
            return true;
        }
        /* if one of the roots is empty and the other one is not -> not mirror */
        if(t1 == null || t2 == null){
            return false;
        }
        /* if both roots are same value
           The left subtree of subtree 1 matches right subtree of subtree 2
           The right subtree of subtree 1 matches the left subtree of subtree 2
        */ 
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
