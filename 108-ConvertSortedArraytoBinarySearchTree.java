/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use recurtion to construct the tree.
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        TreeNode root = constructBST(nums,0,nums.length - 1);
        return root;
    }
    
    private TreeNode constructBST(int[] nums, int start, int end){
        if(start == end){
            return new TreeNode(nums[start]);
        }
        int middle = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        if(start + 1 == end){
            root.left = null;
            root.right = constructBST(nums,middle + 1,end);
        }
        else{
            root.left = constructBST(nums,start,middle - 1);
            root.right = constructBST(nums,middle + 1,end);
        }
        return root;
    } 
}
