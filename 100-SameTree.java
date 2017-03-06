/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use recurtion to judge;
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null && q != null)
            return false;
        if(q == null && p != null)
            return false;
        if(p.val != q.val)
            return false;
        boolean result = true;
        if(p.left != null || q.left != null)
            result = result & isSameTree(p.left,q.left);
        if(p.right != null || q.right != null)
            result = result & isSameTree(p.right,q.right);
        return result;
    }
}
