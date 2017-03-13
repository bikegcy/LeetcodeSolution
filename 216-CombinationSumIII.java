/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use backtracking and recurtion.
 */
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result,new ArrayList<Integer>(), k, 1, n);
        return result;
    }
    
    private void helper(List<List<Integer>> result, List<Integer> list, int k, int start, int n){
        if(list.size() == k && n == 0){
             List<Integer> sublist = new ArrayList<Integer>(list);
             result.add(sublist);
             return;
        }
        for(int index = start;index < 10;index++){
            list.add(index);
            helper(result, list, k, index + 1, n - index);
            list.remove(list.size() - 1);
        }
    }
}
