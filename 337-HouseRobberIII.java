/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use recurtion, really slow because of lapping.
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
    public int rob(TreeNode root) {
        if(root == null)
            return 0;
        int result = helper(root);
        return result;
    }
    
    private int helper(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return root.val;
        if(root.left != null && root.right != null){
            int temp1 = root.val + helper(root.left.left) + helper(root.left.right) + helper(root.right.left) + helper(root.right.right);
            int temp2 = helper(root.left) + helper(root.right);
            return Math.max(temp1,temp2);
        }
        if(root.left == null && root.right != null){
            int temp1 = root.val + helper(root.right.left) + helper(root.right.right);
            int temp2 = helper(root.right);
            return Math.max(temp1,temp2);
        }
        if(root.left != null && root.right == null){
            int temp1 = root.val + helper(root.left.left) + helper(root.left.right);
            int temp2 = helper(root.left);
            return Math.max(temp1,temp2);
        }
        return -1;
    }
}
