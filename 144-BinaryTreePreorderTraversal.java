/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use recurtion,stack and faster stack.
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
    //List<Integer> result = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        /*
        /* Use recurtion
        if(root == null)
            return result;
        result.add(root.val);
        if(root.left != null){
            preorderTraversal(root.left);
        }
        if(root.right != null){
            preorderTraversal(root.right);
        }
        return result;
        */
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        /* 
        /* Use stack
        if(root == null)
            return result;
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            result.add(root.val);
            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        */
        //Less push and pop for stack,faster.
        while(root != null){
            result.add(root.val);
            if(root.right != null){
                stack.push(root.right);
            }
            root = root.left;
            if(root == null && !stack.isEmpty())
                root = stack.pop();
        }
        return result;
    }
}
