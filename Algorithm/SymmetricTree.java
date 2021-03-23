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
    ArrayList<Integer> leftValue = new ArrayList<Integer>();
    ArrayList<Integer> rightValue = new ArrayList<Integer>();
    
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        else if (root.left == null && root.right == null) // 양쪽 다 없으면 대칭
            return true;
        else if (root.left != null && root.right != null) {
            // 왼쪽 오른쪽 대칭이면 왼쪽은 왼쪽 탐색한 순서랑 오른쪽은 오른쪽 탐색한 순서가 같게 나와야됨.
            leftSearch(root.left); // 왼쪽 자식은 왼쪽 전위 순회
            rightSearch(root.right); // 오른쪽 자식은 오른쪽 전위 순회
            if (leftValue.size() == rightValue.size()) {
                for (int i=0;i<leftValue.size();i++) {
                    if (leftValue.get(i) != rightValue.get(i)) { // 대칭되는 위치의 노드의 값이 다르면 대칭이 아님.
                        return false;
                    }
                }
                return true;
            }
            else { // 양 쬭의 노드의 수가 다르면 대칭이 아님.
                return false;
            }
        }
        else { // 한 쪽만 없으면 대칭 아님.
            return false;
        }
    }
    
    void leftSearch(TreeNode root) {
        if (root != null) {
            leftValue.add(root.val);
            leftSearch(root.left); // 왼쪽 먼저 탐색해야됨.
            leftSearch(root.right);
        }
        else {
            leftValue.add(null);
        }
    }
    
    void rightSearch(TreeNode root) {
        if (root != null) {
            rightValue.add(root.val);
            rightSearch(root.right); // 왼쪽탐색에선 왼쪽 먼저 탐색하므로 오른쪽 탐색에선 오른쪽 먼저 탐색해야됨.
            rightSearch(root.left);
        }
        else {
            rightValue.add(null);
        }
    }
}
