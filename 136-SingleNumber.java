/*
 * @Chaoyu Gao
 * @cgao15@ucsc.edu
 * @LeetcodeSolution
 * @Use a hashmap to record how many times an element has appears.
 * @Traverseal and find the elemen that only appears one time.
 * @Use extra space.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numsmap = new HashMap<Integer,Integer>();
        int length = nums.length;
        for(int i = 0;i < length;i++){
            if(numsmap.containsKey(nums[i])){
                numsmap.put(nums[i],2);
            }
            else numsmap.put(nums[i],1);
        }
        for(int i = 0;i < length;i++){
            int temp = numsmap.get(nums[i]);
            if(temp == 1)
                return nums[i];
        }
        return 0;
    }
}
