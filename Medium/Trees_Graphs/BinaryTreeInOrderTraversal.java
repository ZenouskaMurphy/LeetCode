/* COMPLETED
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = []
Output: []
*/


public class BinaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nums = inOrder(root, new ArrayList<>());
        return nums;
    }
        
    public List<Integer> inOrder(TreeNode root, ArrayList<Integer> arr){
        if(root == null){
            return arr;
        }
            
        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
        return arr;
    } 
}
