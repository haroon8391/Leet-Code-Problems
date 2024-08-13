/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null; // Base case: if the tree is empty
        }
        
        if (key < root.val) {
            root.left = deleteNode(root.left, key); // Key is in the left subtree
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key); // Key is in the right subtree
        } else {
            // Node to be deleted is found
            
            // Case 1: Node has no children (leaf node)
            if (root.left == null && root.right == null) {
                return null; // Remove the leaf node
            }
            
            // Case 2: Node has only one child
            if (root.left == null) {
                return root.right; // Replace node with its right child
            } else if (root.right == null) {
                return root.left; // Replace node with its left child
            }
            
            // Case 3: Node has two children
            // Find the smallest value in the right subtree (in-order successor)
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val; // Replace the value of the node with the in-order successor's value
            root.right = deleteNode(root.right, minNode.val); // Delete the in-order successor
        }
        
        return root;
    }
    
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left; // Go to the leftmost node
        }
        return node;
    }
}