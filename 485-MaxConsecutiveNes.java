/*
 * @ Chaoyu GAo
 * @ cgao15@ucsc.edu
 * @ LeetcodeSolution
 * @ Use temp to store current length of resective 1,
 * @ Use result to return the true value.
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int index = 0,temp = 0;
        while(index < nums.length){
            if(nums[index] == 1){
                temp++;
            }
            if(nums[index] == 0){
                if(result < temp)
                    result = temp;
                temp = 0;
            }
            index++;
        }
        if(result < temp)
            result = temp;
        return result;
    }
}
