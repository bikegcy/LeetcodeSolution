/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First level traverse the tree and record the val.
 * @Then sort the array to find the smallest min.
 * @New algorithm: Use stack and in-order traverse.
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
import java.util.ArrayList;
public class Solution {
    public int getMinimumDifference(TreeNode root) {
        /*
        int min = Integer.MAX_VALUE;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        List<Integer> list = new ArrayList<Integer>();
        while(!queue.isEmpty()){
            root = queue.poll();
            list.add(root.val);
            if(root.left != null)
                queue.add(root.left);
            if(root.right != null)
                queue.add(root.right);
        }
        Integer[] result = new Integer[list.size()];
        result = list.toArray(result);
        Arrays.sort(result);
        for(int i = 0;i < result.length - 1;i++){
            if(result[i + 1] - result[i] < min)
                min = result[i + 1] - result[i];
        }
        return min;
        */
        int min = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int prev = Integer.MAX_VALUE;
        while(!stack.isEmpty() || root !=null){
            if(root != null){
                stack.push(root);
                root = root.left;
            }
            else{
                root = stack.pop();
                if(prev != Integer.MAX_VALUE){
                    min = (root.val - prev) < min? root.val - prev: min;
                }
                else min = min;
                prev = root.val;
                root = root.right;
            }
        }
        return min;
    }
}
