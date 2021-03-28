/* COMPLETED
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
*/

public class SortedArrayToBST{

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        return createTree(nums, 0, nums.length-1);
    }
    
    public TreeNode createTree(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        /* Get middle element of array and make it root node of tree*/
        int middle = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        
        /* elements to left of middle = left tree*/
        /* elements to right of middle = right tree*/
        /* iterate recursively*/
        root.left = createTree(nums, start, middle -1);
        root.right = createTree(nums, middle + 1, end);
        
        return root;    
    } 
}
