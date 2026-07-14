// Last updated: 7/14/2026, 2:00:24 PM
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
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        preorder(root, l);
        return l;
    }

    void preorder(TreeNode root, List<Integer> l) {
        if (root == null) return;
        l.add(root.val);                
        preorder(root.left, l);        
        preorder(root.right, l);       
    }
}
