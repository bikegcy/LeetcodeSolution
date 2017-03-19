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
        int[] result = new int[2];
        result = helper2(root);
        //int result = helper(root);
        return Math.max(result[0],result[1]);
    }
    
    private int[] helper2(TreeNode root){
        if(root == null)
            return new int[2];
        int[] left = helper2(root.left);
        int[] right = helper2(root.right);
        int[] result = new int[2];
        result[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        result[1] = root.val + left[0] + right[0];
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
