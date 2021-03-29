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
    int depth = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return depth;
        }
        else {
            depth = dfs(root);
            return depth;
        }
    }
    
    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            return Math.max(dfs(root.left), dfs(root.right)) + 1;
        }
    }
}
