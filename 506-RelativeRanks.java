/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @First copy the array,then sort the array.
 * @For each score find its position and get it into result.
 */
public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        int[] temp = new int[nums.length];
        System.arraycopy(nums,0,temp,0,nums.length);
        Arrays.sort(temp);
        int rank = 1;
        for(int index = 0;index < nums.length;index++){
            rank = nums.length - Arrays.binarySearch(temp,nums[index]);
            switch(rank){
                case 1:{
                    result[index] = "Gold Medal";
                    break;
                }
                case 2:{
                    result[index] = "Silver Medal";
                    break;
                }
                case 3:{
                    result[index] = "Bronze Medal";
                    break;
                }
                default: result[index] = Integer.toString(rank);
            }
        }
        return result;
    }
}
