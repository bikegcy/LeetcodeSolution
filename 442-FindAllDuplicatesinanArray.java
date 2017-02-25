/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use an array res to store [1...n] once appear let it be 0
 * @If res[i] == 0, add it to result Listi
 * @New algorithm: let nums[nums[i] - 1] = - nums[nums[i] - 1]to mark
 * @If it is positive then it appears twice.
 *
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
*/
public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++){
            int temp = Math.abs(nums[i]) - 1;
            nums[temp] = - nums[temp];
            if(nums[temp] > 0){
                result.add(temp + 1);
            }
        }
        return result;
    }
}



