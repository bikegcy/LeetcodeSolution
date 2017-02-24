/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use an array res to store [1...n] once appear let it be 0
 * @If res[i] == 0, add it to result List
 */
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int Length  = nums.length;
        List<Integer> result = new ArrayList<Integer>();
        int[] res = new int[Length];
        for(int i = 0;i < Length;i++){
            res[i] = i + 1;
        }
        for(int i = 0;i < Length;i++){
            if(nums[i] == res[nums[i] - 1]){
                res[nums[i] - 1] = 0;
                continue;
            }
            if(res[nums[i] - 1] == 0){
                result.add(nums[i]);
            }
        }
        return result;
    }
}
