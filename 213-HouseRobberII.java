/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use the rob algo I and change the problen to it.
 */
public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int result = 0;
        result = Math.max(helper(nums,0,nums.length - 2), helper(nums,1,nums.length -1 ));
        return result;
    }
    
    private int helper(int[] nums, int start, int end){
        int prevNo = 0;
        int prevYes = 0;
        for(int i = start;i <= end;i++){
            int temp = prevYes;
            prevYes = prevNo + nums[i];
            prevNo = Math.max(prevNo,temp);
            
        }
        return Math.max(prevNo,prevYes);
    }
}
