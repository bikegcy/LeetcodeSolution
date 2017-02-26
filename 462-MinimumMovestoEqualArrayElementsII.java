/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSoluition
 * @First sort the array, then find the medium one to calculate.
 */
public class Solution {
    public int minMoves2(int[] nums) {
        /*
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int result = 0;
        int index = nums.length / 2;
        if(nums.length % 2 == 1){
            for(int i:nums){
                result += Math.abs(i - nums[index]);
            }
            return result;
        }
        else{
            int result2 = 0;
            for(int i:nums){
                result += Math.abs(i - nums[index]);
                result2 += Math.abs(i - nums[index - 1]);
            }
            result = result > result2 ? result: result2;
            return result;
        }
        */
        Arrays.sort(nums);
        int front = 0, end = nums.length - 1;
        int result = 0;
        while(front < end){
            result += nums[end--] - nums[front++];
        }
        return result;
    }
}
