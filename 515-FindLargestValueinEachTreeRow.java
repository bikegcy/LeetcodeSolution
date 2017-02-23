/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use two queues to implement.
 * @For each time, each queue puts the largest value.
 * @some values : Integer.MAX_VALUE/Integer.MIN_VALUE
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        queue1.add(root);
        
        while(!queue1.isEmpty() || !queue2.isEmpty()){
            if(queue2.isEmpty() && !queue1.isEmpty()){
                int max = Integer.MIN_VALUE;
                while(!queue1.isEmpty()){
                    root = queue1.poll();
                    if(max < root.val)
                        max = root.val;
                    if(root.left != null)
                        queue2.add(root.left);
                    if(root.right != null)
                        queue2.add(root.right);
                }
                result.add(max);
            }//if queue2 is empty
            if(queue1.isEmpty() && !queue2.isEmpty()){
                int max = Integer.MIN_VALUE;
                while(!queue2.isEmpty()){
                    root = queue2.poll();
                    if(max < root.val)
                        max = root.val;
                    if(root.left != null)
                        queue1.add(root.left);
                    if(root.right != null)
                        queue1.add(root.right);
                }
                result.add(max);
            }//if queue1 is empty
        }//end of while
        return result;
    }
}
