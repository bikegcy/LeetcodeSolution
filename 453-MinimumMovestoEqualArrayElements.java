/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First sort the array.
 * @Difine the manipulation,assert: use numofsame * (nums[i] - nums[i - 1])
 * @times of manipulaiton to make sure one more number is the biggest same.
 * @New much faster algorithm:
 * @To add 1 for n - 1 is the same of minus one for certain number.
 * @Hence find the smallest number and result = sum - min * n.
 */
public class Solution {
    public int minMoves(int[] nums) {
        /*
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
        */
        int result = 0,sum = 0,min = Integer.MAX_VALUE;
        for(int element:nums){
            if(element < min)
                min = element;
            sum += element;
        }
        result = sum - min * nums.length;
        return result;
    }
}
