/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use 2 index to traverse the array.
 * @If it's non-zero then put it in nums.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int real = 0;
        for(int index = 0;index < nums.length;index++){
            if(nums[index] != 0){
                nums[real] = nums[index];
                real++;
            }
        }
        for(;real < nums.length;real++){
            nums[real] = 0;
        }
    }
}
