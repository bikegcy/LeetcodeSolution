/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use bit manipulation.
 * @Time complexcity: 32 * O(n)
 */
public class Solution {
    public int totalHammingDistance(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return 0;
        int result = 0;
        /*
        for(int index = 0;index < nums.length - 1;index++){
            for(int next = index + 1;next < nums.length;next++){
                comp = nums[index] ^ nums[next];
                while(comp != 0){
                    comp &= (comp - 1);
                    result++;
                }
            }
        }
        */
        for(int bitposi = 0;bitposi < 32;bitposi++){
            int bitcount = 0;
            for(int index = 0;index < nums.length;index++){
                bitcount += (nums[index] >> bitposi) & 1;
            }
            result += bitcount * (nums.length - bitcount);
        }
        return result;
    }
}
