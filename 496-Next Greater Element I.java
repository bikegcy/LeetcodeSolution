/*
 * @ Chaoyu Gao
 * @ cgao15@ucsc.edu
 * @ LeetCodeSolution
 * @ Use 2 loops
 */
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
         int[] result = new int[findNums.length];
         int index = 0;
         for(int count1 = 0;count1 < findNums.length;count1++){
             for(int count2 = 0;count2 < nums.length;count2++){
                 if(nums[count2] == findNums[count1]){
                     int count = count2;
                     while(count < nums.length){
                         if(findNums[count1] < nums[count]){
                             result[count1] = nums[count];
                             break;
                         }
                         count++;
                     }//find the next greater number
                     if(count == nums.length)
                        result[count1] = -1;
                     continue;
                 }
             }
         }
         return result;
    }
}
