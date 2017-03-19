/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use recurtion.
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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int include = 0;
        int exclude = 0;
        include = depth(root.left) + depth(root.right) + 1;
        exclude = Math.max(diameterOfBinaryTree(root.left) + 1, diameterOfBinaryTree(root.right) + 1);
        return Math.max(include,exclude) - 1;
    }
    
    private int depth(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }
}
