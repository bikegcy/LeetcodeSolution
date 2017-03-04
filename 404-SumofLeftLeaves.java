/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use level traverse to traverse the tree.
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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int result = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            if(root.left != null){
                queue.add(root.left);
                if(root.left.left == null && root.left.right == null)
                result += root.left.val;
            }
            if(root.right != null)
                queue.add(root.right);
        }
        return result;
    }
}
