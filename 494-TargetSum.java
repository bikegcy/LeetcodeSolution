/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First converse the problem to 01 backpack problem(subsum problem).
 */
public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums == null || nums.length == 0)
            return 0;
        int sum = 0;
        for(int element: nums){
            sum += element;
        }
        if(sum < S || (sum + S) % 2 == 1)
            return 0;
        sum = (sum + S) / 2;
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for(int element: nums){
            for(int value = sum;value >= element;value--){
                dp[value] += dp[value - element];
            }
        }
        return dp[sum];
    }
}
