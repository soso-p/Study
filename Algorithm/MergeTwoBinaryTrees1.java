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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) { // 둘 다 null인 것을 체크안해주면 newTree가 생성되고 val의 기본값이 0이라서 0이 반환된다.
            return null;
        }
        TreeNode newTree = new TreeNode();
        
        merge(root1, root2, newTree);
        
        return newTree;
    }
    
    public void merge(TreeNode root1, TreeNode root2, TreeNode newTree) {
        if (root1 != null && root2 != null) { // 둘 다 존재하는 부분일 때 // 더 작은 조건이 먼저 와야함.
            newTree.val = root1.val + root2.val;
            if (root1.left != null || root2.left != null) { // 둘 중 하나라도 왼쪽 자식이 존재한다면.
                newTree.left = new TreeNode();
                merge(root1.left, root2.left, newTree.left);
            }
            
            if (root1.right != null || root2.right != null) { // 둘 중 하나라도 오른쪽 자식이 존재한다면
                newTree.right = new TreeNode();
                merge(root1.right, root2.right, newTree.right);
            }
        }
        else if (root1 != null || root2 != null) {
            if (root1 == null) { // root2만 존재하는 부분일 때
                newTree.val = root2.val;
                if (root2.left != null) { // root2만 존재하는 부분이 더 있으면.
                    newTree.left = new TreeNode();
                    merge(root1, root2.left, newTree.left);
                }
                if (root2.right != null) { // root2만 존재하는 부분이 더 있으면.
                    newTree.right = new TreeNode();
                    merge(root1, root2.right, newTree.right);
                }
            }
            if (root2 == null) { // root1만 존재하는 부분일 때
                newTree.val = root1.val;
                if (root1.left != null) {
                    newTree.left = new TreeNode();
                    merge(root1.left, root2, newTree.left);
                }
                if (root1.right != null) {
                    newTree.right = new TreeNode();
                    merge(root1.right, root2, newTree.right);
                }
            }
        }
    }
}
