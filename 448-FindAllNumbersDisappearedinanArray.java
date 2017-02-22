/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use extra space to store the array from [1...n].
 * @In nums[],traversal each element, compare with [1...n]
 * @If [1...n] has the element, make it 0.Let every non-zero element in result Arraylist.
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        int[] extraspace = new int[length];
        
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < length;i++){
            extraspace[i] = i + 1;
        }
        //constructe the ArrayList
        for(int i = 0;i < length;i++){
            if(nums[i] == extraspace[nums[i] - 1]){
                extraspace[nums[i] - 1] = 0;
            }
        }
        for(int i = 0;i < length;i++){
            if(extraspace[i] != 0)
                result.add(extraspace[i]);
        }
        return result;
    }
}
