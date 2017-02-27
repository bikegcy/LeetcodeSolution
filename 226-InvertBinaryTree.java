/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use recurtion to do it.
 * @Use stack structure(BFS)to avoid the use of recurtion.
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
    /*
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        Invert(root);
        return root;
    }
    private TreeNode Invert(TreeNode root){
        if(root.left != null)
            Invert(root.left);
        if(root.right != null)
            Invert(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
    */
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        Stack<TreeNode> treestack = new Stack<TreeNode>();
        treestack.push(root);
        TreeNode result = root;
        TreeNode temp = root.left;
        while(!treestack.isEmpty()){
            root = treestack.pop();
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            if(root.left != null)
                treestack.push(root.left);
            if(root.right != null)
                treestack.push(root.right);
        }
        return result;
        
    }
}
