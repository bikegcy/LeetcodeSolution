/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First sort the array.
 * @Difine the manipulation,assert: use numofsame * (nums[i] - nums[i - 1])
 * @times of manipulaiton to make sure one more number is the biggest same.
 */
public class Solution {
    public int minMoves(int[] nums) {
        int result = 0,numofsame = 1;
        int numlength = nums.length;
        int index = numlength - 1;
        Arrays.sort(nums);
        while(index > 0){
            while(index > 0 && nums[index] == nums[index - 1]){
                numofsame++;
                index--;
            }
            if(index > 0)
                result += numofsame * (nums[index] - nums[index - 1]);
            index--;
            numofsame++;
        }
        return result;
    }
}
