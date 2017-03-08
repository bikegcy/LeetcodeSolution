/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Backpack problem.
 * @V[i][j] == max{V[i-1][j],V[i-1][j - w[i]]}
 */
public class Solution {
    public boolean canPartition(int[] nums) {
        if(nums == null || nums.length == 0)
            return false;
        int sum = 0;
        for(int element: nums){
            sum += element;
        }
        if(sum % 2 == 1)
            return false;
        sum = sum / 2;
        boolean[] dp = new boolean[sum + 1];
        Arrays.fill(dp,false);
        dp[0] = true;
        for(int element: nums){
            for(int index = sum;index > 0;index--){
                if(index >= element){
                    dp[index] = (dp[index] || dp[index - element]);
                }
            }
        }
        return dp[sum];
    }
}
