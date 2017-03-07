/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use recurtion
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return result;
        if(root.left != null)
            inorderTraversal(root.left);
        result.add(root.val);
        if(root.right != null)
            inorderTraversal(root.right);
        return result;
    }
}
