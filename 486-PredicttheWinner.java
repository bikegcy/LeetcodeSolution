/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use recurtion. DP.
 */
public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return helper(nums,0,nums.length - 1,new int[nums.length][nums.length]) >= 0;
    }
    
    private int helper(int[] nums, int front, int end, int[][] m){
        if(front == end){
            m[front][end] = nums[end];
        }
        else{
            m[front][end] = Math.max(nums[front] - helper(nums,front + 1,end,m),nums[end] - helper(nums,front,end - 1,m));
        }
        return m[front][end];
    } 
}
