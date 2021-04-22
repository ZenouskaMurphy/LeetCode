/* COMPLETED
Given the root of a binary search tree, and an integer k, return the kth (1-indexed) smallest element in the tree.

Example 1:
Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:
Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
*/

class KthSmallestElement{
    /*  Perform an inorder traversal of BST and store new order in arraylist
        Return k - 1 element in new arraylist
    */
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = inOrder(root, new ArrayList<>());
        return nums.get(k-1); 
    }

    public List<Integer> inOrder(TreeNode root, List<Integer> arr){
        if(root == null){
            return arr;
        }
        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
        return arr;
    }
}