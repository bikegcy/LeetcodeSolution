/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use Post Order Traverse to calculate all the subsums and record the biggest one.
 * @Use hashmap to record the frequency of each sum.
 * @If the frequency is equal to the biggest,insert.
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
    int max = Integer.MIN_VALUE;
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer,Integer> SumMap = new HashMap<Integer,Integer>();
        if(root == null)
            return new int[0];
        PostOrder(root,SumMap);
        int times = 0;
        for(Map.Entry<Integer,Integer> entry: SumMap.entrySet()){
            if(entry.getValue() == max)
                result.add(entry.getKey());
        }
        int[] res = new int[result.size()];
        for(int i = 0;i < result.size();i++){
            res[i] = result.get(i);
        }
        return res;
    }
    
    private int PostOrder(TreeNode root, Map<Integer,Integer> map){
        if(root == null)
            return 0;
        int sum = 0;
        sum = PostOrder(root.left,map) + PostOrder(root.right,map) + root.val;
        map.put(sum,map.getOrDefault(sum,0) + 1);
        if(map.get(sum) > max)
            max = map.get(sum);
        return sum;
    }
}
